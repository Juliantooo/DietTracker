/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controller.ControllerFoodDiary;
import Controller.ControllerMealPlan;
import Controller.CtrlBB;
import Controller.CtrlBMI;
import Model.ModBB;
import Model.ModUser;
import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 *
 * @author mbohd
 */
public class OurApp extends javax.swing.JFrame {

    /**
     * Creates new form OurApp
     */
    ModUser u;
    ControllerFoodDiary cfd;
    CtrlBB cbb;
    CtrlBMI cbmi;
    LocalDateTime now;
    ControllerMealPlan ctrlMeal;
    Double bbNow;

    public Double getBbNow() {
        return bbNow;
    }

    public void setBbNow(Double bbNow) {
        this.bbNow = bbNow;
    }
    
    
    public LocalDateTime getNow() {
        return now;
    }

    public void setNow(LocalDateTime now) {
        this.now = now;
    }
    
    
    
    public ModUser getU() {
        return u;
    }

    public void setU(ModUser u) {
        this.u = u;
    }
    
    public OurApp(ModUser u) {
        this.u = u;
        
        initComponents();
        
        //set tanggal
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        now = LocalDateTime.now();
        tf_tanggal.setText(dtf.format(now));
        //panggil controller
        cfd = new ControllerFoodDiary(this);
        ctrlMeal =  new ControllerMealPlan(this);
        ctrlMeal.isiMeal();
        cfd.isiTable();
        cbb = new CtrlBB(this);
        cbb.isiGraph();
        cbmi = new CtrlBMI(this);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setLineWrap(true);
        lb_tinggiatas.setText(String.valueOf(this.getU().getTinggi()));
        cbb.getLatestBB();
        lb_bbnow.setText(String.valueOf(bbNow));
        tf_abot.setText(String.valueOf(bbNow));
        tf_duwur.setText(String.valueOf(this.getU().getTinggi()));
        lb_useratas.setText(u.getUsername());
        
        //System.out.println("vegan : "+u.isVegetarian());
        
    }

    public OurApp() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tf_idFood = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_nmMakanan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cb_jenisMkn = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        sp_kalori = new javax.swing.JSpinner();
        tf_tanggal = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_FoodDiary = new javax.swing.JTable();
        btn_tmbMkn = new javax.swing.JButton();
        btn_updMkn = new javax.swing.JButton();
        btn_delMkn = new javax.swing.JButton();
        btn_tgl = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lbl_totalKalori = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bBGraph2 = new GUI.BBGraph();
        tf_bb = new javax.swing.JTextField();
        btn_bb = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lb_ket = new javax.swing.JLabel();
        lb_bmi = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_abot = new javax.swing.JTextField();
        tf_duwur = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_video = new javax.swing.JTable();
        btn_bmi = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lb_tinggiatas = new javax.swing.JLabel();
        lb_bbnow = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lb_useratas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("Diet Tracker");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("ID");

        tf_idFood.setEditable(false);
        tf_idFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_idFoodActionPerformed(evt);
            }
        });

        jLabel3.setText("Makanan");

        jLabel4.setText("Jenis");

        cb_jenisMkn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sarapan", "Makan Siang", "Makan Malam", "Cemilan" }));

        jLabel5.setText("Kalori");

        tf_tanggal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        jLabel6.setText("Tanggal");

        tbl_FoodDiary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_FoodDiary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_FoodDiaryMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_FoodDiary);

        btn_tmbMkn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/sign-check-icon.png"))); // NOI18N
        btn_tmbMkn.setText("Tambah");
        btn_tmbMkn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tmbMknActionPerformed(evt);
            }
        });

        btn_updMkn.setText("Update");
        btn_updMkn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updMknActionPerformed(evt);
            }
        });

        btn_delMkn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/sign-delete-icon.png"))); // NOI18N
        btn_delMkn.setText("Hapus");
        btn_delMkn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delMknActionPerformed(evt);
            }
        });

        btn_tgl.setText("Cari tanggal");
        btn_tgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tglActionPerformed(evt);
            }
        });

        jLabel7.setText("Total Kalori =");

        lbl_totalKalori.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_jenisMkn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nmMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp_kalori, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_idFood, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_totalKalori))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_delMkn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_tmbMkn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_updMkn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_tgl))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_idFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btn_tgl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tf_nmMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_jenisMkn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(sp_kalori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_tmbMkn)
                            .addComponent(btn_updMkn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_delMkn)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lbl_totalKalori)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Food Diary", jPanel1);

        bBGraph2.setBackground(new java.awt.Color(255, 255, 255));

        tf_bb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_bbActionPerformed(evt);
            }
        });

        btn_bb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/sign-check-icon.png"))); // NOI18N
        btn_bb.setText("Submit");
        btn_bb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bbActionPerformed(evt);
            }
        });

        jLabel8.setText("Masukan berat badan hari ini");

        jLabel17.setText("KG");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(bBGraph2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(tf_bb, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(10, 10, 10)
                .addComponent(btn_bb)
                .addGap(236, 236, 236))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bBGraph2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_bb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel17)
                    .addComponent(btn_bb))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Progress", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("Berat");

        jLabel10.setText("Tinggi");

        lb_ket.setText("-");

        lb_bmi.setText("0");

        jLabel11.setText("BMI");

        jLabel12.setText("Keterangan");

        tf_duwur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_duwurActionPerformed(evt);
            }
        });

        tbl_video.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_video.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_videoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_video);

        btn_bmi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/sign-check-icon.png"))); // NOI18N
        btn_bmi.setText("Submit");
        btn_bmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bmiActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jTextArea1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(jTextArea1);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText(" Saran Meal Plan");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel10))
                                    .addGap(46, 46, 46))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(48, 48, 48)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_duwur, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(tf_abot))
                            .addComponent(lb_ket, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_bmi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_bmi))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tf_abot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tf_duwur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_bmi)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(lb_ket))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_bmi)
                        .addGap(0, 42, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("BMI & Saran", jPanel3);

        jLabel14.setText("Berat badan : ");

        jLabel15.setText("Tinggi :");

        lb_tinggiatas.setText("tinggi");

        lb_bbnow.setText("jLabel17");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Halo");

        lb_useratas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_useratas.setText("user");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_useratas)
                                .addGap(248, 248, 248)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_tinggiatas)
                            .addComponent(lb_bbnow))
                        .addGap(67, 67, 67))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel14)
                    .addComponent(lb_bbnow)
                    .addComponent(jLabel16)
                    .addComponent(lb_useratas))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lb_tinggiatas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextArea1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextArea1AncestorAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextArea1AncestorAdded

    private void btn_bmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bmiActionPerformed
        // TODO add your handling code here:
        cbmi.ukurBMI();
        ctrlMeal.isiMeal();
    }//GEN-LAST:event_btn_bmiActionPerformed

    private void tbl_videoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_videoMouseClicked
        // TODO add your handling code here:
        cbmi.link(String.valueOf(tbl_video.getModel().getValueAt(tbl_video.getSelectedRow(), 4)));
    }//GEN-LAST:event_tbl_videoMouseClicked

    private void tf_duwurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_duwurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_duwurActionPerformed

    private void btn_bbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bbActionPerformed
        // TODO add your handling code here:
        cbb.inputBB();
        cbb.isiGraph();
        cbb.getLatestBB();
        lb_bbnow.setText(String.valueOf(bbNow));

    }//GEN-LAST:event_btn_bbActionPerformed

    private void tf_bbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_bbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_bbActionPerformed

    private void btn_tglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tglActionPerformed
        // TODO add your handling code here:
        cfd.isiTable();
    }//GEN-LAST:event_btn_tglActionPerformed

    private void btn_delMknActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delMknActionPerformed
        // TODO add your handling code here:
        cfd.delete();
        cfd.isiTable();
        cfd.reset_field();
    }//GEN-LAST:event_btn_delMknActionPerformed

    private void btn_updMknActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updMknActionPerformed
        // TODO add your handling code here:
        cfd.update();
        cfd.isiTable();
    }//GEN-LAST:event_btn_updMknActionPerformed

    private void btn_tmbMknActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tmbMknActionPerformed
        // TODO add your handling code here:
        cfd.insert();
        cfd.isiTable();
        cfd.reset_field();
    }//GEN-LAST:event_btn_tmbMknActionPerformed

    private void tbl_FoodDiaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_FoodDiaryMouseClicked
        // TODO add your handling code here:
        cfd.isi_field(tbl_FoodDiary.getSelectedRow());
    }//GEN-LAST:event_tbl_FoodDiaryMouseClicked

    private void tf_idFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_idFoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_idFoodActionPerformed
    
    public JTextArea getjTextArea1() {
        return jTextArea1;
    }

    public void setjTextArea1(JTextArea jTextArea1) {
        this.jTextArea1 = jTextArea1;
    }




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
            java.util.logging.Logger.getLogger(OurApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OurApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OurApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OurApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OurApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.BBGraph bBGraph2;
    private javax.swing.JButton btn_bb;
    private javax.swing.JButton btn_bmi;
    private javax.swing.JButton btn_delMkn;
    private javax.swing.JButton btn_tgl;
    private javax.swing.JButton btn_tmbMkn;
    private javax.swing.JButton btn_updMkn;
    private javax.swing.JComboBox<String> cb_jenisMkn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lb_bbnow;
    private javax.swing.JLabel lb_bmi;
    private javax.swing.JLabel lb_ket;
    private javax.swing.JLabel lb_tinggiatas;
    private javax.swing.JLabel lb_useratas;
    private javax.swing.JLabel lbl_totalKalori;
    private javax.swing.JSpinner sp_kalori;
    private javax.swing.JTable tbl_FoodDiary;
    private javax.swing.JTable tbl_video;
    private javax.swing.JTextField tf_abot;
    private javax.swing.JTextField tf_bb;
    private javax.swing.JTextField tf_duwur;
    private javax.swing.JTextField tf_idFood;
    private javax.swing.JTextField tf_nmMakanan;
    private javax.swing.JFormattedTextField tf_tanggal;
    // End of variables declaration//GEN-END:variables

    public JSpinner getSp_kalori() {
        return sp_kalori;
    }

    public void setSp_kalori(JSpinner sp_kalori) {
        this.sp_kalori = sp_kalori;
    }

    public JTable getTbl_FoodDiary() {
        return tbl_FoodDiary;
    }

    public void setTbl_FoodDiary(JTable tbl_FoodDiary) {
        this.tbl_FoodDiary = tbl_FoodDiary;
    }

    public JTextField getTf_idFood() {
        return tf_idFood;
    }

    public void setTf_idFood(JTextField tf_idFood) {
        this.tf_idFood = tf_idFood;
    }

    public JTextField getTf_nmMakanan() {
        return tf_nmMakanan;
    }

    public void setTf_nmMakanan(JTextField tf_nmMakanan) {
        this.tf_nmMakanan = tf_nmMakanan;
    }

    public JFormattedTextField getTf_tanggal() {
        return tf_tanggal;
    }

    public void setTf_tanggal(JFormattedTextField tf_tanggal) {
        this.tf_tanggal = tf_tanggal;
    }

    public JComboBox<String> getCb_jenisMkn() {
        return cb_jenisMkn;
    }

    public void setCb_jenisMkn(JComboBox<String> cb_jenisMkn) {
        this.cb_jenisMkn = cb_jenisMkn;
    }

    public JButton getBtn_delMkn() {
        return btn_delMkn;
    }

    public void setBtn_delMkn(JButton btn_delMkn) {
        this.btn_delMkn = btn_delMkn;
    }

    public JButton getBtn_tmbMkn() {
        return btn_tmbMkn;
    }

    public void setBtn_tmbMkn(JButton btn_tmbMkn) {
        this.btn_tmbMkn = btn_tmbMkn;
    }

    public JButton getBtn_updMkn() {
        return btn_updMkn;
    }

    public void setBtn_updMkn(JButton btn_updMkn) {
        this.btn_updMkn = btn_updMkn;
    }

    public JLabel getLbl_totalKalori() {
        return lbl_totalKalori;
    }

    public void setLbl_totalKalori(JLabel lbl_totalKalori) {
        this.lbl_totalKalori = lbl_totalKalori;
    }

    public BBGraph getbBGraph2() {
        return bBGraph2;
    }

    public void setbBGraph2(BBGraph bBGraph2) {
        this.bBGraph2 = bBGraph2;
    }

    public JTextField getTf_bb() {
        return tf_bb;
    }

    public void setTf_bb(JTextField tf_bb) {
        this.tf_bb = tf_bb;
    }

    public JLabel getLb_bmi() {
        return lb_bmi;
    }

    public void setLb_bmi(JLabel lb_bmi) {
        this.lb_bmi = lb_bmi;
    }

    public JLabel getLb_ket() {
        return lb_ket;
    }

    public void setLb_ket(JLabel lb_ket) {
        this.lb_ket = lb_ket;
    }

    public JTable getTbl_video() {
        return tbl_video;
    }

    public void setTbl_video(JTable tbl_video) {
        this.tbl_video = tbl_video;
    }

    public JTextField getTf_abot() {
        return tf_abot;
    }

    public void setTf_abot(JTextField tf_abot) {
        this.tf_abot = tf_abot;
    }

    public JTextField getTf_duwur() {
        return tf_duwur;
    }

    public void setTf_duwur(JTextField tf_duwur) {
        this.tf_duwur = tf_duwur;
    }


    
    
    
}
