/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DAO;

import Modelo.Cita;
import Modelo.Pago;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author SALVADOR
 */
public class PagoDAO {
     public static int EjecutarCRUD(String operacion,Cita cita,Pago pago){
        int resultado=-1;
        try {
            Connection con = DBConnection.getInstancia1().getConexion();
            CallableStatement stmt=null;
        if("insertarpago".equalsIgnoreCase(operacion)){
               stmt=con.prepareCall("CALL InsertarPagoenCita(?;?,?,?,?,?,?)");
               stmt.setString(1,cita.getNombre_Completo());
               stmt.setString(2, cita.getNombre_Completo_Medico());
               stmt.setDate(3, cita.getFecha());
               stmt.setString(4, pago.getCodigo_Boleta());
               stmt.setString(5, pago.getMetodo_de_Pago());
               stmt.setDouble(6, pago.getMonto_de_Pago());
               stmt.setString(5, pago.getEstado_de_Pago());
        }
        else if("cancelarpago".equalsIgnoreCase(operacion)){
            stmt=con.prepareCall("CALL CancelarPago(?)");
             stmt.setString(1, pago.getCodigo_Boleta());
        }
        }catch (SQLException e) {
            System.err.println("Error al ejecutar el procedimiento almacenado " + e.getMessage());
        }
        return resultado; 
     }
     }

