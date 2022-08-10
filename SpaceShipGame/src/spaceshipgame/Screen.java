/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package spaceshipgame;

import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author eisen
 */
public final class Screen extends javax.swing.JFrame {
    Mapa map = new Mapa();
    Nave player = new Nave();
    Nave enemy = new Nave();
    Random random = new Random();
    /**
     * Creates new form Screen
     */
    public Screen() {
        initComponents();
        enemy.setX(random.nextInt(9));
        enemy.setY(random.nextInt(9));
        player.setX(4);
        player.setY(9);
        PrintScreen();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfArea = new javax.swing.JTextArea();
        btUp = new javax.swing.JButton();
        btDown = new javax.swing.JButton();
        btFire = new javax.swing.JButton();
        btLeft = new javax.swing.JButton();
        btRight1 = new javax.swing.JButton();
        life = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Spaceship Game");

        tfArea.setEditable(false);
        tfArea.setBackground(new java.awt.Color(51, 51, 51));
        tfArea.setColumns(20);
        tfArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfArea.setForeground(new java.awt.Color(255, 255, 255));
        tfArea.setRows(5);
        tfArea.setText("<map>");

        btUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spaceshipgame/pics/211623_b_up_arrow_icon.png"))); // NOI18N
        btUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpActionPerformed(evt);
            }
        });

        btDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spaceshipgame/pics/211614_down_b_arrow_icon.png"))); // NOI18N
        btDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDownActionPerformed(evt);
            }
        });

        btFire.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spaceshipgame/pics/4634399_aim_interface_shot_target_icon.png"))); // NOI18N
        btFire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFireActionPerformed(evt);
            }
        });

        btLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spaceshipgame/pics/211617_b_left_arrow_icon.png"))); // NOI18N
        btLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLeftActionPerformed(evt);
            }
        });

        btRight1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spaceshipgame/pics/211620_b_right_arrow_icon.png"))); // NOI18N
        btRight1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRight1ActionPerformed(evt);
            }
        });

        life.setMaximum(3);
        life.setValue(3);

        jLabel1.setText("0        1          2          3");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Life");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfArea, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btUp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btDown, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btFire, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btRight1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(life, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfArea, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(life, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btUp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btDown, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btFire, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btRight1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpActionPerformed
        if(player.getY()>0){
            player.setY(player.getY()-1);
        }
        MoveEnemey();
        PrintScreen();
    }//GEN-LAST:event_btUpActionPerformed

    private void btDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDownActionPerformed
        if(player.getY()<9){
            player.setY(player.getY()+1);
        }
        MoveEnemey();
        PrintScreen();
    }//GEN-LAST:event_btDownActionPerformed

    private void btLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLeftActionPerformed
        if(player.getX()>0){
            player.setX(player.getX()-1);
        }
        MoveEnemey();
        PrintScreen();
    }//GEN-LAST:event_btLeftActionPerformed

    private void btRight1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRight1ActionPerformed
        if(player.getX()<9){
            player.setX(player.getX()+1);
        }
        MoveEnemey();
        PrintScreen();
    }//GEN-LAST:event_btRight1ActionPerformed

    private void btFireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFireActionPerformed
        life.setValue(life.getValue()-1);
    }//GEN-LAST:event_btFireActionPerformed

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
                if (!"Windows".equals(info.getName())) {
                } else {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Screen().setVisible(true);
        });
    }

    
    public void PrintScreen(){
        tfArea.setText(map.attShips(player.getX(),player.getY(),enemy.getX(),enemy.getY()));
    }
    
    public void MoveEnemey(){
        switch(random.nextInt(3)){
            case 0 -> {
                if(enemy.getY()>0){
                    enemy.setY(enemy.getY()-1);
                }
                PrintScreen();
            }
            case 1 -> {
                if(enemy.getY()<9){
                    enemy.setY(enemy.getY()+1);
                }
                PrintScreen();
            }
            case 2 -> {
                if(enemy.getX()>0){
                    enemy.setX(enemy.getX()-1);
                }
                PrintScreen();
            }
            default -> {
                if(enemy.getX()<9){
                    enemy.setX(enemy.getX()+1);
                }
                PrintScreen();
            }
                
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDown;
    private javax.swing.JButton btFire;
    private javax.swing.JButton btLeft;
    private javax.swing.JButton btRight1;
    private javax.swing.JButton btUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JProgressBar life;
    private javax.swing.JTextArea tfArea;
    // End of variables declaration//GEN-END:variables
}
