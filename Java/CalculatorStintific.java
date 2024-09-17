import java.awt.event.KeyEvent;
public class ScientificCalc extends javax.swing.JFrame {
 double firstnum;
 double secondnum;
 double result;
 String operations;
 private Object math;
    public ScientificCalc() {
        initComponents();
    }
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         this.setResizable(true);
        this.setSize(500, 410);
        jTextDisplay.setSize(470,70);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       
        this.setResizable(true);
        this.setSize(500, 410);
        
        
    }//GEN-LAST:event_formWindowActivated

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         this.setResizable(true);
        this.setSize(500, 410);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jbtn7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jbtn7ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn7ItemStateChanged

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        String iNum=jTextDisplay.getText()+ jbtn7.getText();
        jTextDisplay.setText(iNum);
        
        
        
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
        String iNum=jTextDisplay.getText()+ jbtn8.getText();
        jTextDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogActionPerformed
        double ops=Double.parseDouble(String.valueOf(jTextDisplay.getText()));
        ops=Math.log(ops);
        jTextDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnLogActionPerformed

    private void jbtnPiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPiActionPerformed
        
        double ops;//=Double.parseDouble(String.valueOf(jTextDisplay.getText()));
        ops=(3.1415926535897932384626433832795);
        jTextDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnPiActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
        String iNum=jTextDisplay.getText()+ jbtn9.getText();
        jTextDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtnn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnn4ActionPerformed
       String iNum=jTextDisplay.getText()+ jbtnn4.getText();
        jTextDisplay.setText(iNum);
    }//GEN-LAST:event_jbtnn4ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        String iNum=jTextDisplay.getText()+ jbtn5.getText();
        jTextDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
       String iNum=jTextDisplay.getText()+ jbtn6.getText();
        jTextDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
       String iNum=jTextDisplay.getText()+ jbtn1.getText();
        jTextDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
       String iNum=jTextDisplay.getText()+ jbtn2.getText();
        jTextDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
       String iNum=jTextDisplay.getText()+ jbtn3.getText();
        jTextDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
        String iNum=jTextDisplay.getText()+ jbtn0.getText();
        jTextDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearActionPerformed
        jTextDisplay.setText(" ");
    }//GEN-LAST:event_jbtnClearActionPerformed

    private void jbtnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackspaceActionPerformed
        String bsp=null;
        
        if(jTextDisplay.getText().length()>0)
        {StringBuilder strB=new StringBuilder(jTextDisplay.getText());
           strB.deleteCharArt(jTextDisplay.getText().length()-1);
           bsp=strB.toString();
           jTextDisplay.setText(bsp);
                   
        }
        
    }//GEN-LAST:event_jbtnBackspaceActionPerformed

    private void jbtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDotActionPerformed
        if(!jTextDisplay.getText().contains("."))
        {
           jTextDisplay.setText(jTextDisplay.getText()+jbtnDot.getText());
        
        }
    }//GEN-LAST:event_jbtnDotActionPerformed

    private void jbtnPlusMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusMinusActionPerformed
        
        double ops=Double.parseDouble(String.valueOf(jTextDisplay.getText()));
        ops=ops*(-1);
        jTextDisplay.setText(String.valueOf(ops));
        
        
    }//GEN-LAST:event_jbtnPlusMinusActionPerformed

    private void jbtnSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSqrtActionPerformed
         double ops=Double.parseDouble(String.valueOf(jTextDisplay.getText()));
        ops=Math.sqrt(ops);
      jTextDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnSqrtActionPerformed

    private void jbtnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSinActionPerformed
          double ops=Double.parseDouble(String.valueOf(jTextDisplay.getText()));
        ops=Math.sin(ops);
        jTextDisplay.setText(String.valueOf(ops));
        
        
    }//GEN-LAST:event_jbtnSinActionPerformed

    private void jbtnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDivActionPerformed
        firstnum=Double.parseDouble(jTextDisplay.getText());
         jTextDisplay.setText(null);
         operations=("/");
    }//GEN-LAST:event_jbtnDivActionPerformed

    private void jbtnMulttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMulttActionPerformed
firstnum=Double.parseDouble(jTextDisplay.getText());
         jTextDisplay.setText(null);
         operations=("*");     
    }//GEN-LAST:event_jbtnMulttActionPerformed

    private void jbtnSinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSinhActionPerformed
      double ops=Double.parseDouble(String.valueOf(jTextDisplay.getText()));
        ops=Math.sinh(ops);
        jTextDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnSinhActionPerformed

    private void jbtnCoshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCoshActionPerformed
       double ops=Double.parseDouble(String.valueOf(jTextDisplay.getText()));
        ops=Math.cosh(ops);
        jTextDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnCoshActionPerformed

    private void jbtnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCosActionPerformed
       double ops=Double.parseDouble(String.valueOf(jTextDisplay.getText()));
        ops=Math.cos(ops);
        jTextDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnCosActionPerformed

    private void jbtnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTanActionPerformed
       double ops=Double.parseDouble(String.valueOf(jTextDisplay.getText()));
        ops=Math.tan(ops);
        jTextDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnTanActionPerformed

    private void jbtnTanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTanhActionPerformed
        double ops=Double.parseDouble(String.valueOf(jTextDisplay.getText()));
        ops=Math.tanh(ops);
        jTextDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnTanhActionPerformed

    private void jbtnRundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRundActionPerformed
         double ops=Double.parseDouble(String.valueOf(jTextDisplay.getText()));
        ops=Math.round(ops);
        jTextDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnRundActionPerformed

    private void jbtnCbrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCbrtActionPerformed
         double ops=Double.parseDouble(String.valueOf(jTextDisplay.getText()));
        ops=Math.cbrt(ops);
        jTextDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnCbrtActionPerformed

    private void jbtnXYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXYActionPerformed
        
         double ops=Double.parseDouble(String.valueOf(jTextDisplay.getText()));
        ops=(ops*ops);
        jTextDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnXYActionPerformed

    private void jbtnXY2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXY2ActionPerformed
        double ops=Double.parseDouble(String.valueOf(jTextDisplay.getText()));
        ops=Math.pow(ops,ops);
        jTextDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnXY2ActionPerformed

    private void jbtnXY3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXY3ActionPerformed
        double ops=Double.parseDouble(String.valueOf(jTextDisplay.getText()));
        ops=(ops*ops*ops);
        jTextDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnXY3ActionPerformed

    private void jbtnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqualsActionPerformed
       int a=Integer.parseInt(jTextDisplay.getText());
       jTextDisplay.setText(Integer.toString(a,2));
    }//GEN-LAST:event_jbtnEqualsActionPerformed

    private void jbtnHexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHexActionPerformed
         int a=Integer.parseInt(jTextDisplay.getText());
      jTextDisplay.setText(Integer.toString(a, 16));
    }//GEN-LAST:event_jbtnHexActionPerformed

    private void jTextDisplayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDisplayKeyTyped
      char c=evt.getKeyChar();
      if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)
              ||(c==KeyEvent.VK_DELETE))){
          getToolkit().beep();
          evt.consume();
      }
    }//GEN-LAST:event_jTextDisplayKeyTyped

    private void jbtnEqualssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqualssActionPerformed
        String answer;
        secondnum=Double.parseDouble(jTextDisplay.getText());
        if(operations== "+")
        {
            result=firstnum + secondnum;
            answer=String.format("%.2f",result);
            jTextDisplay.setText(answer);
        }
        else 
            if(operations =="-")
        {
          {
            result=firstnum - secondnum;
            answer=String.format("%.2f",result);
            jTextDisplay.setText(answer);
        }  
          else if(operations== "*")
           {
            result=firstnum * secondnum;
            answer=String.format("%.2f",result);
            jTextDisplay.setText(answer);
        } 
          else if(operations== "/")
           {
            result=firstnum / secondnum;
            answer=String.format("%.2f",result);
            jTextDisplay.setText(answer);
        }
        else if(operations== "%")
           {
            result=firstnum % secondnum;
            answer=String.format("%.2f",result);
            jTextDisplay.setText(answer);
    }//GEN-LAST:event_jbtnEqualssActionPerformed

    private void jbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddActionPerformed
       
        firstnum=Double.parseDouble(jTextDisplay.getText());
         jTextDisplay.setText(null);
         operations=("+");
        
    }//GEN-LAST:event_jbtnAddActionPerformed

    private void jbtnSubbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubbActionPerformed
        firstnum=Double.parseDouble(jTextDisplay.getText());
         jTextDisplay.setText(null);
         operations=("-");
    }//GEN-LAST:event_jbtnSubbActionPerformed

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
            java.util.logging.Logger.getLogger(ScientificCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScientificCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScientificCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScientificCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScientificCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField jTextDisplay;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JButton jbtnBackspace;
    private javax.swing.JButton jbtnCbrt;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnCos;
    private javax.swing.JButton jbtnCosh;
    private javax.swing.JButton jbtnDiv;
    private javax.swing.JButton jbtnDot;
    private javax.swing.JButton jbtnEquals;
    private javax.swing.JButton jbtnEqualss;
    private javax.swing.JButton jbtnHex;
    private javax.swing.JButton jbtnLog;
    private javax.swing.JButton jbtnMultt;
    private javax.swing.JButton jbtnPi;
    private javax.swing.JButton jbtnPlusMinus;
    private javax.swing.JButton jbtnRund;
    private javax.swing.JButton jbtnSin;
    private javax.swing.JButton jbtnSinh;
    private javax.swing.JButton jbtnSqrt;
    private javax.swing.JButton jbtnSubb;
    private javax.swing.JButton jbtnTan;
    private javax.swing.JButton jbtnTanh;
    private javax.swing.JButton jbtnXY;
    private javax.swing.JButton jbtnXY2;
    private javax.swing.JButton jbtnXY3;
    private javax.swing.JButton jbtnn4;
    // End of variables declaration//GEN-END:variables
}
