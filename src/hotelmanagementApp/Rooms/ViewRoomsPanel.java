package hotelmanagementApp.Rooms;

import hotelmanagementApp.dao.ViewRoomsPanelDAO;
import hotelmanagementApp.model.ViewRoomsPanelModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewRoomsPanel extends javax.swing.JPanel {

    DefaultTableModel dtm;

    public ViewRoomsPanel(){

        initComponents();
        jTable1.setModel(new DefaultTableModel(null, new String[]{"Id", "Room Number", "Room Type", "Floor", "No. Of Beds", "Ac/nonAC", "Rate"}));
        dtm = (DefaultTableModel) jTable1.getModel();
        ArrayList<ViewRoomsPanelModel> al = ViewRoomsPanelDAO.getViewPanelModelList();
        for (ViewRoomsPanelModel p : al) {
            Object o[] = {p.getSelected_id(), p.getRoomNo(), p.getRoomType(), p.getFloor(), p.getNoOfBeds(), p.getAc_non_ac(), p.getRate()};
            dtm.addRow(o);
        }
        jTable1.setModel(dtm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchbtn = new javax.swing.JButton();
        searchByCombo = new javax.swing.JComboBox();
        searchtxt = new javax.swing.JTextField();
        refresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        searchbtn.setBackground(new java.awt.Color(204, 204, 255));
        searchbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        searchByCombo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchByCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Room no.", "Room Type", "Floor no.", "AC/NonAC" }));
        searchByCombo.setToolTipText("please select any one.");

        searchtxt.setColumns(2);
        searchtxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        refresh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Room Number", "Room Type", "Floor", "No. Of Beds", "AC/nonAC", "Rate"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setMaximumSize(new java.awt.Dimension(1333, 640));
        jTable1.setMinimumSize(new java.awt.Dimension(1333, 640));
        jTable1.setPreferredSize(new java.awt.Dimension(1333, 640));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchByCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1363, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1019, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchByCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(695, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        jTable1.setModel(new DefaultTableModel(null, new String[]{"Id", "Room Number", "Room Type", "Floor", "No. Of Beds", "Ac/nonAC", "Rate"}));
        dtm = (DefaultTableModel) jTable1.getModel();
        ArrayList<ViewRoomsPanelModel> al = ViewRoomsPanelDAO.getViewPanelModelList();
        for (ViewRoomsPanelModel p : al) {
            Object o[] = {p.getSelected_id(), p.getRoomNo(), p.getRoomType(), p.getFloor(), p.getNoOfBeds(), p.getAc_non_ac(), p.getRate()};
            dtm.addRow(o);
        }
        jTable1.setModel(dtm);
    }//GEN-LAST:event_refreshActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         int column = 0;
        int row = jTable1.getSelectedRow();
        String value = "" + jTable1.getModel().getValueAt(row, column);
        int selected_id = Integer.parseInt(value);
        new ClickOnViewEditRoom(selected_id).setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
         String value = (String) searchByCombo.getSelectedItem();

        String searchText = searchtxt.getText();
        switch (value) {
            case "Room no.":
               jTable1.setModel(new DefaultTableModel(null, new String[]{"Id", "Room Number", "Room Type", "Floor", "No. Of Beds", "Ac/nonAC", "Rate"}));
                dtm = (DefaultTableModel) jTable1.getModel();
                ArrayList<ViewRoomsPanelModel> al1 = ViewRoomsPanelDAO.searchListByRoomNo(searchText);
                if (al1.size() != 0) {
                    for (ViewRoomsPanelModel p : al1) {
                       Object o[] = {p.getSelected_id(), p.getRoomNo(), p.getRoomType(), p.getFloor(), p.getNoOfBeds(), p.getAc_non_ac(), p.getRate()};
                       dtm.addRow(o);
                    }
                    jTable1.setModel(dtm);
                } else {
                    JOptionPane.showMessageDialog(this, "Enter Appropriate Data.", "Not Found", JOptionPane.ERROR_MESSAGE);
                }
                break;

            case "Room Type":
               jTable1.setModel(new DefaultTableModel(null, new String[]{"Id", "Room Number", "Room Type", "Floor", "No. Of Beds", "Ac/nonAC", "Rate"}));
                dtm = (DefaultTableModel) jTable1.getModel();
                ArrayList<ViewRoomsPanelModel> al2 = ViewRoomsPanelDAO.searchListByRoomType(searchText);
                if (al2.size() != 0) {
                    for (ViewRoomsPanelModel p : al2) {
                       Object o[] = {p.getSelected_id(), p.getRoomNo(), p.getRoomType(), p.getFloor(), p.getNoOfBeds(), p.getAc_non_ac(), p.getRate()};
                       dtm.addRow(o);
                    }
                    jTable1.setModel(dtm);
                } else {
                    JOptionPane.showMessageDialog(this, "Enter Appropriate Data.", "Not Found", JOptionPane.ERROR_MESSAGE);
                }
                break;
            
            case "Floor no.":
              jTable1.setModel(new DefaultTableModel(null, new String[]{"Id", "Room Number", "Room Type", "Floor", "No. Of Beds", "Ac/nonAC", "Rate"}));
                dtm = (DefaultTableModel) jTable1.getModel();
                ArrayList<ViewRoomsPanelModel> al3 = ViewRoomsPanelDAO.searchListByFloorNo(searchText);
                if (al3.size() != 0) {
                    for (ViewRoomsPanelModel p : al3) {
                       Object o[] = {p.getSelected_id(), p.getRoomNo(), p.getRoomType(), p.getFloor(), p.getNoOfBeds(), p.getAc_non_ac(), p.getRate()};
                       dtm.addRow(o);
                    }
                    jTable1.setModel(dtm);
                } else {
                    JOptionPane.showMessageDialog(this, "Enter Appropriate Data.", "Not Found", JOptionPane.ERROR_MESSAGE);
                }
                break;
                
            case "AC/NonAC":
               jTable1.setModel(new DefaultTableModel(null, new String[]{"Id", "Room Number", "Room Type", "Floor", "No. Of Beds", "Ac/nonAC", "Rate"}));
                dtm = (DefaultTableModel) jTable1.getModel();
                ArrayList<ViewRoomsPanelModel> al4 = ViewRoomsPanelDAO.searchListByAC_nonAC(searchText);
                if (al4.size() != 0) {
                    for (ViewRoomsPanelModel p : al4) {
                       Object o[] = {p.getSelected_id(), p.getRoomNo(), p.getRoomType(), p.getFloor(), p.getNoOfBeds(), p.getAc_non_ac(), p.getRate()};
                       dtm.addRow(o);
                    }
                    jTable1.setModel(dtm);
                } else {
                    JOptionPane.showMessageDialog(this, "Enter Appropriate Data.", "Not Found", JOptionPane.ERROR_MESSAGE);
                }
                break;

        }
    }//GEN-LAST:event_searchbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton refresh;
    private javax.swing.JComboBox searchByCombo;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField searchtxt;
    // End of variables declaration//GEN-END:variables
}
