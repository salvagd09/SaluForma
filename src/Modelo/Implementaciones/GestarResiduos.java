
package Modelo.Implementaciones;

import Modelo.Interfaces.Notificaciones;
import Modelo.Interfaces.Registrar_residuos;
import Modelo.Interfaces.SugerenciasReciclaje;

public class GestarResiduos implements Registrar_residuos,SugerenciasReciclaje,Notificaciones{

    @Override
    public void registrarResiduo(String tipo, double cantidad) {
        System.out.println("Residuos registrados: " + tipo + " - " + cantidad + " kg");
    }

    @Override
    public String obtenerSugerencia(String tipoResiduo) {
          return "Sugerencia para " + tipoResiduo + ": reciclaje adecuado.";
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Notificación enviada: " + mensaje);
    }
    
}
