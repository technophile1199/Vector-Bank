package vector_bank.pkg12.pkg03.pkg2018;

import java.awt.Color;
import java.awt.Image;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Request1 extends javax.swing.JFrame 
{
    int xMouse,yMouse,f_id;
    public Request1() 
    {
        initComponents();
    }
    String f_time="";
    String f_path="";
    String name,gender;
    int balance;
    public Request1(int id) throws Exception {
       initComponents();
        
        f_id=id;
        Logout.setVisible(false);
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vector_bank","root","");
        Statement st=con.createStatement();
        
        ResultSet rs=st.executeQuery("select * from create_Account where ID="+id+"");
        while(rs.next()) {
            f_path=rs.getString(7);
            balance=rs.getInt(10);
            gender=rs.getString(6);
            rs=st.executeQuery("select * from register where ID="+id+"");
            while(rs.next()) {
                f_time=rs.getString(5);
                name=rs.getString(1);
                if(gender.equals("Male")) {
                    welcome.setText("Welcome Mr. "+name);
                }
                else {
                    welcome.setText("Welcome Mrs. "+name);
                }
                ImageIcon img=new ImageIcon(f_path);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        debit = new javax.swing.JRadioButton();
        CHEQUE = new javax.swing.JRadioButton();
        credit = new javax.swing.JRadioButton();
        PASS = new javax.swing.JRadioButton();
        welcome = new javax.swing.JLabel();
        Back_btn = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        Cross = new javax.swing.JLabel();
        Upper_Layer = new javax.swing.JLabel();
        Profile_Pic = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        debit.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(debit);
        debit.setFont(new java.awt.Font("AR JULIAN", 1, 18)); // NOI18N
        debit.setText("DEBIT CARD");
        debit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                debitMouseClicked(evt);
            }
        });
        debit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debitActionPerformed(evt);
            }
        });
        getContentPane().add(debit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, 230, -1));

        CHEQUE.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(CHEQUE);
        CHEQUE.setFont(new java.awt.Font("AR JULIAN", 1, 18)); // NOI18N
        CHEQUE.setText("CHEQUE BOOK");
        CHEQUE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CHEQUEMouseClicked(evt);
            }
        });
        getContentPane().add(CHEQUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 240, -1));

        credit.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(credit);
        credit.setFont(new java.awt.Font("AR JULIAN", 1, 18)); // NOI18N
        credit.setText("CREDIT CARD");
        credit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creditMouseClicked(evt);
            }
        });
        credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditActionPerformed(evt);
            }
        });
        getContentPane().add(credit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 230, -1));

        PASS.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(PASS);
        PASS.setFont(new java.awt.Font("AR JULIAN", 1, 18)); // NOI18N
        PASS.setText("PASS BOOK");
        PASS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PASSMouseClicked(evt);
            }
        });
        getContentPane().add(PASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 170, -1));

        welcome.setFont(new java.awt.Font("AR JULIAN", 1, 18)); // NOI18N
        getContentPane().add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 580, 30));

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/request.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void debitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_debitActionPerformed

    private void CHEQUEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHEQUEMouseClicked
        try {
            req_cheque ch=new req_cheque(f_id);
            ch.setVisible(true);
            this.setVisible(false);
        }
        catch(Exception e) {
            
        }
    }//GEN-LAST:event_CHEQUEMouseClicked

    private void PASSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PASSMouseClicked
        try {
            final_request f=new final_request(f_id);
            f.setVisible(true);
            this.setVisible(false);
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_PASSMouseClicked

    private void creditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creditActionPerformed

    private void creditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditMouseClicked
        try {
            cre c=new cre(f_id);
            c.setVisible(true);
            this.setVisible(false);
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_creditMouseClicked

    private void debitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_debitMouseClicked
        try {
            deb b=new deb(f_id);
            b.setVisible(true);
            this.setVisible(false);
            }
        catch(Exception e) {
            
        }
    }//GEN-LAST:event_debitMouseClicked

    private void Back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_btnMouseClicked
        // TODO add your handling code here:
        try {
            String user="",time="";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vector_bank","root","");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from register_login where ID= "+f_id+"");
            while(rs.next()) {
                user=rs.getString(1);
            }
            GriedView g=new GriedView(f_id);
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
            java.util.logging.Logger.getLogger(Request1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Request1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Request1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Request1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Request1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back_btn;
    private javax.swing.JRadioButton CHEQUE;
    private javax.swing.JLabel Cross;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Minimize;
    private javax.swing.JRadioButton PASS;
    private javax.swing.JLabel Profile_Pic;
    private javax.swing.JLabel Upper_Layer;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton credit;
    private javax.swing.JRadioButton debit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
