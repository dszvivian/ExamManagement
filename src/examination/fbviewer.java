/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examination;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class fbviewer extends javax.swing.JFrame {
ResultSet RS=null;
PreparedStatement PST=null;
Connection conn=null;
public static int x=1;
public int s=0;
public String uname="0";
public String fb="0";
    /**
     * Creates new form fbviewer
     */
    public fbviewer() {
        initComponents();
        conn=dbconnection.ConnectDb();

    setResizable(false);
    setLocationRelativeTo(null);
    ta1.setLineWrap(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb1 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        back = new javax.swing.JButton();
        next = new javax.swing.JButton();
        dissappear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb1.setText("jLabel1");

        lbl1.setText("Student             :");

        ta1.setColumns(20);
        ta1.setRows(5);
        jScrollPane1.setViewportView(ta1);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exam pics/new backicon.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exam pics/gofronticon.png"))); // NOI18N
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        dissappear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exam pics/viewfb.png"))); // NOI18N
        dissappear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dissappearActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exam pics/new backicon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dissappear)
                                .addGap(18, 18, 18)
                                .addComponent(lb1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 60, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb1)
                            .addComponent(lbl1)
                            .addComponent(dissappear, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back)
                    .addComponent(next))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dissappearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dissappearActionPerformed

        ta1.setVisible(true);
        back.setVisible(true);
        next.setVisible(true);
       lbl1.setVisible(true);
       lb1.setVisible(true); 
        
        
        
        ta1.setEditable(false);
ta1.setLineWrap(true);
        dissappear.setVisible(false);
        x=1;
        
        
try{
            String snosql="select max(slno) from userdetail";
        PST=conn.prepareStatement(snosql);
        RS=PST.executeQuery();
        
        if(RS.next())
          {
                s=RS.getInt(1);
            
            
          }   
        else
          {
            
          }
   }
catch(Exception e)
   {
           JOptionPane.showMessageDialog(null, e); 
   }        
      

try{  
        String jaba="select rollno,feedback from userdetail where slno=1";
         PST=conn.prepareStatement(jaba);
        RS=PST.executeQuery();
        
        if(RS.next())
         {
            uname=RS.getString(1);
            fb=RS.getString(2);
            lb1.setText(uname);
            ta1.setText(fb);
            
            
         }
        else
        {
            
        }
   }
catch(Exception e)
   {
          JOptionPane.showMessageDialog(null, e);
   }        
        
        

 
      if(x==1)
   {
       back.setEnabled(false);
   }
        else
   {
       
   }
      
      if(x==s)
       {
           next.setEnabled(false);
       }
        else
       {
           
       }
   
       
        // TODO add your handling code here:
    }//GEN-LAST:event_dissappearActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed

        ta1.setEditable(false);
ta1.setLineWrap(true);
        x++;
        if(x==s)
       {
           next.setEnabled(false);
       }
        else
       {
           
       }
        if((x>1)&&(x<=s))
        {
            back.setEnabled(true);
        try{  
        String jaba2="select rollno,feedback from userdetail where slno=?";
         PST=conn.prepareStatement(jaba2);
         PST.setInt(1,x);
        RS=PST.executeQuery();
        
        if(RS.next())
         {
            uname=RS.getString(1);
            fb=RS.getString(2);
            lb1.setText(uname);
            ta1.setText(fb);
            
            
         }
        else 
        {
            
        }
   }
catch(Exception e)
   {
          JOptionPane.showMessageDialog(null, e);
   }        
        
        }
        else
        {
           
        }
        
        
        
        
        
        
        
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_nextActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
ta1.setEditable(false);
ta1.setLineWrap(true);
      x--;
      
      
      if(x==1)
   {
       back.setEnabled(false);
   }
        else
   {
       
   }
      
      
      
      if((x>=1)&&(x<s))
      {
      next.setEnabled(true);
      
      try{  
        String jaba2="select rollno,feedback from userdetail where slno=?";
         PST=conn.prepareStatement(jaba2);
         PST.setInt(1,x);
        RS=PST.executeQuery();
        
        if(RS.next())
         {
            uname=RS.getString(1);
            fb=RS.getString(2);
            lb1.setText(uname);
            ta1.setText(fb);
            
            
         }
        else
        {
            
        }
   }
catch(Exception e)
   {
          JOptionPane.showMessageDialog(null, e);
   }        
        
        }
        else
        {
            
        }
      
      
      
      
        
        
        
        
        
        
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        eteach2 et2=new eteach2();
        et2.setVisible(true);
        this.setVisible(false);        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        
        
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fbviewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fbviewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fbviewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fbviewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new fbviewer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton back;
    private javax.swing.JButton dissappear;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lb1;
    public javax.swing.JLabel lbl1;
    public javax.swing.JButton next;
    public javax.swing.JTextArea ta1;
    // End of variables declaration//GEN-END:variables
}
