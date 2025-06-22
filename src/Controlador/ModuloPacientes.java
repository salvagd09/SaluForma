
package Controlador;

import Modelo.Cita;
import Vista.PanelPacientes;
import javax.swing.JPanel;

public class ModuloPacientes implements Modulos {
    private Cita cita;
    @Override
    public JPanel obtenerPanel() {
         return new PanelPacientes(cita);
    }
    
}
