// select evenement

// select * from Evenement (where Nom = getNom());
Resulset donnees = //resultat cmd sql

Evenement evenement;
String nom;
String lieu;
java.sql.Date dateEd;
String thematique;
int nbPersAttendues;

ArrayList<Evenement> allEvenements = new ArrayList<Evenement>();

while (donnees.next()){
	evenement = new Evenement (donnees.getString("Nom");
	
	evenement.setLieu(donnees.getString("Lieu");
	
	dateEd = donnees.getDate("DateEvenement");
	if (donnees.wasNull() == false){
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(dateEd);
		evenement.setDateEvenement(gc);
	}
	
	evenement.setThematique(donnees.getString("Thematique");
	
	nbPersAttendues = donnees.getInt("NbPersAttendues");
	if (donnees.wasNull() == false){
		evenement.setNbPersAttendues(nbPersAttendues);
	}
	
	allEvenements.add(evenement);
}
