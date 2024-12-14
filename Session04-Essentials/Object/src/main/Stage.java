/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import data.Student;

/**
 *
 * @author Admin
 */
public class Stage {

    public static void main(String[] args) {
        Student ct = checkObjectV6();
        ct.showProfile();
    }
    public static void checkObjectV1() {
        Student s1 = new Student("21103100888", "PHAN ANH TUAN", 2003, 8.5);
        s1.showProfile();
        Student x = s1;
        //sc đang lắm/lư tọa độ vùng ram object trong heap
        //new làm nhiều công việc
        //1.clone khuôn(object và static)
        //2.gọi phễu đổ data vào vùng clone
        //3.chốt lại tọa dộ vùng new vừa rồi,đem tọa độ đó đi gán biến con trỏ
        s1 = new Student("82428", "Mike Brown", 1999, 7.8);
        s1.showProfile();
        x.showProfile();
        //PHAN ANH TUAN  lúc này k còn ai trỏ,ko còn cách nào lấy lại đc vùng ram này
        //tọa độ new cũ k giữ lại
        //biến object là tay cầm con diều,new chính là con diều
        //khi tay cầm nối dây con diều mới con diều cũ k sử dụng nữa
        //1 vùng ram new object k ai trỏ tới,JVM có chương trình ngầm gọi là
        // GARBAGE COLLECTOR,đi gom những vùng new k có con trỏ,don free ram free heap
        //trả lại ram k dùng cho new sau này
        
        new Student("888666", "HEHEH",2005,9.0).showProfile();
    }
    public static void checkObjectV2() {
        Student s1 = new Student("21103100888", "PHAN ANH TUAN", 2003, 8.5);
        Student s2 = new Student("82428", "Mike Brown", 1999, 7.8);
        s1.setName("LEO");//1 new 1 đối tượng
        s1.showProfile();
        s2.showProfile();
    }
    public static void checkObjectV3() {
        Student s1 = new Student("21103100888", "PHAN ANH TUAN", 2003, 8.5);
        s1 = new Student("82428", "Mike Brown", 1999, 7.8);
        //s1 là biến object
        //s1 bỏ qua clone PHAN ANH TUAN chuyển sang kết nối với Brown,con trỏ lưu tọa độ mới,biến thay đổi value,lưu value gần nhất
        //mất tọa độ clone PHAN ANH TUAN
        //vùng ram không có ai trỏ tới,thì định kì khi chạy,JVM sẽ clear vùng clone k có ocn trỏ
        System.gc();//gom  rác vùng HEAP
        s1.showProfile();
    }
    public static void checkObjectV4() {
        Student s1 = new Student("21103100888", "PHAN ANH TUAN", 2003, 8.5);
        Student x = s1;
        s1 = new Student("82428", "Mike Brown", 1999, 7.8);
        s1.showProfile();
        x.showProfile();
    }
    public static void checkObjectV5() {
        Student s1 = new Student("21103100888", "PHAN ANH TUAN", 2003, 8.5);
        new Student("21103100888", "PHAN ANH TUAN", 2003, 8.5).showProfile();
        //new trỏ đến showProfile() xong,GARBAGE COLLECTOR phát hiện k có con trỏ  nên clear luôn
        
    }
    //hàm trả về một tọa độ của object
    public static Student checkObjectV6() {
        Student x;
        x = new Student("21103100888", "PHAN ANH TUAN", 2003, 8.5);
        //new trỏ đến showProfile() xong,GARBAGE COLLECTOR phát hiện k có con trỏ  nên clear luôn
        return x;
    }
}
