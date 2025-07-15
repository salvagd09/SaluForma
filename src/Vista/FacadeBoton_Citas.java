
package Vista;

import Modelo.Cita;

public class FacadeBoton_Citas implements Ventana {
    private final Cita cita;
    public FacadeBoton_Citas() {
        this.cita=new Cita();
    }    
    @Override
    public void Mostrar(Runnable siguiente) {
        /*Datos_Generales frame1 = new Datos_Generales(cita);
        frame1.setSiguiente(() -> {
            Confirmar_Cita2 confirmar = new Confirmar_Cita2(cita);
            confirmar.setSiguiente(()->{
                PrecioEM precio1=new PrecioEM(cita);
                precio1.setVisible(true);
                precio1.setLocationRelativeTo(null);
            });
            confirmar.setVisible(true);
            frame1.setVisible(false); 
        });
        frame1.setVisible(true);*/
    }
}
