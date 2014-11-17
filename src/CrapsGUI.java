import javax.swing.ImageIcon;
import java.net.URL;
public class CrapsGUI extends javax.swing.JFrame {

    int money;
    Craps game;
    boolean newgame;
    public CrapsGUI() {
        initComponents();
    newgame = true;
    money = 100;
    game = new Craps();
    
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnroll = new javax.swing.JButton();
        lbldie1 = new javax.swing.JLabel();
        lbldie2 = new javax.swing.JLabel();
        btnquit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtgame = new javax.swing.JTextArea();
        lblmoney = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnroll.setText("Roll Die");
        btnroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrollActionPerformed(evt);
            }
        });

        lbldie1.setBorder(new javax.swing.border.MatteBorder(null));

        btnquit.setText("Quit");
        btnquit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquitActionPerformed(evt);
            }
        });

        txtgame.setColumns(20);
        txtgame.setRows(5);
        jScrollPane1.setViewportView(txtgame);

        lblmoney.setText("$100");

        lbltotal.setText("TOTAL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lbldie1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(lbldie2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnroll)
                                .addGap(45, 45, 45)
                                .addComponent(btnquit)
                                .addGap(41, 41, 41)
                                .addComponent(lblmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbldie1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldie2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnroll)
                    .addComponent(btnquit)
                    .addComponent(lblmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrollActionPerformed


   //roll both die 
        game.roll();
        //display  images
        lbldie1.setIcon(game.getDiePic(1));
        lbldie2.setIcon(game.getDiePic(2));
       
        if(newgame)
        {
            
            txtgame.setText("New Game\n----\nYou rolled a: "+game.getTotal());
            newgame=false;
            money-=5; //charge 5 dollars 
            lblmoney.setText("$ "+ money);//update money
        }
        else 
            txtgame.append("\nYou rolled a: "+game.getTotal());
        
        //update  total 
        lblmoney.setText(" "+game.getTotal());
        // determine if game.hasWon() or game.hasLost()
        //FINISH
         if(game.hasWon())
         {
           money+=15;
             txtgame.append("\nYOU WON!\nPress the roll button to play again.\n");
           lblmoney.setText("$ "+money);
           newgame=true;
           game = new Craps();
        }
          else if(game.hasLost())
          {
           txtgame.append("\nYOU LOST!\nPress roll button to play again.\n");
           newgame=true;
           game = new Craps();
        }
          else 
          {
              txtgame.append("\nYou're still alive! :) \n roll again!");
          }
        
    }//GEN-LAST:event_btnrollActionPerformed

    private void btnquitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquitActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnquitActionPerformed

    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(CrapsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrapsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrapsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrapsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrapsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnquit;
    private javax.swing.JButton btnroll;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldie1;
    private javax.swing.JLabel lbldie2;
    private javax.swing.JLabel lblmoney;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JTextArea txtgame;
    // End of variables declaration//GEN-END:variables
}
