
package hotelmanagementApp.Rooms;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;


public class RoomsPanel extends javax.swing.JPanel {

   GridBagLayout layout=new GridBagLayout();
        AddRoomPanel addRoomPanel;
        ViewRoomsPanel viewRoomsPanel;
    public RoomsPanel(){
        initComponents();
        addRoomPanel =new AddRoomPanel();
        viewRoomsPanel =new ViewRoomsPanel();
        
        dynamicPanel.setLayout(layout);
        GridBagConstraints c=new GridBagConstraints();
       
        c.gridx=0;
        c.gridy=0;
        dynamicPanel.add(addRoomPanel,c);
        
        c.gridx=0;
        c.gridy=0;
        dynamicPanel.add(viewRoomsPanel,c);
        
        addRoomPanel.setVisible(false);
        viewRoomsPanel.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addRoom = new javax.swing.JButton();
        viewRooms = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        dynamicPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 153, 153));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        addRoom.setBackground(new java.awt.Color(0, 153, 153));
        addRoom.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addRoom.setText("Add Room");
        addRoom.setMaximumSize(new java.awt.Dimension(243, 37));
        addRoom.setMinimumSize(new java.awt.Dimension(243, 37));
        addRoom.setPreferredSize(new java.awt.Dimension(243, 37));
        addRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomActionPerformed(evt);
            }
        });

        viewRooms.setBackground(new java.awt.Color(0, 153, 153));
        viewRooms.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        viewRooms.setText("View Rooms");
        viewRooms.setMaximumSize(new java.awt.Dimension(243, 37));
        viewRooms.setMinimumSize(new java.awt.Dimension(243, 37));
        viewRooms.setOpaque(false);
        viewRooms.setPreferredSize(new java.awt.Dimension(243, 37));
        viewRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRoomsActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("Check Availability");
        jButton3.setMaximumSize(new java.awt.Dimension(243, 40));
        jButton3.setMinimumSize(new java.awt.Dimension(243, 40));
        jButton3.setPreferredSize(new java.awt.Dimension(243, 40));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        dynamicPanel.setBackground(new java.awt.Color(0, 153, 153));
        dynamicPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dynamicPanel.setMaximumSize(new java.awt.Dimension(1379, 753));
        dynamicPanel.setMinimumSize(new java.awt.Dimension(1379, 753));
        dynamicPanel.setName(""); // NOI18N
        dynamicPanel.setPreferredSize(new java.awt.Dimension(1379, 753));

        javax.swing.GroupLayout dynamicPanelLayout = new javax.swing.GroupLayout(dynamicPanel);
        dynamicPanel.setLayout(dynamicPanelLayout);
        dynamicPanelLayout.setHorizontalGroup(
            dynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dynamicPanelLayout.setVerticalGroup(
            dynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 749, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(addRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(viewRooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 581, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dynamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addRoom, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(viewRooms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dynamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void addRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomActionPerformed
        addRoomPanel.setVisible(true);
        viewRoomsPanel.setVisible(false);
    }//GEN-LAST:event_addRoomActionPerformed

    private void viewRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRoomsActionPerformed
        addRoomPanel.setVisible(false);
        viewRoomsPanel.setVisible(true);
    }//GEN-LAST:event_viewRoomsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRoom;
    private javax.swing.JPanel dynamicPanel;
    private javax.swing.JButton jButton3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton viewRooms;
    // End of variables declaration//GEN-END:variables
}
