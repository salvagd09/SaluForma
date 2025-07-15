
package Controlador;
import Modelo.DAO.CitaDAO;
import Modelo.Cita;
public class ActualizarCita implements CRUDCita {
    private Cita cita;
    public ActualizarCita(Cita cita) {
        this.cita=cita;
    }
    @Override
    public int actuar() {
       CitaDAO dao=new CitaDAO();
       int resultado=dao.EjecutarCRUD("Actualizar",cita);
       return resultado;
    } 
}
