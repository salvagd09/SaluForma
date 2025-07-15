
package Modelo;
public class Pago {
    private String Metodo_de_Pago;
    private double Monto_de_Pago;
    private String Estado_de_Pago;
    private String Codigo_Boleta;

    public String getMetodo_de_Pago() {
        return Metodo_de_Pago;
    }

    public void setMetodo_de_Pago(String Metodo_de_Pago) {
        this.Metodo_de_Pago = Metodo_de_Pago;
    }

    public double getMonto_de_Pago() {
        return Monto_de_Pago;
    }

    public void setMonto_de_Pago(double Monto_de_Pago) {
        this.Monto_de_Pago = Monto_de_Pago;
    }

    public String getEstado_de_Pago() {
        return Estado_de_Pago;
    }

    public void setEstado_de_Pago(String Estado_de_Pago) {
        this.Estado_de_Pago = Estado_de_Pago;
    }

    public String getCodigo_Boleta() {
        return Codigo_Boleta;
    }

    public void setCodigo_Boleta(String Codigo_Boleta) {
        this.Codigo_Boleta = Codigo_Boleta;
    }
    
}
