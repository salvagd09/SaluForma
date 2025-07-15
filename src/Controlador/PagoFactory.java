
package Controlador;


import Modelo.Cita;
import Modelo.Pago;

public abstract class PagoFactory {
     public static AccionesPago establecerOperacion(String operacion,Cita cita,Pago pago){
        switch(operacion.toLowerCase()){
            case "insertarpago":
                return new InsertarPago(pago,cita);
            case "cancelarpago":
                return new CancelarPago(pago,cita);
            default:
                throw new IllegalArgumentException("La operacion "+operacion+" no existe.");
        }
}
}
