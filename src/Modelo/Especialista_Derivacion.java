

package Modelo;
import Modelo.Interfaces.Comunicarse_con_el_paciente;
public class Especialista_Derivacion implements Cloneable,Comunicarse_con_el_paciente {
    private String Nombres;
    private String apellidos;
    private String DNI;
    private String Area_correspondiente;
    private String turno_pertenece;
    public Especialista_Derivacion(String Nombres, String apellidos, String DNI, String Area_correspondiente, String turno_pertenece) {
        this.Nombres = Nombres;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.Area_correspondiente = Area_correspondiente;
        this.turno_pertenece = turno_pertenece;
    }
    public Especialista_Derivacion() {
    }
    public Especialista_Derivacion(String DNI) {
        this.DNI = DNI;
    }
    public String getNombres() {
        return Nombres;
    }
    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public String getArea_correspondiente() {
        return Area_correspondiente;
    }
    public void setArea_correspondiente(String Area_correspondiente) {
        this.Area_correspondiente = Area_correspondiente;
    }
    public String getTurno_pertenece() {
        return turno_pertenece;
    }
    public void setTurno_pertenece(String turno_pertenece) {
        this.turno_pertenece = turno_pertenece;
    }
    @Override
    public void interactuar_con_paciente(String nombre_usuario) {
        if(turno_pertenece.equals("Manana")){
           System.out.println("Buenos dias, soy el/la laboratista"+Nombres+
                   ",por lo visto le tengo que sacar pruebas de...");
        }
        else if(turno_pertenece.equals("Tarde")){
           System.out.println("Buenos dias, soy el/la laboratista "+Nombres+
                   ",por lo visto le tengo que sacar pruebas de...");
        }
    }
    @Override
    public Especialista_Derivacion clone() {
        try {
            return (Especialista_Derivacion) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }    
}
