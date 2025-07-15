
package Controlador;


import Modelo.Cita;
import Modelo.DAO.PagoDAO;
import Modelo.Pago;

public class CancelarPago implements AccionesPago {
    private Pago pago;
    private Cita cita;
    public CancelarPago(Pago pago, Cita cita) {
        this.pago = pago;
        this.cita = cita;
    }
    @Override
    public int actuar() {
       PagoDAO pago2=new PagoDAO();
       int resultado=pago2.EjecutarCRUD("cancelarpago",cita,pago);
       return resultado;
    }
}
