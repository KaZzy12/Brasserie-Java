String instructionSQL = "UPDATE CommandeFourn SET Etat = ? where Numero = '"+commande.getNumero(); 
PreparedStatementprepStat= connexion.prepareStatement(instructionSQL);
prepStat.setString(1, commande.getEtat());
prepStat.executeUpdate();
