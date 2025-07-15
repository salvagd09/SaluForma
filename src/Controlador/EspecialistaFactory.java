
package Controlador;

import Modelo.Especialista_Derivacion;

public abstract class EspecialistaFactory {
    public static CRUDEspecialista establecerOperacion(String operacion,Especialista_Derivacion especialista){
        switch(operacion.toLowerCase()){
            case "insertar":
                return new RegistrarEspecialista(especialista);
            case "mostrar":
                return new MostrarEspecialista(especialista);
            case "actualizar":
                return new ActualizarEspecialista(especialista);
            case "eliminar":
                return new EliminarEspecialista(especialista);
            default:
                throw new IllegalArgumentException("La operacion "+operacion+" no existe.");
        }
    }
}
