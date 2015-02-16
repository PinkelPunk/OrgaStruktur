package orgaStruktur;

import orgaMerkmale.EAbteilungen;
import orgaMerkmale.EMitarbeiter;

public class Abteilung extends OrgaComponent
{
	private EAbteilungen abteilung; //jede abteilung muss einen abteilungsleiter haben, es darf aber nur einer pro abteilung sein
	//jede abteilung ausser die IT darf einen admin haben
	//jede abteilung darf max. einen assistenten haben
	//fakura + recht dürfen nur dann einen assistenten haben, wenn sie auch einen admin haben

	private EMitarbeiter mitarbeiter; //es müssen mind. 2 + dürfen max. 10 mitarbeiter pro abteilung sein
	
	private String name;
	private int anzAbteilungen;
	
	public Abteilung(String name)
	{
		this.name=name;
	}
	
/*	@Override
	public String toString()
	{
		return "Abteilung: " + getName() + " untersteht der Abteilung: " + getParent();
	}*/

	@Override
	void accept(OrgaVisitor ov)
	{
		
		
	}

	public String getName()
	{
		return this.name;
	}
}
