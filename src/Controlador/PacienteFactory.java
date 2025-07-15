
package Controlador;

import Modelo.Paciente;

public abstract class PacienteFactory {
    public static CRUDPaciente establecerOperacion(String operacion,Paciente paciente){
        switch(operacion.toLowerCase()){
            case "insertar":
                return new RegistrarPaciente(paciente);
            case "mostrar":
                return new LeerPaciente(paciente);
            case "actualizar":
                return new ActualizarPaciente(paciente);
            case "eliminar":
                return new BorrarPaciente(paciente);
            default:
                throw new IllegalArgumentException("La operacion "+operacion+" no existe.");
        }
    }
}
