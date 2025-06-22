
package Controlador;

import Vista.PanelNotificaciones;
import javax.swing.JPanel;

public class ModuloRecordatorios implements Modulos  {
    @Override
    public JPanel obtenerPanel() {
       return new PanelNotificaciones();
    }

}
