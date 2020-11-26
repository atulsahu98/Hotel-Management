
package hotelmanagementApp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;


public class BookingPanel extends javax.swing.JPanel {
        GridBagLayout layout=new GridBagLayout();
        NewBookingPanel newBookingPanel;
        EditBookingPanel editBookingPanel;
        ViewBookingPanel viewBookingPanel;
        
    public BookingPanel(){
        
        initComponents();
        
        newBookingPanel = new NewBookingPanel();
        viewBookingPanel = new ViewBookingPanel();
         
        BookingDynamicPanel.setLayout(layout);
        GridBagConstraints c=new GridBagConstraints();
       
        c.gridx=0;
        c.gridy=0;
        BookingDynamicPanel.add(newBookingPanel,c);
               
        c.gridx=0;
        c.gridy=0;
        BookingDynamicPanel.add(viewBookingPanel,c);
        
        newBookingPanel.setVisible(false);
        viewBookingPanel.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        NewBooking = new javax.swing.JButton();
        View_Booking = new javax.swing.JButton();
        BookingDynamicPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 153, 153));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        NewBooking.setBackground(new java.awt.Color(0, 153, 153));
        NewBooking.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NewBooking.setText("New");
        NewBooking.setActionCommand("NewBooking");
        NewBooking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBookingActionPerformed(evt);
            }
        });

        View_Booking.setBackground(new java.awt.Color(0, 153, 153));
        View_Booking.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        View_Booking.setText("View");
        View_Booking.setActionCommand("NewBooking");
        View_Booking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        View_Booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_BookingActionPerformed(evt);
            }
        });

        BookingDynamicPanel.setBackground(new java.awt.Color(0, 153, 153));
        BookingDynamicPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BookingDynamicPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        BookingDynamicPanel.setPreferredSize(new java.awt.Dimension(1377, 753));

        javax.swing.GroupLayout BookingDynamicPanelLayout = new javax.swing.GroupLayout(BookingDynamicPanel);
        BookingDynamicPanel.setLayout(BookingDynamicPanelLayout);
        BookingDynamicPanelLayout.setHorizontalGroup(
            BookingDynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        BookingDynamicPanelLayout.setVerticalGroup(
            BookingDynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(22, 22, 22)
                        .addComponent(NewBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(View_Booking, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 810, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BookingDynamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(View_Booking, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BookingDynamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NewBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBookingActionPerformed
       newBookingPanel.setVisible(true);
       viewBookingPanel.setVisible(false);
    }//GEN-LAST:event_NewBookingActionPerformed

    private void View_BookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_BookingActionPerformed
       newBookingPanel.setVisible(false);
       viewBookingPanel.setVisible(true);
    }//GEN-LAST:event_View_BookingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BookingDynamicPanel;
    private javax.swing.JButton NewBooking;
    private javax.swing.JButton View_Booking;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
