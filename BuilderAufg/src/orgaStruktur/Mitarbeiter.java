package orgaStruktur;

import java.util.HashMap;

public class Mitarbeiter extends Abteilung
{
	private String name;
	private Integer mitarbeiterID;
	private HashMap<Integer, String> mitarbeiterListe=new HashMap<Integer, String>();
	
	public Mitarbeiter(String name, Integer id)
	{
		this.name=name;
		if(!id.equals(mitarbeiterListe.containsKey(id)))
		{
			this.mitarbeiterID=id;
		}
		setMitarbeiterListe();
	}
	
	private HashMap<Integer, String> setMitarbeiterListe()
	{
		mitarbeiterListe.put(this.mitarbeiterID, this.name);
		return mitarbeiterListe;
	}
	
	@Override
	public String toString()
	{
		return "Mitarbeiter-ID: " + mitarbeiterID + " , Name: " + name;
	}
}
