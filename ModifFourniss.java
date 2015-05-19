//Insert new Fournisseur
Connection connexion = … ;

String instructionSQL = "INSERT INTO Fournisseur VALUES('"+fournisseur.getNom()+"', '"+fournisseur.getRue()+"', '"+fournisseur.getCodePostal()+"', '"+fournisseur.getLocalite()+"')";
PreparedStatementprepStat = connexion.prepareStatement(instructionSQL);
int nbIns = prepStat.executeUpdate();

//Modif Fournisseur

String instructionSQL = "UPDATE Fournisseur SET colonne = valeur where Nom = '"+fournisseur.getNom+"')"; 
PreparedStatementprepStat = connexion.prepareStatement(instructionSQL);
int nbIns = prepStat.executeUpdate( );

//Supr Fournisseur

String instructionSQL = "DELETE FROM Fournisseur where Nom = '"+fournisseur.getNom+"')"; 
PreparedStatementprepStat = connexion.prepareStatement(instructionSQL);
int nbIns = prepStat.executeUpdate( );
