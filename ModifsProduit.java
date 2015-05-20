//Insert new produit
Connection connexion = … ;

String instructionSQL = "INSERT INTO Produit VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
PreparedStatementprepStat = connexion.prepareStatement(instructionSQL);
prepStat.setInt(1,produit.getReference());
prepStat.setString(2,produit.getLibelle());
prepStat.setDouble(3,produit.getPrixBase());
prepStat.setDouble(4,produit.getPrixVidange());
prepStat.setInt(5,produit.getTVA());
prepStat.setDouble(6,produit.getReduction());
prepStat.setDate(7,new java.sql.Date(produit.getDateFinReduc().getTimeInMillis()));
prepStat.setDouble(8,produit.getPourcReduc());
prepStat.setInt(9,produit.getQteStock());
int nbIns = prepStat.executeUpdate( );

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
