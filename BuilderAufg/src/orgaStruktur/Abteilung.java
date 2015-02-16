package orgaStruktur;

public class Abteilung extends Organisation
{
	private Organisation[] abteilungen;
	private int anzAbteilungen;
	
	public Abteilung(String name, int maxAnzAbteilungen)
	{
		super(name);
		abteilungen=new Organisation[maxAnzAbteilungen];
	}
	
	public void setAbteilungen(Organisation[] abteilungen)
	{
		this.abteilungen=abteilungen;
	}
	
	public void addAbteilungen(Organisation org)
	{
		this.abteilungen[anzAbteilungen++]=org;
	}
	
	@Override
	public String toString()
	{
		return "Abteilung: " + getName() + " untersteht der Abteilung: " + getParent();
	}
}
