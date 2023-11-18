/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import service.GRADESSERVICE;
import service.STUDENTSSERVICE;

/**
 *
 * @author admin
 */
public class viewTrangChu extends javax.swing.JFrame {
private int index = 0;
private GRADESSERVICE diemservice = new GRADESSERVICE();
private STUDENTSSERVICE svservice = new STUDENTSSERVICE();
    /**
     * Creates new form viewTrangChu
     */
    public viewTrangChu() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnhome = new javax.swing.JButton();
        btngiangvien = new javax.swing.JButton();
        btnsinhvien = new javax.swing.JButton();
        btnmonhoc = new javax.swing.JButton();
        btndiem = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnDangXuat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnHeThong = new javax.swing.JMenu();
        mnidangnhap = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mniDoiMatKhau = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniKetThuc = new javax.swing.JMenuItem();
        mnQuanLy = new javax.swing.JMenu();
        mmigiangvien = new javax.swing.JMenuItem();
        mmisinhvien = new javax.swing.JMenuItem();
        mmimonhoc = new javax.swing.JMenuItem();
        mmidiem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        btnhome.setText("Home");
        btnhome.setFocusable(false);
        btnhome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnhome.setMargin(new java.awt.Insets(2, 20, 3, 20));
        btnhome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });
        jToolBar1.add(btnhome);

        btngiangvien.setText("Quản lý giảng viên");
        btngiangvien.setFocusable(false);
        btngiangvien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btngiangvien.setMargin(new java.awt.Insets(2, 20, 3, 20));
        btngiangvien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btngiangvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngiangvienActionPerformed(evt);
            }
        });
        jToolBar1.add(btngiangvien);

        btnsinhvien.setText("Quản lý sinh viên");
        btnsinhvien.setFocusable(false);
        btnsinhvien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsinhvien.setMargin(new java.awt.Insets(2, 20, 3, 20));
        btnsinhvien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnsinhvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsinhvienActionPerformed(evt);
            }
        });
        jToolBar1.add(btnsinhvien);

        btnmonhoc.setText("Quản lý môn học");
        btnmonhoc.setFocusable(false);
        btnmonhoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnmonhoc.setMargin(new java.awt.Insets(2, 20, 3, 20));
        btnmonhoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnmonhoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmonhocActionPerformed(evt);
            }
        });
        jToolBar1.add(btnmonhoc);

        btndiem.setText("Quản lý điểm");
        btndiem.setFocusable(false);
        btndiem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btndiem.setMargin(new java.awt.Insets(2, 20, 3, 20));
        btndiem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btndiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndiemActionPerformed(evt);
            }
        });
        jToolBar1.add(btndiem);
        jToolBar1.add(jSeparator3);

        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setMargin(new java.awt.Insets(2, 20, 3, 20));
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDangXuat);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/conong.png"))); // NOI18N

        mnHeThong.setText("Hệ Thống");

        mnidangnhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnidangnhap.setText("Đăng Nhập");
        mnidangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnidangnhapActionPerformed(evt);
            }
        });
        mnHeThong.add(mnidangnhap);

        mniDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDangXuat.setText("Đăng Xuất");
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        mnHeThong.add(mniDangXuat);
        mnHeThong.add(jSeparator5);

        mniDoiMatKhau.setText("Đổi Mật Khẩu");
        mniDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoiMatKhauActionPerformed(evt);
            }
        });
        mnHeThong.add(mniDoiMatKhau);
        mnHeThong.add(jSeparator1);

        mniKetThuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        mniKetThuc.setText("Thoát");
        mniKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKetThucActionPerformed(evt);
            }
        });
        mnHeThong.add(mniKetThuc);

        jMenuBar1.add(mnHeThong);

        mnQuanLy.setText("Quản Lý");

        mmigiangvien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mmigiangvien.setText("Quản lý giảng viên");
        mmigiangvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmigiangvienActionPerformed(evt);
            }
        });
        mnQuanLy.add(mmigiangvien);

        mmisinhvien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mmisinhvien.setText("Quản lý sinh viên");
        mmisinhvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmisinhvienActionPerformed(evt);
            }
        });
        mnQuanLy.add(mmisinhvien);

        mmimonhoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mmimonhoc.setText("Quản lý môn học");
        mmimonhoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmimonhocActionPerformed(evt);
            }
        });
        mnQuanLy.add(mmimonhoc);

        mmidiem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mmidiem.setText("Quản lý điểm");
        mmidiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmidiemActionPerformed(evt);
            }
        });
        mnQuanLy.add(mmidiem);

        jMenuBar1.add(mnQuanLy);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnidangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnidangnhapActionPerformed
        // TODO add your handling code here:
        DangNhap dn = new DangNhap(this, true);
        dn.setVisible(true);
    }//GEN-LAST:event_mnidangnhapActionPerformed

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        // TODO add your handling code here:
        DangNhap dn = new DangNhap(this, true);
        dn.setVisible(true);
    }//GEN-LAST:event_mniDangXuatActionPerformed

    private void mniDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoiMatKhauActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mniDoiMatKhauActionPerformed

    private void mniKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKetThucActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_mniKetThucActionPerformed

    private void mmisinhvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmisinhvienActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_mmisinhvienActionPerformed

    private void mmimonhocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmimonhocActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_mmimonhocActionPerformed

    private void mmidiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmidiemActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_mmidiemActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        DangNhap dn = new DangNhap(this, true);
        dn.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnsinhvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsinhvienActionPerformed
     
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsinhvienActionPerformed

    private void btnmonhocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmonhocActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmonhocActionPerformed

    private void btngiangvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngiangvienActionPerformed
       
        // TODO add your handling code here:
    }//GEN-LAST:event_btngiangvienActionPerformed

    private void btndiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndiemActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btndiemActionPerformed

    private void mmigiangvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmigiangvienActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mmigiangvienActionPerformed

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnhomeActionPerformed

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
            java.util.logging.Logger.getLogger(viewTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewTrangChu().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btndiem;
    private javax.swing.JButton btngiangvien;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnmonhoc;
    private javax.swing.JButton btnsinhvien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mmidiem;
    private javax.swing.JMenuItem mmigiangvien;
    private javax.swing.JMenuItem mmimonhoc;
    private javax.swing.JMenuItem mmisinhvien;
    private javax.swing.JMenu mnHeThong;
    private javax.swing.JMenu mnQuanLy;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDoiMatKhau;
    private javax.swing.JMenuItem mniKetThuc;
    private javax.swing.JMenuItem mnidangnhap;
    // End of variables declaration//GEN-END:variables
}
