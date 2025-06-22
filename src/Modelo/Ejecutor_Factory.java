
package Modelo;

import Controlador.CRUDEspecialista;
import Controlador.CRUDPaciente;
import Controlador.PacienteFactory;
import Controlador.EspecialistaFactory;

public class Ejecutor_Factory {

    public static void main(String[] args) {
        Paciente pacienteCrear=new Paciente("Mario Raul","Romero Alva","948356145","7111584",
                25,78.2,"Masculino",1.68,"Estar sentado todo el dia");
        //Para crear un paciente
        CRUDPaciente Operacion1=PacienteFactory.establecerOperacion("Insertar", pacienteCrear);
        Operacion1.actuar();
        //Para actualizar un paciente
        pacienteCrear.setNombres("Mario Rodrigo");
        pacienteCrear.setPeso(75.4);
        CRUDPaciente Operacion2=PacienteFactory.establecerOperacion("Actualizar", pacienteCrear);
        Operacion2.actuar();
        //Para mostrar un paciente(Se usó un paciente que ya se encuentra en la BD)
        Paciente pacienteMostrar=new Paciente("76953421");
        CRUDPaciente Operacion3=PacienteFactory.establecerOperacion("Mostrar", pacienteMostrar);
        Operacion3.actuar();
        //Para eliminar un paciente(Se usa el pacienteCrear del inicio)
        Paciente pacienteEliminar=new Paciente(pacienteCrear.getDni());
        CRUDPaciente Operacion4=PacienteFactory.establecerOperacion("Eliminar", pacienteEliminar);
        Operacion4.actuar();
        Especialista_Derivacion especialistaCrear=new Especialista_Derivacion("Juan Carlos","Bodoque Andrade","71536894","Gastroenterologia","Manana");
        //Para crear un especialista
        CRUDEspecialista Operacion5=EspecialistaFactory.establecerOperacion("Insertar", especialistaCrear);
        Operacion5.actuar();
        //Para actualizar un especialista
        especialistaCrear.setNombres("Juan Cesar");
        especialistaCrear.setTurno_pertenece("Tarde");
        CRUDEspecialista Operacion6=EspecialistaFactory.establecerOperacion("Actualizar", especialistaCrear);
        Operacion6.actuar();
        //Para mostrar un especialista
        CRUDEspecialista Operacion7=EspecialistaFactory.establecerOperacion("Mostrar", especialistaCrear);
        Operacion7.actuar();
        //Para eliminar un especialista
        CRUDEspecialista Operacion8=EspecialistaFactory.establecerOperacion("Eliminar",especialistaCrear);
        Operacion8.actuar();
    }   
    
}
