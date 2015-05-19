String instructionSQL = "insert into CommandeFourn (Etat) values (?) (where Numero = (?))"; // where ?? chap 9 slide 20 ?? 
PreparedStatementprepStat= connexion.prepareStatement(instructionSQL);
prepStat.setString(1, commande.getEtat());
prepStat.executeUpdate( );
