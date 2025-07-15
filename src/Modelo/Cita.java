
package Modelo;
import java.sql.Date;
public class Cita {
    private int ID_Cita;
    private String DNI_Paciente;
    private String DNI_Medico;
    private String Nombre_Completo;
    private String Nombre_Completo_Medico;
    private String telefono;
    private String Area_Elegida;
    private Date Fecha;
    private double Precio;
    private String Motivo;
    private String Evaluacion_Realizada;
    private String Hora;
    public Cita() {
    }
    public String getDNI_Paciente() {
        return DNI_Paciente;
    }
    public int getID_Cita() {
        return ID_Cita;
    }
    public void setID_Cita(int ID_Cita) {
        this.ID_Cita = ID_Cita;
    }
    public void setDNI_Paciente(String DNI_Paciente) {
        this.DNI_Paciente = DNI_Paciente;
    }

    public String getDNI_Medico() {
        return DNI_Medico;
    }
    public void setDNI_Medico(String DNI_Medico) {
        this.DNI_Medico = DNI_Medico;
    }
    public String getArea_Elegida() {
        return Area_Elegida;
    }
    public void setArea_Elegida(String Area_Elegida) {
        this.Area_Elegida = Area_Elegida;
    }
    public Date getFecha() {
        return Fecha;
    }
    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    public String getMotivo() {
        return Motivo;
    }
    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }
    public String getEvaluacion_Realizada() {
        return Evaluacion_Realizada;
    }
    public void setEvaluacion_Realizada(String Evaluacion_Realizada) {
        this.Evaluacion_Realizada = Evaluacion_Realizada;
    }
    public String getHora() {
        return Hora;
    }
    public void setHora(String Hora) {
        this.Hora = Hora;
    }
    public String getNombre_Completo() {
        return Nombre_Completo;
    }
    public void setNombre_Completo(String Nombre_Completo) {
        this.Nombre_Completo = Nombre_Completo;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getNombre_Completo_Medico() {
        return Nombre_Completo_Medico;
    }
    public void setNombre_Completo_Medico(String Nombre_Completo_Medico) {
        this.Nombre_Completo_Medico = Nombre_Completo_Medico;
    }
}
