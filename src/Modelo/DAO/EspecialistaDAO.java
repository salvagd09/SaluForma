
package Modelo.DAO;

import Modelo.Especialista_Derivacion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
public class EspecialistaDAO {
    public static int EjecutarCRUD(String operacion,Especialista_Derivacion especialista){
        int resultado=-1;
        try {
            Connection con = DBConnection.getInstancia1().getConexion();
            CallableStatement stmt=null;
             if ("Insertar".equalsIgnoreCase(operacion)) {
                stmt = con.prepareCall("CALL InsertarEspecialista(?, ?, ?, ?, ?)");
                stmt.setString(1, especialista.getNombres());
                stmt.setString(2, especialista.getApellidos());
                stmt.setString(3, especialista.getDNI());
                stmt.setString(4, especialista.getArea_correspondiente());
                stmt.setString(5,especialista.getTurno_pertenece());
                resultado=stmt.executeUpdate();
            } 
            else if ("Actualizar".equalsIgnoreCase(operacion)) {
                stmt = con.prepareCall("CALL ActualizarEspecialistaDerivacion(?, ?, ?, ?, ?)");
                stmt.setString(1, especialista.getNombres());
                stmt.setString(2, especialista.getApellidos());
                stmt.setString(3, especialista.getDNI());
                stmt.setString(4, especialista.getArea_correspondiente());
                stmt.setString(5,especialista.getTurno_pertenece());
                resultado=stmt.executeUpdate();
            } 
            else if ("Eliminar".equalsIgnoreCase(operacion)) {
                stmt = con.prepareCall("CALL EliminarEspecialistaDerivacion(?)");
                stmt.setString(1,especialista.getDNI());
                resultado = stmt.executeUpdate();
            } 
            else if ("Mostrar".equalsIgnoreCase(operacion)) {
                stmt = con.prepareCall("CALL MostrarEspecialistasDerivacion(?)");
                stmt.setString(1,especialista.getDNI());
                ResultSet rs = stmt.executeQuery();
                boolean encontrado=false;
                while (rs.next()) {
                    encontrado=true;
                    System.out.println("-------Datos del especialista seleccionado-------");
                    System.out.println("Nombre: " + rs.getString("Nombres_Especialista"));
                    System.out.println("Apellido: " + rs.getString("Apellidos_Especialista"));
                    System.out.println("DNI: " + rs.getString("DNI"));
                    System.out.println("Area a la que pertenece: "+rs.getString("Area_Correspondiente"));
                    System.out.println("Turno al que pertenece: "+rs.getString("Turno_Perteneciente"));
                    System.out.println("---------------------------");
                }
                if(!encontrado){
                    System.out.println("No encontraron nada");
                }
                resultado = 1;
            }
        }catch (SQLException e) {
            System.err.println("Error al ejecutar el procedimiento almacenado " + e.getMessage());
        }
        return resultado;
    }

}
