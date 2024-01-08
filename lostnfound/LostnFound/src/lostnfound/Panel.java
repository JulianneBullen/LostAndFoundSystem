
package lostnfound;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Panel extends javax.swing.JFrame {

    private UserDatabaseManager dbManager;
    
    public Panel() {
        initComponents();
        jPanelReport.setVisible(false);
        jPanelReport.setEnabled(false);
        jPanelSearch.setVisible(false);
        jPanelSearch.setEnabled(false);
        jPanel3.setVisible(true);
        jPanel3.setEnabled(true);
        dbManager = new UserDatabaseManager("jdbc:mysql://127.0.0.1:3306/lostnfound","root","");
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHome = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanelHomeLNF = new javax.swing.JPanel();
        jLabelfound = new javax.swing.JLabel();
        jLabellost = new javax.swing.JLabel();
        jLabeland = new javax.swing.JLabel();
        jLabelperson = new javax.swing.JLabel();
        jLabelbox = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanelReport = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldSize = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButtonUploadImage = new javax.swing.JButton();
        jTextFieldAddDetails = new javax.swing.JTextField();
        jComboBoxCategory = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldDateLost = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldTimeLost = new javax.swing.JTextField();
        jLabelUploadedImage = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldColor = new javax.swing.JTextField();
        jTextFieldLocation = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldItemName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabelColord = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanelSearch = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jButtonSearch = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBoxSearchCategory = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelHome.setBackground(new java.awt.Color(15, 32, 42));

        jPanel3.setBackground(new java.awt.Color(240, 231, 213));

        jButton2.setBackground(new java.awt.Color(11, 11, 29));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("home");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(11, 11, 29));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Admin");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(11, 11, 29));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Report");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(11, 11, 29));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Search");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jPanelHomeLNF.setBackground(new java.awt.Color(15, 32, 42));
        jPanelHomeLNF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jPanelHomeLNF.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelfound.setBackground(new java.awt.Color(15, 32, 42));
        jLabelfound.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 100)); // NOI18N
        jLabelfound.setForeground(new java.awt.Color(15, 32, 42));
        jLabelfound.setText("Found ");
        jPanelHomeLNF.add(jLabelfound, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, 240, -1));

        jLabellost.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 80)); // NOI18N
        jLabellost.setForeground(new java.awt.Color(255, 255, 0));
        jLabellost.setText("Lost  ");
        jPanelHomeLNF.add(jLabellost, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, -1, -1));

        jLabeland.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 60)); // NOI18N
        jLabeland.setForeground(new java.awt.Color(255, 255, 0));
        jLabeland.setText("And");
        jPanelHomeLNF.add(jLabeland, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, -1, -1));

        jLabelperson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lostnfound/ImageAndIcons/LnF3.png"))); // NOI18N
        jPanelHomeLNF.add(jLabelperson, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 260, 400));

        jLabelbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lostnfound/ImageAndIcons/LnF1.png"))); // NOI18N
        jPanelHomeLNF.add(jLabelbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 390, 400));

        jPanel2.setBackground(new java.awt.Color(15, 32, 42));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "\\", javax.swing.border.TitledBorder.TRAILING, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

            jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 51));
            jLabel1.setText("Hey lost something? Well, you're in the right place. ");

            jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 255, 51));
            jLabel2.setText("This app designed to be your trusty sideckick in the quest ");

            jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(255, 255, 51));
            jLabel3.setText("for your misplaced treasures. Whether it's yout favorite umbrella, ");

            jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(255, 255, 51));
            jLabel4.setText("a crucial document, or those exclusive sunglasses, consider us your ");

            jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(255, 255, 51));
            jLabel5.setText("virtual Sherlock Holmes. ");

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(22, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addContainerGap())
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap(30, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );

            jPanelHomeLNF.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 480, 250));

            jPanelReport.setBackground(new java.awt.Color(15, 32, 42));
            jPanelReport.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));

            jLabel44.setBackground(new java.awt.Color(15, 32, 42));
            jLabel44.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
            jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel44.setText("Report Lost Item");

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(246, 246, 246))
            );
            jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel44)
                    .addContainerGap(8, Short.MAX_VALUE))
            );

            jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

            jTextFieldSize.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

            jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
            jLabel13.setText("Date Found : ");

            jButtonUploadImage.setText("Browse and submit");
            jButtonUploadImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            jButtonUploadImage.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonUploadImageActionPerformed(evt);
                }
            });

            jTextFieldAddDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

            jComboBoxCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Other", "Electronics", "Accessories", "Books", "Personal Items", "Stationery", "Sports Equipment", "Jewerly", "Bags / Purses" }));
            jComboBoxCategory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

            jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
            jLabel14.setText("Time Found : ");

            jTextFieldDateLost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

            jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
            jLabel8.setText("Item Name/Model :");

            jTextFieldTimeLost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

            jLabelUploadedImage.setBackground(new java.awt.Color(255, 255, 255));
            jLabelUploadedImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

            jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
            jLabel11.setText("Additional details : ");

            jLabel17.setForeground(new java.awt.Color(153, 153, 153));
            jLabel17.setText("(e.g., Cafeteria Building, Founder's Building, etc)");

            jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
            jLabel12.setText("Select Category : ");

            jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
            jLabel19.setText("Upload image : ");

            jTextFieldColor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

            jTextFieldLocation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

            jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
            jLabel15.setText("Location Found : ");

            jTextFieldItemName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

            jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
            jLabel10.setText("Capacity / Size : ");

            jLabelColord.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
            jLabelColord.setText("Color : ");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel14))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextFieldDateLost))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextFieldTimeLost))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jTextFieldSize, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, Short.MAX_VALUE))
                                                .addComponent(jTextFieldAddDetails)
                                                .addComponent(jComboBoxCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGap(49, 49, 49))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelColord)
                                        .addComponent(jLabel8))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldColor, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                        .addComponent(jTextFieldItemName))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonUploadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(77, 77, 77)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelUploadedImage, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(67, 67, 67))))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelColord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldSize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldAddDetails)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldDateLost, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(14, 14, 14)
                                            .addComponent(jTextFieldTimeLost, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(96, 96, 96))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButtonUploadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabelUploadedImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel17)
                            .addGap(324, 324, 324)))
                    .addGap(35, 35, 35))
            );

            jButton5.setBackground(new java.awt.Color(0, 0, 0));
            jButton5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
            jButton5.setForeground(new java.awt.Color(51, 255, 0));
            jButton5.setText("ADD NEW ITEM");
            jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 2));
            jButton5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton5ActionPerformed(evt);
                }
            });

            jButton6.setBackground(new java.awt.Color(102, 0, 102));
            jButton6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
            jButton6.setForeground(new java.awt.Color(255, 102, 102));
            jButton6.setText("CLEAR ALL DATA");
            jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102), 2));
            jButton6.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton6ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanelReportLayout = new javax.swing.GroupLayout(jPanelReport);
            jPanelReport.setLayout(jPanelReportLayout);
            jPanelReportLayout.setHorizontalGroup(
                jPanelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelReportLayout.createSequentialGroup()
                    .addContainerGap(23, Short.MAX_VALUE)
                    .addGroup(jPanelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelReportLayout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGap(27, 27, 27))
            );
            jPanelReportLayout.setVerticalGroup(
                jPanelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelReportLayout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(9, 9, 9)
                    .addGroup(jPanelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelReportLayout.createSequentialGroup()
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(44, Short.MAX_VALUE))
            );

            jPanelSearch.setBackground(new java.awt.Color(15, 32, 42));
            jPanelSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));

            jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel22.setForeground(new java.awt.Color(255, 255, 255));
            jLabel22.setText("Search Category");

            jButtonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lostnfound/ImageAndIcons/search (1).png"))); // NOI18N
            jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonSearchActionPerformed(evt);
                }
            });

            jPanel7.setBackground(new java.awt.Color(15, 32, 42));
            jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null}
                },
                new String [] {
                    "Id", "Item Name", "Color", "Size", "Catagory ", "Date Found", "Time Found", "Location Found"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false, true
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTable1MouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(jTable1);

            jComboBoxSearchCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Other", "Electronics", "Accessories", "Books", "Personal Items", "Stationery", "Sports Equipment", "Jewerly", "Bags / Purses" }));
            jComboBoxSearchCategory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            jComboBoxSearchCategory.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBoxSearchCategoryActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanelSearchLayout = new javax.swing.GroupLayout(jPanelSearch);
            jPanelSearch.setLayout(jPanelSearchLayout);
            jPanelSearchLayout.setHorizontalGroup(
                jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelSearchLayout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelSearchLayout.createSequentialGroup()
                            .addComponent(jLabel22)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jComboBoxSearchCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanelSearchLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1054, 1054, 1054))))
                .addGroup(jPanelSearchLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );
            jPanelSearchLayout.setVerticalGroup(
                jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelSearchLayout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jComboBoxSearchCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(9, 9, 9)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(77, Short.MAX_VALUE))
            );

            jLayeredPane2.setLayer(jPanelHomeLNF, javax.swing.JLayeredPane.DEFAULT_LAYER);
            jLayeredPane2.setLayer(jPanelReport, javax.swing.JLayeredPane.DEFAULT_LAYER);
            jLayeredPane2.setLayer(jPanelSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);

            javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
            jLayeredPane2.setLayout(jLayeredPane2Layout);
            jLayeredPane2Layout.setHorizontalGroup(
                jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(jPanelHomeLNF, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jPanelReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jPanelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 1054, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            );
            jLayeredPane2Layout.setVerticalGroup(
                jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelHomeLNF, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jPanelReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jPanelSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap()))
            );

            javax.swing.GroupLayout jPanelHomeLayout = new javax.swing.GroupLayout(jPanelHome);
            jPanelHome.setLayout(jPanelHomeLayout);
            jPanelHomeLayout.setHorizontalGroup(
                jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelHomeLayout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(32, Short.MAX_VALUE))
            );
            jPanelHomeLayout.setVerticalGroup(
                jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelHomeLayout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(37, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jPanelHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTextFieldItemName.setText("");
        jTextFieldColor.setText("");
        jTextFieldSize.setText("");
        jTextFieldAddDetails.setText("");
        jComboBoxCategory.setSelectedIndex(0); // Set the default selected index
        jTextFieldDateLost.setText("");
        jTextFieldTimeLost.setText("");
        jTextFieldLocation.setText("");
     
        jLabelUploadedImage.setIcon(null);
    }//GEN-LAST:event_jButton6ActionPerformed

        private void disableFields() {
    jTextFieldItemName.setEnabled(false);
    jTextFieldColor.setEnabled(false);
    jTextFieldSize.setEnabled(false);
    jTextFieldAddDetails.setEnabled(false);
    jComboBoxCategory.setEnabled(false);
    jTextFieldDateLost.setEnabled(false);
    jTextFieldTimeLost.setEnabled(false);
    jTextFieldLocation.setEnabled(false);
 
    jButtonUploadImage.setEnabled(false);
}

        private void enableFields() {
    jTextFieldItemName.setEnabled(true);
    jTextFieldColor.setEnabled(true);
    jTextFieldSize.setEnabled(true);
    jTextFieldAddDetails.setEnabled(true);
    jComboBoxCategory.setEnabled(true);
    jTextFieldDateLost.setEnabled(true);
    jTextFieldTimeLost.setEnabled(true);
    jTextFieldLocation.setEnabled(true);
 
    jButtonUploadImage.setEnabled(true);
}
    private void jButtonUploadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUploadImageActionPerformed
        String item = jTextFieldItemName.getText();
        String color = jTextFieldColor.getText();
        String capacity = jTextFieldSize.getText();
        String addDetails = jTextFieldAddDetails.getText();
        String category = jComboBoxCategory.getSelectedItem().toString();
        String date = jTextFieldDateLost.getText();
        String time = jTextFieldTimeLost.getText();
        String location = jTextFieldLocation.getText();
  

        // Handle image upload
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String imagePath = selectedFile.getAbsolutePath();
            // Display image in jLabelUploadedImage
            ImageIcon imageIcon = new ImageIcon(imagePath);
            jLabelUploadedImage.setIcon(imageIcon);

            // Save the image and other details in the database
            try {
                // Resize the image to fit the JLabel
                Image originalImage = ImageIO.read(selectedFile);
                Image scaledImage = originalImage.getScaledInstance(
                    jLabelUploadedImage.getWidth(), jLabelUploadedImage.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(scaledImage);
                jLabelUploadedImage.setIcon(scaledIcon);

                // Convert the scaled image back to bytes
                BufferedImage bufferedScaledImage = new BufferedImage(
                    scaledImage.getWidth(null), scaledImage.getHeight(null), BufferedImage.TYPE_INT_RGB);
                Graphics g = bufferedScaledImage.createGraphics();
                g.drawImage(scaledImage, 0, 0, null);
                g.dispose();

                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(bufferedScaledImage, "jpg", baos);
                byte[] scaledImageData = baos.toByteArray();

                // Replace 'url', 'user', and 'password' with your database details
                UserDatabaseManager dbManager = new UserDatabaseManager("jdbc:mysql://localhost:3306/lostnfound", "root", "");
                dbManager.saveItemInfoWithImage(
                    item, color, capacity, addDetails, category, date, time, location, scaledImageData);
                JOptionPane.showMessageDialog(this, "Posted!");
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error uploading image!");
            }
        }
        disableFields();
    }//GEN-LAST:event_jButtonUploadImageActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jPanelHome.setVisible(true);
        jPanelHome.setEnabled(true);
        jPanelReport.setVisible(false);
        jPanelReport.setEnabled(false);
        jPanelSearch.setVisible(false);
        jPanelSearch.setEnabled(false);

        // Ensure jPanel3 remains visible
        jPanel3.setVisible(true);
        jPanel3.setEnabled(true);

        // Adjust visibility of components within jPanelHome as needed
        // For instance, make specific components inside jPanelHome visible
        jPanelHomeLNF.setVisible(true);
        jPanelHomeLNF.setEnabled(true);
        jButton2.setVisible(true);
        jButton2.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // Prompt user for password
    String enteredPassword = JOptionPane.showInputDialog(this, "Enter your password:");

    // Validate the password
    if (isValidPassword(enteredPassword)) {
        // Password is valid, open AdminPanel
        AdminPanel adminPanel = new AdminPanel();
        adminPanel.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        adminPanel.setVisible(true);
        this.dispose();
    } else {
        // Password is invalid, show an error message
        JOptionPane.showMessageDialog(this, "Invalid password. Please try again.");
    }
    }//GEN-LAST:event_jButton1ActionPerformed
private boolean isValidPassword(String enteredPassword) {
    // Implement your password validation logic here
    // For demonstration purposes, I'm assuming a simple password check.
    return "admin123".equals(enteredPassword);
}
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         jPanelReport.setVisible(true);
        jPanelReport.setEnabled(true);
        jPanelSearch.setVisible(false);
        jPanelSearch.setEnabled(false);

        // Ensure jPanel3 remains visible
        jPanel3.setVisible(true);
        jPanel3.setEnabled(true);

        // Adjust visibility of other components if needed
        jPanelHomeLNF.setVisible(false);
        jPanelHomeLNF.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          jPanelReport.setVisible(false);
        jPanelReport.setEnabled(false);
        jPanelSearch.setVisible(true);
        jPanelSearch.setEnabled(true);

        // Ensure jPanel3 remains visible
        jPanel3.setVisible(true);
        jPanel3.setEnabled(true);

        // Adjust visibility of other components if needed
        jPanelHomeLNF.setVisible(false);
        jPanelHomeLNF.setEnabled(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
            String searchCategory = jComboBoxSearchCategory.getSelectedItem().toString(); // Get the search category

    DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
    tableModel.setRowCount(0); // Clear the table

    List<List<Object>> tableData = dbManager.getAllItemsData(); // Retrieve all items data from the database

    boolean found = false;
    for (List<Object> rowData : tableData) {
        String itemCategory = rowData.get(4).toString(); // Assuming category is at index 4 in the rowData list
        if (itemCategory.equals(searchCategory)) {
            // Add the row to the table
            tableModel.addRow(rowData.toArray());
            found = true;
        }
    }

    if (!found) {
        JOptionPane.showMessageDialog(this, "No items found for the selected category.");
    }
    }//GEN-LAST:event_jButtonSearchActionPerformed
private void rowClicked(int rowIndex) {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    String itemID = model.getValueAt(rowIndex, 0).toString();

    // Retrieve item details including the image based on the clicked item's ID from the database
    Map<String, Object> itemDetails = dbManager.getSearchItemDetails(itemID);
     
    
    String itemName = (String) itemDetails.get("item_name");
    String itemColor = (String) itemDetails.get("color");
    String itemCapacity = (String) itemDetails.get("capacity");
    String additionalDetails = (String) itemDetails.get("additional_details");
    String category = (String) itemDetails.get("category");
    String locationLost = (String) itemDetails.get("location");
    String timeLost = (String) itemDetails.get("time_lost");
    // ... (retrieve other item details from the map)

    // Retrieve the image from the database or any other source as ImageIcon
    byte[] imageData = (byte[]) itemDetails.get("image_data"); // Replace "image_column_name" with your actual image column name
    ImageIcon imageIcon = new ImageIcon(imageData);

    // Open the SearchCategory JFrame and pass all the information including the image
    SearchCategory searchCategoryFrame = new SearchCategory();
    searchCategoryFrame.setInfo(itemName, itemColor, itemCapacity, additionalDetails, category, locationLost, timeLost, imageIcon);
    searchCategoryFrame.setVisible(true);

    // Center the frame on the screen
    searchCategoryFrame.setLocationRelativeTo(null); 
}
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       enableFields();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBoxSearchCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSearchCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSearchCategoryActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
             int row = jTable1.getSelectedRow();
    
        rowClicked(row);
        
        
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonUploadImage;
    private javax.swing.JComboBox<String> jComboBoxCategory;
    private javax.swing.JComboBox<String> jComboBoxSearchCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelColord;
    private javax.swing.JLabel jLabelUploadedImage;
    private javax.swing.JLabel jLabeland;
    private javax.swing.JLabel jLabelbox;
    private javax.swing.JLabel jLabelfound;
    private javax.swing.JLabel jLabellost;
    private javax.swing.JLabel jLabelperson;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelHomeLNF;
    private javax.swing.JPanel jPanelReport;
    private javax.swing.JPanel jPanelSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAddDetails;
    private javax.swing.JTextField jTextFieldColor;
    private javax.swing.JTextField jTextFieldDateLost;
    private javax.swing.JTextField jTextFieldItemName;
    private javax.swing.JTextField jTextFieldLocation;
    private javax.swing.JTextField jTextFieldSize;
    private javax.swing.JTextField jTextFieldTimeLost;
    // End of variables declaration//GEN-END:variables
}
