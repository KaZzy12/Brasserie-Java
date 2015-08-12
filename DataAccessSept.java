public class DataAccess 
{
    private Utilisateur user;
        public Utilisateur getConnect(Connect connect) throws ConnexionException
        {
            
            try
            {
                Connection connexion = Singleton.getInstance();
                String instructionSQL = "select * from Utilisateur where Login = ? and Password = ? ";                
                PreparedStatement prepStat = connexion.prepareStatement(instructionSQL);
                prepStat.setString(1,connect.getLogin());               
                prepStat.setString(2,connect.getPassword());
				
                ResultSet donnees = prepStat.executeQuery();  // Ici que ça plante
				
                while (donnees.next())
                {
                    user = new Utilisateur(donnees.getString("Login"), donnees.getString("Password"), donnees.getString("Nom"), donnees.getString("Prenom"), donnees.getString("Fonction"));
                }
            }
            catch(SQLException e)
            {
                throw new ConnexionException(e.getMessage());
            }
            catch (Exception e)
            {
                e.getMessage();
            }
            return user;   
        }
}
