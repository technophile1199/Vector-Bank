package vector_bank.pkg12.pkg03.pkg2018;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class GriedView extends javax.swing.JFrame 
{
    int xMouse,yMouse;
    int a_id = 0;
    String a_time;
    String path,gender,name;
    public GriedView() throws Exception {
        initComponents();
    }
    public GriedView(int id) throws Exception {
        initComponents();
        int x=0;
        a_id=id;
        if(x==0) {
        //Time
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vector_bank","root","");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("Select * from register_login where ID= "+id+"");
        while(rs.next()) {
            a_time=rs.getString(5);
            jLabel3.setText("Last Signed In : "+a_time);
        }
        Logout.setVisible(false);
        
        //Profile Pic    
        rs=st.executeQuery("Select * from create_account where ID="+id+"");
        if(rs.next())
        {
            path=rs.getString(7);
            gender=rs.getString(6);
            ImageIcon img=new ImageIcon(path);
            Image im=img.getImage();
            Image newimg=im.getScaledInstance(Profile_Pic.getWidth(),Profile_Pic.getWidth(), Image.SCALE_SMOOTH);
            ImageIcon image=new ImageIcon(newimg);
            Profile_Pic.setIcon(image);
            rs=st.executeQuery("select * from register where ID="+id+"");
            while(rs.next()) {
                name=rs.getString(1);
                if(gender.equals("Male")) {
                    welcome.setText("Welcome Mr. "+name);
                }
                else {
                    welcome.setText("Welcome Mrs. "+name);
                }
            }
        }
        else
        {
            x++;
            //JOptionPane.showMessageDialog(this, "Error");
        }
        x++;
        }
        else {
            jLabel3.setText("Last Signed In : "+a_time);
            Logout.setVisible(false);
            ImageIcon img=new ImageIcon(path);
            Image im=img.getImage();
            Image newimg=im.getScaledInstance(Profile_Pic.getWidth(),Profile_Pic.getWidth(), Image.SCALE_SMOOTH);
            ImageIcon image=new ImageIcon(newimg);
            Profile_Pic.setIcon(image);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Person_Icon = new javax.swing.JLabel();
        My_Account = new javax.swing.JLabel();
        FundTransfer = new javax.swing.JLabel();
        FundTransfer_label = new javax.swing.JLabel();
        Recharge_icon = new javax.swing.JLabel();
        Recharge_label = new javax.swing.JLabel();
        Light_Bill_Icon = new javax.swing.JLabel();
        Light_Bill_label = new javax.swing.JLabel();
        Reques_Label = new javax.swing.JLabel();
        Reques_Icon = new javax.swing.JLabel();
        About_Us_Icon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        Cross = new javax.swing.JLabel();
        Upper_Layer = new javax.swing.JLabel();
        Profile_Pic = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        About_Us_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 800));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Person_Icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Person_Icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Person_IconMouseClicked(evt);
            }
        });
        getContentPane().add(Person_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 170, 160));

        My_Account.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        My_Account.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        My_Account.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        My_Account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                My_AccountMouseClicked(evt);
            }
        });
        getContentPane().add(My_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 210, 30));

        FundTransfer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FundTransfer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FundTransferMouseClicked(evt);
            }
        });
        getContentPane().add(FundTransfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 200, 190));

        FundTransfer_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FundTransfer_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FundTransfer_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FundTransfer_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FundTransfer_labelMouseClicked(evt);
            }
        });
        getContentPane().add(FundTransfer_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 230, 30));

        Recharge_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Recharge_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Recharge_iconMouseClicked(evt);
            }
        });
        getContentPane().add(Recharge_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, 170, 190));

        Recharge_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Recharge_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Recharge_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Recharge_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Recharge_labelMouseClicked(evt);
            }
        });
        getContentPane().add(Recharge_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 270, 30));

        Light_Bill_Icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Light_Bill_Icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Light_Bill_IconMouseClicked(evt);
            }
        });
        getContentPane().add(Light_Bill_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 110, 190));

        Light_Bill_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Light_Bill_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Light_Bill_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Light_Bill_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Light_Bill_labelMouseClicked(evt);
            }
        });
        getContentPane().add(Light_Bill_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 670, 310, 30));

        Reques_Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Reques_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Reques_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reques_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Reques_LabelMouseClicked(evt);
            }
        });
        getContentPane().add(Reques_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 670, 130, 30));

        Reques_Icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reques_Icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Reques_IconMouseClicked(evt);
            }
        });
        getContentPane().add(Reques_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 180, 190));

        About_Us_Icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(About_Us_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, 180, 200));

        jLabel3.setFont(new java.awt.Font("AR JULIAN", 1, 14)); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 660, 20));

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

        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgroung_Images/logoutnew.png"))); // NOI18N
        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 180, 120, 30));

        welcome.setFont(new java.awt.Font("AR JULIAN", 1, 18)); // NOI18N
        getContentPane().add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 580, 30));

        About_Us_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(About_Us_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 670, 130, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgroung_Images/Grid_View.jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1024, 768));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Person_IconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Person_IconMouseClicked
        try {
            MyAccount ob=new MyAccount(a_id);
            ob.setVisible(true);
            this.setVisible(false);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_Person_IconMouseClicked

    private void My_AccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_My_AccountMouseClicked
        // TODO add your handling code here:
        try {
            MyAccount ob=new MyAccount(a_id);
            ob.setVisible(true);
            this.setVisible(false);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_My_AccountMouseClicked

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

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        // TODO add your handling code here:
        Login l=new Login();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoutMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Logout.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void FundTransferMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FundTransferMouseClicked
        // TODO add your handling code here:
        try {
            Fund_Transfer_1 f=new Fund_Transfer_1(a_id);
            f.setVisible(true);
            this.setVisible(false);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Error in Fund_Transfer_1");
        }
    }//GEN-LAST:event_FundTransferMouseClicked

    private void FundTransfer_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FundTransfer_labelMouseClicked
        // TODO add your handling code here:
        try {
            Fund_Transfer_1 f=new Fund_Transfer_1(a_id);
            f.setVisible(true);
            this.setVisible(false);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Error in Fund_Transfer_1");
        }
    }//GEN-LAST:event_FundTransfer_labelMouseClicked

    private void Recharge_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Recharge_iconMouseClicked
        // TODO add your handling code here:
        try {
            Recharge recharge=new Recharge(a_id);
            recharge.setVisible(true);
            this.setVisible(false);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Error in Recharge");
        }
    }//GEN-LAST:event_Recharge_iconMouseClicked

    private void Recharge_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Recharge_labelMouseClicked
        // TODO add your handling code here:
        try {
            Recharge recharge=new Recharge(a_id);
            recharge.setVisible(true);
            this.setVisible(false);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Error in Recharge");
        }
    }//GEN-LAST:event_Recharge_labelMouseClicked

    private void Light_Bill_IconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Light_Bill_IconMouseClicked
        // TODO add your handling code here:
        try {
            Light_Bill lb=new Light_Bill(a_id);
            lb.setVisible(true);
            this.setVisible(false);
        }
        catch(Exception e) {
            
        }
    }//GEN-LAST:event_Light_Bill_IconMouseClicked

    private void Light_Bill_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Light_Bill_labelMouseClicked
        // TODO add your handling code here:
        try {
            Light_Bill lb=new Light_Bill(a_id);
            lb.setVisible(true);
            this.setVisible(false);
        }
        catch(Exception e) {
            
        }
    }//GEN-LAST:event_Light_Bill_labelMouseClicked

    private void Reques_IconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reques_IconMouseClicked
        // TODO add your handling code here:
        try {
            Request1 r1=new Request1(a_id);
            r1.setVisible(true);
            this.setVisible(false);
        }
        catch(Exception e) {
            
        }
    }//GEN-LAST:event_Reques_IconMouseClicked

    private void Reques_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reques_LabelMouseClicked
        // TODO add your handling code here:
        try {
            Request1 r1=new Request1(a_id);
            r1.setVisible(true);
            this.setVisible(false);
        }
        catch(Exception e) {
            
        }
    }//GEN-LAST:event_Reques_LabelMouseClicked

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
            java.util.logging.Logger.getLogger(GriedView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GriedView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GriedView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GriedView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new GriedView().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(GriedView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel About_Us_Icon;
    private javax.swing.JLabel About_Us_label;
    private javax.swing.JLabel Cross;
    private javax.swing.JLabel FundTransfer;
    private javax.swing.JLabel FundTransfer_label;
    private javax.swing.JLabel Light_Bill_Icon;
    private javax.swing.JLabel Light_Bill_label;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel My_Account;
    private javax.swing.JLabel Person_Icon;
    private javax.swing.JLabel Profile_Pic;
    private javax.swing.JLabel Recharge_icon;
    private javax.swing.JLabel Recharge_label;
    private javax.swing.JLabel Reques_Icon;
    private javax.swing.JLabel Reques_Label;
    private javax.swing.JLabel Upper_Layer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}