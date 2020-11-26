package hotelmanagementApp;

import com.toedter.calendar.JTextFieldDateEditor;
import hotelmanagementApp.dao.EditBookingDAO;
import hotelmanagementApp.model.EditBookingModel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class EditBookingPanel extends javax.swing.JPanel {

    int noOFields=0;
    int selected_id;
    EditBookingModel editBookingModel = new EditBookingModel();
    public EditBookingPanel(int selected_id) {
        this.selected_id = selected_id;
        noOFields=0;
        initComponents();
      
        editBookingModel.setSelected_id(selected_id);
        EditBookingDAO.fecthDataInModel(editBookingModel);
        name.setText(editBookingModel.getName());
        emailId.setText(editBookingModel.getEmailId());
        mobileNumber.setText(editBookingModel.getMobileNumber());
        nationality.setText(editBookingModel.getNationality());
        noOfDays.setValue(editBookingModel.getNo_of_Days());
        noOfPersons.setValue(editBookingModel.getNo_of_person());

        id_Name.setSelectedItem(editBookingModel.getIdName());
        id_Proof.setText(editBookingModel.getIdProof());

        if (editBookingModel.getAc_non_ac().equals("AC")) {
            AC.doClick();
        } else {
            nonAC.doClick();
        }

        ArrivalDateChooser.setDate(null);
     //ArrivalDateChooser.set(editBookingModel.getArrival_date());
        address.setText(editBookingModel.getAddress());

        roomTypeCombo.setSelectedItem(editBookingModel.getRoomType());
        roomNumber.setText(editBookingModel.getRoomNo());
        rate.setText("" + editBookingModel.getRate());
        note.setText(editBookingModel.getNote());
        
         ArrivalDateChooser.getJCalendar().setMinSelectableDate(new Date());
        ((JTextFieldDateEditor)ArrivalDateChooser.getDateEditor()).setEditable(false); 
        
        nameError.setText("*");
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
        name.requestFocus();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        noOfPersonsError = new javax.swing.JLabel();
        mobileNumberError = new javax.swing.JLabel();
        jlabel8 = new javax.swing.JLabel();
        jlabel7 = new javax.swing.JLabel();
        noOfPersons = new javax.swing.JSpinner();
        jlabel15 = new javax.swing.JLabel();
        mobileNumber = new javax.swing.JTextField();
        id_Name = new javax.swing.JComboBox();
        acError = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        nonAC = new javax.swing.JRadioButton();
        id_ProofError = new javax.swing.JLabel();
        jlabel6 = new javax.swing.JLabel();
        nonacError = new javax.swing.JLabel();
        noOfDays = new javax.swing.JSpinner();
        jlabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        note = new javax.swing.JTextArea();
        roomNumber = new javax.swing.JTextField();
        roomTypeCombo = new javax.swing.JComboBox<>();
        ArrivalDateChooser = new com.toedter.calendar.JDateChooser();
        rateError = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        AC = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jlabel11 = new javax.swing.JLabel();
        emailId = new javax.swing.JTextField();
        addressError = new javax.swing.JLabel();
        nationalityError = new javax.swing.JLabel();
        jlabel14 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        nameError = new javax.swing.JLabel();
        roomTypeError = new javax.swing.JLabel();
        noOfDaysError = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        id_Proof = new javax.swing.JTextField();
        jlabel13 = new javax.swing.JLabel();
        emailError = new javax.swing.JLabel();
        jlabel5 = new javax.swing.JLabel();
        nationality = new javax.swing.JTextField();
        jlabel10 = new javax.swing.JLabel();
        jlabel12 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        rate = new javax.swing.JTextField();
        arrivalDateError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(1363, 740));

        noOfPersonsError.setForeground(new java.awt.Color(255, 0, 51));

        mobileNumberError.setForeground(new java.awt.Color(255, 0, 51));

        jlabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel8.setText("Arrival Date");

        jlabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel7.setText("Nationality");

        noOfPersons.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        noOfPersons.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jlabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel15.setText("Rate");

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

        id_Name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        id_Name.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Id Name", "Aadhar Number", "Driving Licence", "Other" }));
        id_Name.setToolTipText("Choose anyone");
        id_Name.setMinimumSize(new java.awt.Dimension(0, 0));
        id_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_NameActionPerformed(evt);
            }
        });

        acError.setForeground(new java.awt.Color(255, 0, 51));

        name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        name.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
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

        id_ProofError.setForeground(new java.awt.Color(255, 0, 51));

        jlabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel6.setText("Mobile Number");

        nonacError.setForeground(new java.awt.Color(255, 0, 51));

        noOfDays.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        noOfDays.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jlabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel9.setText("Number Of Days");

        note.setColumns(20);
        note.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        note.setRows(5);
        note.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(note);

        roomNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        roomNumber.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        roomNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomNumberActionPerformed(evt);
            }
        });

        roomTypeCombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        roomTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Room Type", "Guest", "V.I.P", "Normal" }));
        roomTypeCombo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        roomTypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomTypeComboActionPerformed(evt);
            }
        });

        ArrivalDateChooser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ArrivalDateChooser.setDateFormatString("d/MMM/yyyy");
        ArrivalDateChooser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        rateError.setForeground(new java.awt.Color(255, 0, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Edit Booking");

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

        jlabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel11.setText("Number Of Persons");

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

        addressError.setForeground(new java.awt.Color(255, 0, 51));

        nationalityError.setForeground(new java.awt.Color(255, 0, 51));

        jlabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel14.setText("Note");

        update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        nameError.setForeground(new java.awt.Color(255, 0, 51));

        roomTypeError.setForeground(new java.awt.Color(255, 0, 51));

        noOfDaysError.setForeground(new java.awt.Color(255, 0, 51));

        address.setColumns(20);
        address.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        address.setRows(5);
        address.setToolTipText("House no.:\nColony:\nCity:\nCountry:\n");
        address.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(address);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Name");

        id_Proof.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        id_Proof.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        id_Proof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_ProofActionPerformed(evt);
            }
        });

        jlabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel13.setText("Address");

        emailError.setForeground(new java.awt.Color(255, 0, 51));

        jlabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel5.setText("Email");

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

        jlabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel10.setText("Room Type");

        jlabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlabel12.setText("Room Number");

        reset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        rate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateActionPerformed(evt);
            }
        });

        arrivalDateError.setForeground(new java.awt.Color(255, 0, 51));

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
                                    .addComponent(emailId)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(emailError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                    .addComponent(ArrivalDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
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
                                                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                                .addComponent(rateError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(61, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void mobileNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileNumberActionPerformed

    private void id_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_NameActionPerformed
        id_Proof.requestFocus();
    }//GEN-LAST:event_id_NameActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void nonACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonACActionPerformed

    }//GEN-LAST:event_nonACActionPerformed

    private void roomNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomNumberActionPerformed

    private void roomTypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomTypeComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomTypeComboActionPerformed

    private void ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACActionPerformed

    }//GEN-LAST:event_ACActionPerformed

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

    private void emailIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailIdMouseClicked
        //this.email_lbl.setText(null);
    }//GEN-LAST:event_emailIdMouseClicked

    private void emailIdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailIdMouseExited

    }//GEN-LAST:event_emailIdMouseExited

    private void emailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailIdActionPerformed

    }//GEN-LAST:event_emailIdActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
        String name = this.name.getText();
        if(name.length() != 0)
         noOFields++;
      
        
        String emailId = this.emailId.getText();
        if (emailId.length()!=0)
         noOFields++;
    
        String mobileNumber = this.mobileNumber.getText();
        if (mobileNumber.length()!=0)
         noOFields++;
        
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
        
        
        if ( noOFields==14)
        {
            editBookingModel.setName(name);
            editBookingModel.setEmailId(emailId);
            editBookingModel.setMobileNumber(mobileNumber);
            editBookingModel.setNationality(nationality);
            editBookingModel.setAddress(address);
            editBookingModel.setRoomNo(roomNo);
            editBookingModel.setRoomType(roomType);
            editBookingModel.setAc_non_ac(ac_non_ac);
            editBookingModel.setNo_of_Days(noOfDays);
            editBookingModel.setNo_of_person(noOfPersons);
            editBookingModel.setIdName(idName);
            editBookingModel.setIdProof(idProof);
            editBookingModel.setRate(rate);
            editBookingModel.setArrival_date(arrival_date);
            editBookingModel.setBooking_date(booking_date);
            editBookingModel.setBooking_time(booking_time);
            editBookingModel.setNote(note);

            if (EditBookingDAO.updateCustomerData(editBookingModel)) {

                JOptionPane.showMessageDialog(this, "Your Data Successfully Updated.", "Update sucessful.", JOptionPane.INFORMATION_MESSAGE);
                 noOFields=0;
            } else {
                    JOptionPane.showMessageDialog(this, "Please Enter Appropriate Data.", "Update Falied.", JOptionPane.ERROR_MESSAGE);
                    noOFields=0;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Fill All Required Entry");
             noOFields=0;
        }
        
    }//GEN-LAST:event_updateActionPerformed

    private void id_ProofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_ProofActionPerformed

    }//GEN-LAST:event_id_ProofActionPerformed

    private void nationalityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nationalityFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_nationalityFocusLost

    private void nationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nationalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nationalityActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed

        this.name.setText(null);
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
       
        nameError.setText("*");
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

    private void rateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rateActionPerformed


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
    private javax.swing.JComboBox id_Name;
    private javax.swing.JTextField id_Proof;
    private javax.swing.JLabel id_ProofError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTextField mobileNumber;
    private javax.swing.JLabel mobileNumberError;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nameError;
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
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
