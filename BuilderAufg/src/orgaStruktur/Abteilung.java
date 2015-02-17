package orgaStruktur;

import java.util.ArrayList;

import orgaMerkmale.*;

public class Abteilung extends AbteilungComponent
{
	private EAbteilungen abteilung; //jede abteilung muss einen abteilungsleiter haben, es darf aber nur einer pro abteilung sein
									//jede abteilung ausser die IT darf einen admin haben
									//jede abteilung darf max. einen assistenten haben
									//fakura + recht dürfen nur dann einen assistenten haben, wenn sie auch einen admin haben

	private EMitarbeiter mitarbeiter; //es müssen mind. 2 + dürfen max. 10 mitarbeiter pro abteilung sein
	
		public Abteilung(EAbteilungen abteilung)
	{
		this.abteilung=abteilung;
	}
	
	@Override
	public void accept(AbteilungVisitor ov)
	{
		
		
	}

	public static class AbteilungBuilder
	{
		private Abteilung abteil;
		private ArrayList<EMitarbeiter> mitarbeiterListe;
		
		public AbteilungBuilder(EAbteilungen abteilung)
		{
			abteil=new Abteilung(abteilung);
			
			//standardwerte
			mitarbeiterListe=new ArrayList<EMitarbeiter>();
			mitarbeiterListe.add(abteil.mitarbeiter=EMitarbeiter.ABTEILUNGSLEITER);
			mitarbeiterListe.add(abteil.mitarbeiter=EMitarbeiter.MITARBEITER);
		}
		
		public AbteilungBuilder mitMitarbeiter(EMitarbeiter mitarbeiter)
		{
			abteil.mitarbeiter=mitarbeiter;
			return this;
		}
		
		public AbteilungBuilder inAbteilung(EAbteilungen abteilung)
		{
			abteil.abteilung=abteilung;
			return this;
		}
		
		public Abteilung konfiguriere()
		{
			if(abteil.mitarbeiter.equals(EMitarbeiter.ABTEILUNGSLEITER!=null)&&abteil.mitarbeiter.equals(EMitarbeiter.ABTEILUNGSLEITER))
			{
				throw new IllegalStateException("Jede Abteilung darf nur einen abteilungsleiter haben.");
			}
			
			if(abteil.mitarbeiter.equals((EMitarbeiter.ASSISTENT)!=null)&&abteil.mitarbeiter.equals(EMitarbeiter.ASSISTENT))
			{
				throw new IllegalStateException("Jede Abteilung darf nur maximal einen Assistenten haben.");
			}
			
			if((abteil.abteilung.equals(EAbteilungen.FAKURA)&&abteil.mitarbeiter.equals(EMitarbeiter.ADMINISTRATOR==null)&&
					abteil.mitarbeiter.equals(EMitarbeiter.ASSISTENT!=null))||(abteil.abteilung.equals(EAbteilungen.RECHT)&&
					abteil.mitarbeiter.equals(EMitarbeiter.ADMINISTRATOR==null)&&abteil.mitarbeiter.equals(EMitarbeiter.ASSISTENT!=null)))
			{
				throw new IllegalStateException("Die Abteilungen Recht und Fakura dürfen nur einen Assistenten haben, wenn sie auch einen Administrator haben.");
			}
			
			if(abteil.abteilung.equals(EAbteilungen.IT)&&abteil.mitarbeiter.equals(EMitarbeiter.ADMINISTRATOR))
			{
				throw new IllegalStateException("Die Abteilung IT darf keinen Administrator haben.");
			}
			
			return abteil;
		}
	}
}
