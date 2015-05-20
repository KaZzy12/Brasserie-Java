GregorianCalendar gregC = commande.getDateCommande();
java.sql.Date sqlD = new java.sql.Date(gregC.getTimeInMillis());

String instructionSQL ="INSERT INTO Commande VALUES ("+commande.getNumero()", "+sqlD+", '"+commande.getUtilisateur()"', '"+commande.getFournisseur()"', '"+commande.getEtat()+"')";
PreparedStatement prepStat = connexion.preparedStatement(instructionSQL);
prepStat.executeUpdate();

for (i=0; i<allLignesProduits.size(); i++){
	LigneProduit ligneProduit = new LigneProduit (allLignesProduits.get(i)); 
	
	String instructionSQL = "INSERT INTO LigneProduit VALUES ("+ligneProduit.getProduit()+", '"+ligneProduit.getCommandeFourn()+"', "+ligneProduit.Quantite()+")"; 
	PreparedStatement prepStat = connexion.preparedStatement(instructionSQL);
	prepStat.executeUpdate();
}
