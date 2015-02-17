package orgaStruktur;

import orgaMerkmale.*;

public class Main {

	public static void main(String[] args)
	{
		
		Abteilung abt=new Abteilung.AbteilungBuilder(EAbteilungen.TECHNIK)
		.mitMitarbeiter(EMitarbeiter.ABTEILUNGSLEITER)
		.mitMitarbeiter(EMitarbeiter.ADMINISTRATOR)
		.mitMitarbeiter(EMitarbeiter.MITARBEITER)
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
		
		Abteilung abtV=new Abteilung.AbteilungBuilder(EAbteilungen.VORSTAND)
		.mitMitarbeiter(EMitarbeiter.ABTEILUNGSLEITER)
		.mitMitarbeiter(EMitarbeiter.ASSISTENT)
		.inAbteilung(abt)
		.inAbteilung(abtIT)
		.konfiguriere();
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println(abtV);
		
		/*AbteilungVisitor vi=new AbteilungVisitor();
		
		abt.accept(vi);*/
		//abtV.toString();
		
	}

}
