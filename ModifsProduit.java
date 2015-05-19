//Insert new produit
Connection connexion = … ;

String instructionSQL = "INSERT INTO Produit VALUES('"+getReference()+"', '"+getLibelle()+"', '"+getPrixBase()+"', '"+getPrixVidange()+"', '"+getTVA()+"', '"+getReduction()+"', '"+getDateFinReduc()+"', '"+getPourcReduc()+"', '"+getQteStock()+"')";
PreparedStatementprepStat = connexion.prepareStatement(instructionSQL);
int nbIns = prepStat.executeUpdate( );

//Modif produit

String instructionSQL = "UPDATE Produit SET colonne = valeur where Reference = "+getReference+"')"; 
PreparedStatementprepStat = connexion.prepareStatement(instructionSQL);
int nbIns = prepStat.executeUpdate( );

//Supr Produit

String instructionSQL = "DELETE FROM Produit where Reference = "+getReference+"')"; 
PreparedStatementprepStat = connexion.prepareStatement(instructionSQL);
int nbIns = prepStat.executeUpdate( );
