
package Controlador;

import Modelo.Cita;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ModuloProxy implements Modulos {
    private Modulos moduloReal;
    private final String tipoUsuario;
    private final String nombreModulo; // Cambiado a final
    private final Cita cita;

    // Unificar constructores
    public ModuloProxy(String tipoUsuario, String nombreModulo, Cita cita) {
        this.tipoUsuario = tipoUsuario;
        this.nombreModulo = nombreModulo;
        this.cita = cita;
    }

    @Override
    public JPanel obtenerPanel() {
        if (tieneAcceso()) {
            if (moduloReal == null) {
                moduloReal = crearModuloReal();
                if(moduloReal == null) {
                    JOptionPane.showMessageDialog(null, "Módulo no encontrado");
                    return new JPanel();
                }
            }
            return moduloReal.obtenerPanel();
        } else {
            JOptionPane.showMessageDialog(null, "Acceso denegado al módulo: " + nombreModulo);
            return new JPanel();
        }
    }
    private boolean tieneAcceso() {
        switch (tipoUsuario.toLowerCase()) {
            case "admin":
                return true;
            case "paciente":
                return nombreModulo.equals("Pacientes");
            case "medico":
                return nombreModulo.equals("Consejos") || nombreModulo.equals("Recordatorios");
            default:
                return false;
        }
    }

    private Modulos crearModuloReal() {
        switch (nombreModulo) {
            case "Pacientes":
                return new ModuloPacientes(cita);
            case "Consejos":
                return new ModuloConsejos();
            case "Recordatorios":
                return new ModuloRecordatorios();
            default:
                return null;
        }
    }
}
