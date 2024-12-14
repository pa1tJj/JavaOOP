/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai28;

import java.util.List;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author PHAN ANH TUAN
 */
public class DanhSachSinhVien {

    

    public List<SinhVien> layDanhSach() throws SQLException {
        List<SinhVien> listSSV = new ArrayList<>();
        Connection con = KetNoi.KetNoiDB();
        String sql = "select *from sinhvien";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            SinhVien sv = new SinhVien();
            sv.setMaSinhVien(rs.getString("masv"));
            sv.setHoTen(rs.getString("hoten"));
            sv.setMaLop(rs.getString("malop"));
            sv.setDiemLyThuyet(rs.getDouble("diemlt"));
            sv.setDiemThucHanh(rs.getDouble("diemth"));
            sv.setKq(sql);
            listSSV.add(sv);
        }
        return listSSV;
    }

    public boolean kiemTraMaTrung(String maTrung) throws SQLException {
        for (SinhVien sinhVien : layDanhSach()) {
            if(sinhVien.getMaSinhVien().equals(maTrung)) {
                return true;
            }
        }
        return false;
    }
    public boolean themSinhVien(SinhVien sv) throws SQLException {
        Connection con = KetNoi.KetNoiDB();
        String sql = "insert into sinhvien values(?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, sv.getMaSinhVien());
        ps.setString(2, sv.getHoTen());
        ps.setString(3, sv.getMaLop());
        ps.setDouble(4, sv.getDiemLyThuyet());
        ps.setDouble(5, sv.getDiemThucHanh());
        if(kiemTraMaTrung(sv.getMaSinhVien())) {
            return false;
        } else {
            return ps.executeUpdate() > 0;
        }
    }

    public boolean suaSinhVien(SinhVien sv) throws SQLException {
        Connection con = KetNoi.KetNoiDB();
        String sql = "update sinhvien set hoten = ?, malop = ?, diemlt = ?, diemth = ? where masv = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, sv.getHoTen());
        ps.setString(2, sv.getMaLop());
        ps.setDouble(3, sv.getDiemLyThuyet());
        ps.setDouble(4, sv.getDiemThucHanh());
        ps.setString(5, sv.getMaSinhVien());
        return ps.executeUpdate() > 0;
    }

    public boolean xoaSinhVien(String id) throws SQLException {
        Connection con = KetNoi.KetNoiDB();
        String sql = "delete from sinhvien where masv = '" + id + "'";
        PreparedStatement ps = con.prepareStatement(sql);
        return ps.executeUpdate() > 0;
    }

   

    public List<SinhVien> timKiem(String id) throws SQLException {
        List<SinhVien> list = new ArrayList<>();
        Connection con = KetNoi.KetNoiDB();
        String sql = "select *from sinhvien where masv like '%" + id + "%'";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            SinhVien sv = new SinhVien();
            sv.setMaSinhVien(rs.getString("masv"));
            sv.setHoTen(rs.getString("hoten"));
            sv.setMaLop(rs.getString("malop"));
            sv.setDiemLyThuyet(rs.getDouble("diemlt"));
            sv.setDiemThucHanh(rs.getDouble("diemth"));
            list.add(sv);
        }
        return list;
    }
}
