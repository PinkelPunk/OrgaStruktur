package orgaStruktur;

public abstract class AbteilungComponent
{
	Object abteilung;
	String name;
	abstract void accept(AbteilungVisitor ov);

}
