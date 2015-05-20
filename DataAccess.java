//Connexion Utilisateur

Connection connexion = ?;

String instructionSQL = "select * from Utilisateur where login = ? and password = ?)";
preparedStatement prepStat = connexion.preparedStatement(instructionSQL);
prepStat.setString(1,utilisateur.getLogin());
prepStat.setString(2,utilisateur.getPassword());
ResultSet donnees = prepStat.executeQuery();

//renvoi ligne cmd

String instructionSQL = "select * from LigneProduit where CommandeFourn = ? and Produit = ?)";
preparedStatement prepStat = connexion.preparedStatement(instructionSQL);
prepStat.setInt(1,ligneProduit.getCommandeFourn());
prepStat.setInt(2,ligneProduit.getProduit());
ResultSetdonnees=prepStat.executeQuery();
