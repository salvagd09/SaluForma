
package Modelo.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
    /*Aqui se usa Singleton ya que solo se instancia a la conexion 1 vez*/
    private static DBConnection instancia1;
    private Connection conexion;
    /*Este constructor evita que se pueda instanciar la clase de forma externa*/
    private DBConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conexion=DriverManager.getConnection(DBManager.urlMySQL, DBManager.user, DBManager.password);
        }
        catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /*Este metodo es el unico capaz instanciar la clase y solo lo hace 1 vez*/
    public static DBConnection getInstancia1(){
        if(instancia1==null){
            synchronized (DBConnection.class) {
                if (instancia1 == null) {
                    instancia1 = new DBConnection();
                }
            }
        }
        return instancia1;
        }
    /*Sirve para obtener la informacion sobre la ubicacion de la BD*/
    public Connection getConexion(){
        try {
        if (conexion == null || conexion.isClosed()) {
            // Reabrir la conexión
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(DBManager.urlMySQL, DBManager.user, DBManager.password);
        }
        } catch (SQLException | ClassNotFoundException e) {
        e.printStackTrace();
        }
        return conexion;
    }
  }
