/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bai28;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PHAN ANH TUAN
 */
public class frmSinhVien extends javax.swing.JFrame {

    DanhSachSinhVien ds = new DanhSachSinhVien();
    int chucNangChon = ChucNang.none;

    public void thietLap(boolean x) {
        jbtthem.setEnabled(x);
        jbtclear.setEnabled(x);
        jbtsua.setEnabled(x);
        jbttimkiem.setEnabled(x);
        jbtxoa.setEnabled(x);
        jbtluu.setEnabled(!x);
    }

    public void caiDatSwitch(int chucNang) {
        chucNangChon = chucNang;
        switch (chucNang) {
            case ChucNang.add -> {
                thietLap(false);
                jtfma.setEnabled(true);
                jtften.setEnabled(true);
                jcbmalop.setEnabled(true);
                jtfdiemlt.setEnabled(true);
                jtfdiemth.setEnabled(true);
                jtfma.setText("");
                jtften.setText("");
                jtfdiemlt.setText("");
                jtfdiemth.setText("");
                jcbmalop.setSelectedIndex(1);
            }
            case ChucNang.update -> {
                thietLap(false);
                jtfma.setEnabled(false);
                jtften.setEnabled(true);
                jcbmalop.setEnabled(true);
                jtfdiemlt.setEnabled(true);
                jtfdiemth.setEnabled(true);
            }
            case ChucNang.none -> {
                thietLap(true);
                jtfma.setEnabled(false);
                jtften.setEnabled(false);
                jcbmalop.setEnabled(false);
                jtfdiemlt.setEnabled(false);
                jtfdiemth.setEnabled(false);
            }
        }
    }

    public void them() throws SQLException {
        SinhVien sv = new SinhVien();
        sv.setMaSinhVien(jtfma.getText());
        sv.setHoTen(jtften.getText());
        sv.setMaLop(jcbmalop.getSelectedItem().toString());
        sv.setDiemLyThuyet(Double.parseDouble(jtfdiemlt.getText()));
        sv.setDiemThucHanh(Double.parseDouble(jtfdiemth.getText()));

        if (jtfma.getText().equals("") || jtften.getText().equals("") || ("" + sv.getDiemLyThuyet()).equals("") || ("" + sv.getDiemThucHanh()).equals("")) {
            JOptionPane.showMessageDialog(rootPane, "chưa nhập đủ dữ liệu");
        } else {
            boolean kq = ds.themSinhVien(sv);
            if (kq) {
                JOptionPane.showMessageDialog(rootPane, "thêm thành công");
            } else {
                JOptionPane.showMessageDialog(rootPane, "mã sinh viên đã tồn tại", "cảnh báo", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public void sua() throws SQLException {
        SinhVien sv = new SinhVien();
        sv.setMaSinhVien(jtfma.getText());
        sv.setHoTen(jtften.getText());
        sv.setMaLop(jcbmalop.getSelectedItem().toString());
        sv.setDiemLyThuyet(Double.parseDouble(jtfdiemlt.getText()));
        sv.setDiemThucHanh(Double.parseDouble(jtfdiemth.getText()));

        if (jtsv.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(rootPane, "chưa chọn sinh viên để sửa");
        } else {
            boolean kq = ds.suaSinhVien(sv);
            if (kq) {
                JOptionPane.showMessageDialog(rootPane, "sửa thành công");
            } else {
                JOptionPane.showMessageDialog(rootPane, "mã sinh viên đã tồn tại", "cảnh báo", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public void xoa() throws SQLException {
        int er = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn xóa sinh viên này không", "cảnh báo", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION);
        if (er == JOptionPane.YES_OPTION) {
            int dongChon = jtsv.getSelectedRow();
            String ma = "" + jtsv.getValueAt(dongChon, 0);
            boolean kq = ds.xoaSinhVien(ma);
            if (kq) {
                JOptionPane.showMessageDialog(rootPane, "xóa thành công");
            }
        }
    }

    public void timKiemSinhVien() throws SQLException {
        List<SinhVien> listSV = ds.timKiem(jtfma.getText());
        String col[] = new String[]{"mã sinh viên", "họ tên", "mã lớp", "điểm lt", "điểm th", "kết quả"};
        DefaultTableModel dtm = new DefaultTableModel(col, 0);
        Object o[] = null;
        for (SinhVien sv : listSV) {
            o = new Object[6];
            o[0] = sv.getMaSinhVien();
            o[1] = sv.getHoTen();
            o[2] = sv.getMaLop();
            o[3] = sv.getDiemLyThuyet();
            o[4] = sv.getDiemThucHanh();
            o[5] = sv.getketQua();
            dtm.addRow(o);
        }
        jtsv.setModel(dtm);
        if(listSV.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "sinh viên không tồn tại");
        }
    }

    public void hienThi() throws SQLException {
        List<SinhVien> listSV = ds.layDanhSach();
        String col[] = new String[]{"mã sinh viên", "họ tên", "mã lớp", "điểm lt", "điểm th", "kết quả"};
        DefaultTableModel dtm = new DefaultTableModel(col, 0);
        Object o[] = null;
        for (SinhVien sv : listSV) {
            o = new Object[6];
            o[0] = sv.getMaSinhVien();
            o[1] = sv.getHoTen();
            o[2] = sv.getMaLop();
            o[3] = sv.getDiemLyThuyet();
            o[4] = sv.getDiemThucHanh();
            o[5] = sv.getketQua();
            dtm.addRow(o);
        }
        jtsv.setModel(dtm);
    }

    public frmSinhVien() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfma = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtften = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jcbmalop = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jtfdiemlt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfdiemth = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfkq = new javax.swing.JTextField();
        jbtkq = new javax.swing.JButton();
        jbtthem = new javax.swing.JButton();
        jbtclear = new javax.swing.JButton();
        jbtluu = new javax.swing.JButton();
        jbtxoa = new javax.swing.JButton();
        jbtsua = new javax.swing.JButton();
        jbttimkiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtsv = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Thông tin sinh viên");

        jLabel2.setText("mã sinh viên");

        jLabel3.setText("họ tên");

        jLabel4.setText("mã lớp");

        jcbmalop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("điểm lý thuyết");

        jLabel6.setText("điểm thực hành");

        jLabel7.setText("kết quả");

        jbtkq.setText("kết quả");

        jbtthem.setText("thêm");
        jbtthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtthemActionPerformed(evt);
            }
        });

        jbtclear.setText("clear");
        jbtclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtclearActionPerformed(evt);
            }
        });

        jbtluu.setText("lưu");
        jbtluu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtluuActionPerformed(evt);
            }
        });

        jbtxoa.setText("xóa");
        jbtxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtxoaActionPerformed(evt);
            }
        });

        jbtsua.setText("sửa");
        jbtsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtsuaActionPerformed(evt);
            }
        });

        jbttimkiem.setText("tìm kiếm");
        jbttimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttimkiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfma, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtften, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcbmalop, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfdiemlt)
                    .addComponent(jtfdiemth)
                    .addComponent(jtfkq)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbtkq)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbtthem))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbtclear)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbtluu))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbtxoa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbtsua)))))
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jbttimkiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtften, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbmalop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfdiemlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfdiemth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfkq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtkq)
                    .addComponent(jbtthem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtclear)
                    .addComponent(jbtluu))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtxoa)
                    .addComponent(jbtsua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jbttimkiem))
        );

        jtsv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtsv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtsvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtsv);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtthemActionPerformed
        if (chucNangChon == ChucNang.none) {
            caiDatSwitch(ChucNang.add);
        } else {
            caiDatSwitch(ChucNang.none);
        }
    }//GEN-LAST:event_jbtthemActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            hienThi();
        } catch (SQLException ex) {
            Logger.getLogger(frmSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jbtclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtclearActionPerformed
        jtfma.setText("");
        jtften.setText("");
        jtfdiemlt.setText("");
        jtfdiemth.setText("");
        jcbmalop.setSelectedIndex(1);
    }//GEN-LAST:event_jbtclearActionPerformed

    private void jbtluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtluuActionPerformed
        if(chucNangChon == ChucNang.add) {
            try {
                them();
            } catch (SQLException ex) {
                Logger.getLogger(frmSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (chucNangChon == ChucNang.update) {
            try {
                sua();
            } catch (SQLException ex) {
                Logger.getLogger(frmSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jbtluuActionPerformed

    private void jbtxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtxoaActionPerformed
        try {
            xoa();
        } catch (SQLException ex) {
            Logger.getLogger(frmSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtxoaActionPerformed

    private void jbtsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtsuaActionPerformed
        if (chucNangChon == ChucNang.none) {
            caiDatSwitch(ChucNang.update);
        } else {
            caiDatSwitch(ChucNang.none);
        }
    }//GEN-LAST:event_jbtsuaActionPerformed

    private void jtsvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtsvMouseClicked
        int r = jtsv.getSelectedRow();
        String maSV = jtsv.getValueAt(r, 0).toString();
        String ten = jtsv.getValueAt(r, 1).toString();
        String mal = jtsv.getValueAt(r, 2).toString();
        String dlt = jtsv.getValueAt(r, 3).toString();
        String dth = jtsv.getValueAt(r, 4).toString();
        jtfdiemlt.setText(dlt);
        jtfdiemth.setText(dth);
        jtfma.setText(maSV);
        jtften.setText(ten);
        jcbmalop.setSelectedItem(r);
    }//GEN-LAST:event_jtsvMouseClicked

    private void jbttimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttimkiemActionPerformed
        try {
            timKiemSinhVien();
        } catch (SQLException ex) {
            Logger.getLogger(frmSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbttimkiemActionPerformed

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
            java.util.logging.Logger.getLogger(frmSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSinhVien().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtclear;
    private javax.swing.JButton jbtkq;
    private javax.swing.JButton jbtluu;
    private javax.swing.JButton jbtsua;
    private javax.swing.JButton jbtthem;
    private javax.swing.JButton jbttimkiem;
    private javax.swing.JButton jbtxoa;
    private javax.swing.JComboBox<String> jcbmalop;
    private javax.swing.JTextField jtfdiemlt;
    private javax.swing.JTextField jtfdiemth;
    private javax.swing.JTextField jtfkq;
    private javax.swing.JTextField jtfma;
    private javax.swing.JTextField jtften;
    private javax.swing.JTable jtsv;
    // End of variables declaration//GEN-END:variables
}
