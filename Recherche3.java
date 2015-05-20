//Recherche 3

Resulset donnees = //resultat cmd sql

Commande commande;
int numero;
java.sql.Date dateEd;
String nomGestio;

ArrayList<Commande> allCommandes = new ArrayList<Commande>();

while (donnees.next()){
	commande = new Commande (donnees.getInt("Numéro"));
	
	dateEd = donnees.getDate("DateCommande");
	if (donnees.wasNull() == false){
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(dateEd);
		commande.setDateCommande(gc);
	}

	commande.setNomGestio(donnees.getString("Utilisateur"));
	
	allCommandes.add(commande);
}
