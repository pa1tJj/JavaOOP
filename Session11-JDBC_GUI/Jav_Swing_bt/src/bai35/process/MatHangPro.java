/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai35.process;

import bai35.database.KetNoi;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PHAN ANH TUAN
 */
public class MatHangPro {

    public List<MatHang> layMatHang() {
        List<MatHang> listMH = new ArrayList<>();
        try {
            Connection con = KetNoi.KetNoiDB();
            String sql = "select *from mathang";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                MatHang m = new MatHang();
                m.setMaLoai(rs.getString("mahang"));
                m.setTenHang(rs.getString("tenhang"));
                listMH.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MatHangPro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listMH;
    }
    
    public boolean kiemTraMaTrung(String id) {
        for (MatHang m : layMatHang()) {
            if(m.getMaLoai().equals(id)) {
                return true;
            }
        }
        return false;
    }
    public boolean themMatHang(MatHang m) {
        try {
            Connection con = KetNoi.KetNoiDB();
            String sql = "insert into mathang values(?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, m.getMaLoai());
            ps.setString(2, m.getTenHang());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            if(kiemTraMaTrung(m.getMaLoai())) {
                return false;
            }
            Logger.getLogger(MatHangPro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
