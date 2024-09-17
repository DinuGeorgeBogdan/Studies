package Note;

import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
public class Medie_Note extends javax.swing.JFrame {
    int Total;
    int NumberOfMarks;
     public Medie_Note() {
        initComponents();
    }
      private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlblExamMark = new javax.swing.JLabel();
        jlblResult = new javax.swing.JLabel();
        jrbResult = new javax.swing.JRadioButton();
        jtxtMark = new javax.swing.JTextField();
        jtxtAverage = new javax.swing.JTextField();
        jbtnOk = new javax.swing.JButton();
        jbtnAverage = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
         jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MEDIE NOTE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Introdu notele:");

        jlblExamMark.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblExamMark.setText("MEDIA:");

        jlblResult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblResult.setText("Calificativul");

        jrbResult.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbResult.setText("Rezultat");
        jrbResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbResultActionPerformed(evt);
            }
        });
 jtxtMark.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtMark.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtMarkKeyTyped(evt);
            }
        });

        jtxtAverage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtAverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtAverageActionPerformed(evt);
            }
        });
        jtxtAverage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtAverageKeyTyped(evt);
            }
        });

        jbtnOk.setText("OK");
        jbtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOkActionPerformed(evt);
            }
        });

        jbtnAverage.setText("MEDIA");
        jbtnAverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAverageActionPerformed(evt);
            }
        });

        jbtnReset.setText("RESET");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jbtnExit.setText("EXIT");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jList1.setToolTipText("");
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrbResult)
                        .addGap(43, 43, 43)
                        .addComponent(jlblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jlblExamMark, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jtxtAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtMark, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnOk))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtMark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnAverage))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblExamMark, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtxtAverage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtnReset)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnExit)
                            .addComponent(jrbResult))
                        .addGap(92, 92, 92))))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
      int c = JOptionPane.showConfirmDialog(null,"All System Down","System Down",JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
      if (c == JOptionPane.YES_OPTION){
          System.exit(0);
      }
       private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
      jbtnAverage.setEnabled(false);
      jrbResult.setEnabled(false);
      jbtnReset.setEnabled(false);
      jlblResult.setText(null);
      jtxtAverage.setText(null);
      jlblExamMark.setText(null);
      jtxtMark.setEnabled(true);
      jtxtAverage.setVisible(false);
      jbtnOk.setEnabled(true);
      Number.clear() ;
      jList1.setModel(Number);
       private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
     Total =0;
     NumberOfMarks = 0;
     jbtnAverage.setEnabled(false);
     jrbResult.setEnabled(false);
     jbtnReset.setEnabled(false);
     jlblResult.setVisible(false);
     jtxtAverage.setVisible(false);
     jlblExamMark.setVisible(false);
    }//GEN-LAST:event_formWindowActivated
    DefaultListModel Number = new DefaultListModel();
    private void jbtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOkActionPerformed
      int num1 = Integer.parseInt(jtxtMark.getText());
      
      Number.addElement(num1);
      jList1.setModel(Number);
      Total = Total + num1;
      NumberOfMarks = NumberOfMarks + 1;
      jbtnAverage.setEnabled(true);
      jtxtMark.setText(null);
      jlblExamMark.setVisible(true);
      jtxtAverage.setVisible(true);
      int count = jList1.getModel().getSize();
      if(count == 9){
        jtxtMark.setEnabled(false);
        jbtnOk.setEnabled(false);
        jrbResult.setEnabled(true);
      }
       private void jbtnAverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAverageActionPerformed
       double Average;
       String Answer;
       Average = Total/NumberOfMarks;
       Answer = String.format("%.1f",Average);
       jtxtAverage.setText(Answer);
       jtxtAverage.setEnabled(true);
       jtxtMark.setEnabled(false);
       jbtnOk.setEnabled(false);
       jrbResult.setEnabled(true);
       jbtnReset.setEnabled(true);
       if(Average >= 71){
           jlblResult.setText("1st class");
       }
        if(Average <= 70){
           jlblResult.setText("2nd class upper");
       }
         if(Average <= 60){
           jlblResult.setText("2nd class lower");
       }
         if(Average <= 50){
           jlblResult.setText("3rd class");
       }
        if(Average <= 39){
           jlblResult.setText("Higher education certificate");
       }   
          private void jrbResultActionPerformed(java.awt.event.ActionEvent evt)
       jlblResult.setVisible(true);
        private void jtxtMarkKeyTyped(java.awt.event.KeyEvent evt) 
       char c = evt.getKeyChar();
       
       if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
           getToolkit().beep();
           evt.consume();
       }
        private void jtxtAverageActionPerformed(java.awt.event.ActionEvent evt)
                private void jtxtAverageKeyTyped(java.awt.event.KeyEvent evt
                        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
           getToolkit().beep();
           evt.consume();
       }
                public static void main(String args[]) {
                    
                }
                 try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Medie_Note.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medie_Note.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medie_Note.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medie_Note.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAverage;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnOk;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JLabel jlblExamMark;
    private javax.swing.JLabel jlblResult;
    private javax.swing.JRadioButton jrbResult;
    private javax.swing.JTextField jtxtAverage;
    private javax.swing.JTextField jtxtMark;
    // End of variables declaration//GEN-END:variables
}
