
package Controlador;

<<<<<<< HEAD
import Modelo.Cita;
=======
>>>>>>> 05ea94865f80c69ed3cfbd4ff3039d7611ce2208
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ModuloProxy implements Modulos {
    private Modulos moduloReal;
    private final String tipoUsuario;
    private final String nombreModulo;
<<<<<<< HEAD
    private final Cita cita;
    public ModuloProxy(String tipoUsuario, String nombreModulo,Cita cita) {
        this.tipoUsuario = tipoUsuario;
        this.cita=cita;
=======

    public ModuloProxy(String tipoUsuario, String nombreModulo) {
        this.tipoUsuario = tipoUsuario;
>>>>>>> 05ea94865f80c69ed3cfbd4ff3039d7611ce2208
        this.nombreModulo = nombreModulo;
    }
    @Override
    public JPanel obtenerPanel() {
        if (tieneAcceso()) {
            if (moduloReal == null) {
                moduloReal = crearModuloReal();
            }
            return moduloReal.obtenerPanel();
        } else {
            JOptionPane.showMessageDialog(null, "Lo siento. Usted no puede acceder  a este modulo");
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
<<<<<<< HEAD
                return new ModuloPacientes(cita);
=======
                return new ModuloPacientes();
>>>>>>> 05ea94865f80c69ed3cfbd4ff3039d7611ce2208
            case "Consejos":
                return new ModuloConsejos();
            case "Recordatorios":
                return new ModuloRecordatorios();
            default:
                return null;
        }
    }
}
