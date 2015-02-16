package orgaStruktur;

import java.util.HashMap;

public class Mitarbeiter extends Abteilung
{
	private String name;
	private Integer mitarbeiterID;
	private HashMap<Integer, String> mitarbeiterListe=new HashMap<Integer, String>();;
	
	public Mitarbeiter(String name, Integer id)
	{
		this.name=name;
		if(!id.equals(mitarbeiterListe.get(id)))
		{
			this.mitarbeiterID=id;
		}
		setMitarbeiterListe(this.name, mitarbeiterID);
	}
	
	private HashMap<Integer, String> setMitarbeiterListe(String name, Integer id)
	{
		if(!id.equals(mitarbeiterListe.get(id)))
		{
			mitarbeiterListe.put(id, name);
		}
		return mitarbeiterListe;
	}
	
	@Override
	public String toString()
	{
		return "Mitarbeiter-ID: " + mitarbeiterID + " , Name: " + name;
	}
}
