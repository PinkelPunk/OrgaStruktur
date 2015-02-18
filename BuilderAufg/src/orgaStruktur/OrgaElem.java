package orgaStruktur;

public abstract class OrgaElem implements IVisitable
{
	private OrgaElem parent;
	
	public OrgaElem getParent()
	{
		return parent;
	}
	
	public void setParent(OrgaElem org)
	{
		this.parent=org;
	}
}
