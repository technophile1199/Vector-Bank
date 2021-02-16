package vector_bank.pkg12.pkg03.pkg2018;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Login extends javax.swing.JFrame 
{
    int xMouse,yMouse;
    String email,pass,fname,gender,fi,acc1,ifsc1,acc,ifsc;
    int dob,dob1,dob2,ans;
    long phn;
    String newpass="";
    char ar[]=new char[10];
    MouseEvent evt1 = null;
    String user1,pass1;
    int ans1;
    Object o;
    String time;
    int id=0;
    public Login() {
        initComponents(); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Minimize = new javax.swing.JLabel();
        Cross = new javax.swing.JLabel();
        Upper_Layer = new javax.swing.JLabel();
        UserId = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        Forgot = new javax.swing.JLabel();
        Login_Button = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Minimize.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Minimize.setForeground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 40, 30));

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
        getContentPane().add(Cross, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 40, 30));

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

        UserId.setBackground(new java.awt.Color(208, 208, 211));
        UserId.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        UserId.setForeground(new java.awt.Color(255, 0, 0));
        UserId.setToolTipText("Enter Email Id");
        UserId.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(UserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 270, 50));

        Password.setBackground(new java.awt.Color(208, 208, 211));
        Password.setToolTipText("Enter Password Here");
        Password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 270, 50));

        Forgot.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Forgot.setForeground(new java.awt.Color(132, 247, 132));
        Forgot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Forgot.setText("Forgot Password?");
        Forgot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Forgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForgotMouseClicked(evt);
            }
        });
        getContentPane().add(Forgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, 180, 20));

        Login_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Login_ButtonMouseClicked(evt);
            }
        });
        getContentPane().add(Login_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 170, 50));

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 400, 180, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgroung_Images/Webp.net-compress-image (1).jpg"))); // NOI18N
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

    private void ForgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotMouseClicked

        String ans1=JOptionPane.showInputDialog(this,"Enter Your Account No. : ");
        String ans2=JOptionPane.showInputDialog(this,"Enter Your IFSC : ");
        String newpwd="";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vector_bank","root","");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from create_account");
            while(rs.next())
            {
                System.out.println("IN");
                String acc=rs.getString(8);
                String ifsc=rs.getString(9);
                if(acc.equals(ans1)&& ifsc.equals(ans2)) { 
                    rs=st.executeQuery("Select * from create_account where Account_No='"+acc+"' AND ifsc='"+ifsc+"'");
                    while(rs.next()) {
                        int forgot_id=rs.getInt(11);
                        rs=st.executeQuery("select * from register_login where ID="+forgot_id+"");
                        while(rs.next()) {
                            char ar[]=new char[8];
                            String pass=rs.getString(2);
                            for(int i=0;i<pass.length();i++)
                            {
                                //5752793214
                                //33051609948792
                                char as=pass.charAt(i);
                                int ascii=(int)as;
                                ascii--;
                                ar[i]=(char)ascii;
                            }
                            for(int j=0;j<pass.length();j++)
                            {
                                newpwd+=ar[j];
                            }
                            int decrypt=JOptionPane.showConfirmDialog(this, "Click Ok TO Decrypt Your Password : "+pass);
                            if(decrypt==0) {
                                JOptionPane.showMessageDialog(this, "Password : "+newpwd);
                            }
                            else if(decrypt==1) {
                                JOptionPane.showMessageDialog(this, "Ok!");
                            }
                        }
                    }
                }
                else {
                    System.out.println("Error");
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_ForgotMouseClicked

    private void Login_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_ButtonMouseClicked
        try
        {
            try
            {
                user1=UserId.getText();
                pass1=Password.getText();

                //Encryption Of Password
                String newpwd="";
                for(int i=0;i<pass1.length();i++)
                {
                    char as=pass1.charAt(i);
                    int ascii=(int)as;
                    ascii++;
                    ar[i]=(char)ascii;
                }
                for(int j=0;j<pass1.length();j++)
                {
                    newpwd+=ar[j];
                }

                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vector_bank","root","");
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("Select * from register_login where User_Id= '"+user1+"' and Password='"+newpwd+"'");
                if(rs.next()) {
                    String time1=rs.getString(4);
                    String uss=rs.getString(1);
                    id=rs.getInt(6);
                    
                    if(user1.equals("Admin")) {
                        JOptionPane.showMessageDialog(this, "Successfully Logged In");

                        DateFormat df1=new SimpleDateFormat("dd-MM-yy hh:mm:ss");
                        Calendar cal1=Calendar.getInstance();
                        time=df1.format(cal1.getTime());
                        
                        Statement st2=con.createStatement();
                        int rs3=st2.executeUpdate("Update register_login set Previous_Time = '"+time1+"' where User_Id= '"+user1+"'");
                        int rs4=st2.executeUpdate("Update register_login set Time = '"+time+"' where User_Id= '"+user1+"'");
                        if(rs4>0) {
                            System.out.println("Time : "+time);
                            Admin_GridView ob=new Admin_GridView(id);
                            ob.setVisible(true);
                            this.setVisible(false);
                        }
                        else {
                            JOptionPane.showMessageDialog(this, "Error");
                        }  
                    }
                    else {
                        JOptionPane.showMessageDialog(this, "Successfully Logged In");

                        DateFormat df=new SimpleDateFormat("dd-MM-yy hh:mm:ss");
                        Calendar cal=Calendar.getInstance();
                        time=df.format(cal.getTime());
                        
                      Statement st1=con.createStatement();
                      int rs2=st1.executeUpdate("Update register_login set Previous_Time = '"+time1+"' where User_Id= '"+user1+"'");
                      int rs1=st1.executeUpdate("Update register_login set Time = '"+time+"' where User_Id= '"+user1+"'");
                      if(rs1>0) {
                          System.out.println("Time : "+time);
                          GriedView ob=new GriedView(id);
                          ob.setVisible(true);
                          this.setVisible(false);
                        }
                        else {
                            JOptionPane.showMessageDialog(this, "Error");
                        }
                    }
                }
                else {
                    ans=JOptionPane.showConfirmDialog(this,"Try Again","Warning",0,1);
                    if(ans==0)
                    {
                        UserId.setText("");
                        Password.setText("");
                    }
                    else
                    {
                        System.exit(0);
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_Login_ButtonMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        Register r=new Register(id);
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cross;
    private javax.swing.JLabel Forgot;
    private javax.swing.JLabel Login_Button;
    private javax.swing.JLabel Minimize;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel Upper_Layer;
    private javax.swing.JTextField UserId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}