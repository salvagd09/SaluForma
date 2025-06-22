
package Controlador;

import Modelo.Cita;
import Modelo.Pago;

public class RealizarCitaCommand implements CommandRealizarCita {
    private Cita cita;
    private Pago pago;
    public RealizarCitaCommand(Cita cita, Pago pago) {
        this.cita = cita;
        this.pago = pago;
    }
    @Override
    public void execute() {
         try {
            // Aqui se inserta la cita
            int resultadoCita = CitaFactory.establecerOperacion("insertar", cita).actuar();
            if (resultadoCita <= 0) throw new RuntimeException("Error al insertar cita");
            // PA
            int resultadoPago = PagoFactory.establecerOperacion("insertarpago", cita, pago).actuar();
            if (resultadoPago <= 0) throw new RuntimeException("Error al insertar pago");
        } catch (RuntimeException e) {
            undo(); // Rollback en caso de error
            throw e; // Relanza la excepción para notificar a la capa superior
        }
    }
    @Override
    public void undo() {
         CitaFactory.establecerOperacion("eliminar", cita).actuar();
    }
}
