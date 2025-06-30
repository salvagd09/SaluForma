
package Controlador;

import Modelo.Cita;
import Modelo.Pago;

public class CancelarPagoCommand implements CommandPago {
 private Pago pago;
    private Cita cita;

    public CancelarPagoCommand(Pago pago, Cita cita) {
        this.pago = pago;
        this.cita = cita;
    }

    @Override
    public void execute() {
        if (pago == null || pago.getCodigo_Boleta() == null) {
            throw new RuntimeException("El objeto Pago o el código de boleta es null.");
        }
        PagoFactory.establecerOperacion("cancelarpago", cita, pago).actuar(); 
    }

}
