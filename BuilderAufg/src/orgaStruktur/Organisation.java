package orgaStruktur;

import orgaMerkmale.*;

public abstract class Organisation implements IComposite
{
	private EAbteilungen abteilung; //jede abteilung muss einen abteilungsleiter haben, es darf aber nur einer pro abteilung sein
									//jede abteilung ausser die IT darf einen admin haben
									//jede abteilung darf max. einen assistenten haben
									//fakura + recht dürfen nur dann einen assistenten haben, wenn sie auch einen admin haben
	
	private EMitarbeiter mitarbeiter; //es müssen mind. 2 + dürfen max. 10 mitarbeiter pro abteilung sein
	
	private String name;
	private Organisation parent;
	
	//Konstruktor
	public Organisation(String name)
	{
		this.name=name;
	}
	
	public Organisation getParent()
	{
		return parent;
	}

	public void setParent(Organisation parent)
	{
		this.parent=parent;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	
	
}
