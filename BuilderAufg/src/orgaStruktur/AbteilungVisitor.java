package orgaStruktur;

public class AbteilungVisitor implements IVisitAbteilung
{

	@Override
	public void visitAbteilung(Abteilung a)
	{
		System.out.println("Abteilung: " + a.toString() + " und Unterabteilungen: ");// + a.getAbteilungen);
		
	}

}
