package orgaStruktur;

import orgaMerkmale.*;

public class AbteilungBuilder
{
	private EAbteilungen abteilung; //jede abteilung muss einen abteilungsleiter haben, es darf aber nur einer pro abteilung sein
									//jede abteilung ausser die IT darf einen admin haben
									//jede abteilung darf max. einen assistenten haben
									//fakura + recht dürfen nur dann einen assistenten haben, wenn sie auch einen admin haben

	private EMitarbeiter mitarbeiter; //es müssen mind. 2 + dürfen max. 10 mitarbeiter pro abteilung sein

	
	
	
	
}



/*	private String mName;
private int mitarbeiterID;
private Integer mID;
private HashMap<Integer, String> mitarbeiterListe=new HashMap<Integer, String>();

public AbteilungBuilder(String mName, int id)
{
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

/**
 * @return the mName
 */
/*	public String getmName() {
	return mName;
}

@Override
public String toString()
{
	return "AbteilungBuilder-ID: " + mitarbeiterID + " , Name: " + getmName();
}

@Override
void accept(AbteilungVisitor ov)
{
	ov.visitMitarbeiter(this);
}*/