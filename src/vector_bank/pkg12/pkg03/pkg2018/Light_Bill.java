package vector_bank.pkg12.pkg03.pkg2018;

import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Light_Bill extends javax.swing.JFrame 
{
    int xMouse,yMouse;
    int light_bill_id=0;
    String lb_time="";
    String lb_path="";
    public Light_Bill() {
        initComponents();
    }
    
    public Light_Bill(int id) throws Exception {
        initComponents();
        light_bill_id=id;
        
        Logout.setVisible(false);
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vector_bank","root","");
        Statement st=con.createStatement();
        
        ResultSet rs=st.executeQuery("select * from create_Account where ID="+id+"");
        while(rs.next()) {
            lb_path=rs.getString(7);
            int balance=rs.getInt(10);
            rs=st.executeQuery("select * from register_login where ID="+id+"");
            while(rs.next()) {
                lb_time=rs.getString(5);
                jLabel3.setText("             Total Balance : "+balance);
                ImageIcon img=new ImageIcon(lb_path);
                Image im=img.getImage();
                Image newimg=im.getScaledInstance(Profile_Pic.getWidth(),Profile_Pic.getWidth(), Image.SCALE_SMOOTH);
                ImageIcon image=new ImageIcon(newimg);
                Profile_Pic.setIcon(image);
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        submit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Back_btn = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        Cross = new javax.swing.JLabel();
        Upper_Layer = new javax.swing.JLabel();
        Profile_Pic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("AR JULIAN", 1, 18)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, java.awt.Color.darkGray)));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 440, 40));

        submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 230, 40));

        jLabel3.setFont(new java.awt.Font("AR JULIAN", 1, 18)); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 660, 30));

        Back_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back_btnMouseClicked(evt);
            }
        });
        getContentPane().add(Back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 80, 60));

        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgroung_Images/logoutnew.png"))); // NOI18N
        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 180, 120, 30));

        Minimize.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Minimize.setForeground(new java.awt.Color(255, 255, 255));
        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinimizeMouseExited(evt);
            }
        });
        getContentPane().add(Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 40, 40));

        Cross.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cross.setForeground(new java.awt.Color(255, 255, 255));
        Cross.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cross.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrossMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CrossMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CrossMouseExited(evt);
            }
        });
        getContentPane().add(Cross, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 40, 40));

        Upper_Layer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Upper_Layer.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        Upper_Layer.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Upper_LayerMouseDragged(evt);
            }
        });
        Upper_Layer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Upper_LayerMousePressed(evt);
            }
        });
        getContentPane().add(Upper_Layer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 40));

        Profile_Pic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Profile_Pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Profile_PicMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Profile_PicMouseEntered(evt);
            }
        });
        getContentPane().add(Profile_Pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 50, 125, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgroung_Images/Lightbill.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
        // TODO add your handling code here:
        String mgvcl=jTextField1.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vector_bank","root","");
            Statement st=con.createStatement();
        
            ResultSet rs=st.executeQuery("select * from Light_Bill where mgvcl_no="+mgvcl+"");
            if(rs.next()) {
                Light_Bill_2 l2=new Light_Bill_2(light_bill_id,mgvcl);
                l2.setVisible(true);
                this.setVisible(false);
            }
            else {
                JOptionPane.showMessageDialog(this,"Invalid Mgvcl No");
            }
        }
        catch(Exception e) {
            
        }
        
    }//GEN-LAST:event_submitMouseClicked

    private void Back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_btnMouseClicked
        // TODO add your handling code here:
        try {
            String user="",time="";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vector_bank","root","");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from register_login where ID= "+light_bill_id+"");
            while(rs.next()) {
                user=rs.getString(1);
            }
            GriedView g=new GriedView(light_bill_id);
            g.setVisible(true);
            this.setVisible(false);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Error In MyAccount");
        }
    }//GEN-LAST:event_Back_btnMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        // TODO add your handling code here:
        Login l=new Login();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoutMouseClicked

    private void Upper_LayerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Upper_LayerMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_Upper_LayerMouseDragged

    private void Upper_LayerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Upper_LayerMousePressed
        // TODO add your handling code here:
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_Upper_LayerMousePressed

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_MinimizeMouseClicked

    private void MinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseEntered
        Minimize.setForeground(Color.red);
    }//GEN-LAST:event_MinimizeMouseEntered

    private void MinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseExited
        Minimize.setForeground(Color.WHITE);
    }//GEN-LAST:event_MinimizeMouseExited

    private void CrossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrossMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CrossMouseClicked

    private void CrossMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrossMouseEntered
        Cross.setForeground(Color.red);
    }//GEN-LAST:event_CrossMouseEntered

    private void CrossMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrossMouseExited
        Cross.setForeground(Color.WHITE);
    }//GEN-LAST:event_CrossMouseExited

    private void Profile_PicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Profile_PicMouseClicked
        // TODO add your handling code here:
        Logout.setVisible(true);
    }//GEN-LAST:event_Profile_PicMouseClicked

    private void Profile_PicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Profile_PicMouseEntered
        // TODO add your handling code here:
        Logout.setVisible(true);
    }//GEN-LAST:event_Profile_PicMouseEntered

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Light_Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Light_Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Light_Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Light_Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Light_Bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back_btn;
    private javax.swing.JLabel Cross;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel Profile_Pic;
    private javax.swing.JLabel Upper_Layer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel submit;
    // End of variables declaration//GEN-END:variables
}