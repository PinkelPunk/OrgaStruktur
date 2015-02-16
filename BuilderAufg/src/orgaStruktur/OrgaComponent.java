package orgaStruktur;

public abstract class OrgaComponent
{
	Object abteilung;
	String name;
	abstract void accept(OrgaVisitor ov);

}
