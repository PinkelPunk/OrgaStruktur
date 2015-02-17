package orgaStruktur;

public interface IVisitable<E>
{
	abstract void accept(IVisitable<AbteilungVisitor> ov);
}
