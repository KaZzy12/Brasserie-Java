for (i=0; i < allLignesProduit.size(); i++){
	Produit produit = new Produit (allLignesProduit.get(i));
	String instructionSQL = "UPDATE Produit SET QteStock = QteStock + ? WHERE Reference = '"+produit.getReference();
	PreparedStatementprepStat= connexion.prepareStatement(instructionSQL);
	prepStat.setInt(1, produit.getQteStock());
	prepStat.executeUpdate();	
}
