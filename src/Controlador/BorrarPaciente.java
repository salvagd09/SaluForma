
package Controlador;
import Modelo.DAO.PacienteDAO;
import Modelo.Paciente;
public class BorrarPaciente implements CRUDPaciente {
    private Paciente paciente;
    public BorrarPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    @Override
    public int actuar() {
       PacienteDAO pdao=new PacienteDAO();
       int resultado=pdao.ejecutarCRUD("Eliminar",paciente);
       return resultado;
    }
    
}
