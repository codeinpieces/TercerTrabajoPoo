package Parte1;

/**
 *
 * @author sebastian
 */
public class Punto4_23 extends javax.swing.JFrame {

    /**
     * Creates new form Punto3_20
     */
    public Punto4_23() {
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
        aLabel = new javax.swing.JLabel();
        aInput = new javax.swing.JTextField();
        bLabel = new javax.swing.JLabel();
        bInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cLabel = new javax.swing.JLabel();
        cInput = new javax.swing.JTextField();
        Respuesta = new javax.swing.JPanel();
        raiz1 = new javax.swing.JLabel();
        mensajeAns = new javax.swing.JLabel();
        raiz2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Punto3_20");
        setBackground(new java.awt.Color(249, 249, 249));
        setName("ventana"); // NOI18N

        titulo.setText("Punto 4.23");

        formulario.setBackground(new java.awt.Color(227, 227, 227));

        enviar.setText("Enviar");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        aLabel.setText("A:");

        aInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aInputActionPerformed(evt);
            }
        });

        bLabel.setText("B:");

        bInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInputActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese los numeros para la ecuacion Ax^2+Bx+C=0");

        cLabel.setText("C:");

        cInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cInputActionPerformed(evt);
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
                        .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aInput)
                            .addComponent(bInput)
                            .addGroup(formularioLayout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(cLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cInput)))
                    .addGroup(formularioLayout.createSequentialGroup()
                        .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formularioLayout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(bLabel))
                            .addGroup(formularioLayout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(enviar))
                            .addGroup(formularioLayout.createSequentialGroup()
                                .addGap(216, 216, 216)
                                .addComponent(aLabel))
                            .addGroup(formularioLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel1)))
                        .addGap(0, 91, Short.MAX_VALUE)))
                .addContainerGap())
        );
        formularioLayout.setVerticalGroup(
            formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(enviar)
                .addContainerGap())
        );

        Respuesta.setBackground(new java.awt.Color(210, 201, 201));

        raiz1.setText("Raiz 1:");

        raiz2.setText("Raiz 2:");

        javax.swing.GroupLayout RespuestaLayout = new javax.swing.GroupLayout(Respuesta);
        Respuesta.setLayout(RespuestaLayout);
        RespuestaLayout.setHorizontalGroup(
            RespuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RespuestaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RespuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mensajeAns)
                    .addComponent(raiz1)
                    .addComponent(raiz2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RespuestaLayout.setVerticalGroup(
            RespuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RespuestaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mensajeAns)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(raiz1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(raiz2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(205, 205, 205))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Respuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(formulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {                                       
        double a,b,c,raizOne,raizTwo,determinante;
        String mensaje;
        try{
            a=Double.parseDouble(aInput.getText());
            b=Double.parseDouble(bInput.getText());
            c=Double.parseDouble(cInput.getText());
            mensaje="Datos introducidos correctamente";
            mensajeAns.setText(mensaje);
            
            determinante=Math.pow(b,2)-4*a*c;
            
            if(determinante>0){
                raizOne=(-b+determinante)/(2*a);
                raizTwo=(-b-determinante)/(2*a);

                raiz1.setText("raiz 1: "+String.valueOf(raizOne));
                raiz2.setText("raiz 2: "+String.valueOf(raizTwo));
                
            }else if(determinante==0){
                raizOne=(-b)/(2*a);
                raiz1.setText("raiz 1: "+String.valueOf(raizOne));
                raiz2.setText("raiz 2: ");
            }else{
                raiz1.setText("No tiene raiz");
                raiz2.setText("No tiene raiz");
            }

        }
        catch(Exception e){
            mensaje="Entradas no válidas"+e;
            mensajeAns.setText(mensaje);
        }
    }                                      

    private void aInputActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void bInputActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void cInputActionPerformed(java.awt.event.ActionEvent evt) {                                       
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
            java.util.logging.Logger.getLogger(Punto4_23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Punto4_23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Punto4_23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Punto4_23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Punto4_23().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel Respuesta;
    private javax.swing.JTextField aInput;
    private javax.swing.JLabel aLabel;
    private javax.swing.JTextField bInput;
    private javax.swing.JLabel bLabel;
    private javax.swing.JTextField cInput;
    private javax.swing.JLabel cLabel;
    private javax.swing.JButton enviar;
    private javax.swing.JPanel formulario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mensajeAns;
    private javax.swing.JLabel raiz1;
    private javax.swing.JLabel raiz2;
    private javax.swing.JLabel titulo;
    // End of variables declaration                   
}