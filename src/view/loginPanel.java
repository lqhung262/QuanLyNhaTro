/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Font;
import java.awt.TextField;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import model.User;
import view.CustomControl.StyledButtonUI;


/**
 *
 * @author Admin
 */
public class loginPanel extends javax.swing.JPanel {

    /**
     * Creates new form loginPanel
     */
    public loginPanel() {
        initComponents();
        addPlaceHolder(txtLoginName);
        addPlaceHolder(pwf);
    }
    public void addPlaceHolder(JTextField txtf)
    {
        Font font = txtf.getFont();
        font = font.deriveFont(Font.ITALIC);
        txtf.setFont(font);
        txtf.setForeground(Color.gray);
    }
      public void removePlaceHolder(JTextField txtf)
    {
        Font font = txtf.getFont();
        font = font.deriveFont(Font.PLAIN|Font.BOLD);
        txtf.setFont(font);
        txtf.setForeground(Color.black);
    }
      public User getUser()
      {
          User loginUser = new User();
          loginUser.setPhone(txtLoginName.getText());
          loginUser.setPassword(String.valueOf(pwf.getPassword()));
          return loginUser;
      }
      public void setActionListenerButtonLogin(ActionListener listener)
      {
          btnlogin.addActionListener(listener);
      }
      public void setActionListenenrForEnterKey (KeyListener listener)
      {
          this.addKeyListener(listener);
      }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtLoginName = new javax.swing.JTextField();
        pwf = new javax.swing.JPasswordField();
        btnForget = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        btnRegisNewUser = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        txtLoginName.setForeground(new java.awt.Color(153, 153, 153));
        txtLoginName.setText("Nhập tên đăng nhập...");
        txtLoginName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtLoginName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLoginNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLoginNameFocusLost(evt);
            }
        });

        pwf.setText("Nhập mật khẩu...");
        pwf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pwf.setEchoChar('\u0000');
        pwf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwfFocusLost(evt);
            }
        });

        btnForget.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnForget.setForeground(new java.awt.Color(0, 0, 255));
        btnForget.setText("Quên mật khẩu?");
        btnForget.setBorder(null);
        btnForget.setBorderPainted(false);
        btnForget.setContentAreaFilled(false);

        btnlogin.setBackground(new java.awt.Color(0, 102, 204));
        btnlogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("Đăng nhập");
        btnlogin.setUI(new StyledButtonUI());

        btnRegisNewUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegisNewUser.setForeground(new java.awt.Color(51, 51, 255));
        btnRegisNewUser.setText("Không có tài khoản? Đăng ký ngay");
        btnRegisNewUser.setBorder(null);
        btnRegisNewUser.setBorderPainted(false);
        btnRegisNewUser.setContentAreaFilled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(pwf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                            .addComponent(txtLoginName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnlogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnRegisNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(btnForget)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtLoginName, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pwf, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnForget, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnlogin, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnRegisNewUser)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoginNameFocusGained
           if (txtLoginName.getText().equals("Nhập tên đăng nhập..."))
           {
               txtLoginName.setText(null);
               txtLoginName.requestFocus();
               removePlaceHolder(txtLoginName);
           }
    }//GEN-LAST:event_txtLoginNameFocusGained

    private void pwfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwfFocusGained
             if (pwf.getText().equals("Nhập mật khẩu..."))
             {
                 pwf.setText(null);
                 pwf.requestFocus();
                 pwf.setEchoChar('*');
                 removePlaceHolder(pwf);
             }
    }//GEN-LAST:event_pwfFocusGained

    private void txtLoginNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoginNameFocusLost
             if(txtLoginName.getText().length() == 0)
             {
                 addPlaceHolder(txtLoginName);
                 txtLoginName.setText("Nhập tên đăng nhập...");
             }
    }//GEN-LAST:event_txtLoginNameFocusLost

    private void pwfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwfFocusLost
        if(pwf.getText().length() == 0 || pwf.getText().equalsIgnoreCase("Nhập mật khẩu..."))
        {
            addPlaceHolder(pwf);
            pwf.setText("Nhập mật khẩu...");
            pwf.setEchoChar('\u0000');
            
        }
    }//GEN-LAST:event_pwfFocusLost

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.requestFocus();
    }//GEN-LAST:event_formMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnForget;
    private javax.swing.JButton btnRegisNewUser;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField pwf;
    private javax.swing.JTextField txtLoginName;
    // End of variables declaration//GEN-END:variables
}
