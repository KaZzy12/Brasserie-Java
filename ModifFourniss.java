//Insert new Fournisseur
Connection connexion = … ;

String instructionSQL = "INSERT INTO Fournisseur VALUES('"+getNom()+"', '"+getRue()+"', '"+getCodePostal()+"', '"+getLocalite()+"')";
PreparedStatementprepStat = connexion.prepareStatement(instructionSQL);
int nbIns = prepStat.executeUpdate();

//Modif Fournisseur

String instructionSQL = "UPDATE Fournisseur SET colonne = valeur where Nom = '"+getNom+"')"; 
PreparedStatementprepStat = connexion.prepareStatement(instructionSQL);
int nbIns = prepStat.executeUpdate( );

//Supr Fournisseur

String instructionSQL = "DELETE FROM Fournisseur where Nom = '"+getNom+"')"; 
PreparedStatementprepStat = connexion.prepareStatement(instructionSQL);
int nbIns = prepStat.executeUpdate( );
