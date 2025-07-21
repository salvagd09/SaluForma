
package Modelo.DAO;
import Modelo.Paciente;
import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;
public class PacienteDAO {
       public static int ejecutarCRUD(String operacion, Paciente paciente) {
        int resultado = -1;
        try {
            Connection con = DBConnection.getInstancia1().getConexion();
            CallableStatement stmt=null;
             if ("Insertar".equalsIgnoreCase(operacion)) {
                stmt = con.prepareCall("CALL InsertarPacientes(?, ?, ?, ?, ?, ?, ?, ?,?)");
                stmt.setString(1, paciente.getNombres());
                stmt.setString(2, paciente.getApellidos());
                stmt.setString(3, paciente.getDni());
                stmt.setInt(4, paciente.getEdad());
                stmt.setDouble(5, paciente.getPeso());
                stmt.setString(6, paciente.getGenero());
                stmt.setDouble(7, paciente.getAltura());
                stmt.setString(8, paciente.getHabitos());
                stmt.setString(9,paciente.getTelefono());
                resultado=stmt.executeUpdate();
            } 
            else if ("Actualizar".equalsIgnoreCase(operacion)) {
                stmt = con.prepareCall("CALL ActualizarPacientes(?, ?, ?, ?, ?, ?, ?, ?)");
                stmt.setString(1, paciente.getNombres());
                stmt.setString(2, paciente.getApellidos());
                stmt.setString(3, paciente.getDni());
                stmt.setInt(4, paciente.getEdad());
                stmt.setDouble(5, paciente.getPeso());
                stmt.setString(6, paciente.getGenero());
                stmt.setDouble(7, paciente.getAltura());
                stmt.setString(8, paciente.getHabitos());
                resultado=stmt.executeUpdate();
            } 
            else if ("Eliminar".equalsIgnoreCase(operacion)) {
                stmt = con.prepareCall("CALL EliminarPacientes(?)");
                stmt.setString(1,paciente.getDni());
                resultado = stmt.executeUpdate();
            } 
            else if ("Mostrar".equalsIgnoreCase(operacion)) {
                stmt = con.prepareCall("CALL MostrarPacientes(?)");
                stmt.setString(1,paciente.getDni());
                ResultSet rs = stmt.executeQuery();
                boolean encontrado=false;
                while (rs.next()) {
                    encontrado=true;
                    System.out.println("-------Datos del paciente seleccionado-------");
                    System.out.println("Nombre: " + rs.getString("Nombres_paciente"));
                    System.out.println("Apellido: " + rs.getString("Apellidos_Paciente"));
                    System.out.println("DNI: " + rs.getString("DNI"));
                    System.out.println("Edad: " + rs.getInt("Edad"));
                    System.out.println("Peso: " + rs.getDouble("Peso"));
                    System.out.println("Genero: " + rs.getString("Genero"));
                    System.out.println("Altura: " + rs.getDouble("Altura"));
                    System.out.println("Habitos: " + rs.getString("Habitos"));
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
