
package Controlador;

import Modelo.Cita;
import Vista.PanelPacientes;
import javax.swing.JPanel;

public class ModuloPacientes implements Modulos {
<<<<<<< HEAD
    Cita cita;
    public ModuloPacientes(Cita cita){
        this.cita=cita;
    }
=======
    private Cita cita;
>>>>>>> 05ea94865f80c69ed3cfbd4ff3039d7611ce2208
    @Override
    public JPanel obtenerPanel() {
         return new PanelPacientes(cita);
    }
    
}
