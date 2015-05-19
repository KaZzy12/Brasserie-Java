//Recherche 1

Resulset donnees = //cmd sql

Commande commande;
int numero;
java.sql.Date dateEd;
String nomGestio;
String nomFourniss;

ArrayList<Commande> allCommandes = new ArrayList<Commande>();

while (donnees.next()){
	commande = new Commande (donnees.getInt("Numéro"));
	
	dateEd = donnees.getDate("DateCommande");
	if (donnees.wasNull() == false){
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(dateEd);
		commande.setDateCommande(gc);
	}
	
	nomGestio = donnees.getString("Utilisateur");
	commande.setNomGestio(nomGestio);
	
	nomFourniss = donnees.getString("Fournisseur");
	commande.setNomFourniss(nomFourniss);
	
	allCommandes.add(commande);
}
