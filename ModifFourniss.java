//Insert new Fournisseur
Connection connexion = … ;

String instructionSQL = "INSERT INTO Fournisseur VALUES(?, ?, ?, ?)";
PreparedStatementprepStat = connexion.prepareStatement(instructionSQL);
prepStat.setString(1,fournisseur.getNom());
prepStat.setString(2,fournisseur.getRue());
prepStat.setInt(3,fournisseur.getCodePostal());
prepStat.setString(4,fournisseur.getLocalite());
int nbIns = prepStat.executeUpdate();

//Modif Fournisseur A REVOIR !!!!!!!!!!!

String instructionSQL = "UPDATE Fournisseur SET colonne = valeur where Nom = ?"; 
PreparedStatementprepStat = connexion.prepareStatement(instructionSQL);
prepStat.setString(1,fournisseur.getNom());
int nbIns = prepStat.executeUpdate( );

//Supr Fournisseur

String instructionSQL = "DELETE FROM Fournisseur where Nom = ?"; 
PreparedStatementprepStat = connexion.prepareStatement(instructionSQL);
prepStat.setString(1,fournisseur.getNom());
int nbIns = prepStat.executeUpdate( );
