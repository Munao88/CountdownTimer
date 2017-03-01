import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
public class TimerJFrame extends javax.swing.JFrame implements Runnable{
    int MAll = 0;
    int SAll = 0;
    int count = 0;
    
    Thread Ct = new Thread(this);
    public TimerJFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        time = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        Sec1 = new javax.swing.JLabel();
        Mtext = new javax.swing.JTextField();
        Stext = new javax.swing.JTextField();
        StartButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Lm = new javax.swing.JLabel();
        Ls = new javax.swing.JLabel();
        Stop = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("โปรแกรมการนับถอยหลัง");
        setBackground(new java.awt.Color(255, 102, 153));
        getContentPane().setLayout(null);

        time.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 0));
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("เวลา");
        getContentPane().add(time);
        time.setBounds(80, 80, 70, 20);

        name1.setDisplayedMnemonic('\u0e42');
        name1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 255, 51));
        name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name1.setText("โปรแกรมการนับถอยหลัง");
        getContentPane().add(name1);
        name1.setBounds(120, 10, 220, 54);

        min.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        min.setForeground(new java.awt.Color(255, 255, 0));
        min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        min.setText("นาที");
        getContentPane().add(min);
        min.setBounds(210, 80, 70, 20);

        Sec1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sec1.setForeground(new java.awt.Color(255, 255, 0));
        Sec1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sec1.setText("วินาที");
        getContentPane().add(Sec1);
        Sec1.setBounds(330, 80, 70, 20);

        Mtext.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Mtext.setText("0");
        Mtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MtextActionPerformed(evt);
            }
        });
        getContentPane().add(Mtext);
        Mtext.setBounds(150, 80, 70, 20);

        Stext.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Stext.setText("0");
        Stext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StextActionPerformed(evt);
            }
        });
        getContentPane().add(Stext);
        Stext.setBounds(270, 80, 70, 20);

        StartButton.setText("Start");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });
        getContentPane().add(StartButton);
        StartButton.setBounds(150, 270, 80, 23);

        RemoveButton.setText("Remove");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RemoveButton);
        RemoveButton.setBounds(200, 110, 80, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("นับถอยหลัง");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 220, 90, 30);

        Lm.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Lm.setForeground(new java.awt.Color(204, 0, 0));
        Lm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lm.setText("00");
        getContentPane().add(Lm);
        Lm.setBounds(150, 150, 100, 70);

        Ls.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Ls.setForeground(new java.awt.Color(204, 0, 0));
        Ls.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ls.setText(":00");
        getContentPane().add(Ls);
        Ls.setBounds(210, 160, 100, 50);

        Stop.setText("Stop");
        Stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopActionPerformed(evt);
            }
        });
        getContentPane().add(Stop);
        Stop.setBounds(240, 270, 80, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimePJ.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 480, 320);

        setBounds(0, 0, 493, 358);
    }// </editor-fold>//GEN-END:initComponents

    private void MtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MtextActionPerformed

    }//GEN-LAST:event_MtextActionPerformed

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
     if(count==0){
      Ct.start();
      MAll = Integer.parseInt(Mtext.getText());
      SAll = Integer.parseInt(Stext.getText());
      count++;
     }
     else 
      MAll = Integer.parseInt(Mtext.getText());
      SAll = Integer.parseInt(Stext.getText()); 
      Ct.resume();
    }//GEN-LAST:event_StartButtonActionPerformed

    private void StextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StextActionPerformed

    }//GEN-LAST:event_StextActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
        Mtext.setText("");
        Stext.setText("");      
    }//GEN-LAST:event_RemoveButtonActionPerformed

    private void StopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopActionPerformed
        Ct.suspend();
    }//GEN-LAST:event_StopActionPerformed
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
            java.util.logging.Logger.getLogger(TimerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimerJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lm;
    private javax.swing.JLabel Ls;
    private javax.swing.JTextField Mtext;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JLabel Sec1;
    private javax.swing.JButton StartButton;
    private javax.swing.JTextField Stext;
    private javax.swing.JButton Stop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel min;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
    while(true){     
        int m01 = MAll;
          int s01 = SAll;
          
        for(int i=m01;i>=0;i--){
          if(s01>=60){
          i+= s01/60;
          s01=s01%60;
          }
            if(i>=0){
            for(int j=s01;j>=0;j--){
                try {
                    Ct.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TimerJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(i<10){
                    Lm.setText("0"+i);
                }
                else
                    Lm.setText(""+i);
                if(j<10){
                    Ls.setText(":0"+j);
                }
                else
                    Ls.setText(":"+j);
            }
            s01 = 59;
            }
        } 
        Ct.suspend();
    }
}
}
