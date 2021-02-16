package vector_bank.pkg12.pkg03.pkg2018;

import java.awt.Color;
import java.awt.Image;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Recharge extends javax.swing.JFrame 
{
    int xMouse,yMouse;
    int recharge_id=0;
    String r_time="";
    String r_path="";
    String combo;
    public Recharge() 
    {
        initComponents();
    }
    
    public Recharge(int id) throws Exception
    {
        initComponents();
        recharge_id=id;
        Logout.setVisible(false);
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vector_bank","root","");
        Statement st=con.createStatement();
        
        ResultSet rs=st.executeQuery("select * from create_Account where ID="+id+"");
        while(rs.next()) {
            r_path=rs.getString(7);
            int balance=rs.getInt(10);
            rs=st.executeQuery("select * from register_login where ID="+id+"");
            while(rs.next()) {
                r_time=rs.getString(5);
                jLabel3.setText("             Total Balance : "+balance);
                ImageIcon img=new ImageIcon(r_path);
                Image im=img.getImage();
                Image newimg=im.getScaledInstance(Profile_Pic.getWidth(),Profile_Pic.getWidth(), Image.SCALE_SMOOTH);
                ImageIcon image=new ImageIcon(newimg);
                Profile_Pic.setIcon(image);
            }
        }
        r309.setVisible(true);
        r509.setVisible(true);
        r408.setVisible(true);
        r608.setVisible(true);
        a101.setVisible(false);
        a146.setVisible(false);
        a99.setVisible(false);
        v1299.setVisible(false);
        v499.setVisible(false);
        v899.setVisible(false);
        v1599.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logout = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        Cross = new javax.swing.JLabel();
        Upper_Layer = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Back_btn = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        r309 = new javax.swing.JLabel();
        r509 = new javax.swing.JLabel();
        r408 = new javax.swing.JLabel();
        r608 = new javax.swing.JLabel();
        a99 = new javax.swing.JLabel();
        a101 = new javax.swing.JLabel();
        a146 = new javax.swing.JLabel();
        v499 = new javax.swing.JLabel();
        v899 = new javax.swing.JLabel();
        v1299 = new javax.swing.JLabel();
        v1599 = new javax.swing.JLabel();
        Offers = new javax.swing.JLabel();
        Profile_Pic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel3.setFont(new java.awt.Font("AR JULIAN", 1, 18)); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 660, 30));

        Back_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back_btnMouseClicked(evt);
            }
        });
        getContentPane().add(Back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 80, 60));

        jComboBox1.setFont(new java.awt.Font("AR JULIAN", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JIO", "AIRTEL", "VODAFONE", "OTHERS" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, java.awt.Color.darkGray)));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 570, 40));

        jTextField1.setFont(new java.awt.Font("AR JULIAN", 1, 18)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, java.awt.Color.darkGray)));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 420, 40));

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 604, 270, 30));

        jLabel5.setFont(new java.awt.Font("AR JULIAN", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, 380, 30));

        r309.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        r309.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r309MouseClicked(evt);
            }
        });
        getContentPane().add(r309, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 444, 80, 20));

        r509.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        r509.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r509MouseClicked(evt);
            }
        });
        getContentPane().add(r509, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 470, 80, 30));

        r408.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        r408.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r408MouseClicked(evt);
            }
        });
        getContentPane().add(r408, new org.netbeans.lib.awtextra.AbsoluteConstraints(764, 444, 110, 20));

        r608.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        r608.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r608MouseClicked(evt);
            }
        });
        getContentPane().add(r608, new org.netbeans.lib.awtextra.AbsoluteConstraints(764, 470, 110, 30));

        a99.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        a99.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a99MouseClicked(evt);
            }
        });
        getContentPane().add(a99, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 90, 40));

        a101.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        a101.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a101MouseClicked(evt);
            }
        });
        getContentPane().add(a101, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 90, 40));

        a146.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        a146.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a146MouseClicked(evt);
            }
        });
        getContentPane().add(a146, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, 90, 40));

        v499.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        v499.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v499MouseClicked(evt);
            }
        });
        getContentPane().add(v499, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 394, 100, 30));

        v899.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        v899.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v899MouseClicked(evt);
            }
        });
        getContentPane().add(v899, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 420, 100, 30));

        v1299.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        v1299.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v1299MouseClicked(evt);
            }
        });
        getContentPane().add(v1299, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 454, 100, 30));

        v1599.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        v1599.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v1599MouseClicked(evt);
            }
        });
        getContentPane().add(v1599, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 490, 100, 20));

        Offers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgroung_Images/Reliance-Jio-Dhan-Dhana-Dhan-offer-2.jpg"))); // NOI18N
        getContentPane().add(Offers, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 520, 180));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgroung_Images/topup.jpg"))); // NOI18N
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

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        // TODO add your handling code here:
        Login l=new Login();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoutMouseClicked

    private void Back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_btnMouseClicked
        // TODO add your handling code here:
        try {
            String user="",time="";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vector_bank","root","");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from register_login where ID= "+recharge_id+"");
            while(rs.next()) {
                user=rs.getString(1);
            }
            GriedView g=new GriedView(recharge_id);
            g.setVisible(true);
            this.setVisible(false);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Error In MyAccount");
        }
    }//GEN-LAST:event_Back_btnMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        int rech=Integer.parseInt(jTextField1.getText());
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vector_bank","root","");
            Statement st=con.createStatement();
        
            ResultSet rs=st.executeQuery("select * from create_Account where ID="+recharge_id+"");
            while(rs.next()) {
                int bal=rs.getInt(10);
                if(bal>rech) {
                    int tot=0;
                    tot=bal-rech;
                    if(tot<=1000) {
                        jLabel5.setText("Insufficient Balance Would Remain!");
                    }
                    else {
                            jLabel5.setVisible(false);
                            jLabel3.setText("             Total Balance : "+Integer.toString(tot));
                            rs=st.executeQuery("select * from create_account where ID='"+recharge_id+"'");
                            while(rs.next()) {
                                int receive_bal=rs.getInt(10);
                                int receive_tot=0;
                                receive_tot+=receive_bal+rech;
                                JOptionPane.showMessageDialog(this, "Recharge Successfully");
                                jTextField1.setText("");
                                jLabel5.setText("");
                                
                                int send_balance=tot;
                                String send_msg="Recharge Successfull ";
                                
                                DateFormat df=new SimpleDateFormat("dd-MM-yy hh:mm:ss");
                                Calendar cal=Calendar.getInstance();
                                String time=df.format(cal.getTime());
                                
                                st.executeUpdate("insert into summary(`Transaction_Details`, `Amount`, `Total_Balance`, `Time`, `ID`) values('"+send_msg+"',"+rech+","+send_balance+",'"+time+"',"+recharge_id+")");
                                st.executeUpdate("Update create_account set Balance = "+tot+" where id="+recharge_id+"");
                                GriedView gv=new GriedView(recharge_id);
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
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        combo=jComboBox1.getSelectedItem().toString();
        System.out.println(combo);
        switch(combo) {
            case "JIO" :
                ImageIcon img=new ImageIcon("F:/SEM-4/Advanced Java/Vector_Bank(12-03-2018)/src/Backgroung_Images/Reliance-Jio-Dhan-Dhana-Dhan-offer-2.jpg");
                Image im=img.getImage();
                Image newimg=im.getScaledInstance(Offers.getWidth(),Offers.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image=new ImageIcon(newimg);
                Offers.setIcon(image);
                break;
            case "AIRTEL" :
                r309.setVisible(false);
                r509.setVisible(false);
                r408.setVisible(false);
                r608.setVisible(false);
                a101.setVisible(true);
                a146.setVisible(true);
                a99.setVisible(true);
                v1299.setVisible(false);
                v499.setVisible(false);
                v899.setVisible(false);
                v1599.setVisible(false);
                ImageIcon img1=new ImageIcon("F:/SEM-4/Advanced Java/Vector_Bank(12-03-2018)/src/Backgroung_Images/aa2.jpg");
                Image im1=img1.getImage();
                Image newimg1=im1.getScaledInstance(Offers.getWidth(),Offers.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image1=new ImageIcon(newimg1);
                Offers.setIcon(image1);
                break;
            case "VODAFONE" :
                r309.setVisible(false);
                r509.setVisible(false);
                r408.setVisible(false);
                r608.setVisible(false);
                a101.setVisible(false);
                a146.setVisible(false);
                a99.setVisible(false);
                v1299.setVisible(true);
                v499.setVisible(true);
                v899.setVisible(true);
                v1599.setVisible(true);
                ImageIcon img2=new ImageIcon("F:/SEM-4/Advanced Java/Vector_Bank(12-03-2018)/src/Backgroung_Images/vodafone-red-postpaid-tariff.jpg");
                Image im2=img2.getImage();
                Image newimg2=im2.getScaledInstance(Offers.getWidth(),Offers.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image2=new ImageIcon(newimg2);
                Offers.setIcon(image2);
                break;
            case "OTHERS" :
                try 
                {
                    Recharge_2 r2=new Recharge_2(recharge_id);
                    r2.setVisible(true);
                    this.setVisible(false);
                }
                catch(Exception e) {}
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void r309MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r309MouseClicked
        // TODO add your handling code here:
        jTextField1.setText(Integer.toString(309));
    }//GEN-LAST:event_r309MouseClicked

    private void r509MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r509MouseClicked
        // TODO add your handling code here:
        jTextField1.setText(Integer.toString(509));
    }//GEN-LAST:event_r509MouseClicked

    private void r408MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r408MouseClicked
        // TODO add your handling code here:
        jTextField1.setText(Integer.toString(408));
    }//GEN-LAST:event_r408MouseClicked

    private void r608MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r608MouseClicked
        // TODO add your handling code here:
        jTextField1.setText(Integer.toString(608));
    }//GEN-LAST:event_r608MouseClicked

    private void a99MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a99MouseClicked
        // TODO add your handling code here:
        jTextField1.setText(Integer.toString(99));
    }//GEN-LAST:event_a99MouseClicked

    private void a101MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a101MouseClicked
        // TODO add your handling code here:
        jTextField1.setText(Integer.toString(101));
    }//GEN-LAST:event_a101MouseClicked

    private void a146MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a146MouseClicked
        // TODO add your handling code here:
        jTextField1.setText(Integer.toString(146));
    }//GEN-LAST:event_a146MouseClicked

    private void v1599MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v1599MouseClicked
        // TODO add your handling code here:
        jTextField1.setText(Integer.toString(1599));
    }//GEN-LAST:event_v1599MouseClicked

    private void v1299MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v1299MouseClicked
        // TODO add your handling code here:
        jTextField1.setText(Integer.toString(1299));
    }//GEN-LAST:event_v1299MouseClicked

    private void v899MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v899MouseClicked
        // TODO add your handling code here:
        jTextField1.setText(Integer.toString(899));
    }//GEN-LAST:event_v899MouseClicked

    private void v499MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v499MouseClicked
        // TODO add your handling code here:
        jTextField1.setText(Integer.toString(499));
    }//GEN-LAST:event_v499MouseClicked

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
            java.util.logging.Logger.getLogger(Recharge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recharge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recharge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recharge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Recharge().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back_btn;
    private javax.swing.JLabel Cross;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel Offers;
    private javax.swing.JLabel Profile_Pic;
    private javax.swing.JLabel Upper_Layer;
    private javax.swing.JLabel a101;
    private javax.swing.JLabel a146;
    private javax.swing.JLabel a99;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel r309;
    private javax.swing.JLabel r408;
    private javax.swing.JLabel r509;
    private javax.swing.JLabel r608;
    private javax.swing.JLabel v1299;
    private javax.swing.JLabel v1599;
    private javax.swing.JLabel v499;
    private javax.swing.JLabel v899;
    // End of variables declaration//GEN-END:variables
}