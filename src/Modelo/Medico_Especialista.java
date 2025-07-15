
package Modelo;

import Modelo.Interfaces.Comunicarse_con_el_paciente;

public class Medico_Especialista implements Cloneable,Comunicarse_con_el_paciente{
    private String Nombres;
    private String Apellidos;
    private String DNI;
    private String Area_Pertenece;
    private String Turno_Pertenece;
    public Medico_Especialista(String Nombres, String Apellidos, String DNI, String Area_Pertenece, String Turno_Pertenece) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.DNI = DNI;
        this.Area_Pertenece = Area_Pertenece;
        this.Turno_Pertenece = Turno_Pertenece;
    }
    public Medico_Especialista() {
    }
    public Medico_Especialista(String DNI) {
        this.DNI = DNI;
    }
    public String getNombres() {return Nombres;}
    public void setNombres(String Nombres) {this.Nombres = Nombres;}
    public String getApellidos() {return Apellidos;}
    public void setApellidos(String Apellidos) {this.Apellidos = Apellidos;}
    public String getDNI() {return DNI;}
    public void setDNI(String DNI) {this.DNI = DNI;}
    public String getArea_Pertenece() {return Area_Pertenece;}
    public void setArea_Pertenece(String Area_Pertenece) {this.Area_Pertenece = Area_Pertenece;}
    public String getTurno_Pertenece() {return Turno_Pertenece;}
    public void setTurno_Pertenece(String Turno_Pertenece) {this.Turno_Pertenece = Turno_Pertenece;}
    @Override
    public void interactuar_con_paciente(String nombre_usuario) {
       if(Turno_Pertenece.equals("8am - 1pm")){
            System.out.println("Buenos dias:"+nombre_usuario+
            ",mi nombre es: "+Nombres+""+Apellidos+" quisiera que me hablara sobre mas sobre el motivo de que este aqui."
                    + "En caso lo requiera se le haran algunos analisis mas para comprobar su enfermedad");
        }
        else if(Turno_Pertenece.equals("2pm - 6pm")){
            System.out.println("Buenas tardes:"+nombre_usuario+
            ",mi nombre es: "+Nombres+""+Apellidos+"quisiera que me hablara sobre mas sobre el motivo de que este aqui" + 
            "En caso lo requiera se le harán algunos analisis mas para comprobar su enfermedad");
        }
    }
    @Override
    public Medico_Especialista clone() {
        try {
            return (Medico_Especialista) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
