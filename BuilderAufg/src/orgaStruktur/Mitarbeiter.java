package orgaStruktur;

import java.util.HashMap;

public class Mitarbeiter extends Organisation
{
	private String name;
	private String mName;
	private int mitarbeiterID;
	private Integer mID;
	private HashMap<Integer, String> mitarbeiterListe=new HashMap<Integer, String>();
	
	public Mitarbeiter(String mName, int id)
	{
		super(mName);
		this.mID=id;
		this.mName=mName;
		
		if(!mID.equals(mitarbeiterListe.containsKey(mitarbeiterID)) && mID<=10)
		{
			this.mitarbeiterID=mID;
		}
		setMitarbeiterListe();
	}
	
	private HashMap<Integer, String> setMitarbeiterListe()
	{
		mitarbeiterListe.put(this.mitarbeiterID, this.mName);
		return mitarbeiterListe;
	}
	
	@Override
	public String toString()
	{
		return "Mitarbeiter-ID: " + mitarbeiterID + " , Name: " + mName;
	}
}
