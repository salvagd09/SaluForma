
package App;

/*import Modelo.DAO.DBConnection;
import Modelo.Paciente;*/
import Vista.Ventanas_de_Usuarios;

public class Ejecutor {

    public static void main(String[] args) throws CloneNotSupportedException {
         javax.swing.SwingUtilities.invokeLater(() -> {
            Ventanas_de_Usuarios ventanaUsuarios = new Ventanas_de_Usuarios();
            ventanaUsuarios.setVisible(true);
        });
        
        /*Paciente p1=new Paciente();
        p1.setNombres("Salvador Vasco");
        p1.setAltura(1.63);
        p1.setPeso(63.2);
        p1.setEdad(23);
        p1.setHabitos("Jugar videojuegos");
        Paciente clon=(Paciente) p1.clone();
        System.out.println("Original:");
        p1.ingresarDatos();
        System.out.println("Clon");
        clon.ingresarDatos();
    DBConnection conexion1 = (DBConnection) DBConnection.getInstancia1();
        DBConnection conexion2 =(DBConnection) DBConnection.getInstancia1();/*
        System.out.println("Instancia 1: " + conexion1);
        System.out.println("Instancia 2: " + conexion2);
        */
        /*
        if (conexion1 == conexion2) {
            System.out.println("Ambas instancias son iguales (singleton funciona)");
        } else {
            System.out.println("Las instancias son diferentes (¡error!)");
        }*
        // Opcional: también puedes imprimir el objeto Connection
        System.out.println("Conexión 1: " + conexion1.getConexion());
        System.out.println("Conexión 2: " + conexion2.getConexion());*/
    }
    }

