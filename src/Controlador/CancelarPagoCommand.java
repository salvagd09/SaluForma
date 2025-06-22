
package Controlador;

import Modelo.Cita;
import Modelo.Pago;

public class CancelarPagoCommand implements CommandPago {
    private Pago pago;
    private Cita cita;
    @Override
    public void execute() {
       PagoFactory.establecerOperacion("cancelarpago",cita,pago).actuar();
    }
}
