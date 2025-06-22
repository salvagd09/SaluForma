
package Controlador;

import Modelo.Cita;
import Modelo.DAO.CitaDAO;

public class EliminarCita implements CRUDCita {
    private Cita cita;
    public EliminarCita(Cita cita) {
        this.cita=cita;
    }
    @Override
    public int actuar() {
       CitaDAO dao=new CitaDAO();
       int resultado=dao.EjecutarCRUD("Eliminar",cita);
       return resultado;
    } 
}
