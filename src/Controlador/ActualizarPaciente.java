
package Controlador;

import Modelo.Paciente;
import Modelo.DAO.PacienteDAO;
public class ActualizarPaciente implements CRUDPaciente {
    private Paciente paciente;
    public ActualizarPaciente(Paciente paciente){
        this.paciente=paciente;
    }
    @Override
    public int actuar() {
       PacienteDAO pdao=new PacienteDAO();
       int resultado=pdao.ejecutarCRUD("Actualizar",paciente);
       return resultado;
    }
}
