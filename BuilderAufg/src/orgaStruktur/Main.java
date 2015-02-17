package orgaStruktur;

import orgaMerkmale.*;

public class Main {

	public static void main(String[] args)
	{
		Abteilung abt=new Abteilung.AbteilungBuilder(EAbteilungen.VORSTAND)
		.mitMitarbeiter(EMitarbeiter.GESCHAEFTSFUEHRER)
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
		
		Abteilung abtF=new Abteilung.AbteilungBuilder(EAbteilungen.FAKURA)
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
		
	}

}
