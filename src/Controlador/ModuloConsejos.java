
package Controlador;

import Vista.PanelBienestar;
import javax.swing.JPanel;

public class ModuloConsejos implements Modulos  {
    @Override
    public JPanel obtenerPanel() {
        return new PanelBienestar();
    }

}
