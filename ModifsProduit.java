//Insert new produit
Connection connexion = … ;

String instructionSQL = "INSERT INTO Produit VALUES('"+produit.getReference()+"', '"+produit.getLibelle()+"', '"+produit.getPrixBase()+"', '"+produit.getPrixVidange()+"', '"+produit.getTVA()+"', '"+produit.getReduction()+"', '"+produit.getDateFinReduc()+"', '"+produit.getPourcReduc()+"', '"+produit.getQteStock()+"')";
PreparedStatementprepStat = connexion.prepareStatement(instructionSQL);
int nbIns = prepStat.executeUpdate( );

//Modif produit

String instructionSQL = "UPDATE Produit SET colonne = valeur where Reference = '"+produit.getReference+"')"; 
PreparedStatementprepStat = connexion.prepareStatement(instructionSQL);
int nbIns = prepStat.executeUpdate( );

//Supr Produit

String instructionSQL = "DELETE FROM Produit where Reference = '"+produit.getReference+"')"; 
PreparedStatementprepStat = connexion.prepareStatement(instructionSQL);
int nbIns = prepStat.executeUpdate( );
