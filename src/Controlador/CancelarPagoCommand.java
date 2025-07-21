
package Controlador;

import Modelo.Cita;
import Modelo.Pago;
import javax.swing.JOptionPane;

public class CancelarPagoCommand implements CommandPago {
 private Pago pago;
    private Cita cita;

    public CancelarPagoCommand(Cita cita, Pago pago) {
        this.pago = pago;
        this.cita = cita;
    }

    @Override
    public void execute() {
        try {
            // Aqui se inserta la cita
            int resultadoCancelarPago = PagoFactory.establecerOperacion("cancelarpago", cita, pago).actuar();
            if (resultadoCancelarPago <= 0) throw new RuntimeException("Error al cancelar pago");
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null,"Error al conectar con la base de datos y cancelar todo"); // Rollback en caso de error
            throw e; // Relanza la excepción para notificar a la capa superior
        } 
    }

}
