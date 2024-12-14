/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jav;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class DinhDangDate {

    public static void main(String[] args) {
        playWithSimpleDateFormat();
    }
    
    public static void playWithDate() {
        LocalDate l1 = LocalDate.parse("2000-10-20");
        LocalDate l2 = LocalDate.parse("2020-12-22");
        System.out.println("l1.isBefore(l2)" + l1.isBefore(l2));
        System.out.println(LocalDate.now());
        LocalDateTime mt = LocalDateTime.now();
        System.out.println("before:" + mt);
        DateTimeFormatter mform = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String time = "21/10/2023";
        String time1 = "22/10/2024";
        LocalDate lcal = LocalDate.parse(time, mform);
        LocalDate lcal1 = LocalDate.parse(time1, mform);
        System.out.println("localDate:" + lcal);
        System.out.println("format:" + mform.format(lcal));
        System.out.println("so sanh:" + lcal.isBefore(LocalDate.now()));
        //string sang Date
        String s = "20/06/2023";
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = sdf.parse(s);
            System.out.println("String sang Date:" + date);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void playWithCalendar() {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println("thoi gian hien tai cua he thong:" + date);
        System.out.println("ngay hien tai tren he thong:" + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("thang hien tai tren he thong:" + (c.get(Calendar.MONTH) + 1));//tháng trong java chạy từ 0 -> 11 nên phải cộng thêm 1
        System.out.println("nam hien tai tren he thong:" + c.get(Calendar.YEAR));
        System.out.println("gio hien tai tren he thong:" + c.get(Calendar.HOUR));//hiển thị giờ theo khung 12h
        System.out.println("gio hien tai tren he thong:" + c.get(Calendar.HOUR_OF_DAY));//hiển thị giờ theo khung 24h
        System.out.println("phut hien tai tren he thong:" + c.get(Calendar.MINUTE));
        System.out.println("giay hien tai tren he thong:" + c.get(Calendar.SECOND));
    }
    
    public static void thayDoiThoiGianHeThong() {
        Calendar c = Calendar.getInstance();
        //c.set(int x, int y) - hàm thay đổi thời gian - x là tên giá trị cần thay đổi, y là giá trị mới của x
        c.set(Calendar.DAY_OF_MONTH, 20);
        System.out.println("thay doi ngay cua he thong:" + c.get(Calendar.DAY_OF_MONTH));
    }
    
    public static void phepTinhVoiThoiGianHeThong() {
        Calendar c = Calendar.getInstance();
        //c.add(int x, int y) - hàm tính toán thòi gian hệ thống - x là giá trị cần thay đổi - y > 0 thì tăng x lên, y < 0 thì giảm giá trị x
        System.out.println("thang hien tai:" + (c.get(Calendar.MONTH) + 1));
        c.add(Calendar.MONTH, 2);
        System.out.println("sau khi thay doi:" + c.get(Calendar.MONTH));
    }
    
    public static void playWithSimpleDateFormat() {
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();
        System.out.println("thoi gian hien tai:" + d);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("thoi gian sau khi dinh dang lai:" + sdf.format(d));
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("thoi gian day du sau khi dinh dang:" + sdf2.format(d));
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss aaa");
        System.out.println("thoi gian day du dinh dang:" + sdf3.format(d));
    }
}
