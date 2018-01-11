package proyectoedd;

import java.awt.Window;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.media.bean.playerbean.MediaPlayer;
import javax.print.attribute.standard.Media;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackEvent;
import javazoom.jl.player.advanced.PlaybackListener;
import static org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.QuaquaIconFactory.getResource;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class play extends javax.swing.JFrame {

    public play() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("SIGUIENTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("PAUSA");
        jButton2.setToolTipText("");
        jButton2.setActionCommand("PAUSA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("PLAY");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(266, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            reproducir();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(play.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JavaLayerException ex) {
            Logger.getLogger(play.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        parar();
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            repro();
        } catch (IOException ex) {
            Logger.getLogger(play.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(play.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(play.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public void hola() throws FileNotFoundException,
            
      JavaLayerException {
        
      Player apl = new Player(new FileInputStream("C://talvez.mp3"));
      apl.play();
      
   }
        public void siguiente() throws FileNotFoundException,
            
      JavaLayerException {
        
      Player apl = new Player(new FileInputStream("C://senorita.mp3"));
      apl.play();
      
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
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new play().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables

static boolean pausa = false;

   public  void PAUSE() throws FileNotFoundException,
       JavaLayerException, InterruptedException {
       final Player pl = new Player(new FileInputStream("C://talvez.mp3"));

      new Thread() {
         @Override
         public void run() {
            try {
               while (true) {
                  if (!pausa) {
                     if (!pl.play(2)) {
                        break;
                     }
                  }
               }
            } catch (JavaLayerException e) {
            }
         }
      }.start();

      Thread.sleep(10000);
      pausa = true;
      System.out.println("pausado");
      Thread.sleep(20000);
      pausa = false;
   }

    private int pausedOnFrame = 0;
    //String fis= "C://talvez.mp3";
   public void reproducir() throws FileNotFoundException, JavaLayerException{
 // private int pausedOnFrame = 0;
FileInputStream fis = new FileInputStream("C://talvez.mp3");
AdvancedPlayer player = new AdvancedPlayer(fis);
player.setPlayBackListener(new PlaybackListener() {
    
    
    @Override
    public void playbackFinished(PlaybackEvent event) {
        pausedOnFrame = event.getFrame();
    }
});
//player.play();
player.play(pausedOnFrame, 4000);
    }
   
   


   public AudioStream audio1;
   
   private void repro() throws FileNotFoundException, IOException, UnsupportedAudioFileException, LineUnavailableException {
    String sonido1 = "C://body.wav";
    
//AudioInputStream audioIn = AudioSystem.getAudioInputStream(getResource(sonido1));
//Clip clip = AudioSystem.getClip();
//clip.open(audioIn);
//clip.start();
    
    InputStream in = new FileInputStream(sonido1);
     audio1 = new AudioStream(in);
    AudioPlayer.player.start(audio1);     
   }
   
       private void parar() {        
       try {

        AudioPlayer.player.stop(audio1);
    } catch (Exception ex) {
        Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, 
  ex);
    }   
   }
   
   
}
