package orgaStruktur;

public class OrgaVisitor implements IVisitOrga
{

	@Override
	public void visitAbteilung(Abteilung a)
	{
		System.out.println("Abteilung: " + a.getName() + " und Unterabteilungen: ");// + a);
		
	}

	@Override
	public void visitMitarbeiter(Mitarbeiter m)
	{
		System.out.println("Mitarbeiter: " + m.getName());
		
	}
	
}