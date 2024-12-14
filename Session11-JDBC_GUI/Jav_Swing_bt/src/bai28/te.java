/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai28;
import java.sql.*;
/**
 *
 * @author PHAN ANH TUAN
 */
public class te {
    public static void main(String[] args) throws SQLException {
        Connection con = KetNoi.KetNoiDB();
        if(con == null) {
            System.out.println("that bai");
        }
        System.out.println("thanh cong");
    }
}
