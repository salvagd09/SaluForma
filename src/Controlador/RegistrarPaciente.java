
package Controlador;

import Modelo.Paciente;
import Modelo.DAO.PacienteDAO;
public class RegistrarPaciente implements CRUDPaciente{
    private Paciente paciente;
    public RegistrarPaciente(Paciente paciente){
        this.paciente=paciente;
    }
    @Override
    public int actuar() {
       PacienteDAO pdao=new PacienteDAO();
       int resultado=pdao.ejecutarCRUD("Insertar",paciente);
       return resultado;
    }
}
