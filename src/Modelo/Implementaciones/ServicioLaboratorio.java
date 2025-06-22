
package Modelo.Implementaciones;

import Modelo.Especialista_Derivacion;

public class ServicioLaboratorio {
    public String ir_a_pruebas(Especialista_Derivacion lab1){
        return "Ahora tengo que ir a sacarme prueba de con el laboratista "+lab1.getNombres()+lab1.getApellidos();
    }
}
