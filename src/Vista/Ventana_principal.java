
package Vista;
import Controlador.CRUDPaciente;
import Controlador.PacienteFactory;
import Modelo.Cita;
import Modelo.Paciente;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ventana_principal extends javax.swing.JFrame {
    private final Color COLOR_POR_DEFECTO = new Color(0,0,0,0); // O usa null para transparente
    private final Color COLOR_SELECCIONADO = new Color(153, 217, 140);
    private String panel_Activo;
    private JPanel panelActual;
    private JButton botonSeleccionadoActual = null;
    private Cita cita;
    public Ventana_principal(Cita cita) {
    initComponents();
    this.cita=cita;
    RegistrarseP_btn.setText("Registrarse como \nPaciente");
    setLocationRelativeTo(null);
    setTitle("Ventana principal");
    configurarBotones();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Modulo_Pacientes = new javax.swing.JButton();
        BienestarBtn = new javax.swing.JButton();
        Recordatorio_Salud = new javax.swing.JButton();
        Boton_atajo = new javax.swing.JButton();
        contenedor = new javax.swing.JPanel();
        Boton_Aceptar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        RegistrarseP_btn = new javax.swing.JButton();
        Historial_observacionesBtn = new javax.swing.JButton();
        RealizarCita_btn = new javax.swing.JButton();
        Observar_Historialbtn = new javax.swing.JButton();
        GenerarRec_btn = new javax.swing.JButton();
        Rutina_actividades_btn = new javax.swing.JButton();
        Plan_de_alimentacionbtn = new javax.swing.JButton();
        Notificar_Eventos = new javax.swing.JButton();
        Enviar_recordatorios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(85, 143, 178));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        Modulo_Pacientes.setText("PACIENTES");
        Modulo_Pacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Modulo_Pacientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Modulo_Pacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modulo_PacientesActionPerformed(evt);
            }
        });
        jPanel2.add(Modulo_Pacientes);

        BienestarBtn.setText("CONSEJOS DE BIENESTAR");
        BienestarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BienestarBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BienestarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BienestarBtnActionPerformed(evt);
            }
        });
        jPanel2.add(BienestarBtn);

        Recordatorio_Salud.setText("RECORDATORIOS DE SALUD");
        Recordatorio_Salud.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Recordatorio_Salud.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Recordatorio_Salud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Recordatorio_SaludActionPerformed(evt);
            }
        });
        jPanel2.add(Recordatorio_Salud);

        Boton_atajo.setText("AGENDAR CITA");
        Boton_atajo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_atajo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Boton_atajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_atajoActionPerformed(evt);
            }
        });
        jPanel2.add(Boton_atajo);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));

        contenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 580, 430));

        Boton_Aceptar.setBackground(new java.awt.Color(138, 192, 102));
        Boton_Aceptar.setText("Aceptar");
        Boton_Aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_AceptarActionPerformed(evt);
            }
        });
        jPanel1.add(Boton_Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 150, 30));

        jButton2.setBackground(new java.awt.Color(218, 131, 136));
        jButton2.setText("<html>Cancelar y cerrar <br>el programa</html>");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 170, 30));

        RegistrarseP_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro.png"))); // NOI18N
        RegistrarseP_btn.setText("<html>Registrarse como <br>Paciente</html>");
        RegistrarseP_btn.setBorder(null);
        RegistrarseP_btn.setContentAreaFilled(false);
        RegistrarseP_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistrarseP_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseP_btnActionPerformed(evt);
            }
        });
        jPanel1.add(RegistrarseP_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 170, 30));

        Historial_observacionesBtn.setText("<html>Mostrar historial de <br>evaluaciones</html>");
        Historial_observacionesBtn.setBorder(null);
        Historial_observacionesBtn.setContentAreaFilled(false);
        Historial_observacionesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Historial_observacionesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Historial_observacionesBtnActionPerformed(evt);
            }
        });
        jPanel1.add(Historial_observacionesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 170, 40));

        RealizarCita_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cita.png"))); // NOI18N
        RealizarCita_btn.setText("Realizar Cita");
        RealizarCita_btn.setBorder(null);
        RealizarCita_btn.setContentAreaFilled(false);
        RealizarCita_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RealizarCita_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarCita_btnActionPerformed(evt);
            }
        });
        jPanel1.add(RealizarCita_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 170, -1));

        Observar_Historialbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Observar_Historial.png"))); // NOI18N
        Observar_Historialbtn.setText("Observar Historial");
        Observar_Historialbtn.setBorder(null);
        Observar_Historialbtn.setContentAreaFilled(false);
        Observar_Historialbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Observar_Historialbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Observar_HistorialbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Observar_Historialbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 170, -1));

        GenerarRec_btn.setText("<html>Generar recomendaciones<br>preventivas</html>");
        GenerarRec_btn.setBorder(null);
        GenerarRec_btn.setContentAreaFilled(false);
        GenerarRec_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GenerarRec_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarRec_btnActionPerformed(evt);
            }
        });
        jPanel1.add(GenerarRec_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 170, 50));

        Rutina_actividades_btn.setText("<html>Ofrecer rutinas de <br>actividad física</html>");
        Rutina_actividades_btn.setBorder(null);
        Rutina_actividades_btn.setContentAreaFilled(false);
        Rutina_actividades_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Rutina_actividades_btn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Rutina_actividades_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rutina_actividades_btnActionPerformed(evt);
            }
        });
        jPanel1.add(Rutina_actividades_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 170, 30));

        Plan_de_alimentacionbtn.setText("<html>Sugerir plan de <br>alimentación </html>");
        Plan_de_alimentacionbtn.setBorder(null);
        Plan_de_alimentacionbtn.setContentAreaFilled(false);
        Plan_de_alimentacionbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Plan_de_alimentacionbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Plan_de_alimentacionbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Plan_de_alimentacionbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 170, 40));

        Notificar_Eventos.setText("Notificar eventos medicos");
        Notificar_Eventos.setBorder(null);
        Notificar_Eventos.setContentAreaFilled(false);
        Notificar_Eventos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Notificar_Eventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Notificar_EventosActionPerformed(evt);
            }
        });
        jPanel1.add(Notificar_Eventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 170, 40));

        Enviar_recordatorios.setText("Enviar recordatorios");
        Enviar_recordatorios.setBorder(null);
        Enviar_recordatorios.setContentAreaFilled(false);
        Enviar_recordatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Enviar_recordatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enviar_recordatoriosActionPerformed(evt);
            }
        });
        jPanel1.add(Enviar_recordatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 170, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Modulo_PacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modulo_PacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Modulo_PacientesActionPerformed

    private void Recordatorio_SaludActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Recordatorio_SaludActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Recordatorio_SaludActionPerformed

    private void BienestarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BienestarBtnActionPerformed
        
    }//GEN-LAST:event_BienestarBtnActionPerformed

    private void Boton_atajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_atajoActionPerformed
        
    }//GEN-LAST:event_Boton_atajoActionPerformed

    private void RegistrarseP_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseP_btnActionPerformed
        seleccionarBoton(RegistrarseP_btn);
         Boton_Aceptar.setVisible(true);
        Registrar_Paciente r1=new Registrar_Paciente();
        panel_Activo="registrarse";
        contenedor.removeAll(); // Limpia el contenedor
        contenedor.setLayout(new BorderLayout());
        contenedor.add(r1, BorderLayout.CENTER); // Agrega el nuevo panel
        contenedor.revalidate(); // Revalida el layout
        contenedor.repaint();    // Redibuja el contenedor
    }//GEN-LAST:event_RegistrarseP_btnActionPerformed

    private void Historial_observacionesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Historial_observacionesBtnActionPerformed
      seleccionarBoton(Historial_observacionesBtn);
      Boton_Aceptar.setVisible(true);
    }//GEN-LAST:event_Historial_observacionesBtnActionPerformed

    private void RealizarCita_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarCita_btnActionPerformed
    seleccionarBoton(RealizarCita_btn);
    Boton_Aceptar.setVisible(false);
    Datos_Generales d1=new Datos_Generales(cita,contenedor);
    contenedor.removeAll(); // Limpia el contenedor
    contenedor.setLayout(new BorderLayout());
    contenedor.add(d1, BorderLayout.CENTER); // Agrega el nuevo panel
    contenedor.revalidate(); // Revalida el layout
    contenedor.repaint();    // Redibuja el contenedor
    }//GEN-LAST:event_RealizarCita_btnActionPerformed

    private void Observar_HistorialbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Observar_HistorialbtnActionPerformed
        seleccionarBoton(Observar_Historialbtn);
         Boton_Aceptar.setVisible(true);
    }//GEN-LAST:event_Observar_HistorialbtnActionPerformed

    private void GenerarRec_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarRec_btnActionPerformed
        seleccionarBoton(GenerarRec_btn);
         Boton_Aceptar.setVisible(true);
    }//GEN-LAST:event_GenerarRec_btnActionPerformed

    private void Rutina_actividades_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rutina_actividades_btnActionPerformed
        seleccionarBoton(Rutina_actividades_btn);
         Boton_Aceptar.setVisible(true);
    }//GEN-LAST:event_Rutina_actividades_btnActionPerformed

    private void Plan_de_alimentacionbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Plan_de_alimentacionbtnActionPerformed
        seleccionarBoton(Plan_de_alimentacionbtn);
         Boton_Aceptar.setVisible(true);
    }//GEN-LAST:event_Plan_de_alimentacionbtnActionPerformed

    private void Notificar_EventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Notificar_EventosActionPerformed
        seleccionarBoton(Notificar_Eventos);
         Boton_Aceptar.setVisible(true);
    }//GEN-LAST:event_Notificar_EventosActionPerformed

    private void Enviar_recordatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enviar_recordatoriosActionPerformed
        seleccionarBoton(Enviar_recordatorios);
         Boton_Aceptar.setVisible(true);
    }//GEN-LAST:event_Enviar_recordatoriosActionPerformed

    private void Boton_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AceptarActionPerformed
         int valor=JOptionPane.showConfirmDialog(null,"¿Deseas realizar esta operacion?",
                 "Alerta",JOptionPane.YES_NO_OPTION);
         if(valor==0){
        switch(panel_Activo){
            case "registrarse":
                insertarPaciente();
                break;
        }  
        }
    }//GEN-LAST:event_Boton_AceptarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int valor=JOptionPane.showConfirmDialog(null,"¿Deseas cancelar y cerrar todo?","Alerta",JOptionPane.YES_NO_OPTION);
        if(valor==0){
            this.dispose();
        } 
    }//GEN-LAST:event_jButton2ActionPerformed
private void configurarBotones() {
    // Lista de todos los botones que cambiarán de color
    JButton[] botones = {
        RegistrarseP_btn, Historial_observacionesBtn, RealizarCita_btn,
        Observar_Historialbtn, GenerarRec_btn, Rutina_actividades_btn,
        Plan_de_alimentacionbtn, Notificar_Eventos, Enviar_recordatorios
    };

    for (JButton boton : botones) {
        boton.setOpaque(false); 
        boton.setBorderPainted(false); 
        boton.setContentAreaFilled(false);
    }
}
private void seleccionarBoton(JButton boton) {
    if (boton == null) return; // Seguridad

    // Restaura el botón anterior
    if (botonSeleccionadoActual != null) {
        botonSeleccionadoActual.setBackground(COLOR_POR_DEFECTO);
        botonSeleccionadoActual.setOpaque(false);
        botonSeleccionadoActual.setContentAreaFilled(false);
    }

    // Selecciona el nuevo botón
    boton.setBackground(COLOR_SELECCIONADO);
    boton.setContentAreaFilled(true);
    boton.setOpaque(true);
    botonSeleccionadoActual = boton;
}
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_principal(new Cita()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BienestarBtn;
    private javax.swing.JButton Boton_Aceptar;
    private javax.swing.JButton Boton_atajo;
    private javax.swing.JButton Enviar_recordatorios;
    private javax.swing.JButton GenerarRec_btn;
    private javax.swing.JButton Historial_observacionesBtn;
    private javax.swing.JButton Modulo_Pacientes;
    private javax.swing.JButton Notificar_Eventos;
    private javax.swing.JButton Observar_Historialbtn;
    private javax.swing.JButton Plan_de_alimentacionbtn;
    private javax.swing.JButton RealizarCita_btn;
    private javax.swing.JButton Recordatorio_Salud;
    private javax.swing.JButton RegistrarseP_btn;
    private javax.swing.JButton Rutina_actividades_btn;
    private javax.swing.JPanel contenedor;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private void insertarPaciente() {
        try{
           Registrar_Paciente panelpaciente=(Registrar_Paciente) contenedor.getComponent(0);
           Paciente paciente2=panelpaciente.getPacienteFromForm();
           guardarPacienteenBD(paciente2);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error en formato numérico: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void guardarPacienteenBD(Paciente paciente) {
       CRUDPaciente operacion = PacienteFactory.establecerOperacion("insertar", paciente);
       int resultado = operacion.actuar();
       if (resultado > 0) {
        JOptionPane.showMessageDialog(this, "Registro realizado correctamente");
       } else {
        JOptionPane.showMessageDialog(this, "Error al registrar al paciente");
       }
    }
    }
