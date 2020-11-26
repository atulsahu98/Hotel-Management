/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementApp.Rooms;

import hotelmanagementApp.dao.AddRoomsDAO;
import hotelmanagementApp.model.AddRoomsModel;
import javax.swing.JOptionPane;


public class ClickOnViewEditRoom extends javax.swing.JFrame {
    int noOfFields=0;
    int selected_id;
     AddRoomsModel addRoomsModel = new AddRoomsModel();
    public ClickOnViewEditRoom(int selected_id) {
        this.selected_id = selected_id;
        noOfFields=0;

        addRoomsModel.setSelected_id(selected_id);
        initComponents();
        AddRoomsDAO.fecthDataInModel(addRoomsModel);
        
        roomNumber.setText(addRoomsModel.getRoomNo());
        roomTypeCombo.setSelectedItem(addRoomsModel.getRoomType());
        floor.setValue(addRoomsModel.getFloor());
        noOfBeds.setValue(addRoomsModel.getNoOfBeds());
         if (addRoomsModel.getAc_non_ac().equals("AC")) {
            AC.doClick();
        } else {
            nonAC.doClick();
        }
         
        rate.setText(""+addRoomsModel.getRate());
        
        RoomNoError.setText("*");
        roomTypeError.setText("*");
        floorError.setText("*");
        noOfBedsError.setText("*");
        ac_nonacError.setText("*");
        rateError.setText("*");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        RoomNoError = new javax.swing.JLabel();
        jlabel10 = new javax.swing.JLabel();
        roomTypeCombo = new javax.swing.JComboBox<>();
        AC = new javax.swing.JRadioButton();
        jlabel12 = new javax.swing.JLabel();
        roomNumber = new javax.swing.JTextField();
        jlabel15 = new javax.swing.JLabel();
        nonAC = new javax.swing.JRadioButton();
        roomTypeError = new javax.swing.JLabel();
        jlabel11 = new javax.swing.JLabel();
        floorError = new javax.swing.JLabel();
        rate = new javax.swing.JTextField();
        floor = new javax.swing.JSpinner();
        jlabel13 = new javax.swing.JLabel();
        noOfBedsError = new javax.swing.JLabel();
        noOfBeds = new javax.swing.JSpinner();
        jlabel14 = new javax.swing.JLabel();
        ac_nonacError = new javax.swing.JLabel();
        rateError = new javax.swing.JLabel();
        update = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Edit Room Detail");

        RoomNoError.setForeground(new java.awt.Color(255, 0, 51));

        jlabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel10.setText("Room Type");

        roomTypeCombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        roomTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Room Type", "Guest", "V.I.P", "Normal" }));
        roomTypeCombo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        roomTypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomTypeComboActionPerformed(evt);
            }
        });

        buttonGroup1.add(AC);
        AC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AC.setText(" AC");
        AC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AC.setMaximumSize(new java.awt.Dimension(71, 25));
        AC.setMinimumSize(new java.awt.Dimension(71, 25));
        AC.setPreferredSize(new java.awt.Dimension(71, 25));
        AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACActionPerformed(evt);
            }
        });

        jlabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel12.setText("Room Number");

        roomNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        roomNumber.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        roomNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomNumberActionPerformed(evt);
            }
        });

        jlabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel15.setText("Rate");

        buttonGroup1.add(nonAC);
        nonAC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nonAC.setText("Non AC");
        nonAC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nonAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonACActionPerformed(evt);
            }
        });

        roomTypeError.setForeground(new java.awt.Color(255, 0, 51));

        jlabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel11.setText("Floor");

        floorError.setForeground(new java.awt.Color(255, 0, 51));

        rate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateActionPerformed(evt);
            }
        });

        floor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        floor.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jlabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel13.setText("Number of Beds");

        noOfBedsError.setForeground(new java.awt.Color(255, 0, 51));

        noOfBeds.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        noOfBeds.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jlabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel14.setText("AC / Non AC");

        ac_nonacError.setForeground(new java.awt.Color(255, 0, 51));

        rateError.setForeground(new java.awt.Color(255, 0, 51));

        update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(noOfBedsError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(RoomNoError, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(roomTypeError, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(floorError, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jlabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rateError, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ac_nonacError, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(roomTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(roomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(floor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(noOfBeds, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(AC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(nonAC)))
                            .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RoomNoError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(roomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(roomTypeError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roomTypeCombo, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jlabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(floor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addComponent(floorError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noOfBedsError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(noOfBeds)
                    .addComponent(jlabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(ac_nonacError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jlabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                .addComponent(rateError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(181, 181, 181)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nonAC, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(AC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roomTypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomTypeComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomTypeComboActionPerformed

    private void ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACActionPerformed

    }//GEN-LAST:event_ACActionPerformed

    private void roomNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomNumberActionPerformed

    private void nonACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonACActionPerformed

    }//GEN-LAST:event_nonACActionPerformed

    private void rateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rateActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        String roomNo = this.roomNumber.getText();
        if (roomNo.length() != 0) {
           noOfFields++;
        }
        
        String roomType = this.roomTypeCombo.getSelectedItem().toString();
        if (!roomType.equals("Select Room Type")) {
           noOfFields++;
        }

        String ac_non_ac = "";
        if (AC.isSelected()){
            ac_non_ac = "AC";
            noOfFields++;
        } else {
            if (nonAC.isSelected()) {
                ac_non_ac = "Non AC";
                noOfFields++;
            } 
        }

        int floor = (int) this.floor.getValue();
        if (floor != -1) {
          noOfFields++;
        }

        int no_OfBeds = (int) this.noOfBeds.getValue();
        if (no_OfBeds != 0) {
            noOfFields++;
        }

        String roomRate = this.rate.getText();
        float rate = 0.0f;
        if (roomRate.length() != 0) {
             rate = Float.parseFloat(roomRate);
             noOfFields++;
        }
        if (noOfFields==6) {
            
            addRoomsModel.setRoomNo(roomNo);
            addRoomsModel.setRoomType(roomType);
            addRoomsModel.setAc_non_ac(ac_non_ac);
            addRoomsModel.setNoOfBeds(no_OfBeds);
            addRoomsModel.setFloor(floor);
            addRoomsModel.setRate(rate);

            if (AddRoomsDAO.updateRoom(addRoomsModel)){
                JOptionPane.showMessageDialog(this, "Your Data Successfully Updated.", "Update sucessful.", JOptionPane.INFORMATION_MESSAGE);
                noOfFields=0;
            } else {
                JOptionPane.showMessageDialog(this, "Please Enter Appropriate Data.", "Update Falied.", JOptionPane.ERROR_MESSAGE);
                noOfFields=0;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Fill All Required Entry");
             noOfFields=0;
        }
    }//GEN-LAST:event_updateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClickOnViewEditRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClickOnViewEditRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClickOnViewEditRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClickOnViewEditRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           //     new ClickOnViewEditRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AC;
    private javax.swing.JLabel RoomNoError;
    private javax.swing.JLabel ac_nonacError;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JSpinner floor;
    private javax.swing.JLabel floorError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlabel10;
    private javax.swing.JLabel jlabel11;
    private javax.swing.JLabel jlabel12;
    private javax.swing.JLabel jlabel13;
    private javax.swing.JLabel jlabel14;
    private javax.swing.JLabel jlabel15;
    private javax.swing.JSpinner noOfBeds;
    private javax.swing.JLabel noOfBedsError;
    private javax.swing.JRadioButton nonAC;
    private javax.swing.JTextField rate;
    private javax.swing.JLabel rateError;
    private javax.swing.JTextField roomNumber;
    private javax.swing.JComboBox<String> roomTypeCombo;
    private javax.swing.JLabel roomTypeError;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
