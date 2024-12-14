/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bai35.Interface;

import bai35.process.ChucNang;
import bai35.database.KetNoi;
import bai35.process.SanPhamPro;
import bai35.process.SanPham;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PHAN ANH TUAN
 */
public class frmSanPham extends javax.swing.JFrame {

    SanPhamPro mPro = new SanPhamPro();
    int chucNangDaChon = ChucNang.none;

    public void trangThaiNut(boolean trangThai) {
        jbtNew2.setEnabled(trangThai);
        jbtRemove2.setEnabled(trangThai);
        jbtSave.setEnabled(!trangThai);
    }

    public void thietLap(int chucNang) {
        chucNangDaChon = chucNang;
        switch (chucNang) {
            case ChucNang.none -> {
                trangThaiNut(true);
                jtfma.setEnabled(false);
                jtften.setEnabled(false);
                jtfgia.setEnabled(false);
                jtfsl.setEnabled(false);
                jtfchitiet.setEnabled(false);
            }
            case ChucNang.add -> {
                trangThaiNut(false);
                jtfma.setEnabled(true);
                jtften.setEnabled(true);
                jtfgia.setEnabled(true);
                jtfsl.setEnabled(true);
                jtfchitiet.setEnabled(true);
                jtfma.setText("");
                jtften.setText("");
                jtfgia.setText("");
                jtfsl.setText("");
                jtfchitiet.setText("");
            }
            case ChucNang.update -> {
                trangThaiNut(false);
                jtfma.setEnabled(false);
                jtften.setEnabled(true);
                jtfgia.setEnabled(true);
                jtfsl.setEnabled(true);
                jtfchitiet.setEnabled(true);
            }
        }
    }

    public void hienThiLenJList() {
        try {
            Connection con = KetNoi.KetNoiDB();
            String sql = "select *from mathang";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            DefaultListModel dlm = new DefaultListModel();
            while (rs.next()) {
                dlm.addElement(rs.getString("tenhang"));
            }
            jlDanhMucSP.setModel(dlm);
        } catch (SQLException ex) {
            Logger.getLogger(frmSanPham.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void taiDanhMucSanPhamLenComboBox() {
        try {
            Connection con = KetNoi.KetNoiDB();
            String sql = "select *from mathang";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            jcbloai.removeAllItems();
            while (rs.next()) {
                jcbloai.addItem(rs.getString("tenhang"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmSanPham.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void them() {
        SanPham sp = new SanPham();
        sp.setMaSanPham(jtfma.getText());
        sp.setTenSanPham(jtften.getText());
        sp.setGia(Double.parseDouble(jtfgia.getText()));
        sp.setSl(Integer.parseInt(jtfsl.getText()));
        sp.setChiTiet(jtfchitiet.getText());
        sp.setTenHang(jcbloai.getSelectedItem().toString());
        if (sp.getMaSanPham().length() == 0 || sp.getTenSanPham().length() == 0 || ("" + sp.getGia()).equals("") || ("" + sp.getSl()).equals("")) {
            JOptionPane.showMessageDialog(rootPane, "chưa nhập đủ dữ liệu");
        } else {
            boolean kq = mPro.themSanPham(sp);
            if (kq) {
                JOptionPane.showMessageDialog(rootPane, "thêm thành công");
            } else {
                JOptionPane.showMessageDialog(rootPane, "mã sản phẩm đã tồn tại", "cảnh báo", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public void sua() {
        SanPham sp = new SanPham();
        sp.setMaSanPham(jtfma.getText());
        sp.setTenSanPham(jtften.getText());
        sp.setGia(Double.parseDouble(jtfgia.getText()));
        sp.setSl(Integer.parseInt(jtfsl.getText()));
        sp.setChiTiet(jtfchitiet.getText());
        sp.setTenHang(jcbloai.getSelectedItem().toString());
        boolean kq = mPro.suaSanPham(sp);
        if (kq) {
            JOptionPane.showMessageDialog(rootPane, "thêm thành công");
        }
    }

    public void xoa() {
        int pat = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn xóa sản phẩm này?", "cảnh báo", JOptionPane.YES_NO_OPTION);
        if (pat == JOptionPane.YES_OPTION) {
            int dongChon = jtsp.getSelectedRow();
            String ma = "" + jtsp.getValueAt(dongChon, 0);
            boolean kq = mPro.xoaSanPham(ma);
            if (kq) {
                JOptionPane.showMessageDialog(rootPane, "xóa thành công");
            }
        }
    }

    public void hienThi() {
        List<SanPham> list = mPro.layDanSach();
        String col[] = new String[]{"mã sản phẩm", "tên sản phẩm", "giá", "số lượng", "chi tiết"};
        DefaultTableModel dtm = new DefaultTableModel(col, 0);
        Object o[] = null;
        for (SanPham sp : list) {
            o = new Object[5];
            o[0] = sp.getMaSanPham();
            o[1] = sp.getTenSanPham();
            o[2] = sp.getGia();
            o[3] = sp.getSl();
            o[4] = sp.getChiTiet();
            dtm.addRow(o);
        }
        jtsp.setModel(dtm);
    }

    public frmSanPham() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlDanhMucSP = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtsp = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcbloai = new javax.swing.JComboBox<>();
        jtfma = new javax.swing.JTextField();
        jtften = new javax.swing.JTextField();
        jtfgia = new javax.swing.JTextField();
        jtfsl = new javax.swing.JTextField();
        jtfchitiet = new javax.swing.JTextField();
        jbtSave = new javax.swing.JButton();
        jbtNew2 = new javax.swing.JButton();
        jbtRemove2 = new javax.swing.JButton();
        jbtNew = new javax.swing.JButton();
        jbtUp = new javax.swing.JButton();
        jbtRemove = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ SẢN PHẨM");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "danh mục sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jlDanhMucSP.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jlDanhMucSPValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jlDanhMucSP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "thông tin chi tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jtsp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtspMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtsp);

        jLabel2.setText("danh mục");

        jLabel3.setText("mã hàng");

        jLabel4.setText("tên hàng");

        jLabel5.setText("giá");

        jLabel6.setText("số lượng");

        jLabel7.setText("chi tiết");

        jbtSave.setText("save");
        jbtSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSaveActionPerformed(evt);
            }
        });

        jbtNew2.setText("new");
        jbtNew2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNew2ActionPerformed(evt);
            }
        });

        jbtRemove2.setText("remove");
        jbtRemove2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRemove2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(14, 14, 14)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jbtNew2)
                                .addGap(14, 14, 14)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbloai, 0, 231, Short.MAX_VALUE)
                                    .addComponent(jtfma)
                                    .addComponent(jtften)
                                    .addComponent(jtfgia)
                                    .addComponent(jtfsl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfchitiet))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbtSave)
                                .addGap(73, 73, 73)
                                .addComponent(jbtRemove2)
                                .addGap(73, 73, 73)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtften, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfsl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfchitiet, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtSave)
                    .addComponent(jbtNew2)
                    .addComponent(jbtRemove2))
                .addGap(15, 15, 15))
        );

        jbtNew.setText("new");
        jbtNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNewActionPerformed(evt);
            }
        });

        jbtUp.setText("update");

        jbtRemove.setText("remove");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtNew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtUp))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jbtRemove)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(317, 317, 317))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtNew)
                            .addComponent(jbtUp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtRemove)
                        .addGap(0, 114, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNewActionPerformed
        frmMatHang f = new frmMatHang();
        f.setVisible(true);
    }//GEN-LAST:event_jbtNewActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        hienThiLenJList();
        taiDanhMucSanPhamLenComboBox();
        hienThi();
    }//GEN-LAST:event_formWindowOpened

    private void jbtNew2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNew2ActionPerformed
        if(chucNangDaChon == ChucNang.none) {
            thietLap(ChucNang.add);
        } else {
            thietLap(ChucNang.none);
        }
    }//GEN-LAST:event_jbtNew2ActionPerformed

    private void jbtSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSaveActionPerformed
        if (chucNangDaChon == ChucNang.add) {
            them();
        } else if (chucNangDaChon == ChucNang.update) {
            sua();
        }
    }//GEN-LAST:event_jbtSaveActionPerformed

    private void jbtRemove2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRemove2ActionPerformed
        xoa();
    }//GEN-LAST:event_jbtRemove2ActionPerformed

    private void jtspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtspMouseClicked
        int r = jtsp.getSelectedRow();
        String maSP = jtsp.getValueAt(r, 0).toString();
        String ten = jtsp.getValueAt(r, 1).toString();
        String g = jtsp.getValueAt(r, 2).toString();
        String soLuong = jtsp.getValueAt(r, 3).toString();
        String ct = jtsp.getValueAt(r, 4).toString();
        jtfma.setText(maSP);
        jtften.setText(ten);
        jtfsl.setText(soLuong);
        jtfgia.setText(g);
        jtfchitiet.setText(ct);
    }//GEN-LAST:event_jtspMouseClicked

    private void jlDanhMucSPValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jlDanhMucSPValueChanged
        
    }//GEN-LAST:event_jlDanhMucSPValueChanged

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
            java.util.logging.Logger.getLogger(frmSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbtNew;
    private javax.swing.JButton jbtNew2;
    private javax.swing.JButton jbtRemove;
    private javax.swing.JButton jbtRemove2;
    private javax.swing.JButton jbtSave;
    private javax.swing.JButton jbtUp;
    private javax.swing.JComboBox<String> jcbloai;
    private javax.swing.JList<String> jlDanhMucSP;
    private javax.swing.JTextField jtfchitiet;
    private javax.swing.JTextField jtfgia;
    private javax.swing.JTextField jtfma;
    private javax.swing.JTextField jtfsl;
    private javax.swing.JTextField jtften;
    private javax.swing.JTable jtsp;
    // End of variables declaration//GEN-END:variables
}
