GregorianCalendar gregC = commande.getDateCommande();
java.sql.Date sqlD = new java.sql.Date(gregC.getTimeInMillis());

String instructionSQL ="INSERT INTO Commande VALUES (?, "+sqlD+", ?, ?, ?)";
PreparedStatement prepStat = connexion.preparedStatement(instructionSQL);
prepStat.setInt(1,commande.getNumero());
prepStat.setString(2,commande.getUtilisateur());
prepStat.setString(3,commande.getFournisseur());
prepStat.setString(4,commande.getEtat());
prepStat.executeUpdate();

for (i=0; i<allLignesProduits.size(); i++){
	LigneProduit ligneProduit = new LigneProduit (allLignesProduits.get(i)); 
	
	String instructionSQL = "INSERT INTO LigneProduit VALUES (?, ?, ?)"; 
	PreparedStatement prepStat = connexion.preparedStatement(instructionSQL);
	prepStat.setInt(1,ligneProduit.getProduit());
	prepStat.setInt(2,ligneProduit.getCommandeFourn());
	prepStat.setInt(3,ligneProduit.Quantite());
	prepStat.executeUpdate();
}
