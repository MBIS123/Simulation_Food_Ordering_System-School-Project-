package oodj_assignment;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HAO
 */
public class UserInterface extends javax.swing.JFrame {
    
    //following code is to pass login variables into form
    
    //declare class variables that can be called from child classes
    private String TPNo;
    private String pw;
    private String name;
    private String gender;
    private String address;
    private String contactno;
    private String email;
    private String DOB;
    
    void setData(String tp, String pass, String nm, String gen, String add, String cont, String em, String birth)
    {
        TPNo = tp;
        pw = pass;
        name = nm;
        gender = gen;
        address = add;
        contactno = cont;
        email = em;
        DOB = birth;        
    }

    //String[][] menu = new Menu().load_Menu_Data();
   
    // * Creates new form UserInterface
     //*/
    public UserInterface() {
        initComponents();
    
        
        /*DefaultListModel temp1 = new DefaultListModel();
        localFoodList.setModel(temp1);
        for(int i=0; i< menu.length;i++){
            if("Local".equals(menu[i][0])){
                temp1.addElement(menu[i][1]);   }
    }

        DefaultListModel temp2 = new DefaultListModel();
        BeverageList.setModel(temp2);
        for(int i=0; i< menu.length;i++){
            if("Beverage".equals(menu[i][0])){
                temp2.addElement(menu[i][1]);   }
    }
        DefaultListModel temp3 = new DefaultListModel();
        WesternFoodList.setModel(temp3);
        for(int i=0; i< menu.length;i++){
            if("Western Food".equals(menu[i][0])){
                temp3.addElement(menu[i][1]);   }
    }
        DefaultListModel price1 = new DefaultListModel();
        priceLocalFoodList.setModel(price1);
        for(int i=0; i< menu.length;i++){
            if("Local".equals(menu[i][0])){
                price1.addElement("RM"+menu[i][2]);   }
    }
        DefaultListModel price2 = new DefaultListModel();
        priceWesternList.setModel(price2);
        for(int i=0; i< menu.length;i++){
            if("Western Food".equals(menu[i][0])){
                price2.addElement("RM"+menu[i][2]);   }
    }
        DefaultListModel price3 = new DefaultListModel();
        priceBeverageList.setModel(price3);
        for(int i=0; i< menu.length;i++){
            if("Beverage".equals(menu[i][0])){
                price3.addElement("RM"+menu[i][2]);   }
    }
        
        /*try {
            
            PrintWriter pw = new PrintWriter(new FileWriter(new File("Menu.txt"),true));
            pw.write("Local,"+"Nasi Lemak,"+"4.50\n");
            pw.close();
        } catch (Exception e) {
            System.out.println("gt error"); 
        } */
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        textField1 = new java.awt.TextField();
        jPanel34 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jButton35 = new javax.swing.JButton();
        jComboBox33 = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuPanel = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        jScrollPane4 = new javax.swing.JScrollPane();
        WesternFoodList = new javax.swing.JList<>();
        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane5 = new javax.swing.JScrollPane();
        localFoodList = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        BeverageList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        priceLocalFoodList = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        priceWesternList = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        priceBeverageList = new javax.swing.JList<>();
        headPanelMenu = new javax.swing.JPanel();
        labelPic1 = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        apuLogo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartOrder = new javax.swing.JTextArea();

        jPopupMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuItem1.setText("jMenuItem1");
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jPopupMenu1.add(jMenuItem2);

        textField1.setText("textField1");

        jLabel73.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(102, 102, 102));
        jLabel73.setText("Soya bean");
        jLabel73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel73MousePressed(evt);
            }
        });

        jButton35.setBackground(new java.awt.Color(254, 120, 83));
        jButton35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton35.setForeground(new java.awt.Color(242, 242, 242));
        jButton35.setText("Add to cart");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jComboBox33.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        jComboBox33.setSelectedIndex(0);
        jComboBox33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBox33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox33ActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 102, 102));
        jLabel43.setText("RM2.50");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox33, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel72))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel72))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel73)
                            .addComponent(jComboBox33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        setForeground(new java.awt.Color(102, 255, 102));
        setSize(new java.awt.Dimension(800, 800));

        jScrollPane1.setBackground(new java.awt.Color(222, 222, 222));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);

        menuPanel.setBackground(new java.awt.Color(222, 222, 222));
        menuPanel.setMaximumSize(new java.awt.Dimension(1800, 32767));
        menuPanel.setPreferredSize(new java.awt.Dimension(1687, 1177));
        menuPanel.setLayout(null);

        label1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        label1.setForeground(new java.awt.Color(254, 120, 83));
        label1.setText("Local Food");
        menuPanel.add(label1);
        label1.setBounds(17, 23, 118, 34);

        label2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        label2.setForeground(new java.awt.Color(254, 120, 83));
        label2.setText("Western Food");
        menuPanel.add(label2);
        label2.setBounds(264, 23, 148, 34);

        label3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        label3.setForeground(new java.awt.Color(254, 120, 83));
        label3.setText("Beverage");
        menuPanel.add(label3);
        label3.setBounds(533, 23, 101, 34);

        WesternFoodList.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        WesternFoodList.setForeground(new java.awt.Color(255, 51, 51));
        WesternFoodList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Burger", "Cheese", "Orange", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(WesternFoodList);

        menuPanel.add(jScrollPane4);
        jScrollPane4.setBounds(260, 60, 160, 302);
        menuPanel.add(jSpinner1);
        jSpinner1.setBounds(618, 1014, 64, 22);

        localFoodList.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        localFoodList.setForeground(new java.awt.Color(255, 51, 0));
        localFoodList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Burger", "Cheese", "Orange", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        localFoodList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                localFoodListMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(localFoodList);

        menuPanel.add(jScrollPane5);
        jScrollPane5.setBounds(20, 60, 120, 302);

        BeverageList.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BeverageList.setForeground(new java.awt.Color(255, 51, 51));
        BeverageList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Burger", "Cheese", "Orange", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(BeverageList);

        menuPanel.add(jScrollPane6);
        jScrollPane6.setBounds(520, 60, 140, 302);

        jScrollPane3.setAlignmentY(0.0F);

        priceLocalFoodList.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        priceLocalFoodList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        priceLocalFoodList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        priceLocalFoodList.setEnabled(false);
        jScrollPane3.setViewportView(priceLocalFoodList);

        menuPanel.add(jScrollPane3);
        jScrollPane3.setBounds(140, 60, 60, 302);

        priceWesternList.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        priceWesternList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        priceWesternList.setEnabled(false);
        jScrollPane7.setViewportView(priceWesternList);

        menuPanel.add(jScrollPane7);
        jScrollPane7.setBounds(420, 60, 60, 300);

        priceBeverageList.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        priceBeverageList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        priceBeverageList.setEnabled(false);
        jScrollPane8.setViewportView(priceBeverageList);

        menuPanel.add(jScrollPane8);
        jScrollPane8.setBounds(660, 60, 70, 300);

        jScrollPane1.setViewportView(menuPanel);

        lblMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(254, 120, 83));
        lblMenu.setText("Menu");
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMenuMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Order History");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Feedback");

        jButton1.setBackground(new java.awt.Color(254, 120, 83));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Logout  ");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buttonGroup1.add(jButton1);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        apuLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodj_assignment/Pictures/apcafelogo.png"))); // NOI18N
        apuLogo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout headPanelMenuLayout = new javax.swing.GroupLayout(headPanelMenu);
        headPanelMenu.setLayout(headPanelMenuLayout);
        headPanelMenuLayout.setHorizontalGroup(
            headPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPanelMenuLayout.createSequentialGroup()
                .addGroup(headPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headPanelMenuLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelPic1))
                    .addGroup(headPanelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(apuLogo)
                        .addGap(105, 105, 105)
                        .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel3)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel4)
                        .addGap(45, 45, 45)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headPanelMenuLayout.setVerticalGroup(
            headPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPanelMenuLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(headPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apuLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMenu)
                        .addComponent(jLabel3))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPic1))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("YOUR CART");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("GRAND TOTAL : RM");

        jButton2.setBackground(new java.awt.Color(254, 120, 83));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(242, 242, 242));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodj_assignment/Pictures/cartIcon.png"))); // NOI18N
        jButton2.setText("CHECK OUT");
        jButton2.setAlignmentY(0.0F);
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton2.setBorderPainted(false);
        jButton2.setIconTextGap(30);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel24.setText("9.60");

        cartOrder.setColumns(20);
        cartOrder.setRows(5);
        jScrollPane2.setViewportView(cartOrder);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(headPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setToolTipText("log out");
        //JOptionPane.showMessageDialog(null,"hello");

    }//GEN-LAST:event_jButton1MouseEntered

    private void lblMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMousePressed
        lblMenu.setForeground(new Color(255,119,83));
    }//GEN-LAST:event_lblMenuMousePressed

    private void jLabel73MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel73MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel73MousePressed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jComboBox33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox33ActionPerformed

    private void localFoodListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_localFoodListMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,localFoodList.getSelectedValue()+ " Do u want this ?");
    }//GEN-LAST:event_localFoodListMouseClicked

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
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> BeverageList;
    private javax.swing.JList<String> WesternFoodList;
    private javax.swing.JLabel apuLogo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextArea cartOrder;
    private javax.swing.JPanel headPanelMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton35;
    private javax.swing.JComboBox<String> jComboBox33;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSpinner jSpinner1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private javax.swing.JLabel labelPic1;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JList<String> localFoodList;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JList<String> priceBeverageList;
    private javax.swing.JList<String> priceLocalFoodList;
    private javax.swing.JList<String> priceWesternList;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
