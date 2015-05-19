// Renvoi commande
	//infos cmd
Resulset donnees = //resultat cmd sql

Commande commande;
int numero;
java.sql.Date dateEd;
String nomGestio;
String nomFourniss;
String etat;

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

	commande.setNomFourniss(donnees.getString("Fournisseur"));

	commande.setEtat(donnees.getString("Etat"));
	
	allCommandes.add(commande);
}
	//ligne prod
Resulset donnees = //resultat cmd sql

LigneProduit ligneProduit;
int reference;
String libelle;
int quantite;
double prixBase;

ArrayList<LigneProduit> allLignesProduits = new ArrayList<LigneProduit>();

while (donnees.next()){
	ligneProduit = new LigneProduit (donnees.getInt("Produit");
	
	ligneProduit.setLibellle(donnees.getString("Libelle"));
	
	ligneProduit.setQuantite(donnees.getInt("Quantite"));

	ligneProduit.setPrixBase(donnees.getDouble("PrixBase"));
	
	allLignesProduits.add(ligneProduit);
}
