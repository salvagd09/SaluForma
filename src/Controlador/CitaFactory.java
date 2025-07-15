
package Controlador;

import Modelo.Cita;
public abstract class CitaFactory {
    public static CRUDCita establecerOperacion(String operacion,Cita cita){
        switch(operacion.toLowerCase()){
            case "insertar":
                return new RegistrarCita(cita);
            case "mostrar":
                return new MostrarCita(cita);
            case "actualizar":
                return new ActualizarCita(cita);
            case "eliminar":
                return new EliminarCita(cita);
            default:
                throw new IllegalArgumentException("La operacion "+operacion+" no existe.");
        }
    }
}
