package orgaStruktur;

public class Abteilung extends AbteilungComponent
{
	private String name;
	private AbteilungComponent[] oc;
	private int anzAbteilungen;
	
	public Abteilung(String name, int anzAbteilungen)
	{
		this.name=name;
		this.oc=new AbteilungComponent[anzAbteilungen];
	}
	
	public void addAbteilung(AbteilungComponent oc)
	{
		this.oc[anzAbteilungen]=oc;
		anzAbteilungen++;
	}
	
	@Override
	public void accept(AbteilungVisitor ov)
	{
		
		
	}

	public String getName()
	{
		return this.name;
	}
	
	@Override
	public String toString()
	{
		return "Abteilung: " + getName();
	}
}
