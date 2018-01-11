package proyectoedd;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javazoom.jl.player.Player;
import static proyectoedd.Login.superuser;
import static proyectoedd.Login.superpass;
import static proyectoedd.Login.Archivo;
import static proyectoedd.Conection.cadena;

public final class Inicio extends javax.swing.JFrame {

    private Player player;
    Conection cx = new Conection();

    public Inicio() {

        initComponents();

        this.setLocationRelativeTo(null);

        ImageIcon img = new ImageIcon("src/proyectoedd/logo.png");
        Icon icono = new ImageIcon(img.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT));
        jLabel2.setIcon(icono);
        //--------------------
        ImageIcon img2 = new ImageIcon("src/proyectoedd/buscar.png");
        Icon icono2 = new ImageIcon(img2.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_DEFAULT));
        jLabel7.setIcon(icono2);
        //*------------------------
        ImageIcon imguser = new ImageIcon("src/proyectoedd/user.png");
        Icon iconou = new ImageIcon(imguser.getImage().getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_DEFAULT));
        jLabel10.setIcon(iconou);
        lbluser.setText(superuser);
      //  aggNodoArtista();
//        cargararchivo();
         cx.listaGeneral("hola");          
         listadogeneral();
        this.repaint();

        jTable2.setOpaque(false);
        ((DefaultTableCellRenderer) jTable2.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jTable2.setRowSelectionAllowed(true);
        jTable2.setColumnSelectionAllowed(false);

        //-----------------------
        
        System.out.println("tamano de la lista" + listcanciones.size());

        //----------------------------------- 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem6 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        rbalbum = new javax.swing.JRadioButton();
        rbartista = new javax.swing.JRadioButton();
        rbgenero = new javax.swing.JRadioButton();
        rbanio = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblcancion = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblmix = new javax.swing.JLabel();
        lblplay = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblanterior = new javax.swing.JLabel();
        lblsiguiente = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        eliminarnodomatriz = new javax.swing.JMenuItem();
        eliminarNodoB = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoedd/logo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 30, 30));

        jLabel7.setLabelFor(this);
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 20, 20));

        txtsearch.setBackground(new java.awt.Color(61, 77, 92));
        txtsearch.setForeground(new java.awt.Color(255, 255, 255));
        txtsearch.setText("Search");
        txtsearch.setToolTipText("");
        txtsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsearchMouseClicked(evt);
            }
        });
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        getContentPane().add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 150, 20));
        txtsearch.getAccessibleContext().setAccessibleName("");

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Album", "Genero", "Artista", "Año", "Path"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 580, 440));

        buttonGroup1.add(rbalbum);
        rbalbum.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        rbalbum.setForeground(new java.awt.Color(255, 255, 255));
        rbalbum.setText("ALBUMS");
        getContentPane().add(rbalbum, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 70, -1));

        buttonGroup1.add(rbartista);
        rbartista.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        rbartista.setForeground(new java.awt.Color(255, 255, 255));
        rbartista.setText("ARTISTS");
        getContentPane().add(rbartista, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 70, -1));

        buttonGroup1.add(rbgenero);
        rbgenero.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        rbgenero.setForeground(new java.awt.Color(255, 255, 255));
        rbgenero.setText("GENRE");
        getContentPane().add(rbgenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 60, -1));

        buttonGroup1.add(rbanio);
        rbanio.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        rbanio.setForeground(new java.awt.Color(255, 255, 255));
        rbanio.setText("YEAR");
        getContentPane().add(rbanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 204, 0));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        jButton1.setText("ADD PLAYLIST");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, -1, -1));

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        jButton3.setText("ELIMINAR CANCION");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 140, -1));

        lblcancion.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblcancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 540, 140, 20));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 60, 20));

        lbluser.setFont(new java.awt.Font("Segoe WP", 0, 11)); // NOI18N
        lbluser.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 80, 10));

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 30, 20));

        lblmix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblmixMouseClicked(evt);
            }
        });
        getContentPane().add(lblmix, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, 20, 20));

        lblplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblplayMouseClicked(evt);
            }
        });
        getContentPane().add(lblplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 20, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoedd/user.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 30, 30));

        lblanterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblanteriorMouseClicked(evt);
            }
        });
        getContentPane().add(lblanterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 20, 20));

        lblsiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsiguienteMouseClicked(evt);
            }
        });
        getContentPane().add(lblsiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 20, 20));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("______________________");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, 20));

        jLabel8.setFont(new java.awt.Font("Segoe WP SemiLight", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Home");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe WP", 0, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 51));
        jLabel11.setText("My Music");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoedd/fondo4.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 630, 520));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoedd/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 520, 1080, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoedd/fondo.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 530));

        jMenu1.setText("ALL");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu4.setText("Usuario");

        jMenuItem9.setText("Eliminar Usuario");
        jMenuItem9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem9MouseClicked(evt);
            }
        });
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        eliminarnodomatriz.setText("Eliminar Nodo Matriz");
        eliminarnodomatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarnodomatrizActionPerformed(evt);
            }
        });
        jMenu4.add(eliminarnodomatriz);

        eliminarNodoB.setText("Eliminar Nodo Artista");
        eliminarNodoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarNodoBActionPerformed(evt);
            }
        });
        jMenu4.add(eliminarNodoB);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Reportes");

        jMenuItem1.setText("Matriz Dispersa");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Arbol B");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Arbol ABB");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Lista de Canciones");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Usuarios del Sistema");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem7.setText("PlayList");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        String respuesta = JOptionPane.showInputDialog("Escribe este Formato a\u00f1o-genero");
        cx.graphBARtista(respuesta);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        String artista = JOptionPane.showInputDialog("Ingrese Nombre del Artista");
        String respuesta = JOptionPane.showInputDialog("Escribe este Formato a\u00f1o-genero");
        cx.graphABBAlbums(artista, respuesta);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        String respuesta = JOptionPane.showInputDialog("Escribe");
        
    }//GEN-LAST:event_jLabel3MouseClicked

   
    int n;
    Boolean sony = false;
    
    private void lblplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblplayMouseClicked
       mix = true;     
        n = jTable2.getSelectedRow();
        try{
            if (sony != true) {  
                
            lblcancion.setText(nombrecanciones.get(n));
            Play(listcanciones.get(n));
            jTable2.setSelectionForeground( Color.green );
                System.out.println("REPRODUCIENDO ......");
                sony=true;

            }else{
               Close();
                System.out.println("STOP");
                lblcancion.setText("STOP");               
                sony = false;
                
            }

        }
        catch(Exception e){
        
         JOptionPane.showMessageDialog(null, "SELECCIONE CANCION");
        }

    }//GEN-LAST:event_lblplayMouseClicked

  
    private void lblanteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblanteriorMouseClicked
 
      try{
        n--;    
          if (mix != true) {        
         JOptionPane.showMessageDialog(null, "NO REPRODUCE ANTERIOR");
         // mix =true;
          }else{
            
        if (n ==0) { 
          lblcancion.setText(nombrecanciones.get(n));
          Close();
          Play(listcanciones.get(n)); 
          sony = true;
          n=listcanciones.size();
        }else{                     
           lblcancion.setText(nombrecanciones.get(n));
            Close();
            Play(listcanciones.get(n)); 
            sony= true;
        }
          }
       }catch(Exception e){
         JOptionPane.showMessageDialog(null, "PRESIONE PLAY");
       }
      
    }//GEN-LAST:event_lblanteriorMouseClicked
   
    Boolean mix;
    private void lblmixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmixMouseClicked
        JOptionPane.showMessageDialog(null, "SHUFFLE PLAY");
       Random rnd = new Random(System.currentTimeMillis());
       int no = rnd.nextInt(listcanciones.size());
       lblcancion.setText(nombrecanciones.get(no));
       Close();
       Play(listcanciones.get(no)); 
        System.out.println("REPRODUCIENDO .....");
       mix = false;
       sony = true;
    }//GEN-LAST:event_lblmixMouseClicked
       
    private void lblsiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsiguienteMouseClicked
           
        try{
        n++;
          
        if (mix !=true) {
            
       Random rnd = new Random(System.currentTimeMillis());
       int no = rnd.nextInt(listcanciones.size());
       lblcancion.setText(nombrecanciones.get(no));
       Close();
       Play(listcanciones.get(no)); 
       mix = false;
       sony = true;
            
        }else{
            
        if (n==listcanciones.size()) {            
            n = 0;
            lblcancion.setText(nombrecanciones.get(n));
            Close();
            Play(listcanciones.get(n)); 
            sony = true;
                      
        }else{          
            lblcancion.setText(nombrecanciones.get(n));
            Close();
            Play(listcanciones.get(n)); 
            sony = true;
        }
    }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "PRESIONE PLAY");
        }
    }//GEN-LAST:event_lblsiguienteMouseClicked

    
 


    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        limpiar();
        superuser = "";
        superpass = "";
        
        for (String listcancione : listcanciones) {
            System.out.println("esto tengo despues de salir" + listcancione);
            System.out.println("tamano de la lista" + listcanciones.size());
        }
        Login l = new Login();
        l.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jLabel8MouseClicked

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        txtsearch.setText("");        
    }//GEN-LAST:event_txtsearchActionPerformed

    private void txtsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearchMouseClicked
       txtsearch.setText("");

    }//GEN-LAST:event_txtsearchMouseClicked

    public void busquedaAlbum(){
         boolean ss =  cx.searchAlbum(search);
            if (ss) {
            aggAlbumtabla();
            System.out.println("tamano de la lista---->" + listcanciones.size());                   
            }else{
           cx.listaGeneral("hola");          
           listadogeneral(); 
          System.out.println("tamano de la lista---->" + listcanciones.size());  
           JOptionPane.showMessageDialog(null, "ALBUM NO ENCONTRADO");
            }
     
    }
    public void busquedaArtista(){
    
     boolean ss =  cx.searchArtista(search);
            if (ss) {
            aggArtistatabla();
            System.out.println("tamano de la lista---->" + listcanciones.size());                   
            }else{
           cx.listaGeneral("hola");          
           listadogeneral(); 
          System.out.println("tamano de la lista---->" + listcanciones.size());  
           JOptionPane.showMessageDialog(null, "ARTISTA NO ENCONTRADO");
            }
    }
    
     public void busquedaGenero(){
    
     boolean ss =  cx.searchGenero(search); 
            if (ss) {
           aggGenerotabla();
           System.out.println("tamano de la lista---->" + listcanciones.size());             
            }else{
           cx.listaGeneral("hola");          
           listadogeneral(); 
          System.out.println("tamano de la lista---->" + listcanciones.size());  
           JOptionPane.showMessageDialog(null, "GENERO NO ENCONTRADO");
            }
    }
     
    public void busquedaAnio(){
    
     boolean ss =  cx.searchYear(search);
            if (ss) {
           aggYeartabla();
           System.out.println("tamano de la lista--->>" + listcanciones.size());         
            }else{
           cx.listaGeneral("hola");          
           listadogeneral(); 
          System.out.println("tamano de la lista---->" + listcanciones.size());  
           JOptionPane.showMessageDialog(null, "AÑO NO ENCONTRADO");
            }
    }
    
    String search;
    @SuppressWarnings("empty-statement")
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
  
       limpiar();
        search = txtsearch.getText();
        if (rbalbum.isSelected()) {
            busquedaAlbum();           
        }else if (rbartista.isSelected()) {
            busquedaArtista();           
        } else if (rbgenero.isSelected()) {
            busquedaGenero();                                
        } else if (rbanio.isSelected()) { 
         //   cx.searchYear(search);
         //   aggYeartabla();
         //  System.out.println("tamano de la lista--->>" + listcanciones.size());   
            busquedaAnio();
        } else {  
            cx.listaGeneral("hola");          
            listadogeneral(); 
            JOptionPane.showMessageDialog(null, "SELECCIONE UNA OPCION");       
        }


    }//GEN-LAST:event_jLabel7MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        cx.grafica("lista");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        cx.graficaMatriz();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
     
        String respuesta = JOptionPane.showInputDialog("Escribe Nombre del Album");
        cx.graphListaCanciones(respuesta);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        try {
            limpiar();
             
           // cargararchivo();
           cx.listaGeneral("hola");          
           listadogeneral();
            System.out.println("tamano de la lista" + listcanciones.size());
        } catch (Exception e) {
            System.out.println("ERROR AL CARGAR" + e);
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked


    }//GEN-LAST:event_jButton1MouseClicked

   
    
    public void limpiar(){
    DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
 
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        lblcancion.setText("");
        search = "";
        cadena = "";
        contador = 0;  
//        ss=true;
        listcanciones.clear();
        nombrecanciones.clear();
        Close();
        a = "";
        b = "";
        c = "";
        d = "";
        f = "";
        e = "";
        System.out.println("tamano de la lista" + listcanciones.size());
    
    }
   

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int filaseleccionada = jTable2.getSelectedRow();
            String nombre = (String) jTable2.getValueAt(filaseleccionada, 0);
            String path = (String) jTable2.getValueAt(filaseleccionada, 5);
            String anio = (String) jTable2.getValueAt(filaseleccionada, 4);
            String genero = (String) jTable2.getValueAt(filaseleccionada, 2);
            String artista = (String) jTable2.getValueAt(filaseleccionada, 3);
            String album = (String) jTable2.getValueAt(filaseleccionada, 1);
                          
            cx.addlista(superuser, superpass, anio, genero, album, artista, nombre, path);
            JOptionPane.showMessageDialog(null, "AGREGADO CORRECTAMENTE");
            System.out.println(listcanciones.size() + listcanciones.get(0));


        } catch (Exception e) {
            System.out.println("ERROR AL AGREGAR" + e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
     
        cx.graphplaylist(superuser, superpass);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    
    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
       limpiar();
        boolean ss =  cx.reproducirPlayList(superuser, superpass);
            if (ss) {
                aggtabla();
                System.out.println("tamano de la lista" + listcanciones.size());
    
            }else{
                 cx.listaGeneral("hola");          
                 listadogeneral();  
              JOptionPane.showMessageDialog(null, "PLAY LIST VACIA");
            }
        
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jMenuItem9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem9MouseClicked
        cx.eliminarUsuario(superuser, superpass);
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem9MouseClicked


    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
       cx.eliminarUsuario(superuser, superpass);
       Login l = new Login();
       l.setVisible(true);
       superuser = "";
       superpass = "";
       this.dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void eliminarnodomatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarnodomatrizActionPerformed
     
        String anio = JOptionPane.showInputDialog("Escriba el año");
        String genero = JOptionPane.showInputDialog("Escriba el genero");
        limpiar();
        boolean ss =  cx.eliminarNodoM(anio, genero);
            if (ss) {
               listadogeneral();
                System.out.println("tamano de la lista" + listcanciones.size());   
            }else{
                cx.listaGeneral("hola");          
                 listadogeneral(); 
                 System.out.println("tamano de la lista" + listcanciones.size()); 
              JOptionPane.showMessageDialog(null, "NO ENCONTRADO");
            }
                
    }//GEN-LAST:event_eliminarnodomatrizActionPerformed

    

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try{
            
            int filaseleccionada = jTable2.getSelectedRow();
            String nombre = (String) jTable2.getValueAt(filaseleccionada, 0);
            String path = (String) jTable2.getValueAt(filaseleccionada, 5);
            
            String anio = (String) jTable2.getValueAt(filaseleccionada, 4);
            String genero = (String) jTable2.getValueAt(filaseleccionada, 2);
            String artista = (String) jTable2.getValueAt(filaseleccionada, 3);
            String album = (String) jTable2.getValueAt(filaseleccionada, 1);
            

            limpiar();
            cx.eliminarCancion(anio, genero, album, artista, nombre, path);
            pintartabla();
            System.out.println(listcanciones.size());
            JOptionPane.showMessageDialog(null, "ELIMINADA CORRECTAMENTE");
       }catch(Exception e){
           System.out.println("error" + e);
       }

       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void eliminarNodoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarNodoBActionPerformed

       String anio = JOptionPane.showInputDialog("Escribe el Año");
         String genero  = JOptionPane.showInputDialog("Escribe el Genero");
         String artista  = JOptionPane.showInputDialog("Escribe el nombre del Artista");  
        limpiar();
        boolean ss =  cx.eliminaNodoArtista(anio, genero, artista);
            if (ss) {
               // limpiar();
               listadogeneral();
               System.out.println("tamano de la lista" + listcanciones.size());   
            }else{
               // limpiar();
                cx.listaGeneral("hola");          
                 listadogeneral(); 
                System.out.println("tamano de la lista" + listcanciones.size());  
              JOptionPane.showMessageDialog(null, "NO ENCONTRADO");
            }
        
        
        
      //  String anio = JOptionPane.showInputDialog("Escribe el Año");
      //   String genero  = JOptionPane.showInputDialog("Escribe el Genero");
      //   String artista  = JOptionPane.showInputDialog("Escribe el nombre del Artista");       
     //  limpiar();
       // cx.eliminaNodoArtista(anio, genero, artista);
 //      listadogeneral();
       
    }//GEN-LAST:event_eliminarNodoBActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuItem eliminarNodoB;
    private javax.swing.JMenuItem eliminarnodomatriz;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblanterior;
    private javax.swing.JLabel lblcancion;
    private javax.swing.JLabel lblmix;
    private javax.swing.JLabel lblplay;
    private javax.swing.JLabel lblsiguiente;
    private javax.swing.JLabel lbluser;
    private javax.swing.JRadioButton rbalbum;
    private javax.swing.JRadioButton rbanio;
    private javax.swing.JRadioButton rbartista;
    private javax.swing.JRadioButton rbgenero;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables

    public void Close() {
        if (player != null) {
            player.close();
        }
    }

    public void Play(String filename) {
        try {
            FileInputStream fis = new FileInputStream(filename);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "PATH NO ENCONTRADA");
           // System.out.println("NO SE PUEDE REPRODUCIR" + e);
        }

        new Thread() {
            public void run() {
                try {
                    player.play();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

        }.start();

    }

    ArrayList<String> listcanciones = new ArrayList<String>();
    ArrayList<String> nombrecanciones = new ArrayList<String>();

    public void cargararchivo() {
        try {

            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxParserFactory.newSAXParser();
            VersionesHandler handler = new VersionesHandler();
            saxParser.parse(Archivo, handler);

            ArrayList<Artista> artistas = handler.getArtistas();
            DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();

            for (Artista a : artistas) {
                for (Album al : a.albumes) {
                    for (Cancion ca : al.canciones) {
                        Object filaNueva[] = {ca.getNombreC(), al.getNombre(), al.getGenero(), a.getNombre(), al.getAnio(), ca.getPath()};
                        listcanciones.add(ca.getPath());
                        modelo.addRow(filaNueva);
                    }
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO EXISTEN CANCIONES EN EL SISTEMA");
        }

    }

    public void cargar(String anio, String genero, String artista, String album, String nombre, String path) {
   
       DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();

       Object filaNueva[] = {nombre, album, genero, artista, anio, path};
       listcanciones.add(path);
       nombrecanciones.add(nombre);
       modelo.addRow(filaNueva);

    }

    int contador = 0;
    String a;
    String b;
    String c;
    String d;
    String e;
    String f;

    
    public void aggtabla() {

        String[] tokens = cadena.split("\\*");
        for (String t : tokens) {

            switch (contador) {
                case 1:
                    //  System.out.println("Este es el A;o: " + t); 
                    a = t;
                    contador++;
                    break;
                case 2:
                    //System.out.println("Este es el Genero: " + t);
                    b = t;
                    // ini.cargar(t, t, t, t, t, t);
                    contador++;
                    break;
                case 3:
                    // System.out.println("Este es el Artista: " + t);
                    c = t;
                    contador++;
                    break;
                case 4:
                    // System.out.println("Este es el Album: " + t);
                    d = t;
                    contador++;
                    break;
                case 5:
                    // System.out.println("Este es el NOmbre de Cancion: " + t);
                    e = t;
                    contador++;
                    break;
                case 6:
                    // System.out.println("Este es el Path: " + t);
                    f = t;
                    cargar(a, b, c, d, e, f);
                    contador = 1;
                    break;

                default:
                    contador++;
                    break;

            }
        }
    }

    public void cargarAlbum(String anio, String genero, String artista, String album, String nombre, String path) {
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();

        System.out.println("esto tengo " + "---" + nombre + "---" + album + "---" + genero + "---" + artista + "---" + anio + "---" + path);
        Object filaNueva[] = {nombre, album, genero, artista, anio, path};
        listcanciones.add(path);
        nombrecanciones.add(nombre);
        modelo.addRow(filaNueva);

    }
   
    public void cargarGenero(String anio, String genero, String artista, String album, String nombre, String path) {
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
         Object filaNueva[] = {nombre, album, genero, artista, anio, path};
        listcanciones.add(path);
        nombrecanciones.add(nombre);
        modelo.addRow(filaNueva);

    }
    public void cargarGeneral(String anio, String genero, String artista, String album, String nombre, String path) {
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
       Object filaNueva[] = {nombre, album, genero, artista, anio, path};
        listcanciones.add(path);
        nombrecanciones.add(nombre);
        modelo.addRow(filaNueva);

    }
    public void aggAlbumtabla() {
        String[] tokens = cadena.split("\\*");
        for (String t : tokens) {

            switch (contador) {
                case 1:
                    a = t;
                    contador++;
                    break;
                case 2:
                    b = t;
                    contador++;
                    break;
                case 3:
                    c = t;
                    contador++;
                    break;
                case 4:
                    d = t;
                    contador++;
                    break;
                case 5:
                    e = t;
                    cargarAlbum(a, b, c, search, d, e);
                    contador = 4;
                    break;

                default:
                    contador++;
                    break;

            }
        }

    }

    public void aggGenerotabla() {
        String[] tokens = cadena.split("\\*");
        for (String t : tokens) {
            switch (t) {
                case "Nombre: ":
                    contador = 1;
                    break;
                case "Artista: ":
                    contador = 4;
                    break;
                case "Album: ":
                    contador = 6;
                    break;
            }
            switch (contador) {
                case 1:
                    contador++;
                    break;
                case 2:
                    a=t;
                    contador++;
                    break;
                case 3:
                    b=t;
                    contador++;
                    break;
                case 4:
                    contador++;
                    break;
                case 5:
                    c=t;
                    contador++;
                    break;
                case 6:
                    contador++;
                    break;
                case 7:
                    d=t;
                    contador++;
                    break;
                case 8:
                    e=t;
                    contador++;
                    break;      
                case 9:
                    f=t;
                    cargarAlbum(a, b, c, d, e, f);
                    contador= 8;
                    break;
                default:
                    contador++;
                    break;
            }

        }

    }

     public void aggArtistatabla() {
        String[] tokens = cadena.split("\\*");
        for (String t : tokens) {
            switch (t) {
                case "Nombre: ":
                    contador = 1;
                    break;
                case "Artista: ":
                    contador = 4;
                    break;
                case "Album: ":
                    contador = 6;
                    break;
            }
            switch (contador) {
                case 1:
                    contador++;
                    break;
                case 2:
                    a=t;
                    System.out.println("este el anio" + t);
                    contador++;
                    break;
                case 3:
                    b=t;
                    System.out.println("este es el genero" + t);
                    contador++;
                    break;
                case 4:
                    System.out.println("omito esto" + t);
                    contador++;
                    break;
                case 5:
                    c=t;
                    System.out.println("este es el artista" + t);
                    contador++;
                    break;
                case 6:
                   System.out.println("omito esto"+t);
                    contador++;
                    break;
                case 7:
                    d=t;
                    System.out.println("este es el album" + t);
                    contador++;
                    break;
                case 8:
                    e=t;
                    System.out.println("este es el nombre cancion" + t);
                    contador++;
                    break;      
                case 9:
                    f=t;
                    System.out.println("este es el path" + t);
                    cargarAlbum(a, b, search, d, e, f);
                    contador= 8;
                    break;
                default:
                    contador++;
                    break;
            }
        }
    }
     
     
     public void pintartabla(){
      String[] tokens = cadena.split("\\*");
        for (String t : tokens) {
            switch (t) {
                case "Nombre: ":
                    contador = 1;
                    break;
                case "Artista: ":
                    contador = 3;
                    break;
                case "Album":
                    contador = 5;
                    break;
            }
            switch (contador) {
                case 1:
                    contador++;
                    break;
                case 2:
                   
                    String[] parts = t.split("-");
                    a = parts[0]; 
                    b = parts[1]; 
                    contador++;
                    break;
                case 3:
                    contador++;
                    break;
                case 4:
                    c=t;
                    contador++;
                    break;
                case 5:
                    contador++;
                    break;
                case 6:
                    d=t;
                    contador++;
                    break;
                case 7:
                    e=t;
                    contador++;
                    break;
                case 8:
                    f=t;
                    cargarGeneral(a,b,c,d,e,f);
                    contador = 7;
                    break;      
                default:
                    contador++;
                    break;
            }

        }
     
     
     }
     
    public void aggYeartabla(){
    
     String[] tokens = cadena.split("\\*");
        for (String t : tokens) {
            switch (t) {
                case "Nombre: ":
                    contador = 1;
                    break;
                case "Artista: ":
                    contador = 4;
                    break;
                case "Album: ":
                    contador = 6;
                    break;
            }
            switch (contador) {
                case 1:
                    contador++;
                    break;
                case 2:
                    String[] parts = t.split("-");  
                   a  = parts[0]; 
                   b = parts[1];
                    contador++;
                    break;
                 case 3:
                    contador++;
                    break;
                case 4:
                    contador++;
                    break;
                case 5:
                    c=t;
                    contador++;
                    break;
                case 6:
                    contador++;
                    break;
                case 7:
                    d=t;
                    contador++;
                    break;
                case 8:
                    e=t;
                    contador++;
                    break;
                case 9:
                    f=t;
                    cargarGeneral(a,b,c,d,e,f);
                    contador = 8;
                    break;      
                default:
                    contador++;
                    break;
            }

        }
    
    }
    
     public void listadogeneral(){
    
     String[] tokens = cadena.split("\\*");
        for (String t : tokens) {
            switch (t) {
                case "Nombre: ":
                    contador = 1;
                    break;
                case "Artista: ":
                    contador = 3;
                    break;
                case "Album":
                    contador = 5;
                    break;
            }
            switch (contador) {
                case 1:
                    contador++;
                    break;
                case 2:

                   String[] parts = t.split("-");  
                   a  = parts[0]; 
                   b = parts[1];
                    contador++;
                    break;
                 case 3:
                    contador++;
                    break;
                case 4:
                    c=t;
                    contador++;
                    break;
                case 5:
                    contador++;
                    break;
                case 6:
                    d=t;
                    contador++;
                    break;
                case 7:
                    e=t;
                    contador++;
                    break;
                case 8:
                    f=t;
                    cargar(a,b,c,d,e,f);
                    contador = 7;
                    break;      
                default:
                    contador++;
                    break;
            }

        }
    
    }
}
