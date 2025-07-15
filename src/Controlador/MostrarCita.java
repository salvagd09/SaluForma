
package Controlador;

import Modelo.Cita;
import Modelo.DAO.CitaDAO;

public class MostrarCita implements CRUDCita {
    private Cita cita;
    public MostrarCita(Cita cita){
        this.cita=cita;
    }
    @Override
    public int actuar() {
      CitaDAO dao=new CitaDAO();
      int resultado=dao.EjecutarCRUD("Mostrar",cita);
      dao.EjecutarCRUD("Mostrar",cita);
      return resultado;
    } 
    
}
