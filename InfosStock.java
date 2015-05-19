//infos stock

// SELECT * FROM Produits where QteStock > 0;

Resulset donnees = //resultat cmd sql

Produit produit;
int reference;
String libelle;
double prixBase;
double prixVidange; 
int TVA;
double reduction; 
java.sql.Date dateEd;
double pourcReduc;
int qteStock;

ArrayList<Produit> allProduits = new ArrayList<Produit>();

while (donnees.next()){
	produit = new Produit (donnees.getInt("Reference"));
	
	produit.setLibelle(donnees.getString("Libelle"));
	
	produit.setPrixBase(donnees.getDouble("PrixBase"));
	
	prixVidange = donnees.getDouble("PrixVidange");
	if (donnees.wasNull() == false){
		produit.setPrixVidange(prixVidange);
	}
	
	produit.setTVA(donnees.getInt("TVA"));
	
	reduction = donnees.getDouble("Reduction");
	if (donnees.wasNull() == false){
		produit.setReduction(reduction);
	}
	
	dateEd = donnees.getDate("DateFinReduc");
	if (donnees.wasNull() == false){
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(dateEd);
		produit.setDateEvenement(gc);
	}
	
	pourcReduc = donnees.getDouble("PourcReduc");
	if (donnees.wasNull() == false){
		produit.setPourcReduc(pourcReduc);
	}
	
	qteStock = donnees.getInt("QteStock");
	if (donnees.wasNull() == false){
		produit.setQteStock(qteStock);
	}
	allProduits.add(produit);
}
