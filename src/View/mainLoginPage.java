
package View;

import Controller.forgotPassword_Ctrl_;
import Controller.loginAsCashier_Ctrl_;
import Controller.loginAsManager_Ctrl_;
import javax.swing.JPanel;

public class mainLoginPage extends javax.swing.JFrame {

    
errorMsgForLogin E1 = new errorMsgForLogin();
manageProductPage_C_ C = new manageProductPage_C_();
forgotPassword_Ctrl_ F1 = new forgotPassword_Ctrl_();


    
    public mainLoginPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPage = new javax.swing.JPanel();
        mainLoginPage_ = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmdCashier_ = new javax.swing.JButton();
        cmdManager_ = new javax.swing.JButton();
        sideLogoMainPage = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        managerLoginPage_ = new javax.swing.JPanel();
        leftSideLogo2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cmdBackManager_1 = new javax.swing.JButton();
        txtBackManager_1 = new javax.swing.JLabel();
        panelManager1 = new javax.swing.JPanel();
        cmdLoginManager_ = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtPasswordManager_ = new javax.swing.JTextField();
        txtUsernameManager_ = new javax.swing.JTextField();
        cashierLoginPage_ = new javax.swing.JPanel();
        leftSideLogo1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmdBackCashier_ = new javax.swing.JButton();
        txtBackCashier_ = new javax.swing.JLabel();
        panelCashier = new javax.swing.JPanel();
        cmdLoginCashier_ = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtPasswordCashier_ = new javax.swing.JTextField();
        txtUsernameCashier_ = new javax.swing.JTextField();
        cmdForgotPasswordCashier_ = new javax.swing.JButton();
        cashierForgotPassword_ = new javax.swing.JPanel();
        leftSideLogo3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cmdBackCashier_1 = new javax.swing.JButton();
        txtBackCashier_1 = new javax.swing.JLabel();
        panelCashier1 = new javax.swing.JPanel();
        cmdShoePasssword_FP_ = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtFirstName_FP_ = new javax.swing.JTextField();
        txtLastName_FP_ = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtNIC_FP_ = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtDOB_FP_ = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPage.setLayout(new java.awt.CardLayout());

        mainLoginPage_.setBackground(new java.awt.Color(51, 255, 153));
        mainLoginPage_.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(500, 300));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Login as ");

        cmdCashier_.setBackground(new java.awt.Color(0, 0, 0));
        cmdCashier_.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cmdCashier_.setForeground(new java.awt.Color(255, 255, 255));
        cmdCashier_.setText("Cashier");
        cmdCashier_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCashier_ActionPerformed(evt);
            }
        });

        cmdManager_.setBackground(new java.awt.Color(0, 0, 0));
        cmdManager_.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cmdManager_.setForeground(new java.awt.Color(255, 255, 255));
        cmdManager_.setText("Manager");
        cmdManager_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdManager_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdCashier_, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdManager_, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cmdManager_, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmdCashier_, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        mainLoginPage_.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        sideLogoMainPage.setBackground(new java.awt.Color(255, 102, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/paws logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("The Paw Shop");

        javax.swing.GroupLayout sideLogoMainPageLayout = new javax.swing.GroupLayout(sideLogoMainPage);
        sideLogoMainPage.setLayout(sideLogoMainPageLayout);
        sideLogoMainPageLayout.setHorizontalGroup(
            sideLogoMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideLogoMainPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideLogoMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sideLogoMainPageLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        sideLogoMainPageLayout.setVerticalGroup(
            sideLogoMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideLogoMainPageLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        mainLoginPage_.add(sideLogoMainPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPage.add(mainLoginPage_, "card2");

        managerLoginPage_.setBackground(new java.awt.Color(51, 255, 153));
        managerLoginPage_.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftSideLogo2.setBackground(new java.awt.Color(255, 102, 102));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/paws logo.png"))); // NOI18N
        jLabel12.setText("jLabel2");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("The Paw Shop");

        cmdBackManager_1.setBackground(new java.awt.Color(0, 0, 0));
        cmdBackManager_1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cmdBackManager_1.setForeground(new java.awt.Color(255, 255, 255));
        cmdBackManager_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Arrow L.png"))); // NOI18N
        cmdBackManager_1.setMaximumSize(new java.awt.Dimension(100, 50));
        cmdBackManager_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBackManager_1ActionPerformed(evt);
            }
        });

        txtBackManager_1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtBackManager_1.setText("BACK");
        txtBackManager_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBackManager_1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout leftSideLogo2Layout = new javax.swing.GroupLayout(leftSideLogo2);
        leftSideLogo2.setLayout(leftSideLogo2Layout);
        leftSideLogo2Layout.setHorizontalGroup(
            leftSideLogo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSideLogo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftSideLogo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftSideLogo2Layout.createSequentialGroup()
                        .addGroup(leftSideLogo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(leftSideLogo2Layout.createSequentialGroup()
                                .addComponent(cmdBackManager_1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBackManager_1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        leftSideLogo2Layout.setVerticalGroup(
            leftSideLogo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSideLogo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftSideLogo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmdBackManager_1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBackManager_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(93, 93, 93)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        managerLoginPage_.add(leftSideLogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelManager1.setBackground(new java.awt.Color(153, 204, 255));
        panelManager1.setPreferredSize(new java.awt.Dimension(500, 360));

        cmdLoginManager_.setBackground(new java.awt.Color(0, 0, 0));
        cmdLoginManager_.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cmdLoginManager_.setForeground(new java.awt.Color(255, 255, 255));
        cmdLoginManager_.setText("Login");
        cmdLoginManager_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLoginManager_ActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Manager Login ");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel21.setText("Username :");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel22.setText("Password :");

        txtUsernameManager_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameManager_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelManager1Layout = new javax.swing.GroupLayout(panelManager1);
        panelManager1.setLayout(panelManager1Layout);
        panelManager1Layout.setHorizontalGroup(
            panelManager1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManager1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelManager1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelManager1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelManager1Layout.createSequentialGroup()
                        .addGroup(panelManager1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(panelManager1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPasswordManager_, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsernameManager_, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cmdLoginManager_, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );
        panelManager1Layout.setVerticalGroup(
            panelManager1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManager1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(panelManager1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsernameManager_, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelManager1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPasswordManager_, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(cmdLoginManager_, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        managerLoginPage_.add(panelManager1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, 310));

        mainPage.add(managerLoginPage_, "card2");

        cashierLoginPage_.setBackground(new java.awt.Color(51, 255, 153));
        cashierLoginPage_.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftSideLogo1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/paws logo.png"))); // NOI18N
        jLabel6.setText("jLabel2");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("The Paw Shop");

        cmdBackCashier_.setBackground(new java.awt.Color(0, 0, 0));
        cmdBackCashier_.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cmdBackCashier_.setForeground(new java.awt.Color(255, 255, 255));
        cmdBackCashier_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Arrow L.png"))); // NOI18N
        cmdBackCashier_.setMaximumSize(new java.awt.Dimension(100, 50));
        cmdBackCashier_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBackCashier_ActionPerformed(evt);
            }
        });

        txtBackCashier_.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtBackCashier_.setText("BACK");
        txtBackCashier_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBackCashier_MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout leftSideLogo1Layout = new javax.swing.GroupLayout(leftSideLogo1);
        leftSideLogo1.setLayout(leftSideLogo1Layout);
        leftSideLogo1Layout.setHorizontalGroup(
            leftSideLogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSideLogo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftSideLogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftSideLogo1Layout.createSequentialGroup()
                        .addGroup(leftSideLogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(leftSideLogo1Layout.createSequentialGroup()
                                .addComponent(cmdBackCashier_, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBackCashier_, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        leftSideLogo1Layout.setVerticalGroup(
            leftSideLogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSideLogo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftSideLogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmdBackCashier_, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBackCashier_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(93, 93, 93)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        cashierLoginPage_.add(leftSideLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelCashier.setBackground(new java.awt.Color(153, 204, 255));
        panelCashier.setPreferredSize(new java.awt.Dimension(500, 360));

        cmdLoginCashier_.setBackground(new java.awt.Color(0, 0, 0));
        cmdLoginCashier_.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cmdLoginCashier_.setForeground(new java.awt.Color(255, 255, 255));
        cmdLoginCashier_.setText("Login");
        cmdLoginCashier_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLoginCashier_ActionPerformed(evt);
            }
        });

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Cashier Login");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setText("Username :");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setText("Password :");

        txtUsernameCashier_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameCashier_ActionPerformed(evt);
            }
        });

        cmdForgotPasswordCashier_.setBackground(new java.awt.Color(0, 0, 0));
        cmdForgotPasswordCashier_.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cmdForgotPasswordCashier_.setForeground(new java.awt.Color(255, 255, 255));
        cmdForgotPasswordCashier_.setText("Forgot Password");
        cmdForgotPasswordCashier_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdForgotPasswordCashier_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCashierLayout = new javax.swing.GroupLayout(panelCashier);
        panelCashier.setLayout(panelCashierLayout);
        panelCashierLayout.setHorizontalGroup(
            panelCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCashierLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCashierLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCashierLayout.createSequentialGroup()
                        .addComponent(cmdForgotPasswordCashier_, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdLoginCashier_, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCashierLayout.createSequentialGroup()
                        .addGroup(panelCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(panelCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPasswordCashier_, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsernameCashier_, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59))
        );
        panelCashierLayout.setVerticalGroup(
            panelCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCashierLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(panelCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsernameCashier_, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPasswordCashier_, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panelCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdLoginCashier_, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdForgotPasswordCashier_, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );

        cashierLoginPage_.add(panelCashier, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, 310));

        mainPage.add(cashierLoginPage_, "card2");

        cashierForgotPassword_.setBackground(new java.awt.Color(51, 255, 153));
        cashierForgotPassword_.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftSideLogo3.setBackground(new java.awt.Color(255, 102, 102));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/paws logo.png"))); // NOI18N
        jLabel7.setText("jLabel2");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("The Paw Shop");

        cmdBackCashier_1.setBackground(new java.awt.Color(0, 0, 0));
        cmdBackCashier_1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cmdBackCashier_1.setForeground(new java.awt.Color(255, 255, 255));
        cmdBackCashier_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Arrow L.png"))); // NOI18N
        cmdBackCashier_1.setMaximumSize(new java.awt.Dimension(100, 50));
        cmdBackCashier_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBackCashier_1ActionPerformed(evt);
            }
        });

        txtBackCashier_1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtBackCashier_1.setText("BACK");
        txtBackCashier_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBackCashier_1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout leftSideLogo3Layout = new javax.swing.GroupLayout(leftSideLogo3);
        leftSideLogo3.setLayout(leftSideLogo3Layout);
        leftSideLogo3Layout.setHorizontalGroup(
            leftSideLogo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSideLogo3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftSideLogo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(leftSideLogo3Layout.createSequentialGroup()
                        .addGroup(leftSideLogo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(leftSideLogo3Layout.createSequentialGroup()
                                .addComponent(cmdBackCashier_1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBackCashier_1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        leftSideLogo3Layout.setVerticalGroup(
            leftSideLogo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSideLogo3Layout.createSequentialGroup()
                .addGroup(leftSideLogo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftSideLogo3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmdBackCashier_1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftSideLogo3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(txtBackCashier_1)))
                .addGap(93, 93, 93)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        cashierForgotPassword_.add(leftSideLogo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelCashier1.setBackground(new java.awt.Color(153, 204, 255));
        panelCashier1.setPreferredSize(new java.awt.Dimension(500, 360));

        cmdShoePasssword_FP_.setBackground(new java.awt.Color(0, 0, 0));
        cmdShoePasssword_FP_.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cmdShoePasssword_FP_.setForeground(new java.awt.Color(255, 255, 255));
        cmdShoePasssword_FP_.setText("Show Password");
        cmdShoePasssword_FP_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdShoePasssword_FP_ActionPerformed(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Forgot Password");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel26.setText("First Name :");

        txtFirstName_FP_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstName_FP_ActionPerformed(evt);
            }
        });

        txtLastName_FP_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastName_FP_ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel28.setText("Last Name :");

        txtNIC_FP_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNIC_FP_ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel29.setText("NIC :");

        txtDOB_FP_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOB_FP_ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel30.setText("Date Of Birth :");

        javax.swing.GroupLayout panelCashier1Layout = new javax.swing.GroupLayout(panelCashier1);
        panelCashier1.setLayout(panelCashier1Layout);
        panelCashier1Layout.setHorizontalGroup(
            panelCashier1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCashier1Layout.createSequentialGroup()
                .addGroup(panelCashier1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCashier1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelCashier1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelCashier1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFirstName_FP_, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCashier1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNIC_FP_, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                .addComponent(txtLastName_FP_))))
                    .addGroup(panelCashier1Layout.createSequentialGroup()
                        .addContainerGap(13, Short.MAX_VALUE)
                        .addComponent(jLabel30)
                        .addGap(50, 50, 50)
                        .addComponent(txtDOB_FP_, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCashier1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdShoePasssword_FP_)))
                .addGap(59, 59, 59))
            .addGroup(panelCashier1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelCashier1Layout.setVerticalGroup(
            panelCashier1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCashier1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelCashier1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstName_FP_, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCashier1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastName_FP_, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCashier1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNIC_FP_, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCashier1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDOB_FP_, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cmdShoePasssword_FP_, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        cashierForgotPassword_.add(panelCashier1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 520, 540));

        mainPage.add(cashierForgotPassword_, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPage, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPage, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCashier_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCashier_ActionPerformed
        mainLoginPage_.setVisible(false);
        cashierLoginPage_.setVisible(true);
    }//GEN-LAST:event_cmdCashier_ActionPerformed

    private void cmdManager_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdManager_ActionPerformed
        mainLoginPage_.setVisible(false);
        managerLoginPage_.setVisible(true);
        
    }//GEN-LAST:event_cmdManager_ActionPerformed

    private void cmdBackCashier_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBackCashier_ActionPerformed
         cashierLoginPage_.setVisible(false);
         mainLoginPage_.setVisible(true);
    }//GEN-LAST:event_cmdBackCashier_ActionPerformed

    private void cmdLoginCashier_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLoginCashier_ActionPerformed
        String Username = txtUsernameCashier_.getText();
        String Password = txtPasswordCashier_.getText();
        loginAsCashier_Ctrl_ LAC = new loginAsCashier_Ctrl_();
            LAC.login(Username, Password);
        
        if(LAC.getSuccess()==true){
            C.setVisible(true);
            this.dispose();
            E1.dispose();
        }
        else{
            E1.setVisible(true);
        }
            
        txtUsernameManager_.setText("");
        txtPasswordManager_.setText("");
    }//GEN-LAST:event_cmdLoginCashier_ActionPerformed

    private void txtUsernameCashier_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameCashier_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameCashier_ActionPerformed

    private void cmdBackManager_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBackManager_1ActionPerformed
        managerLoginPage_.setVisible(false);
        mainLoginPage_.setVisible(true);
    }//GEN-LAST:event_cmdBackManager_1ActionPerformed

    private void cmdLoginManager_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLoginManager_ActionPerformed
        String Username = txtUsernameManager_.getText();
        String Password = txtPasswordManager_.getText();
        loginAsManager_Ctrl_ LAM = new loginAsManager_Ctrl_();
            LAM.login(Username, Password);
        
        if(LAM.getSuccess()==true){
            this.dispose();
            E1.dispose();
        }
        else{
            E1.setVisible(true);
        }
            
        txtUsernameManager_.setText("");
        txtPasswordManager_.setText("");
    }//GEN-LAST:event_cmdLoginManager_ActionPerformed

    private void txtUsernameManager_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameManager_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameManager_ActionPerformed

    private void cmdBackCashier_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBackCashier_1ActionPerformed
        cashierForgotPassword_.setVisible(false);
        cashierLoginPage_.setVisible(true);
    }//GEN-LAST:event_cmdBackCashier_1ActionPerformed

    private void cmdShoePasssword_FP_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdShoePasssword_FP_ActionPerformed
        String FirstName = txtFirstName_FP_.getText();
        String LastName = txtLastName_FP_.getText();
        String NIC = txtNIC_FP_.getText();
        String DOB = txtDOB_FP_.getText();
        
        F1.ForgotP(FirstName, LastName, NIC, DOB);


    }//GEN-LAST:event_cmdShoePasssword_FP_ActionPerformed

    private void txtFirstName_FP_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstName_FP_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstName_FP_ActionPerformed

    private void txtLastName_FP_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastName_FP_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastName_FP_ActionPerformed

    private void txtNIC_FP_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNIC_FP_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNIC_FP_ActionPerformed

    private void txtDOB_FP_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOB_FP_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOB_FP_ActionPerformed

    private void txtBackManager_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackManager_1MouseClicked
        managerLoginPage_.setVisible(false);
        mainLoginPage_.setVisible(true);
    }//GEN-LAST:event_txtBackManager_1MouseClicked

    private void txtBackCashier_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackCashier_MouseClicked
        cashierLoginPage_.setVisible(false);
        mainLoginPage_.setVisible(true);
    }//GEN-LAST:event_txtBackCashier_MouseClicked

    private void cmdForgotPasswordCashier_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdForgotPasswordCashier_ActionPerformed
        cashierLoginPage_.setVisible(false);
        cashierForgotPassword_.setVisible(true);
    }//GEN-LAST:event_cmdForgotPasswordCashier_ActionPerformed

    private void txtBackCashier_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackCashier_1MouseClicked
        cashierForgotPassword_.setVisible(false);
        cashierLoginPage_.setVisible(true);
    }//GEN-LAST:event_txtBackCashier_1MouseClicked

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
            java.util.logging.Logger.getLogger(mainLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainLoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cashierForgotPassword_;
    private javax.swing.JPanel cashierLoginPage_;
    private javax.swing.JButton cmdBackCashier_;
    private javax.swing.JButton cmdBackCashier_1;
    private javax.swing.JButton cmdBackManager_1;
    private javax.swing.JButton cmdCashier_;
    private javax.swing.JButton cmdForgotPasswordCashier_;
    private javax.swing.JButton cmdLoginCashier_;
    private javax.swing.JButton cmdLoginManager_;
    private javax.swing.JButton cmdManager_;
    private javax.swing.JButton cmdShoePasssword_FP_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel leftSideLogo1;
    private javax.swing.JPanel leftSideLogo2;
    private javax.swing.JPanel leftSideLogo3;
    private javax.swing.JPanel mainLoginPage_;
    private javax.swing.JPanel mainPage;
    private javax.swing.JPanel managerLoginPage_;
    private javax.swing.JPanel panelCashier;
    private javax.swing.JPanel panelCashier1;
    private javax.swing.JPanel panelManager1;
    private javax.swing.JPanel sideLogoMainPage;
    private javax.swing.JLabel txtBackCashier_;
    private javax.swing.JLabel txtBackCashier_1;
    private javax.swing.JLabel txtBackManager_1;
    private javax.swing.JTextField txtDOB_FP_;
    private javax.swing.JTextField txtFirstName_FP_;
    private javax.swing.JTextField txtLastName_FP_;
    private javax.swing.JTextField txtNIC_FP_;
    private javax.swing.JTextField txtPasswordCashier_;
    private javax.swing.JTextField txtPasswordManager_;
    private javax.swing.JTextField txtUsernameCashier_;
    private javax.swing.JTextField txtUsernameManager_;
    // End of variables declaration//GEN-END:variables
}
