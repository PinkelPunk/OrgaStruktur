package orgaStruktur;

public interface IVisitable
{
	//abstract void accept(Abteilung ov);

	abstract void accept(AbteilungVisitor vi);
}
