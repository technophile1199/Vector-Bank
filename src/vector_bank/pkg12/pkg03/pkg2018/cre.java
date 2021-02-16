package vector_bank.pkg12.pkg03.pkg2018;
import java.awt.PopupMenu;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Image;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.paint.Color.color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class cre extends javax.swing.JFrame 
{
    int xMouse,yMouse,f_id;
    String f_time="";
    String f_path="";
    String name,gender;
    int balance;
    String acc;
    public cre() 
    {
        initComponents();
    }
    public cre(int id) throws Exception {
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
            acc=rs.getString(8);
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

        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        back = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        Cross = new javax.swing.JLabel();
        Upper_Layer = new javax.swing.JLabel();
        Visa_Name = new javax.swing.JLabel();
        Cards = new javax.swing.JLabel();
        Profile_Pic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 240, 40));

        jComboBox1.setFont(new java.awt.Font("AR JULIAN", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "American Express", "Discover", "MasterCard", "Visa" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 250, -1));

        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 194, 90, 70));

        welcome.setFont(new java.awt.Font("AR JULIAN", 1, 18)); // NOI18N
        getContentPane().add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 580, 30));

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

        Visa_Name.setFont(new java.awt.Font("AR JULIAN", 1, 18)); // NOI18N
        getContentPane().add(Visa_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 280, 30));

        Cards.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgroung_Images/1-american_express.jpg"))); // NOI18N
        getContentPane().add(Cards, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 320, 140));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/request_ce.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        JOptionPane.showMessageDialog(this,"REQUEST FOR CREDIT CARD ["+jComboBox1.getSelectedItem().toString()+"] IS RECEIVED SUCCESSFULLY !");
        
        try {
            DateFormat df=new SimpleDateFormat("dd-MM-yy hh:mm:ss");
            Calendar cal=Calendar.getInstance();
            String time=df.format(cal.getTime());
            String send_msg="REQUEST FOR CREDIT CARD ["+jComboBox1.getSelectedItem().toString()+"] Of "+name;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vector_bank", "root", "");
            Statement st = con.createStatement();
            int x=st.executeUpdate("insert into request values('"+send_msg+"','"+acc+"','"+name+"'");
            if(x>0) {
                GriedView gv= new GriedView(f_id);
                gv.setVisible(true);
                this.setVisible(false);
            }
            else {
                JOptionPane.showMessageDialog(this, "Error ");
            }
        } catch (Exception ex) {
            Logger.getLogger(cre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        try {
            Request1 r= new Request1(f_id);
            r.setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(cre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backMouseClicked

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

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String combo=jComboBox1.getSelectedItem().toString();
        switch(combo) {
            case "American Express" :
                Visa_Name.setText(name);
                Visa_Name.setForeground(Color.white);
                ImageIcon img=new ImageIcon("F:\\SEM-4\\Advanced Java\\Vector_Bank(12-03-2018)\\src\\Backgroung_Images\\1-american_express.jpg");
                Image im=img.getImage();
                Image newimg=im.getScaledInstance(Cards.getWidth(),Cards.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image=new ImageIcon(newimg);
                Cards.setIcon(image);
                break;
            case "MasterCard" :
                Visa_Name.setForeground(Color.BLACK);
                ImageIcon img1=new ImageIcon("F:\\SEM-4\\Advanced Java\\Vector_Bank(12-03-2018)\\src\\Backgroung_Images\\master.jpg");
                Image im1=img1.getImage();
                Image newimg1=im1.getScaledInstance(Cards.getWidth(),Cards.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image1=new ImageIcon(newimg1);
                Cards.setIcon(image1);
                break;
            case "Visa" :
                Visa_Name.setForeground(Color.BLACK);
                ImageIcon img2=new ImageIcon("F:\\SEM-4\\Advanced Java\\Vector_Bank(12-03-2018)\\src\\Backgroung_Images\\1-visa.jpg");
                Image im2=img2.getImage();
                Image newimg2=im2.getScaledInstance(Cards.getWidth(),Cards.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image2=new ImageIcon(newimg2);
                Cards.setIcon(image2);
                break;
            case "RuPay" :
                Visa_Name.setForeground(Color.BLACK);
                ImageIcon img3=new ImageIcon("F:\\SEM-4\\Advanced Java\\Vector_Bank(12-03-2018)\\src\\Backgroung_Images\\1-rupay.jpg");
                Image im3=img3.getImage();
                Image newimg3=im3.getScaledInstance(Cards.getWidth(),Cards.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image3=new ImageIcon(newimg3);
                Cards.setIcon(image3);
                break;
            case "Maestro" :
                Visa_Name.setForeground(Color.BLACK);
                ImageIcon img4=new ImageIcon("F:\\SEM-4\\Advanced Java\\Vector_Bank(12-03-2018)\\src\\Backgroung_Images\\1-maestro.jpg");
                Image im4=img4.getImage();
                Image newimg4=im4.getScaledInstance(Cards.getWidth(),Cards.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image4=new ImageIcon(newimg4);
                Cards.setIcon(image4);
                break;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(cre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new cre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cards;
    private javax.swing.JLabel Cross;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel Profile_Pic;
    private javax.swing.JLabel Upper_Layer;
    private javax.swing.JLabel Visa_Name;
    private javax.swing.JLabel back;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}