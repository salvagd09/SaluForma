
package Controlador;

import Modelo.DAO.CitaDAO;
import Modelo.Cita;

public class RegistrarCita implements CRUDCita {
    private Cita cita;
    public RegistrarCita(Cita cita) {
        this.cita=cita;
    }
    @Override
    public int actuar() {
       CitaDAO dao=new CitaDAO();
       int resultado=dao.EjecutarCRUD("Insertar",cita);
       return resultado;
    }
}