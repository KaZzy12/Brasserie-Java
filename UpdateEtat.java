String instructionSQL = "insert into CommandeFourn (Etat) values (?) (where Numero = (?))"; // where ??
PreparedStatementprepStat= connexion.prepareStatement(instructionSQL);
prepStat.setString(1, commande.getEtat());
prepStat.executeUpdate( );
