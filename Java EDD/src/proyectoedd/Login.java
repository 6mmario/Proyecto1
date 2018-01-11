package proyectoedd;

import java.awt.Dimension;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;
import org.xml.sax.SAXException;

public class Login extends javax.swing.JFrame {

    Conection cx = new Conection();
    FileNameExtensionFilter filtro = new FileNameExtensionFilter("XML files", "xml"); 
    JFileChooser seleccionado = new JFileChooser();
    static File Archivo;
   static String superuser;
   static String superpass;
    
    public Login() {
        initComponents();
        ImageIcon img = new ImageIcon("src/proyectoedd/logo2.png");
        ImageIcon img2 = new ImageIcon("src/proyectoedd/regresar.png");
        Icon icono = new ImageIcon(img.getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));
        jLabel4.setIcon(icono);
        Icon icono2 = new ImageIcon(img2.getImage().getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_DEFAULT));
        jLabel9.setIcon(icono2);
        
        //------------------------------------------------
                jTabbedPane1.setEnabledAt(0, false);
                jTabbedPane1.setEnabledAt(1, false);
                jTabbedPane1.setEnabledAt(2, true);
                jTabbedPane1.setSelectedIndex(2);
       
      
       
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
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));
        jPanel1.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 170, -1));
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 170, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoedd/logo1.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 190, 210));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("USUARIO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONTRASENA:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 0));
        jLabel8.setText("Registrarse");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 90, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoedd/fondo4.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 440));

        jTabbedPane1.addTab("LOGIN", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 180, -1));
        jPanel2.add(txtcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 180, -1));

        txtregistrarse.setText("Registrarse");
        txtregistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtregistrarseActionPerformed(evt);
            }
        });
        jPanel2.add(txtregistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 0));
        jLabel11.setText("Registrarse con Google");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 150, 20));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Usuario:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contrasena:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 70, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoedd/fondo4.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 550, 460));

        jTabbedPane1.addTab("REGISTRO", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("ABRIR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 110, 40));

        jButton2.setText("INGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 110, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoedd/fondo4.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 440));

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
        
        boolean a = cx.search(user, pass);
        if (a) {
            JOptionPane.showMessageDialog(null, "Bienvenido");
            superuser = user;
            superpass = pass;
            Inicio ini = new Inicio();
            ini.setVisible(true);
            this.setVisible(false);
             
        } else {
            JOptionPane.showMessageDialog(null, "No Existe el usuario");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtregistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtregistrarseActionPerformed
        
        String user = txtusuario.getText();
        String pass = txtcontrasena.getText();
        
        if (!"".equals(user) & !"".equals(pass)) {
            
            cx.insert(user, pass);
            JOptionPane.showMessageDialog(null, "Registrado");
            txtusuario.setText("");
            txtcontrasena.setText("");
            
        }else{
            
       
            JOptionPane.showMessageDialog(null, "Ingrese todos los campos");
        }
    }//GEN-LAST:event_txtregistrarseActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
         
      // getContentPane().add(jPanel2);
      // this.jPanel2.setVisible(false);  
      // this.jPanel1.setVisible(true);
       
                jTabbedPane1.setEnabledAt(0, false);
                jTabbedPane1.setEnabledAt(1, true);
                jTabbedPane1.setEnabledAt(2, false);
                jTabbedPane1.setSelectedIndex(1);
                  
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        
                jTabbedPane1.setEnabledAt(0, true);
                jTabbedPane1.setEnabledAt(1, false);
                jTabbedPane1.setEnabledAt(2, false);
                jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel9MouseClicked


    private void btnexaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexaminarActionPerformed

        try{
        JFileChooser seleccionado = new JFileChooser();
        seleccionado.setFileFilter(filtro);      
        int selec = seleccionado.showOpenDialog(this);
        
        if (selec == JFileChooser.APPROVE_OPTION) {
                  Archivo = seleccionado.getSelectedFile();

            
            if (Archivo.canRead()) {

                if (Archivo.getName().endsWith("xml")) {
                    
                        String contenido = Cargar(Archivo);
                    
                        leerarchivo();
//                        jTextArea1.setText(contenido);
                    

                } else {
                    JOptionPane.showMessageDialog(null, "FORMATO NO ACEPTADO");
                }
            }
        }
        }
        catch(Exception e){
            System.out.println("error" + e);
        }
		

    }//GEN-LAST:event_btnexaminarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                jTabbedPane1.setEnabledAt(0, true);
                jTabbedPane1.setEnabledAt(1, false);
                jTabbedPane1.setEnabledAt(2, false);
                jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  try{
        JFileChooser seleccionado = new JFileChooser();
        seleccionado.setFileFilter(filtro);      
        int selec = seleccionado.showOpenDialog(this);
        
        if (selec == JFileChooser.APPROVE_OPTION) {
                  Archivo = seleccionado.getSelectedFile();
            
            if (Archivo.canRead()) {

                if (Archivo.getName().endsWith("xml")) {
                    
                        String contenido = Cargar(Archivo);                    
                        leerarchivo();
                        JOptionPane.showMessageDialog(null, "CARGADO CORRECTAMENTE");
//                        jTextArea1.setText(contenido);

                } else {
                    JOptionPane.showMessageDialog(null, "FORMATO NO ACEPTADO");
                }
            }
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR EL ARCHIVO");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        String direccion = "http://localhost:5000/";
         try
                {
                    Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + direccion);
                }
                catch(Exception err)
                {
                    JOptionPane.showMessageDialog(null,"Error: "+err);
                }
       
    }//GEN-LAST:event_jLabel11MouseClicked

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtcontrasena;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JButton txtregistrarse;
    private javax.swing.JTextField txtuser;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

  
    FileInputStream entrada;
    FileOutputStream salida;

    public String Cargar(File Archivo) {
        String contenido = "";
        try {
            entrada = new FileInputStream(Archivo);
            int cod;
            while ((cod = entrada.read()) != -1) {
                char caracter = (char) cod;
                contenido += caracter;
            }
        } catch (Exception e) {

        }
        return contenido;
    }

    public void leerarchivo() throws FileNotFoundException, SAXException, IOException, TransformerException, XPathExpressionException, ParserConfigurationException {
       
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        VersionesHandler handler = new VersionesHandler();
        saxParser.parse(Archivo, handler);

        ArrayList<Usuario> usuarios = handler.getUsuarios();
        ArrayList<Artista> artistas = handler.getArtistas();
        ArrayList<Album> albumes;

        for (Usuario u : usuarios) {
            //System.out.println(u);
            cx.insert(u.getNombreU(), u.getPass());
            
        }

        for (Artista a : artistas) {

            for(Album al : a.albumes){
                cx.insertMatrix(al.getAnio(), al.getGenero(), al.getAnio()+"-"+al.getGenero());
                String nodo = al.getAnio()+"-"+al.getGenero();
                cx.insertarArtist(nodo,a.getNombre());
                //Nombre artista + nombre Album + nodo (genero y anio)
                cx.insertarAlbums(a.getNombre(),al.getNombre(),nodo);
                
                for(Cancion ca : al.canciones){
                    
                    //System.out.println(ca);
                 cx.insertarCanciones(nodo, a.getNombre(), al.getNombre(), ca.getNombreC(), ca.getPath());
              
                  Object filaNueva[] = {ca.getNombreC(), al.getNombre(), al.getGenero(), a.getNombre(),al.getAnio(),ca.getPath()};
//                   modelo.addRow(filaNueva); 
                }
  
            }
           
        }
        
    }
}
