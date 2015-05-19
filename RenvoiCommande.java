// Renvoi commande
	//infos cmd
Resulset donnees = //cmd sql

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
	
	nomGestio = donnees.getString("Utilisateur");
	commande.setNomGestio(nomGestio);
	
	nomFourniss = donnees.getString("Fournisseur");
	commande.setNomFourniss(nomFourniss);
	
	etat = donnees.getString("Etat");
	commande.setEtat(etat);
	
	allCommandes.add(commande);
}
	//ligne prod
Resulset donnees = //cmd sql

LigneProduit ligneProduit;
int reference;
String libelle;
int quantite;
double prixBase;

ArrayList<LigneProduit> allLignesProduits = new ArrayList<LigneProduit>();

while (donnees.next()){
	ligneProduit = new LigneProduit (donnees.getInt("Produit");
	
	libelle = donnees.getString("Libelle");
	ligneProduit.setLibellle(libelle);
	
	quantite = donnees.getInt("Quantite");
	ligneProduit.setQuantite(quantite);
	
	prixBase = donnees.getDouble("PrixBase");
	ligneProduit.setPrixBase(prixBase);
	
	allLignesProduits.add(ligneProduit);
}
