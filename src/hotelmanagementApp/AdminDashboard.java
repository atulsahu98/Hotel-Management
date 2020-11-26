
package hotelmanagementApp;

import hotelmanagementApp.Rooms.RoomsPanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class AdminDashboard extends javax.swing.JFrame {
      GridBagLayout layout=new GridBagLayout();
      BookingPanel bookingPanel;
      StaffPanel staffPanel;
      RoomsPanel roomsPanel;
      BillingPanel billingPanel;
      MealPanel mealPanel;

    public AdminDashboard() {
        initComponents();
        
        bookingPanel =new BookingPanel();
        roomsPanel=new RoomsPanel();
        staffPanel=new StaffPanel();
        mealPanel=new MealPanel();
        billingPanel=new BillingPanel();
        
        
        DynamicPanel.setLayout(layout);
        GridBagConstraints c=new GridBagConstraints();
        
        c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(bookingPanel,c);
        
        c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(roomsPanel,c);
        
        c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(staffPanel,c);
        
        c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(billingPanel,c);
         
        c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(mealPanel,c);
        
        bookingPanel.setVisible(false);
        roomsPanel.setVisible(false);
        staffPanel.setVisible(false);
        billingPanel.setVisible(false);
        mealPanel.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        booking = new javax.swing.JButton();
        rooms = new javax.swing.JButton();
        staff = new javax.swing.JButton();
        billing = new javax.swing.JButton();
        meal = new javax.swing.JButton();
        home = new javax.swing.JButton();
        DynamicPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setMinimumSize(new java.awt.Dimension(1000, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1800, 900));
        jPanel1.setPreferredSize(new java.awt.Dimension(1800, 900));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelmanagementApp/icons8-user-100.png"))); // NOI18N

        booking.setBackground(new java.awt.Color(0, 153, 153));
        booking.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        booking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelmanagementApp/booking_icon.png"))); // NOI18N
        booking.setText("            Booking");
        booking.setBorder(null);
        booking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        booking.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingActionPerformed(evt);
            }
        });

        rooms.setBackground(new java.awt.Color(0, 153, 153));
        rooms.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rooms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelmanagementApp/room_icon.png"))); // NOI18N
        rooms.setText("             Rooms");
        rooms.setBorder(null);
        rooms.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rooms.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        rooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomsActionPerformed(evt);
            }
        });

        staff.setBackground(new java.awt.Color(0, 153, 153));
        staff.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        staff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelmanagementApp/Staff_icon.png"))); // NOI18N
        staff.setText("              Staff");
        staff.setBorder(null);
        staff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        staff.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffActionPerformed(evt);
            }
        });

        billing.setBackground(new java.awt.Color(0, 153, 153));
        billing.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        billing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelmanagementApp/icons8-billing-machine-60.png"))); // NOI18N
        billing.setText("             Billing");
        billing.setBorder(null);
        billing.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        billing.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        billing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingActionPerformed(evt);
            }
        });

        meal.setBackground(new java.awt.Color(0, 153, 153));
        meal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        meal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelmanagementApp/icons8-meal-60.png"))); // NOI18N
        meal.setText("              Meal");
        meal.setBorder(null);
        meal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        meal.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        meal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mealActionPerformed(evt);
            }
        });

        home.setBackground(new java.awt.Color(0, 153, 153));
        home.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelmanagementApp/icons8-home-60.png"))); // NOI18N
        home.setText("              Home");
        home.setBorder(null);
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(booking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rooms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(staff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(billing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(meal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(booking, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rooms, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(staff, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(billing, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(meal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        DynamicPanel.setBackground(new java.awt.Color(0, 204, 204));
        DynamicPanel.setPreferredSize(new java.awt.Dimension(1407, 900));

        javax.swing.GroupLayout DynamicPanelLayout = new javax.swing.GroupLayout(DynamicPanel);
        DynamicPanel.setLayout(DynamicPanelLayout);
        DynamicPanelLayout.setHorizontalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1398, Short.MAX_VALUE)
        );
        DynamicPanelLayout.setVerticalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DynamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1398, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DynamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingActionPerformed
      bookingPanel.setVisible(true);
      staffPanel.setVisible(false);
      roomsPanel.setVisible(false);
      billingPanel.setVisible(false);
      mealPanel.setVisible(false);
    }//GEN-LAST:event_bookingActionPerformed

    private void roomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomsActionPerformed
        bookingPanel.setVisible(false);
        roomsPanel.setVisible(true);
        staffPanel.setVisible(false);
        billingPanel.setVisible(false);
        mealPanel.setVisible(false);
        
    }//GEN-LAST:event_roomsActionPerformed

    private void staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffActionPerformed
        bookingPanel.setVisible(false);
        roomsPanel.setVisible(false);
        staffPanel.setVisible(true);
        billingPanel.setVisible(false);
        mealPanel.setVisible(false);
    }//GEN-LAST:event_staffActionPerformed

    private void billingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingActionPerformed
        bookingPanel.setVisible(false);
        roomsPanel.setVisible(false);
        staffPanel.setVisible(false);
        billingPanel.setVisible(true);
        mealPanel.setVisible(false);
    }//GEN-LAST:event_billingActionPerformed

    private void mealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mealActionPerformed
         bookingPanel.setVisible(false);
        roomsPanel.setVisible(false);
        staffPanel.setVisible(false);
        billingPanel.setVisible(false);
        mealPanel.setVisible(true);
    }//GEN-LAST:event_mealActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        bookingPanel.setVisible(false);
        roomsPanel.setVisible(false);
        staffPanel.setVisible(false);
        billingPanel.setVisible(false);
        mealPanel.setVisible(false);
    }//GEN-LAST:event_homeActionPerformed

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JButton billing;
    private javax.swing.JButton booking;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton meal;
    private javax.swing.JButton rooms;
    private javax.swing.JButton staff;
    // End of variables declaration//GEN-END:variables
}
