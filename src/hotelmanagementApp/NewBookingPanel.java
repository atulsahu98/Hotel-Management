
package hotelmanagementApp;

import com.toedter.calendar.JTextFieldDateEditor;
import hotelmanagementApp.dao.NewBookingDAO;
import hotelmanagementApp.model.NewBookingModel;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class NewBookingPanel extends javax.swing.JPanel {
    int noOFields=0;
    public NewBookingPanel() {
        initComponents();
        firstNameError.setText("*");
        lastNameError.setText("*");
        emailError.setText("*");
        mobileNumberError.setText("*");
        nationalityError.setText("*");
        arrivalDateError.setText("*");
        id_ProofError.setText("*");
        addressError.setText("*");
        roomTypeError.setText("*");
        noOfPersonsError.setText("*");
        noOfDaysError.setText("*");
        acError.setText("*");
        nonacError.setText("*");
        rateError.setText("*");
        
        ArrivalDateChooser.getJCalendar().setMinSelectableDate(new Date());
        ((JTextFieldDateEditor)ArrivalDateChooser.getDateEditor()).setEditable(false); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        middleName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        jlabel5 = new javax.swing.JLabel();
        emailId = new javax.swing.JTextField();
        mobileNumber = new javax.swing.JTextField();
        jlabel6 = new javax.swing.JLabel();
        jlabel7 = new javax.swing.JLabel();
        rate = new javax.swing.JTextField();
        jlabel8 = new javax.swing.JLabel();
        jlabel9 = new javax.swing.JLabel();
        jlabel13 = new javax.swing.JLabel();
        id_Proof = new javax.swing.JTextField();
        id_Name = new javax.swing.JComboBox();
        ArrivalDateChooser = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        AC = new javax.swing.JRadioButton();
        nonAC = new javax.swing.JRadioButton();
        jlabel10 = new javax.swing.JLabel();
        jlabel11 = new javax.swing.JLabel();
        roomTypeCombo = new javax.swing.JComboBox<>();
        nationality = new javax.swing.JTextField();
        noOfPersons = new javax.swing.JSpinner();
        jlabel14 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jlabel12 = new javax.swing.JLabel();
        roomNumber = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        note = new javax.swing.JTextArea();
        jlabel15 = new javax.swing.JLabel();
        noOfDays = new javax.swing.JSpinner();
        emailError = new javax.swing.JLabel();
        mobileNumberError = new javax.swing.JLabel();
        firstNameError = new javax.swing.JLabel();
        middleNameError = new javax.swing.JLabel();
        lastNameError = new javax.swing.JLabel();
        nationalityError = new javax.swing.JLabel();
        arrivalDateError = new javax.swing.JLabel();
        noOfDaysError = new javax.swing.JLabel();
        id_ProofError = new javax.swing.JLabel();
        addressError = new javax.swing.JLabel();
        roomTypeError = new javax.swing.JLabel();
        noOfPersonsError = new javax.swing.JLabel();
        rateError = new javax.swing.JLabel();
        acError = new javax.swing.JLabel();
        nonacError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 0, 0));
        setPreferredSize(new java.awt.Dimension(1363, 740));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Add Room Booking");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Middle Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Last Name");

        firstName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        firstName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });

        middleName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        middleName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lastName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel5.setText("Email");

        emailId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emailId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        emailId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailIdFocusLost(evt);
            }
        });
        emailId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailIdMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                emailIdMouseExited(evt);
            }
        });
        emailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailIdActionPerformed(evt);
            }
        });

        mobileNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mobileNumber.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mobileNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mobileNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mobileNumberFocusLost(evt);
            }
        });
        mobileNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileNumberActionPerformed(evt);
            }
        });

        jlabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel6.setText("Mobile Number");

        jlabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel7.setText("Nationality");

        rate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateActionPerformed(evt);
            }
        });

        jlabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel8.setText("Arrival Date");

        jlabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel9.setText("Number Of Days");

        jlabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel13.setText("Address");

        id_Proof.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        id_Proof.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        id_Proof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_ProofActionPerformed(evt);
            }
        });

        id_Name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        id_Name.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Id Name", "Aadhar Number", "Driving Licence", "Other" }));
        id_Name.setToolTipText("Choose anyone");
        id_Name.setMinimumSize(new java.awt.Dimension(0, 0));
        id_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_NameActionPerformed(evt);
            }
        });

        ArrivalDateChooser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ArrivalDateChooser.setDateFormatString("d/MMM/yyyy");
        ArrivalDateChooser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        address.setColumns(20);
        address.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        address.setRows(5);
        address.setToolTipText("House no.:\nColony:\nCity:\nCountry:\n");
        address.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(address);

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

        buttonGroup1.add(nonAC);
        nonAC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nonAC.setText("Non AC");
        nonAC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nonAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonACActionPerformed(evt);
            }
        });

        jlabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel10.setText("Room Type");

        jlabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel11.setText("Number Of Persons");

        roomTypeCombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        roomTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Room Type", "Guest", "V.I.P", "Normal", "Guest" }));
        roomTypeCombo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        roomTypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomTypeComboActionPerformed(evt);
            }
        });

        nationality.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nationality.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nationality.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nationalityFocusLost(evt);
            }
        });
        nationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nationalityActionPerformed(evt);
            }
        });

        noOfPersons.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        noOfPersons.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jlabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel14.setText("Note");

        submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
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

        note.setColumns(20);
        note.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        note.setRows(5);
        note.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(note);

        jlabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel15.setText("Rate");

        noOfDays.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        noOfDays.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        emailError.setForeground(new java.awt.Color(255, 0, 51));

        mobileNumberError.setForeground(new java.awt.Color(255, 0, 51));

        firstNameError.setForeground(new java.awt.Color(255, 0, 51));

        middleNameError.setForeground(new java.awt.Color(255, 0, 51));

        lastNameError.setForeground(new java.awt.Color(255, 0, 51));

        nationalityError.setForeground(new java.awt.Color(255, 0, 51));

        arrivalDateError.setForeground(new java.awt.Color(255, 0, 51));

        noOfDaysError.setForeground(new java.awt.Color(255, 0, 51));

        id_ProofError.setForeground(new java.awt.Color(255, 0, 51));

        addressError.setForeground(new java.awt.Color(255, 0, 51));

        roomTypeError.setForeground(new java.awt.Color(255, 0, 51));

        noOfPersonsError.setForeground(new java.awt.Color(255, 0, 51));

        rateError.setForeground(new java.awt.Color(255, 0, 51));

        acError.setForeground(new java.awt.Color(255, 0, 51));

        nonacError.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(firstName)
                                    .addComponent(emailId)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(emailError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(firstNameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ArrivalDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(arrivalDateError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(addressError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jlabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(mobileNumberError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(mobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(noOfDays, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jlabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(noOfDaysError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jlabel10)
                                                .addGap(18, 18, 18)
                                                .addComponent(roomTypeError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(nonAC)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(AC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(acError, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nonacError, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(roomNumber)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jlabel12)
                                                        .addGap(0, 0, Short.MAX_VALUE))))
                                            .addComponent(roomTypeCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(91, 91, 91)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(noOfPersons, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(id_Proof, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nationality, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lastNameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jlabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nationalityError, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(id_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(id_ProofError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jlabel11)
                                                .addGap(18, 18, 18)
                                                .addComponent(noOfPersonsError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jlabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(rateError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(middleNameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(middleName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1))
                        .addContainerGap(65, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(firstNameError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lastNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(middleNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(middleName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nationalityError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nationality, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(mobileNumberError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id_ProofError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(id_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(noOfDaysError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalDateError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ArrivalDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(noOfDays, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_Proof))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomTypeError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(roomTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jlabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(acError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(AC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(nonAC)
                                                    .addComponent(roomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(nonacError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noOfPersonsError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noOfPersons, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rateError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void emailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailIdActionPerformed
      

    }//GEN-LAST:event_emailIdActionPerformed

    private void mobileNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileNumberActionPerformed

    private void rateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rateActionPerformed

    private void id_ProofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_ProofActionPerformed

    }//GEN-LAST:event_id_ProofActionPerformed

    private void id_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_NameActionPerformed
        id_Proof.requestFocus();
    }//GEN-LAST:event_id_NameActionPerformed

    private void ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACActionPerformed

    }//GEN-LAST:event_ACActionPerformed

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void nationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nationalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nationalityActionPerformed

    private void roomTypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomTypeComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomTypeComboActionPerformed

    private void nonACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonACActionPerformed

    }//GEN-LAST:event_nonACActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        
        String name;
        String firstName = this.firstName.getText();
        String middleName = this.middleName.getText();
        String lastName = this.lastName.getText();
        if(firstName.length() != 0)
         noOFields++;

        if(lastName.length() != 0)
          noOFields++;
           
        if(middleName.length() == 0)
            name = firstName+" "+lastName;
         else
            name = firstName+" "+middleName+" "+lastName;
        
        String emailId = this.emailId.getText();
    
        String mobileNumber = this.mobileNumber.getText();
        
        String nationality = this.nationality.getText();
       
        if(nationality.length() != 0)
         noOFields++;
        
        String address = this.address.getText();
        if(address.length() != 0)
         noOFields++;
        
        String roomNo = this.roomNumber.getText();
        if(roomNo.length() != 0)
         noOFields++;
        
        String roomType = this.roomTypeCombo.getSelectedItem().toString();
        if(!roomType.equals("Select Room Type"))
         noOFields++;
        
        String ac_non_ac ="";
        if (AC.isSelected())
        {  
           ac_non_ac = "AC";
           noOFields++;
        }
          else
          {  
            if(nonAC.isSelected())
            {
              ac_non_ac = "Non AC";
              noOFields++;
            }
          }                 
       
        int noOfDays = (int)this.noOfDays.getValue();
        if(noOfDays!=0)
         noOFields++;   
        
        
        int noOfPersons =(int)this.noOfPersons.getValue();
        if(noOfPersons != 0)
         noOFields++;
               
        String idName = this.id_Name.getSelectedItem().toString();
        if(!idName.equals("Select Id Name"))
         noOFields++;
        
        String idProof = this.id_Proof.getText();
        if(idProof.length() != 0)
         noOFields++;
         
        String roomRate = this.rate.getText();
        float rate=0.0f;
        if(roomRate.length() != 0)
        {
          rate = Float.parseFloat(roomRate);
          noOFields++;
        }
        
        Date date;
        date = ArrivalDateChooser.getDate();
        String arrival_date="";
        if(date!=null)
        {
           arrival_date = DateFormat.getDateInstance().format(date);
           noOFields++;
        }
        
        Date d = new Date();
        SimpleDateFormat t = new SimpleDateFormat("hh:mm:ss a");
        String booking_time = t.format(d);
        
        SimpleDateFormat da = new SimpleDateFormat("dd/MM/yyyy");
        String booking_date= da.format(d);
        
       
        String note = this.note.getText();
        
        System.out.println(noOFields);
       if(noOFields==15)
       {
           
        NewBookingModel newBookingModel = new NewBookingModel();
        newBookingModel.setName(name);
        newBookingModel.setEmailId(emailId);
        newBookingModel.setMobileNumber(mobileNumber);
        newBookingModel.setNationality(nationality);
        newBookingModel.setAddress(address);
        newBookingModel.setRoomNo(roomNo);
        newBookingModel.setRoomType(roomType);
        newBookingModel.setAc_non_ac(ac_non_ac);
        newBookingModel.setNo_of_Days(noOfDays);
        newBookingModel.setNo_of_person(noOfPersons);
        newBookingModel.setIdName(idName);
        newBookingModel.setIdProof(idProof);
        newBookingModel.setRate(rate);
        newBookingModel.setArrival_date(arrival_date);
        newBookingModel.setBooking_date(booking_date);
        newBookingModel.setBooking_time(booking_time);
        newBookingModel.setNote(note);
        
        if(NewBookingDAO.registerNewCustomer(newBookingModel)){
        
        JOptionPane.showMessageDialog(this, "Your Data Successfully Entered.", "Submmision sucessful.", JOptionPane.INFORMATION_MESSAGE);
        this.firstName.setText(null);
        this.middleName.setText(null);
        this.lastName.setText(null);
        this.mobileNumber.setText(null);
        this.nationality.setText(null);
        this.emailId.setText(null);
        this.address.setText(null);
        this.roomTypeCombo.setSelectedItem("Select Room Type");
        this.roomNumber.setText(null);
        this.noOfDays.setValue(0);
        this.noOfPersons.setValue(0);
        this.id_Name.setSelectedItem("Select Id Name");
        this.id_Proof.setText(null);
        this.rate.setText(null);
        this.ArrivalDateChooser.setDate(null);
        this.note.setText(null);
        buttonGroup1.clearSelection();
        noOFields=0; 
        } else {
            JOptionPane.showMessageDialog(this, "Please Enter Appropriate Data.", "Submmision Falied.", JOptionPane.ERROR_MESSAGE);
            noOFields=0;
        }
       }
       else
       {
           JOptionPane.showMessageDialog(this, "Fill All Required Entry");
           noOFields=0;
       }
    }//GEN-LAST:event_submitActionPerformed
   
     
    private void roomNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomNumberActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        
        this.firstName.setText(null);
        this.middleName.setText(null);
        this.lastName.setText(null);
        this.mobileNumber.setText(null);
        this.nationality.setText(null);
        this.emailId.setText(null);
        this.address.setText(null);
        this.roomTypeCombo.setSelectedItem("Select Room Type");
        this.roomNumber.setText(null);
        this.noOfDays.setValue(0);
        this.noOfPersons.setValue(0);
        this.id_Name.setSelectedItem("Select Id Name");
        this.id_Proof.setText(null);
        this.rate.setText(null);
        this.ArrivalDateChooser.setDate(null);
        this.note.setText(null);
        buttonGroup1.clearSelection();
        
        firstNameError.setText("*");
        lastNameError.setText("*");
        emailError.setText("*");
        mobileNumberError.setText("*");
        nationalityError.setText("*");
        arrivalDateError.setText("*");
        id_ProofError.setText("*");
        addressError.setText("*");
        roomTypeError.setText("*");
        noOfPersonsError.setText("*");
        noOfDaysError.setText("*");
        acError.setText("*");
        nonacError.setText("*");
        rateError.setText("*");
        noOFields=0;
    }//GEN-LAST:event_resetActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
    }//GEN-LAST:event_formMouseClicked

    private void emailIdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailIdMouseExited
      
    }//GEN-LAST:event_emailIdMouseExited

    private void emailIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailIdMouseClicked

    }//GEN-LAST:event_emailIdMouseClicked

    private void emailIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailIdFocusLost
      String email = emailId.getText();
      String regex = "^[a-zA-Z0-9_]+@[a-z]+[.][a-z]+$";
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(email);
      
       if(!matcher.matches())
       { 
          emailError.setText("Invalid Email Id");
       }
       else
       {
          noOFields++;
       }
      
      
        
    }//GEN-LAST:event_emailIdFocusLost

    private void emailIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailIdFocusGained
      emailError.setText("*"); 
      String email = emailId.getText();
      String regex = "^[a-zA-Z0-9_]+@[a-z]+[.][a-z]+$";
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(email);
      if(matcher.matches())
      { 
       noOFields--;
      }
                
    }//GEN-LAST:event_emailIdFocusGained

    private void mobileNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobileNumberFocusLost
      String mno = mobileNumber.getText();
      String regex = "[6-9][0-9]{9}";
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(mno);
      if(!matcher.matches())
      {
        mobileNumberError.setText("Invalid Mobile Number");
      }
       else
      {
        noOFields++;
      }

    }//GEN-LAST:event_mobileNumberFocusLost

    private void mobileNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobileNumberFocusGained
      mobileNumberError.setText("*");
      String mno = mobileNumber.getText();
      String regex = "[6-9][0-9]{9}";
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(mno);
      if(matcher.matches())
      {
        noOFields--;
      }
    }//GEN-LAST:event_mobileNumberFocusGained

    private void nationalityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nationalityFocusLost
        
    }//GEN-LAST:event_nationalityFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AC;
    private com.toedter.calendar.JDateChooser ArrivalDateChooser;
    private javax.swing.JLabel acError;
    private javax.swing.JTextArea address;
    private javax.swing.JLabel addressError;
    private javax.swing.JLabel arrivalDateError;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel emailError;
    private javax.swing.JTextField emailId;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel firstNameError;
    private javax.swing.JComboBox id_Name;
    private javax.swing.JTextField id_Proof;
    private javax.swing.JLabel id_ProofError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlabel10;
    private javax.swing.JLabel jlabel11;
    private javax.swing.JLabel jlabel12;
    private javax.swing.JLabel jlabel13;
    private javax.swing.JLabel jlabel14;
    private javax.swing.JLabel jlabel15;
    private javax.swing.JLabel jlabel5;
    private javax.swing.JLabel jlabel6;
    private javax.swing.JLabel jlabel7;
    private javax.swing.JLabel jlabel8;
    private javax.swing.JLabel jlabel9;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel lastNameError;
    private javax.swing.JTextField middleName;
    private javax.swing.JLabel middleNameError;
    private javax.swing.JTextField mobileNumber;
    private javax.swing.JLabel mobileNumberError;
    private javax.swing.JTextField nationality;
    private javax.swing.JLabel nationalityError;
    private javax.swing.JSpinner noOfDays;
    private javax.swing.JLabel noOfDaysError;
    private javax.swing.JSpinner noOfPersons;
    private javax.swing.JLabel noOfPersonsError;
    private javax.swing.JRadioButton nonAC;
    private javax.swing.JLabel nonacError;
    private javax.swing.JTextArea note;
    private javax.swing.JTextField rate;
    private javax.swing.JLabel rateError;
    private javax.swing.JButton reset;
    private javax.swing.JTextField roomNumber;
    private javax.swing.JComboBox<String> roomTypeCombo;
    private javax.swing.JLabel roomTypeError;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
