
package proyectoedd;

import java.awt.Dimension;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.NodeList;
import static sun.awt.image.ImagingLib.filter;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        ImageIcon img = new ImageIcon("src/proyectoedd/logo.png");
        ImageIcon img2 = new ImageIcon("src/proyectoedd/regresar.png");
        Icon icono = new ImageIcon(img.getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(),Image.SCALE_DEFAULT));
        jLabel4.setIcon(icono);
        Icon icono2 = new ImageIcon(img2.getImage().getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(),Image.SCALE_DEFAULT));
        jLabel9.setIcon(icono2);
        this.setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(500, 500)); 
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtuser = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtusuario = new javax.swing.JTextField();
        txtcontrasena = new javax.swing.JTextField();
        txtregistrarse = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnexaminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));
        jPanel1.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 160, -1));
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 160, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoedd/logo.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 150, 130));

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel3.setText("USUARIO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel2.setText("CONTRASENA:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gadugi", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Registrarse");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoedd/fondo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 440));

        jTabbedPane1.addTab("LOGIN", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 170, -1));
        jPanel2.add(txtcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 170, -1));

        txtregistrarse.setText("Registrarse");
        txtregistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtregistrarseActionPerformed(evt);
            }
        });
        jPanel2.add(txtregistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel6.setText("Usuario:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel7.setText("Contrasena:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoedd/regresar.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 70, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoedd/fondo.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 550, 460));

        jTabbedPane1.addTab("REGISTRO", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnexaminar.setText("Abrir");
        btnexaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexaminarActionPerformed(evt);
            }
        });
        jPanel3.add(btnexaminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 500, 330));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoedd/fondo.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        jTabbedPane1.addTab("CARGA", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String user = txtuser.getText();
        String pass = txtpass.getText();
        
  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtregistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtregistrarseActionPerformed
      //   String user = txtusuario.getText();
      //  String pass = txtcontrasena.getText();
        
      
    }//GEN-LAST:event_txtregistrarseActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
    // this.jPanel1.setVisible(false);
//    this.getContentPane().add(this.jPanel1);
 //   this.jPanel2.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
    //this.getContentPane().add(this.jPanel2);
    //this.jPanel1.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

  
    
    private void btnexaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexaminarActionPerformed
        
        if(seleccionado.showDialog(null, "abrir archivo ")== JFileChooser.APPROVE_OPTION){
        FileNameExtensionFilter filter = new FileNameExtensionFilter("xml files", "xml", "EDD");     
        seleccionado.setFileFilter(filter);
        seleccionado.setDialogTitle("Abre un archivo .xml");
        Archivo = seleccionado.getSelectedFile();
        
                 if(Archivo.canRead()){

                if(Archivo.getName().endsWith("xml")){
                 String contenido = Cargar(Archivo);
                 leerarchivo();
                 jTextArea1.setText(contenido);

                }else{
                    JOptionPane.showMessageDialog(null,"fORMATO NO ACEPTADO");
                }
            }
        
        
    } 
        
        
 
    }//GEN-LAST:event_btnexaminarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexaminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtcontrasena;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JButton txtregistrarse;
    private javax.swing.JTextField txtuser;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

    JFileChooser seleccionado = new JFileChooser();
    File Archivo;
    FileInputStream entrada;
    FileOutputStream salida;
    
  
  public String Cargar(File Archivo){
    String contenido = "";
    try{
    entrada = new FileInputStream(Archivo);
    int cod;
    while((cod = entrada.read()) != -1){
    char caracter = (char)cod;
    contenido += caracter;
    }
    }catch(Exception e){
    
    }
    return contenido;
}
  

    public void leerarchivo(){
            
    try{
    DocumentBuilderFactory docbuildfac = DocumentBuilderFactory.newInstance();
    DocumentBuilder docbuild = docbuildfac.newDocumentBuilder();
    org.w3c.dom.Document doc = docbuild.parse(Archivo);    
    doc.getDocumentElement().normalize();

    
    NodeList listnodo = doc.getElementsByTagName("archivo"); 
    NodeList listausuarios = doc.getElementsByTagName("usuarios"); 
    NodeList listausuario = doc.getElementsByTagName("usuario"); 
    NodeList listaartistas = doc.getElementsByTagName("artistas");
    NodeList listaartista = doc.getElementsByTagName("artista");
   
    for (int a = 0; a < listnodo.getLength(); a++) {               
     for (int i = 0; i < listausuarios.getLength(); i++) {
        Node nodon = listausuarios.item(i);  
        for (int j = 0; j < listausuario.getLength(); j++) {      
        if (nodon.getNodeType() == Node.ELEMENT_NODE) {
         
            Element eElement = (Element) nodon;
 
            System.out.println("el nombre es : " + eElement.getElementsByTagName("nombre").item(j).getTextContent() );
            System.out.println("el pass es: " + eElement.getElementsByTagName("pass").item(j).getTextContent() );                 
        }                
        }        
     for (int j = 0; j < listaartistas.getLength(); j++) {
          Node nodoa = listaartistas.item(j); 
          for (int k = 0; k < listaartista.getLength(); k++) {
          if (nodoa.getNodeType() == Node.ELEMENT_NODE) {
         
            Element eElement = (Element) nodoa;
 
            System.out.println("el nombre artista es : " + eElement.getElementsByTagName("nombre").item(k).getTextContent() );
            //System.out.println("el pass es: " + eElement.getElementsByTagName("pass").item(j).getTextContent() );                 
        } 
         }
         
         
         }
 
        
    }
    }
     
    }catch(Exception e){
        System.out.println("Archivo no encontrado.");
    }
       
    }
}
