package DataAccess;

import Exceptions.DataException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Singleton 
{ 
    private static Connection connexionUnique;
    
    public static Connection getInstance() throws DataException
    { 
        if (connexionUnique == null)
        {
            try
            {
                Context ctx = new InitialContext();
                DataSource source = (DataSource)ctx.lookup("jdbc/BrassLagneaux");
                connexionUnique = source.getConnection();
            }
            catch(SQLException ex) 
            {
                throw new DataException();
            } 
            catch(NamingException ex) 
            {
                throw new DataException();
            }
        }
        return connexionUnique;
    }
    
    public static void fermerConnexion() throws DataException
    {
        if(connexionUnique != null)
        {
            try
            {
                connexionUnique.close();
                
            }
            catch(SQLException e)
            {
                throw new DataException();
            }
        }
    }
}

---------------------------------------------------------------------
package Exceptions;

public class DataException extends Exception 
{
    
    public String getMessage ()
    {
        return "Une erreur est survenue lors de la connexion";
    }
}
