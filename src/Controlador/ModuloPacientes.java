
package Controlador;

import Modelo.Cita;
import Vista.PanelPacientes;
import javax.swing.JPanel;

public class ModuloPacientes implements Modulos {
    Cita cita;
    public ModuloPacientes(Cita cita){
        this.cita=cita;
    }
    @Override
    public JPanel obtenerPanel() {
         return new PanelPacientes(cita);
    }
    
}
