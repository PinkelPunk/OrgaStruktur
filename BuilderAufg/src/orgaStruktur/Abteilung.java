package orgaStruktur;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import orgaMerkmale.*;

@SuppressWarnings("unused")
public class Abteilung implements IVisitable<AbteilungVisitor>
{
	private EAbteilungen abteilung; //jede abteilung muss einen abteilungsleiter haben, es darf aber nur einer pro abteilung sein...funzt in den if-abfragen
									//jede abteilung ausser die IT darf einen admin haben...funzt in den if-abfragen
									//jede abteilung darf max. einen assistenten haben...funzt in den if-abfragen
									//fakura + recht dürfen nur dann einen assistenten haben, wenn sie auch einen admin haben...funzt in den if-abfragen

	private EMitarbeiter mitarbeiter; //es müssen mind. 2 + dürfen max. 10 mitarbeiter pro abteilung sein...funzt in den if-abfragen
	private ArrayList<EMitarbeiter> mitarbeiterListe;
//	private HashMap<Abteilung<E>, EAbteilungen> abteilungsListe;
	private ArrayList<Abteilung> unterAbt=new ArrayList<Abteilung>();
	private ArrayList<Abteilung> oberAbt=new ArrayList<Abteilung>();
	private ArrayList<EAbteilungen> abtei=new ArrayList<EAbteilungen>();
	
	public Abteilung(EAbteilungen abteilung)
	{
		this.abteilung=abteilung;
	}
	
	//innere statische klasse für den Builder
	public static class AbteilungBuilder
	{
		private Abteilung abteil;
		
		public AbteilungBuilder(EAbteilungen abteilung)
		{
			abteil=new Abteilung(abteilung);
			
			abteil.unterAbt.add(abteil);
			abteil.abtei.add(abteilung);
			//standardwerte
			abteil.mitarbeiterListe=new ArrayList<EMitarbeiter>();
		}
		
		public AbteilungBuilder mitMitarbeiter(EMitarbeiter mitarbeiter)
		{
			abteil.mitarbeiterListe.add(abteil.mitarbeiter=mitarbeiter);
			return this;
		}
		
		public AbteilungBuilder inAbteilung(Abteilung abt)
		{
			abteil.unterAbt.add(abt);
			return this;
		}
		
		public Abteilung konfiguriere()
		{
			if(abteil.mitarbeiterListe.isEmpty())
			{
				throw new NullPointerException("Es darf keine Abteilung ohne Mitarbeiter geben!");
			}
			
			if(!abteil.mitarbeiterListe.contains(EMitarbeiter.ABTEILUNGSLEITER))
			{
				throw new IllegalStateException("Es muss einen Abteilungsleiter geben!");
			}
			
			if(abteil.mitarbeiter.equals(EMitarbeiter.ABTEILUNGSLEITER))
			{
				int anzLeiter=0;
				for(int i=0; i<abteil.mitarbeiterListe.size(); i++)
				{
					if(abteil.mitarbeiterListe.get(i).equals(EMitarbeiter.ABTEILUNGSLEITER))
					{
						anzLeiter++;
					}
				}
				if(anzLeiter>1)
				{
					throw new IllegalStateException("Jede Abteilung darf nur einen abteilungsleiter haben.");
				}
			}
			
			if(abteil.mitarbeiter.equals(EMitarbeiter.ASSISTENT))
			{
				int anzAssi=0;
				for(int i=0; i<abteil.mitarbeiterListe.size(); i++)
				{
					if(abteil.mitarbeiterListe.get(i).equals(EMitarbeiter.ASSISTENT))
					{
						anzAssi++;
					}
				}
				if(anzAssi>1)
				{
					throw new IllegalStateException("Jede Abteilung darf nur maximal einen Assistenten haben.");
				}
			}
			
			if(((abteil.abteilung.equals(EAbteilungen.FAKTURA))&&(!abteil.mitarbeiterListe.contains(EMitarbeiter.ADMINISTRATOR))&&
					(abteil.mitarbeiter.equals(EMitarbeiter.ASSISTENT)))||((abteil.abteilung.equals(EAbteilungen.RECHT))&&
					(!abteil.mitarbeiterListe.contains(EMitarbeiter.ADMINISTRATOR))&&(abteil.mitarbeiter.equals(EMitarbeiter.ASSISTENT))))
			{
				throw new IllegalStateException("Die Abteilungen Recht und Fakura dürfen nur einen Assistenten haben, wenn sie auch einen Administrator haben.");
			}
			
			if(abteil.abteilung.equals(EAbteilungen.IT)&&abteil.mitarbeiter.equals(EMitarbeiter.ADMINISTRATOR))
			{
				throw new IllegalStateException("Die Abteilung IT darf keinen Administrator haben.");
			}
			
			if((abteil.mitarbeiterListe.size()<2)||(abteil.mitarbeiterListe.size()>10))
			{
				if((abteil.mitarbeiterListe.size()<2))
				{
					throw new IllegalStateException("Es muss mindestens 2 Mitarbeiter pro Abteilung geben!");
				}
				else
				{
					throw new IllegalStateException("Es darf nicht mehr als 10 Mitarbeiter pro Abteilung geben!");
				}
			}
			
			return abteil;
		}
	}
	
	@Override
	public void accept(AbteilungVisitor vi)
	{
		vi.visitAbteilung(this);
	}
	
	@Override
	public String toString()
	{
		String ausgabe;
		ausgabe="Abteilung -> " + abteilung + " mit Mitarbeiter -> " + mitarbeiterListe.toString();
		
		if(!unterAbt.isEmpty())
		{
			ausgabe+= "\nAbteilungsliste: -> \t";
			Iterator<EAbteilungen> it=abtei.iterator();
			while(it.hasNext())
			{
				ausgabe+=it.next();
			}
		}
		return ausgabe;
	}

}
