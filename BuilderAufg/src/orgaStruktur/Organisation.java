package orgaStruktur;

import orgaMerkmale.*;

public class Organisation
{
	private EAbteilungen abteilung; //jede abteilung muss einen abteilungsleiter haben, es darf aber nur einer pro abteilung sein
									//jede abteilung ausser die IT darf einen admin haben
									//jede abteilung darf max. einen assistenten haben
									//fakura + recht d�rfen nur dann einen assistenten haben, wenn sie auch einen admin haben
	
	private EMitarbeiter mitarbeiter; //es m�ssen mind. 2 + d�rfen max. 10 mitarbeiter pro abteilung sein
	
	
	
	
	
}
