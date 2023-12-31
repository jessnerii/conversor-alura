/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import modelo.MonedaConversion;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class MonedaFrame extends javax.swing.JFrame {

    /**
     * Creates new form MonedaFrame
     */
    public MonedaFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        monedaName = new javax.swing.JComboBox<>();
        monedaName2 = new javax.swing.JComboBox<>();
        cantidadDinero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        convertirMonedaBoton = new javax.swing.JButton();
        cancelarMonedaBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(177, 180, 195));

        jLabel1.setFont(new java.awt.Font("Dubai Medium", 0, 24)); // NOI18N
        jLabel1.setText("¿De qué moneda?");

        jLabel2.setFont(new java.awt.Font("Dubai Medium", 0, 24)); // NOI18N
        jLabel2.setText("¿A qué moneda?");

        monedaName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peso (MXN)", "Dolar (USD)", "Euro (EUR)", "Libra Esterlina (GBP)", "Yen Japones (JPY)", "Won sur-coreano (KRW)" }));
        monedaName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monedaNameActionPerformed(evt);
            }
        });

        monedaName2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peso (MXN)", "Dolar (USD)", "Euro (EUR)", "Libra Esterlina (GBP)", "Yen Japones (JPY)", "Won sur-coreano (KRW)" }));
        monedaName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monedaName2ActionPerformed(evt);
            }
        });

        cantidadDinero.setBackground(new java.awt.Color(209, 217, 220));
        cantidadDinero.setForeground(new java.awt.Color(130, 128, 136));
        cantidadDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadDineroActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jLabel3.setText("Ingrese la cantidad de dinero a convertir:");

        convertirMonedaBoton.setBackground(new java.awt.Color(130, 128, 136));
        convertirMonedaBoton.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        convertirMonedaBoton.setForeground(new java.awt.Color(255, 255, 255));
        convertirMonedaBoton.setText("Convertir");
        convertirMonedaBoton.setAutoscrolls(true);
        convertirMonedaBoton.setBorderPainted(false);
        convertirMonedaBoton.setFocusPainted(false);
        convertirMonedaBoton.setFocusable(false);
        convertirMonedaBoton.setRequestFocusEnabled(false);
        convertirMonedaBoton.setVerifyInputWhenFocusTarget(false);
        convertirMonedaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirMonedaBotonActionPerformed(evt);
            }
        });

        cancelarMonedaBoton.setBackground(new java.awt.Color(130, 128, 136));
        cancelarMonedaBoton.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        cancelarMonedaBoton.setForeground(new java.awt.Color(255, 255, 255));
        cancelarMonedaBoton.setText("Cancelar");
        cancelarMonedaBoton.setAutoscrolls(true);
        cancelarMonedaBoton.setBorderPainted(false);
        cancelarMonedaBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelarMonedaBoton.setFocusPainted(false);
        cancelarMonedaBoton.setFocusable(false);
        cancelarMonedaBoton.setRequestFocusEnabled(false);
        cancelarMonedaBoton.setVerifyInputWhenFocusTarget(false);
        cancelarMonedaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarMonedaBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cancelarMonedaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                        .addComponent(convertirMonedaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(monedaName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(monedaName2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cantidadDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monedaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monedaName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(cantidadDinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarMonedaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convertirMonedaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantidadDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadDineroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadDineroActionPerformed

    private void convertirMonedaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirMonedaBotonActionPerformed
        String monedaOrigen = MonedaConversion.obtenerCodigoMoneda(monedaName.getSelectedItem().toString());
        String monedaDestino = MonedaConversion.obtenerCodigoMoneda(monedaName2.getSelectedItem().toString());

        if (monedaOrigen.isEmpty() || monedaDestino.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una moneda de origen y una moneda de destino válidas.");
            return;
        }
        String cantidad = cantidadDinero.getText().trim();

        if (cantidad.isEmpty() || !MonedaConversion.validarInput(cantidad)) {
            JOptionPane.showMessageDialog(null, "Los datos no son válidos. Por favor, introduzca solo números.");
            return;
        }

        double cantidadDouble = Double.parseDouble(cantidad);
        double factorConversion = MonedaConversion.obtenerFactorConversionDesdeAPI(monedaOrigen, monedaDestino);

        if (factorConversion != 0.0) {
            double resultado = cantidadDouble * factorConversion;
            JOptionPane.showMessageDialog(null, cantidad + " " + monedaOrigen + " son " + resultado + " " + monedaDestino);
        }

        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea hacer otra conversión?",
                "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if (confirmacion == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Saliendo del programa");
            System.exit(0);
        }
    }//GEN-LAST:event_convertirMonedaBotonActionPerformed

    private void cancelarMonedaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarMonedaBotonActionPerformed
        Pantalla pantalla = new Pantalla();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_cancelarMonedaBotonActionPerformed

    private void monedaNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monedaNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monedaNameActionPerformed

    private void monedaName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monedaName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monedaName2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarMonedaBoton;
    public static javax.swing.JTextField cantidadDinero;
    private javax.swing.JButton convertirMonedaBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> monedaName;
    private javax.swing.JComboBox<String> monedaName2;
    // End of variables declaration//GEN-END:variables
}
