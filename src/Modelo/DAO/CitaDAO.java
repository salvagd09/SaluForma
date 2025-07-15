
package Modelo.DAO;
import Modelo.Cita;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
public class CitaDAO {
     public static int EjecutarCRUD(String operacion,Cita cita){
        int resultado=-1;
        try {
            Connection con = DBConnection.getInstancia1().getConexion();
            CallableStatement stmt=null;
             if ("Insertar".equalsIgnoreCase(operacion)) {
                stmt = con.prepareCall("CALL InsertarCita(?, ?, ?, ?, ?,?,?,?,?,?,?)");
                stmt.setString(1, cita.getDNI_Paciente());
                stmt.setString(2, cita.getDNI_Medico());
                stmt.setString(3, cita.getNombre_Completo());
                stmt.setString(4, cita.getTelefono());
                stmt.setString(5, cita.getNombre_Completo_Medico());
                stmt.setString(6, cita.getArea_Elegida());
                stmt.setDate(7, cita.getFecha());
                stmt.setDouble(8,cita.getPrecio());
                stmt.setString(9,cita.getMotivo());
                stmt.setString(10, cita.getEvaluacion_Realizada());
                stmt.setString(11, cita.getHora());
                resultado=stmt.executeUpdate();
            }
            else if ("Actualizar".equalsIgnoreCase(operacion)) {
                stmt = con.prepareCall("CALL ActualizarCita(?, ?, ?, ?, ?,?,?)");
                stmt.setInt(1,cita.getID_Cita());
                stmt.setString(2, cita.getArea_Elegida());
                stmt.setDate(3, cita.getFecha());
                stmt.setDouble(5,cita.getPrecio());
                stmt.setString(6,cita.getMotivo());
                stmt.setString(7, cita.getEvaluacion_Realizada());
                stmt.setString(8, cita.getHora());
                resultado=stmt.executeUpdate();
            } 
            else if ("Eliminar".equalsIgnoreCase(operacion)) {
                stmt = con.prepareCall("CALL EliminarCita(?)");
                stmt.setInt(1,cita.getID_Cita());
                resultado = stmt.executeUpdate();
            } 
            else if ("Mostrar".equalsIgnoreCase(operacion)) {
                stmt = con.prepareCall("CALL MostrarCita(?)");
                stmt.setInt(1,cita.getID_Cita());
                ResultSet rs = stmt.executeQuery();
                boolean encontrado=false;
                while (rs.next()) {
                    encontrado=true;
                    System.out.println("-------Datos de la cita------");
                    System.out.println("ID del Paciente:"+rs.getInt("ID_Paciente"));
                    System.out.println("Nombre del Paciente:"+rs.getString("Nombre_Paciente"));
                    System.out.println("ID del Medico: "+rs.getString("ID_Medico"));
                    System.out.println("Nombre del Medico:"+rs.getString("Nombre_Doctor"));
                    System.out.println("Area elegida por el paciente:"+rs.getString("Area_Elegida"));
                    System.out.println("Evaluacion realizada: "+rs.getString("Evaluacion_Realizada"));
                    System.out.println("Motivo de la cita:"+rs.getString("Motivo"));
                    System.out.println("Fecha de la cita: "+rs.getDate("Fecha"));
                    System.out.println("Hora de la cita:"+rs.getString("Hora"));
                      System.out.println("Telefono del paciente:"+rs.getString("Telefono"));
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
