
package Controlador;

import Modelo.DAO.EspecialistaDAO;
import Modelo.Especialista_Derivacion;

public class MostrarEspecialista implements CRUDEspecialista {
     private Especialista_Derivacion especialista;
    public MostrarEspecialista(Especialista_Derivacion especialista) {
        this.especialista=especialista;
    }
    @Override
    public void actuar() {
       EspecialistaDAO dao=new EspecialistaDAO();
       dao.EjecutarCRUD("Mostrar",especialista);
    }

}
