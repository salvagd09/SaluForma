
package Modelo;

import Controlador.ObservadorEventoPreventivo;
import Controlador.ObservadorRecomendacion;
import Modelo.Implementaciones.Evaluarsalud;
import javax.swing.JOptionPane;
import Controlador.ObservadorRecordatorio;
import Controlador.ObservarPlanAlimentacion;
import Controlador.ObservarRutinaFisica;
/*Aqui se usa el Prototype mediante la interfaz Cloneable*/
public class Paciente extends Evaluarsalud implements Cloneable,ObservadorRecordatorio,ObservadorEventoPreventivo,ObservadorRecomendacion,ObservarPlanAlimentacion,ObservarRutinaFisica {
    
    private String nombres;
    private String apellidos;
    private String dni;
    private int edad;
    private String telefono;
    private double peso;
    private String genero;
    private double altura;
    private String habitos;

    // Constructor
    public Paciente(String nombres, String apellidos,String telefono, String dni, int edad, double peso, String genero, double altura, String habitos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.genero = genero;
        this.telefono=telefono;
        this.altura = altura;
        this.habitos = habitos;
    }
    public Paciente() {
    }
    public Paciente(String dni) {
        this.dni = dni;
    }
    public void setNombres(String nombres) {this.nombres = nombres;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}
    public void setDni(String dni) {this.dni = dni;}
    public void setEdad(int edad) {this.edad = edad;}
    public void setPeso(double peso) {this.peso = peso;}
    public void setGenero(String genero) {this.genero = genero;}
    public void setAltura(double altura) {this.altura = altura;}
    public void setHabitos(String habitos) {this.habitos = habitos;}
    public String getDni() {return dni;}
    public String getNombres() { return nombres; }
    public String getApellidos() { return apellidos; }
    public String getGenero() { return genero; }
    public int getEdad() { return edad; }
    public double getPeso() { return peso; }
    public double getAltura() { return altura; }
    public String getHabitos() { return habitos; }
    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}


  /*Metodo Prototype para clonar al objeto proveniente de paciente*/
     @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void actualizar2(String origen, String destinatario, String mensaje) {
        JOptionPane.showMessageDialog(null,"Datos del recordatorio:\nOrigen del mensaje:"+origen+
                "\nDestinatario del mensaje:"+destinatario+
                "\nContenido del mensaje:"+mensaje,
                "Recordatorio de cita",JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void actualizar(String origen, String destinatario, String Motivo, String mensaje) {
       JOptionPane.showMessageDialog(null,"Datos del recordatorio:\nOrigen del mensaje:"+origen+
                "\nDestinatario del mensaje:"+destinatario+
                "\n Tipo de evento medico:"+Motivo+
                "\nContenido del mensaje:"+mensaje,
                "Notificacion de evento medico",JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void actualizar3(String origen, String pacientes, String mensaje) {
       JOptionPane.showMessageDialog(null,"Hola, lo saludamos de:"+origen+" para recomendarle que "+mensaje+" ya que usted es un paciente usual en el area de "+mensaje);
    }

    @Override
    public void actualizar5(String plan, String detalles) {
       JOptionPane.showMessageDialog(null, "Detalles del plan de alimentacion\nTipo de Plan:"+plan+"\nDetalles del plan:"+detalles);
    }

    @Override
    public void actualizar4(String area, String rutina, String Actfisica) {
       JOptionPane.showMessageDialog(null, "Detalles del plan de actividad física\nRutina para los pacientes de:"+area+"\nNombre de la rutina:"+rutina+"\nActividades Fisicas a realizar:"+Actfisica);
    }

  }

