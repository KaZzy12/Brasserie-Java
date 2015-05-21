 public getConnect (Connect connect)
 {
    Connection connexion = Singleton.getInstance();
    String instructionSQL = "select * from Utilisateur where login = ? and password = ?)";
    preparedStatement prepStat = connexion.preparedStatement(instructionSQL);
    prepStat.setString(1,connect.getLogin());
    prepStat.setString(2,connect.getPassword());
    ResultSet donnees = prepStat.executeQuery();
    
    if (donnees.wasNull() == false)
    {
      Utilisateur user = new Utilisateur (donnees.getString("Login"), donnees.getString("Password"), donnees.getString("Nom"), donnees.getString("Prenom"), donnees.getString("Fonction"),
    }else
     exeption
     
 }
 




 
 
