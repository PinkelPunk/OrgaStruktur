package orgaStruktur;

import orgaMerkmale.*;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Abteilung abtFa;
		Abteilung abtCo;
		Abteilung abt=new Abteilung.AbteilungBuilder(EAbteilungen.TECHNIK)
		.mitMitarbeiter(EMitarbeiter.ABTEILUNGSLEITER)
		.mitMitarbeiter(EMitarbeiter.ADMINISTRATOR)
		.mitMitarbeiter(EMitarbeiter.MITARBEITER)
		.inAbteilung(abtFa=new Abteilung.AbteilungBuilder(EAbteilungen.FAKTURA)
		.mitMitarbeiter(EMitarbeiter.ABTEILUNGSLEITER)
		.mitMitarbeiter(EMitarbeiter.ADMINISTRATOR)
		.mitMitarbeiter(EMitarbeiter.ASSISTENT)
		.mitMitarbeiter(EMitarbeiter.MITARBEITER)
		.inAbteilung(abtCo=new Abteilung.AbteilungBuilder(EAbteilungen.CONTROLLING)
		.mitMitarbeiter(EMitarbeiter.ABTEILUNGSLEITER)
		.mitMitarbeiter(EMitarbeiter.ASSISTENT)
		.konfiguriere())
		.konfiguriere())
		.konfiguriere();
		
		System.out.println(abt);
		
		Abteilung abtIT=new Abteilung.AbteilungBuilder(EAbteilungen.IT)
		.mitMitarbeiter(EMitarbeiter.ABTEILUNGSLEITER)
		.mitMitarbeiter(EMitarbeiter.ASSISTENT)
		.mitMitarbeiter(EMitarbeiter.MITARBEITER)
		.konfiguriere();
		
		System.out.println(abtIT);
		
		Abteilung abtF=new Abteilung.AbteilungBuilder(EAbteilungen.FAKTURA)
		.mitMitarbeiter(EMitarbeiter.ABTEILUNGSLEITER)
		.mitMitarbeiter(EMitarbeiter.ADMINISTRATOR)
		.mitMitarbeiter(EMitarbeiter.ASSISTENT)
		.mitMitarbeiter(EMitarbeiter.MITARBEITER)
		.mitMitarbeiter(EMitarbeiter.MITARBEITER)
		.mitMitarbeiter(EMitarbeiter.MITARBEITER)
		.mitMitarbeiter(EMitarbeiter.MITARBEITER)
		.mitMitarbeiter(EMitarbeiter.MITARBEITER)
		.mitMitarbeiter(EMitarbeiter.MITARBEITER)
		.mitMitarbeiter(EMitarbeiter.MITARBEITER)
		.konfiguriere();
		
		System.out.println(abtF);
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		
		AbteilungVisitor visit=new AbteilungVisitor();
		visit.visitAbteilung(abt);
		visit.visitAbteilung(abtFa);
	}

}
