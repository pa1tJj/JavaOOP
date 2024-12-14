/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;


import Process.ChuyenKhoa;
import Process.ChuyenKhoaImpl;
import Process.SinhVien;
import Process.SinhVienBusiness;
import java.awt.Component;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicComboBoxRenderer;

/**
 *
 * @author PHAN ANH TUAN
 */
public class frmSinhVienAdd extends javax.swing.JFrame {

    ISinhVien svb = new SinhVienBusiness();
    public frmSinhVienAdd() {
        initComponents();
        hienThiDanhSachKhoa();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jMenuItem1 = new javax.swing.JMenuItem();
        jDialog2 = new javax.swing.JDialog();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfMaSV = new javax.swing.JTextField();
        jtfHoTen = new javax.swing.JTextField();
        jrbNam = new javax.swing.JRadioButton();
        jrbNu = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jDateChooserNgaySinh = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jtfDienThoai = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfDiaChi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jcbKhoa = new javax.swing.JComboBox<>();
        jbtCapNhat = new javax.swing.JButton();
        jbtDong = new javax.swing.JButton();
        jbtKhoiTao = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã SV:");

        jLabel2.setText("Họ tên:");

        jLabel3.setText("Giới tính:");

        buttonGroup1.add(jrbNam);
        jrbNam.setText("Nam");
        jrbNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNamActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbNu);
        jrbNu.setText("Nữ");
        jrbNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNuActionPerformed(evt);
            }
        });

        jLabel4.setText("Ngày sinh:");

        jDateChooserNgaySinh.setDateFormatString("dd-MM-yyyy");

        jLabel5.setText("Điện thoại:");

        jLabel6.setText("Email:");

        jLabel7.setText("Địa chỉ:");

        jLabel8.setText("Khoa:");

        jbtCapNhat.setText("Cập nhật");
        jbtCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCapNhatActionPerformed(evt);
            }
        });

        jbtDong.setText("Đóng");
        jbtDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDongActionPerformed(evt);
            }
        });

        jbtKhoiTao.setText("Khởi tạo");
        jbtKhoiTao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtKhoiTaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(373, 373, 373))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtCapNhat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtKhoiTao)
                                .addGap(79, 79, 79)
                                .addComponent(jbtDong))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jrbNam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbNu)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(jDateChooserNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfHoTen, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfDienThoai, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfDiaChi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbKhoa, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jrbNu)
                        .addComponent(jrbNam))
                    .addComponent(jDateChooserNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtCapNhat)
                    .addComponent(jbtDong)
                    .addComponent(jbtKhoiTao))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbNuActionPerformed

    private void jbtCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCapNhatActionPerformed
        SinhVien sv = new SinhVien();
        //lấy thông tin trên giao diện cho các thuộc tính của sv
        sv.setMaSV(jtfMaSV.getText());
        sv.setHoTen(jtfHoTen.getText());
        sv.setDienThoai(jtfDienThoai.getText());
        sv.setEmail(jtfEmail.getText());
        sv.setDiaChi(jtfDiaChi.getText());
        if(jrbNu.isSelected()) {
            sv.setGioiTinh(1);
        }else{
            sv.setGioiTinh(0);
        }
        sv.setNgaySinh(jDateChooserNgaySinh.getDate());
        //xử lý lấy mã khoa để lưu vào csdl từ combobox Khoa mà người dùng chọn
        String maKhoa = "";
        ChuyenKhoa objKhoa = (ChuyenKhoa) jcbKhoa.getSelectedItem();
        if(objKhoa != null) {
            maKhoa = objKhoa.getMaKhoa();
        }
        sv.setMaKhoa(maKhoa);
        //lấy thông tin khoa chọn trên giao diện
       boolean kq;
       if(!maSinhVien.isEmpty()) {
           kq = svb.capNhat(sv);
       }else {
           kq = svb.themMoi(sv);
       }
       if(kq) {//nếu thực hiện thành công
           JOptionPane.showMessageDialog(rootPane, "cap nhat thong tin sinh vien thanh cong");
           //reload lại danh sách
       }
    }//GEN-LAST:event_jbtCapNhatActionPerformed

    private void jbtDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDongActionPerformed
        this.setVisible(false);//câu lệnh dùng để đóng form hiện thời
    }//GEN-LAST:event_jbtDongActionPerformed

    private void jbtKhoiTaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtKhoiTaoActionPerformed
        jtfMaSV.setText("");
        jtfHoTen.setText("");
        jtfDiaChi.setText("");
        jtfDienThoai.setText("");
        jtfEmail.setText("");
        jDateChooserNgaySinh.setDateFormatString("");
        jrbNam.setSelected(false);
        jrbNu.setSelected(false);
    }//GEN-LAST:event_jbtKhoiTaoActionPerformed

    private void jrbNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbNamActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private String maSinhVien = "";
    public String getMaSinhVien() {
        return maSinhVien;
    }
    
    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }
    
    public void hienThiChiTietSinhVien() {
        SinhVien sv = svb.layChiTietTheoMa(maSinhVien);
        jtfMaSV.setText(maSinhVien);
        jtfMaSV.setEnabled(false);
        if(sv != null) {
            //hiển thị lên giao diện
            jtfMaSV.setText(sv.getMaSV());
            jtfHoTen.setText(sv.getHoTen());
            jtfDienThoai.setText(sv.getDienThoai());
            jtfEmail.setText(sv.getEmail());
            jtfDiaChi.setText(sv.getDiaChi());
            if(sv.getGioiTinh() == 1) {
                jrbNu.setSelected(true);
            }else{
                jrbNam.setSelected(true);
            }
            jDateChooserNgaySinh.setDate(sv.getNgaySinh());
            //xử lý hiển thị thông tin khoa lên thông tin chi tiết của sinh viên
            IChuyenKhoa chuyenKhoaImpl = new ChuyenKhoaImpl();
            ChuyenKhoa objKhoa = chuyenKhoaImpl.layChiTietTheoMa(sv.getMaKhoa());
            if(objKhoa != null) {
                //thiết lập thông tin khoa của sinh viên đó trong danh sách
                jcbKhoa.getModel().setSelectedItem(objKhoa);
            }
        }
    }
    
    class Khoa extends BasicComboBoxRenderer {//lớp Render tác động vào từng item trước khi nó hiển thị lên trên giao diện 
        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus){
             super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
             if(value != null) {
                 ChuyenKhoa item = (ChuyenKhoa) value;
                 setText(item.getTenKhoa());
             }
             return this;
        }
    }
    
    private void hienThiDanhSachKhoa() {
        IChuyenKhoa chuyenKhoaImpl = new ChuyenKhoaImpl();
        List<ChuyenKhoa> listKhoa = chuyenKhoaImpl.layDanhSach();
        DefaultComboBoxModel dcb = new DefaultComboBoxModel();
        for (ChuyenKhoa objKhoa : listKhoa) {
            dcb.addElement(objKhoa);
        }
        jcbKhoa.setModel(dcb);//hiển thị lên combobox
        jcbKhoa.setRenderer(new Khoa());//thiết lập chế độ hiển thị chuẩn do người dùng lập trên combobox
    }
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
            java.util.logging.Logger.getLogger(frmSinhVienAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSinhVienAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSinhVienAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSinhVienAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSinhVienAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private com.toedter.calendar.JDateChooser jDateChooserNgaySinh;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton jbtCapNhat;
    private javax.swing.JButton jbtDong;
    private javax.swing.JButton jbtKhoiTao;
    private javax.swing.JComboBox<String> jcbKhoa;
    private javax.swing.JRadioButton jrbNam;
    private javax.swing.JRadioButton jrbNu;
    private javax.swing.JTextField jtfDiaChi;
    private javax.swing.JTextField jtfDienThoai;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfHoTen;
    private javax.swing.JTextField jtfMaSV;
    // End of variables declaration//GEN-END:variables
}