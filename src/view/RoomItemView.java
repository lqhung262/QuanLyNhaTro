/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;
import model.Room;
import view.CustomControl.StyledButtonUI;

/**
 *
 * @author Admin
 */
public class RoomItemView extends javax.swing.JPanel implements ListCellRenderer<Room>{

    /**
     * Creates new form RoomItemView
     */
    public RoomItemView() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblRoomName = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblCustomer = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        lblVote = new javax.swing.JLabel();
        numberPeople = new javax.swing.JLabel();
        lblarea = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        btnShort = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(650, 205));
        setVerifyInputWhenFocusTarget(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 180));

        lblRoomName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRoomName.setText("RoomName");

        lblPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(255, 0, 102));
        lblPrice.setText("lblPrices");

        lblLocation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLocation.setText("lblLocation");
        lblLocation.setPreferredSize(new java.awt.Dimension(128, 50));

        lblCustomer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnInfo.setBackground(new java.awt.Color(51, 204, 0));
        btnInfo.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        btnInfo.setForeground(new java.awt.Color(255, 255, 255));
        btnInfo.setText("Trống");
        btnInfo.setUI(new StyledButtonUI());

        lblVote.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblVote.setText("Vote");

        lblarea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblarea.setText("Area");

        btnShort.setBackground(new java.awt.Color(255, 102, 102));
        btnShort.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        btnShort.setForeground(new java.awt.Color(255, 255, 255));
        btnShort.setText("NGẮN HẠN");
        btnShort.setUI(new StyledButtonUI());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRoomName, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCustomer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(lblVote, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numberPeople)
                                    .addComponent(lblarea, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnShort, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblRoomName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCustomer)
                            .addComponent(lblarea))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVote, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberPeople)
                            .addComponent(btnInfo)
                            .addComponent(btnShort)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );

        add(jPanel1);

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnShort;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCustomer;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblRoomName;
    private javax.swing.JLabel lblVote;
    private javax.swing.JLabel lblarea;
    private javax.swing.JLabel numberPeople;
    // End of variables declaration//GEN-END:variables

    @Override
    public Component getListCellRendererComponent(JList<? extends Room> list, Room room, int index, boolean isSelected, boolean cellHasFocus) {
        //this.lblCustomer.setText(String.valueOf(room.getCustomerName()));
        this.lblImage.setIcon(new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource(room.getIconList())).getImage().getScaledInstance(200,200,Image.SCALE_AREA_AVERAGING)));
        this.lblPrice.setText(String.valueOf(room.getPrices()));
        this.lblLocation.setText(String.valueOf(room.getLocation().getDistrict()));
        this.lblRoomName.setText(String.valueOf(room.getName()));
        this.lblarea.setText(String.valueOf(room.getArea())+" m2");
        this.lblVote.setText(String.valueOf(room.getVote()) + "/5");
        if(room.getCategoryId() == 600){
            this.btnShort.setVisible(true);
        } else {
            this.btnShort.setVisible(false);
        }
        return this;
    }
}
