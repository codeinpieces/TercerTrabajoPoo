package Parte1;
/**
 *
 * @author sebastian
 */
public class Punto3_20 extends javax.swing.JFrame {

    /**
     * Creates new form Punto3_20
     */
    public Punto3_20() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        formulario = new javax.swing.JPanel();
        enviar = new javax.swing.JButton();
        ladoLabel = new javax.swing.JLabel();
        ladoInput = new javax.swing.JTextField();
        Respuesta = new javax.swing.JPanel();
        areaAns = new javax.swing.JLabel();
        perimetroAns = new javax.swing.JLabel();
        alturaAns = new javax.swing.JLabel();
        mensajeAns = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Punto3_20");
        setBackground(new java.awt.Color(249, 249, 249));
        setName("ventana"); // NOI18N

        titulo.setText("Punto3.20");

        formulario.setBackground(new java.awt.Color(227, 227, 227));

        enviar.setText("Enviar");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        ladoLabel.setText("Lado:");

        ladoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ladoInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formularioLayout = new javax.swing.GroupLayout(formulario);
        formulario.setLayout(formularioLayout);
        formularioLayout.setHorizontalGroup(
            formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioLayout.createSequentialGroup()
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formularioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ladoInput))
                    .addGroup(formularioLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(ladoLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(formularioLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(enviar)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        formularioLayout.setVerticalGroup(
            formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formularioLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(ladoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ladoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enviar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Respuesta.setBackground(new java.awt.Color(210, 201, 201));

        areaAns.setText("Area:");

        perimetroAns.setText("Perimetro:");

        alturaAns.setText("Altura:");

        javax.swing.GroupLayout RespuestaLayout = new javax.swing.GroupLayout(Respuesta);
        Respuesta.setLayout(RespuestaLayout);
        RespuestaLayout.setHorizontalGroup(
            RespuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RespuestaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RespuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(areaAns)
                    .addComponent(perimetroAns)
                    .addComponent(alturaAns)
                    .addComponent(mensajeAns))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RespuestaLayout.setVerticalGroup(
            RespuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RespuestaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mensajeAns)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(areaAns)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perimetroAns)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alturaAns)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(titulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Respuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(formulario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String mensaje;
        double area,perimetro,altura,lado;
        double pi=3.14;
        try{
            lado=Double.parseDouble(ladoInput.getText());
            
            mensaje="Mensajes introducidos correctamente";
            mensajeAns.setText(mensaje);
            
            
            perimetro= lado*3;
            altura=(lado*1.73)/2;
            area=(lado*lado* 1.73) /4;
            
            
            areaAns.setText("Area: "+String.valueOf(area));
            perimetroAns.setText("perimetro: "+String.valueOf(perimetro));
            alturaAns.setText("altura: "+String.valueOf(altura));
        }
        catch(Exception e){
            mensaje="Entradas no v??lidas"+e;
            mensajeAns.setText(mensaje);
        }
    }                                      

    private void ladoInputActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Punto3_20.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Punto3_20.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Punto3_20.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Punto3_20.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Punto3_20().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel Respuesta;
    private javax.swing.JLabel alturaAns;
    private javax.swing.JLabel areaAns;
    private javax.swing.JButton enviar;
    private javax.swing.JPanel formulario;
    private javax.swing.JTextField ladoInput;
    private javax.swing.JLabel ladoLabel;
    private javax.swing.JLabel mensajeAns;
    private javax.swing.JLabel perimetroAns;
    private javax.swing.JLabel titulo;
    // End of variables declaration                   
}
