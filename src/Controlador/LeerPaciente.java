
package Controlador;

import Modelo.DAO.PacienteDAO;
import Modelo.Paciente;

public class LeerPaciente implements CRUDPaciente  {
    private Paciente paciente;
    public LeerPaciente(Paciente paciente){
        this.paciente=paciente;
    }
    @Override
    public int actuar() {
      PacienteDAO pdao=new PacienteDAO();
      int resultado=pdao.ejecutarCRUD("Mostrar",paciente);
      pdao.ejecutarCRUD("Mostrar",paciente);
      return resultado;
    }
}
