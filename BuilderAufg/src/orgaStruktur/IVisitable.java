package orgaStruktur;

public interface IVisitable<E>
{
	//abstract void accept(Abteilung ov);

	abstract void accept(AbteilungVisitor vi);
}
