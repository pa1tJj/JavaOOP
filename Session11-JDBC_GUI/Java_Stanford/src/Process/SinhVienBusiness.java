/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Process;

import Interface.ISinhVien;
import Interface.frmDanhSachSinhVien;
import database.DataProvider;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PHAN ANH TUAN
 */
public class SinhVienBusiness implements ISinhVien {

    @Override
    public List<SinhVien> layDanhSach() {
        List<SinhVien> lstSinhVien = new ArrayList<>();
        Connection con = null;
        try {
            con = DataProvider.ketNoi();
            String sql = "select *from sinhvien";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            SinhVien objSV = null;
            while (rs.next()) {
                objSV = new SinhVien();
                objSV.setMaSV(rs.getString("MaSV"));
                objSV.setHoTen(rs.getString("HoTen"));
                objSV.setGioiTinh(rs.getInt("GioiTinh"));
                objSV.setNgaySinh(rs.getDate("NgaySinh"));
                objSV.setDienThoai(rs.getString("DienThoai"));
                objSV.setEmail(rs.getString("Email"));
                objSV.setMaKhoa(rs.getString("DiaChi"));
                objSV.setMaKhoa(rs.getString("MaKhoa"));
                lstSinhVien.add(objSV);
            }
        } catch (SQLException e) {
            System.err.println("co loi xay ra trong qua trinh lam viec voi MySQL" + "Chi tiet:" + e.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVienBusiness.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lstSinhVien;
    }

    //hàm thêm mới thông tin sinh viên 
    @Override
    public boolean themMoi(SinhVien sv) {
        Connection con = null;
        try {
            con = DataProvider.ketNoi();
            String sql = "insert into sinhvien (MaSV, HoTen, GioiTinh, NgaySinh, DienThoai, Email, DiaChi, MaKhoa) values(?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, sv.getMaSV());
            ps.setString(2, sv.getHoTen());
            ps.setInt(3, sv.getGioiTinh());
            ps.setDate(4, new Date(sv.getNgaySinh().getTime()));
            ps.setString(5, sv.getDienThoai());
            ps.setString(6, sv.getEmail());
            ps.setString(7, sv.getDiaChi());
            ps.setString(8, sv.getMaKhoa());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("co loi khong them duoc thong tin chi tiet:" + e.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVienBusiness.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    //hàm lấy thông tin chi tiết của sinh viên
    @Override
    public SinhVien layChiTietTheoMa(String ma) {
        SinhVien sv = null;
        Connection con = null;
        try {
            con = DataProvider.ketNoi();
            String sql = "select MaSV, HoTen, GioiTinh, NgaySinh, DienThoai, Email, DiaChi, MaKhoa"
                    + " from sinhvien where MaSV = '" + ma + "'";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                sv = new SinhVien();
                sv.setMaSV(rs.getString("MaSV"));
                sv.setHoTen(rs.getString("HoTen"));
                sv.setGioiTinh(rs.getInt("GioiTinh"));
                sv.setNgaySinh(rs.getDate("NgaySinh"));
                sv.setDienThoai(rs.getString("DienThoai"));
                sv.setEmail(rs.getString("Email"));
                sv.setDiaChi(rs.getString("DiaChi"));
                sv.setMaKhoa(rs.getString("MaKhoa"));
            }
        } catch (SQLException e) {
            System.out.println("co loi xay ra trong qua trinh lam viec voi MySQL.Chi tiet:" + e.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVienBusiness.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return sv;
    }

    //hàm sửa thông tin sinh viên
    @Override
    public boolean capNhat(SinhVien sv) {
        Connection con = null;
        try {
            con = DataProvider.ketNoi();
            String sql = "update sinhvien set HoTen = ?, GioiTinh = ?, NgaySinh = ?,"
                    + " DienThoai = ?, Email = ?, DiaChi = ?, MaKhoa = ? where MaSV = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, sv.getHoTen());
            ps.setInt(2, sv.getGioiTinh());
            ps.setDate(3, new Date(sv.getNgaySinh().getTime()));
            ps.setString(4, sv.getDienThoai());
            ps.setString(5, sv.getEmail());
            ps.setString(6, sv.getDiaChi());
            ps.setString(7, sv.getMaKhoa());
            ps.setString(8, sv.getMaSV());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVienBusiness.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    //hàm xóa thông tin sinh viên
    @Override
    public boolean xoa(String maSV) {
        Connection con = null;
        try {
            con = DataProvider.ketNoi();
            Statement stm = con.createStatement();
            String sql = "delete from sinhvien where MaSV = '" + maSV + "'";
            return stm.executeUpdate(sql) > 0;
        } catch (Exception e) {

        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVienBusiness.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    @Override
    public List<SinhVien> timKiem(String name) {
        Connection con = null;
        ResultSet rs = null;
        List<SinhVien> listSV = new ArrayList<>();
        try {
            con = DataProvider.ketNoi();
            String sql = "select *from sinhvien where HoTen like '%" + name + "%'";
            Statement stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setMaSV(rs.getString("MaSV"));
                sv.setHoTen(rs.getString("HoTen"));
                sv.setGioiTinh(rs.getInt("GioiTinh"));
                sv.setNgaySinh(rs.getDate("NgaySinh"));
                sv.setDienThoai(rs.getString("DienThoai"));
                sv.setEmail(rs.getString("Email"));
                sv.setDiaChi(rs.getString("DiaChi"));
                sv.setMaKhoa(rs.getString("MaKhoa"));
                listSV.add(sv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienBusiness.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVienBusiness.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listSV;
    }
}
