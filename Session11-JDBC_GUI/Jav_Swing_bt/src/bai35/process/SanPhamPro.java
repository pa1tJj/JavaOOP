/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai35.process;

import bai35.database.KetNoi;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author PHAN ANH TUAN
 */
public class SanPhamPro {
    
    public List<SanPham> layDanSach() {
        List<SanPham> listSP = new ArrayList<>();
        try {
            Connection con = KetNoi.KetNoiDB();
            String sql = "select *from sanpham";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                SanPham sp = new SanPham();
                sp.setMaSanPham(rs.getString("masp"));
                sp.setTenSanPham(rs.getString("tensp"));
                sp.setGia(rs.getDouble("gia"));
                sp.setSl(rs.getInt("sl"));
                sp.setChiTiet(rs.getString("chitiet"));
                sp.setTenHang(rs.getString("tenhang"));
                listSP.add(sp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamPro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listSP;
    }
    
    public boolean kiemTraMaTrung(String id) {
        for (SanPham sp : layDanSach()) {
            if(sp.getMaSanPham().equals(id)) {
                return true;
            }
        }
        return false;
    }
    public boolean themSanPham(SanPham sp) {
        try {
            Connection con = KetNoi.KetNoiDB();
            String sql = "insert into sanpham values(?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, sp.getMaSanPham());
            ps.setString(2, sp.getTenSanPham());
            ps.setDouble(3, sp.getGia());
            ps.setInt(4, sp.getSl());
            ps.setString(5, sp.getChiTiet());
            ps.setString(6, sp.getTenHang());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            if(kiemTraMaTrung(sp.getMaSanPham())) {
                return false;
            }
            Logger.getLogger(SanPhamPro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    } 
    
    public boolean suaSanPham(SanPham sp) {
        try {
            Connection con = KetNoi.KetNoiDB();
            String sql = "update sanpham set tensp = ?, gia = ?, sl = ?, chitiet = ?, tenloai = ? where masp = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, sp.getTenSanPham());
            ps.setDouble(2, sp.getGia());
            ps.setInt(3, sp.getSl());
            ps.setString(4, sp.getChiTiet());
            ps.setString(5, sp.getTenHang());
            ps.setString(6, sp.getMaSanPham());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamPro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean xoaSanPham(String id) {
        try {
            Connection con = KetNoi.KetNoiDB();
            String sql = "delete from sanpham where masp = '"+id+"'";
            PreparedStatement ps = con.prepareStatement(sql);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamPro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
