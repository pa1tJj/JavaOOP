/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Process;

import Interface.IChuyenKhoa;
import database.DataProvider;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PHAN ANH TUAN
 */
public class ChuyenKhoaImpl implements IChuyenKhoa {

    @Override
    public List<ChuyenKhoa> layDanhSach() {
        List<ChuyenKhoa> listChuyenKhoa = new ArrayList<>();
        Connection con = null;
        try {
            con = DataProvider.ketNoi();
            String sql = "select *from chuyenkhoa";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            ChuyenKhoa c = null;
            while (rs.next()) {
                c = new ChuyenKhoa();
                c.setMaKhoa(rs.getString("MaKhoa"));
                c.setTenKhoa(rs.getString("TenKhoa"));
                listChuyenKhoa.add(c);
            }
        } catch (SQLException ex) {
            System.out.println("co loi xay ra trong qua trinh lam viec voi mysql.chi tiet:" + ex.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVienBusiness.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listChuyenKhoa;
    }

    @Override
    public ChuyenKhoa layChiTietTheoMa(String ma) {
        ChuyenKhoa c = null;
        Connection con = null;
        try {
            con = DataProvider.ketNoi();
            String sql = "select MaKhoa, TenKhoa from chuyenkhoa where MaKhoa = '" + ma + "'";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                c = new ChuyenKhoa();
                c.setMaKhoa(rs.getString("MaKhoa"));
                c.setTenKhoa(rs.getString("TenKhoa"));
            }
        } catch (SQLException ex) {
            System.out.println("co loi xay ra voi mysql.chi tiet:" + ex.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVienBusiness.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return c;
    }

    @Override
    public boolean themMoi(ChuyenKhoa c) {
        Connection con = null;
        try {
            con = DataProvider.ketNoi();
            String sql = "insert into chuyenkhoa (MaKhoa, TenKhoa) values (?, ?) ";
            Statement stm = con.createStatement();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, c.getMaKhoa());
            ps.setString(2, c.getTenKhoa());
        } catch (SQLException ex) {
            Logger.getLogger(ChuyenKhoaImpl.class.getName()).log(Level.SEVERE, null, ex);
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
    public boolean capNhat(ChuyenKhoa c) {
        Connection con = null;
        try {
            con = DataProvider.ketNoi();
            String sql = "update chuyenkhoa set MaKhoa = ?, TenKhoa = ? where MaKhoa = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, c.getMaKhoa());
            ps.setString(2, c.getTenKhoa());
        } catch (SQLException ex) {
            Logger.getLogger(ChuyenKhoaImpl.class.getName()).log(Level.SEVERE, null, ex);
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
    public boolean xoa(String ma) {
        Connection con = null;
        try {
            con = DataProvider.ketNoi();
            String sql = "delete *from chuyenkhoa where MaKhoa = '" + ma + "'";
            Statement stm = con.createStatement();
            return stm.executeUpdate(sql) > 0;
        } catch (SQLException ex) {
            Logger.getLogger(ChuyenKhoaImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    @Override
    public  List<ChuyenKhoa> timKiem(String ma) {
        List<ChuyenKhoa> ck = new ArrayList<>();
        return ck;
    }
}
