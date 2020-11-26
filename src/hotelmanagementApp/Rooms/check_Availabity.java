package hotelmanagementApp.Rooms;

import hotelmanagementApp.dao.ViewRoomsPanelDAO;
import hotelmanagementApp.model.ViewRoomsPanelModel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class check_Availabity extends javax.swing.JPanel {

    DefaultTableModel dtm;

    public check_Availabity(){

        initComponents();
        jTable1.setModel(new DefaultTableModel(null, new String[]{"Id", "Room Number", "Room Type", "Booked/Unbooked", "Customer Name", "Booked Till Date", "Floor","No. Of Beds","AC/nonAC","Rate"}));
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

        refresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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
                "ID", "Room Number", "Room Type", "Booked/Unbooked", "Customer Name", "Booked Till Date", "Floor", "No. Of Beds", "AC/nonAC", "Rate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
                .addContainerGap(1217, Short.MAX_VALUE)
                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1363, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        jTable1.setModel(new DefaultTableModel(null, new String[]{"Id", "Room Number", "Room Type", "Booked/Unbooked", "Customer Name", "Booked Till Date", "Floor","No. Of Beds","AC/nonAC","Rate"}));
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton refresh;
    // End of variables declaration//GEN-END:variables
}
