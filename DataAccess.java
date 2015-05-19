//Connexion Utilisateur

Connection connexion = ?;

String instructionSQL = "select * from Utilisateur where login = "utilisateur.getLogin()+"and password = "+utilisateur.getPassword();
preparedStatement prepStat = connexion.preparedStatement(instructionSQL);
ResultSet donnees = prepStat.executeQuery();  //comment lancer l'exeption a partir de la ? dans le cours y a une flèche sur donnees avec throws SQLExeption

/* dans ma création de l'instruction ça devrait pas être comme ça ? :/ (j'ai du mal a capter xD)
	prepStat.setString(1,getLogin());
	prepStat.setString(2,getPassword());
*/

//renvoi ligne cmd

String instructionSQL = "select * from LigneProduit where CommandeFourn = "+ligneProduit.getCommandeFourn()+" and Produit = "+ligneProduit.getProduit();
preparedStatement prepStat = connexion.preparedStatement(instructionSQL);
ResultSetdonnees=prepStat.executeQuery();
