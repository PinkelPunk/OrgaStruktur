package orgaStruktur;

import orgaMerkmale.*;

public class Main {

	public static void main(String[] args)
	{
		Abteilung abt1 = null;
		
		abt1=new Abteilung.AbteilungBuilder(abt1, EAbteilungen.INVESTITIONEN)
		.mitMitarbeiter(EMitarbeiter.ABTEILUNGSLEITER)
		.mitMitarbeiter(EMitarbeiter.ASSISTENT)
		.konfiguriere();
		
		Abteilung abt=new Abteilung.AbteilungBuilder(abt1, EAbteilungen.TECHNIK)
		.mitMitarbeiter(EMitarbeiter.ABTEILUNGSLEITER)
		.mitMitarbeiter(EMitarbeiter.ADMINISTRATOR)
		.mitMitarbeiter(EMitarbeiter.MITARBEITER)
		.konfiguriere();
		
		System.out.println(abt);
		
		Abteilung abtIT=new Abteilung.AbteilungBuilder(abt1, EAbteilungen.IT)
		.mitMitarbeiter(EMitarbeiter.ABTEILUNGSLEITER)
		.mitMitarbeiter(EMitarbeiter.ASSISTENT)
		.mitMitarbeiter(EMitarbeiter.MITARBEITER)
		.konfiguriere();
		
		System.out.println(abtIT);
		
		Abteilung abtF=new Abteilung.AbteilungBuilder(abt1, EAbteilungen.FAKTURA)
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
		
		//funzt noch nich -> -> -> -> -> -> -> -> -> \
		//AbteilungVisitor vi=new AbteilungVisitor();
		
		//abt1.accept(new AbteilungVisitor());
		//abtV.toString();
		
	}

}
