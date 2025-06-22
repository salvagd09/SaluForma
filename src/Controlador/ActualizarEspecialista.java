
package Controlador;

import Modelo.DAO.EspecialistaDAO;
import Modelo.Especialista_Derivacion;

public class ActualizarEspecialista implements CRUDEspecialista  {
    private Especialista_Derivacion especialista;
    public ActualizarEspecialista(Especialista_Derivacion especialista) {
        this.especialista=especialista;
    }
    @Override
    public void actuar() {
       EspecialistaDAO dao=new EspecialistaDAO();
       int resultado=dao.EjecutarCRUD("Actualizar",especialista);
       if(resultado==1){
           System.out.println("La actualizacion del especialista ha sido exitosa.");
           System.out.println("----------------");
       }else{
           System.out.println("La actualizacion del especialista no funciono.");
            System.out.println("----------------");
       }
    }

}
