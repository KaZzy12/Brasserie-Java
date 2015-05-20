//Insert new produit
Connection connexion = … ;

String instructionSQL = "INSERT INTO Produit VALUES(?, ?, ?, NULL, ?)";
PreparedStatementprepStat = connexion.prepareStatement(instructionSQL);
prepStat.setInt(1,produit.getReference());
prepStat.setString(2,produit.getLibelle());
prepStat.setDouble(3,produit.getPrixBase());
prepStat.setInt(4,produit.getTVA());
prepStat.executeUpdate();


if(produit.getPrixVidange() != NULL){
	instructionSQL = "UPDATE Produit set PrixVidange = ? where Reference = "+produit.getReference();
	PreparedStatementprepStat = connexion.prepareStatement(instructionSQL);
	prepStat.setDouble(4,produit.getPrixVidange());
	prepStat.executeUpdate();
}

if (produit.getReduction() != NULL){
	instructionSQL = "UPDATE Produit set Reduction = ? where Reference = "+produit.getReference();
	PreparedStatementprepStat = connexion.prepareStatement(instructionSQL);
	prepStat.setBoolean(6,produit.getReduction());
	prepStat.executeUpdate();
}

if (produit.getDateFinReduc() != NULL){
	instructionSQL = "UPDATE Produit set DateFinReduc = ? where Reference = "+produit.getReference();
	PreparedStatementprepStat = connexion.prepareStatement(instructionSQL);
	prepStat.setDate(7,new java.sql.Date(produit.getDateFinReduc().getTimeInMillis()));
	prepStat.executeUpdate();
}

if (produit.getPourcReduc != NULL){
	instructionSQL = "UPDATE Produit set PourcReduc = ? where Reference = "+produit.getReference();
	PreparedStatementprepStat = connexion.prepareStatement(instructionSQL);
	prepStat.setDouble(8,produit.getPourcReduc());
	prepStat.executeUpdate();
}

if (produit.getQteStock != NULL){
	instructionSQL = "UPDATE Produit set QteStock = ? where Reference = "+produit.getReference();
	PreparedStatementprepStat = connexion.prepareStatement(instructionSQL);
	prepStat.setInt(9,produit.getQteStock());
	prepStat.executeUpdate();
}

//Modif produit

String instructionSQL = "UPDATE Produit SET colonne = valeur where Reference = ?)"; 
PreparedStatementprepStat = connexion.prepareStatement(instructionSQL);
prepStat.setInt(1,produit.getReference());
int nbIns = prepStat.executeUpdate( );

//Supr Produit

String instructionSQL = "DELETE FROM Produit where Reference = ?)"; 
PreparedStatementprepStat = connexion.prepareStatement(instructionSQL);
prepStat.setInt(1,produit.getReference());
int nbIns = prepStat.executeUpdate();
