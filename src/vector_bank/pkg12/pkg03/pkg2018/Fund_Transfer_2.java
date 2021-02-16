package vector_bank.pkg12.pkg03.pkg2018;
import java.awt.Color;
import java.awt.Image;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Fund_Transfer_2 extends javax.swing.JFrame 
{
    int xMouse,yMouse;
    String f2_time="";
    String f2_path="";
    int f2_id=0;
    String receive_acc="";
    public Fund_Transfer_2() 
    {
        initComponents();
    }
    
    public Fund_Transfer_2(int id,String acc) throws Exception {
        initComponents();
        
        receive_acc=acc;
        f2_id=id;
        Logout.setVisible(false);
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vector_bank","root","");
        Statement st=con.createStatement();
        
        ResultSet rs=st.executeQuery("select * from create_Account where ID="+id+"");
        while(rs.next()) {
            f2_path=rs.getString(7);
            int constructor_bal=rs.getInt(10);
            rs=st.executeQuery("select * from register_login where ID="+id+"");
            while(rs.next()) {
                f2_time=rs.getString(5);
                jLabel3.setText("             Total Balance : "+constructor_bal);
                ImageIcon img=new ImageIcon(f2_path);
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

        Minimize = new javax.swing.JLabel();
        Cross = new javax.swing.JLabel();
        Upper_Layer = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Back_btn2 = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Transfer = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Profile_Pic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel3.setFont(new java.awt.Font("AR JULIAN", 1, 18)); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 660, 30));

        Back_btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back_btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back_btn2MouseClicked(evt);
            }
        });
        getContentPane().add(Back_btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 80, 70));

        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgroung_Images/logoutnew.png"))); // NOI18N
        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 180, 120, 30));

        jTextField1.setFont(new java.awt.Font("AR JULIAN", 1, 18)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, java.awt.Color.darkGray)));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 490, 50));

        Transfer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Transfer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransferMouseClicked(evt);
            }
        });
        getContentPane().add(Transfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, 260, 60));

        jLabel5.setFont(new java.awt.Font("AR JULIAN", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 370, 30));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgroung_Images/fund_t.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void Back_btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_btn2MouseClicked
        // TODO add your handling code here:
        try {
            String user="";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vector_bank","root","");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from register_login where ID= "+f2_id+"");
            while(rs.next()) {
                user=rs.getString(1);
            }
            Fund_Transfer_1 g=new Fund_Transfer_1(f2_id);
            g.setVisible(true);
            this.setVisible(false);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Error In MyAccount");
        }
    }//GEN-LAST:event_Back_btn2MouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        // TODO add your handling code here:
        Login l=new Login();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoutMouseClicked

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

    private void TransferMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransferMouseClicked
        // TODO add your handling code here:
        int textfield=Integer.parseInt(jTextField1.getText());
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vector_bank","root","");
            Statement st=con.createStatement();
        
            ResultSet rs=st.executeQuery("select * from create_Account where ID="+f2_id+"");
            while(rs.next()) {
                int bal=rs.getInt(10);
                String send_name=rs.getString(1);
                
                if(bal>textfield) {
                    int tot=0;
                    tot=bal-textfield;
                    if(tot<=1000) {
                        jLabel5.setText("Insufficient Balance Would Remain!");
                    }
                    else {
                        jLabel3.setText("             Total Balance : "+Integer.toString(tot));
                        rs=st.executeQuery("select * from create_account where Account_No='"+receive_acc+"'");
                        while(rs.next()) {
                            int receive_bal=rs.getInt(10);
                            int receive_tot=0;
                            int receive_id=rs.getInt(11);
                            String receive_name=rs.getString(1);
                            
                            receive_tot+=receive_bal+textfield;
                            JOptionPane.showMessageDialog(this, "Successfully Transfer");
                            jTextField1.setText("");
                            jLabel5.setText("");
                            String send_msg="Fund Transfered To "+receive_name;
                            String receive_msg="Fund Received From "+send_name;
                            
                            int send_balance=tot;
                            int receive_balance=receive_tot;
                            
                            DateFormat df=new SimpleDateFormat("dd-MM-yy hh:mm:ss");
                            Calendar cal=Calendar.getInstance();
                            String time=df.format(cal.getTime());
                            
                            st.executeUpdate("insert into summary(`Transaction_Details`, `Amount`, `Total_Balance`, `Time`, `ID`) values('"+send_msg+"',"+textfield+","+send_balance+",'"+time+"',"+f2_id+")");
                            st.executeUpdate("insert into summary(`Transaction_Details`, `Amount`, `Total_Balance`, `Time`, `ID`) values('"+receive_msg+"',"+textfield+","+receive_tot+",'"+time+"',"+receive_id+")");
                            st.executeUpdate("Update create_account set Balance = "+tot+" where id="+f2_id+"");
                            st.executeUpdate("Update create_account set Balance = "+receive_tot+" where Account_No="+receive_acc+"");
                            GriedView gv=new GriedView(f2_id);
                            gv.setVisible(true);
                            this.setVisible(false);
                        }
                    }
                }
                else {
                    jLabel5.setText("Insufficient Balance!");
                }
            }
        }
        catch(Exception e) {
            //JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_TransferMouseClicked

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
            java.util.logging.Logger.getLogger(Fund_Transfer_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fund_Transfer_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fund_Transfer_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fund_Transfer_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Fund_Transfer_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back_btn2;
    private javax.swing.JLabel Cross;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel Profile_Pic;
    private javax.swing.JLabel Transfer;
    private javax.swing.JLabel Upper_Layer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}