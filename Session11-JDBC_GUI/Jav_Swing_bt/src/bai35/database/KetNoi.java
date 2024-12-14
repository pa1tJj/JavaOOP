/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai35.database;

import java.sql.*;
/**
 *
 * @author PHAN ANH TUAN
 */
public class KetNoi {
    public static Connection KetNoiDB() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/thongtinsp", "root", "");
        return con;
    }
}
