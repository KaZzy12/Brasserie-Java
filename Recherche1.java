//Recherche 1

Resulset donnees = //resultat cmd sql

Commande commande;
int numero;
String nomGestio;
String nomFourniss;

ArrayList<Commande> allCommandes = new ArrayList<Commande>();

while (donnees.next()){
	commande = new Commande (donnees.getInt("Numéro"));

	commande.setNomGestio(donnees.getString("Utilisateur"));

	commande.setNomFourniss(donnees.getString("Fournisseur"));
	
	allCommandes.add(commande);
}
