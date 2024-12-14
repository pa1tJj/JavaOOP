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
public class KetNoi {
    public static Connection KetNoiDB() throws SQLException{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/thongtinsv", "root", "");
        return con;
    }
}
