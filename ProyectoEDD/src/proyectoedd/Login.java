package proyectoedd;

import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import com.sun.org.apache.xpath.internal.XPathAPI;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class Login extends javax.swing.JFrame {

    Conected.Conection cx = new Conected.Conection();

    public Login() {
        initComponents();
        ImageIcon img = new ImageIcon("src/proyectoedd/logo.png");
        ImageIcon img2 = new ImageIcon("src/proyectoedd/regresar.png");
        Icon icono = new ImageIcon(img.getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));
        jLabel4.setIcon(icono);
        Icon icono2 = new ImageIcon(img2.getImage().getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_DEFAULT));
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
        boolean a = cx.search(user, pass);
        if (a) {
            JOptionPane.showMessageDialog(null, "Bienvenido");
        } else {
            JOptionPane.showMessageDialog(null, "No Existe el usuario");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtregistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtregistrarseActionPerformed
        String user = txtusuario.getText();
        String pass = txtcontrasena.getText();

        cx.insert(user, pass);

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

        try {
            leerarchivo();
//        if (seleccionado.showDialog(null, "abrir archivo ") == JFileChooser.APPROVE_OPTION) {
//            FileNameExtensionFilter filter = new FileNameExtensionFilter("xml files", "xml", "EDD");
//            seleccionado.setFileFilter(filter);
//            seleccionado.setDialogTitle("Abre un archivo .xml");
//            Archivo = seleccionado.getSelectedFile();
//
//            if (Archivo.canRead()) {
//
//                if (Archivo.getName().endsWith("xml")) {
//                    String contenido = Cargar(Archivo);
//                    leerarchivo();
//                    jTextArea1.setText(contenido);
//
//                } else {
//                    JOptionPane.showMessageDialog(null, "fORMATO NO ACEPTADO");
//                }
//            }
//
//        }
        } catch (SAXException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (XPathExpressionException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
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
    String Archivo = "C:\\Users\\mmari\\Documents\\0772 - EDD\\2017 Segundo Semestre Diciembre\\archivoProyecto1.xml";
    // File Archivo;

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
        File file = new File(Archivo);
        VersionesHandler handler = new VersionesHandler();
        saxParser.parse(file, handler);

        ArrayList<Usuario> usuarios = handler.getUsuarios();
        ArrayList<Artista> artistas = handler.getArtistas();
        ArrayList<Album> albumes;

        for (Usuario u : usuarios) {
            System.out.println(u);
            cx.insert(u.getNombreU(), u.getPass());

        }
        //For Inserto Nombre del Artista
        for (Artista a : artistas) {
            System.out.println(a);
           // a.getNombre();
            //Inserto Datos del Album del Artista
            for(Album al : a.albumes){
                System.out.println(al);
                cx.insertMatrix(al.getAnio(), al.getGenero(), al.getAnio()+"-"+al.getGenero());
                for(Cancion ca : al.canciones){
                    System.out.println(ca);
                }
            }
           
        }

    }
}
