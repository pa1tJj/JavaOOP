/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wrapperclass;

/**
 *
 * @author Admin
 */
public class WrapperClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        playWithPool();
    }
    
    public static void playWithIntegers() {
        int num0 = 2003;
        Integer num1 = new Integer("2004");//2 vùng ram con trỏ và new;
        Integer num2 = new Integer(2005);
        Integer num3 = 2006;//vẫn new ngầm, bản chất vẫn là new Integer(2003)
        //cách ta lấy con số literal(số xuất hiện trong code) chính là primitive-boxing a primitive value 
        //boxing: từ primitive -> wrapper obj, thứ đc đóng gói
        System.out.println("num0:" + num0);//dùng trực tiếp vùng ram
        System.out.println("num1:" + num1);//
        System.out.println("num2:" + num2);
        System.out.println("num3:" + num3);
        int num4 = num1;//hiện tượng mở hộp <=> unboxing
        //unboxing: từ obj -> primitive
        // mở vùng new lấy value/nhân/lõi gốc primitive
        System.out.println("num4:" + num4);
        Integer num5 = num0;
        num5 = 7635734;
        //biến  Integer mỗi lần = value mới primitive => new Integer(value mới)
        //vùng Integer đc new k có set() chỉ có get()
        //muốn thay đổi thì phải new mới
        //Integer là obj-read-only
        //class k có hàm sửa ,chỉ new xong dùng value đó mãi mãi
        // k sửa ,read-only obj:imutable classs/obj
        //có 8 wrapper class(imutable class)
        //Byte, Short, Integer, Long, Float, Double, Boolean, Character
        
    }
    
    public static void playWithIntegerpointers() {
        Integer num1 = new Integer("2003");
        Integer num2 = new Integer(2003);
        Integer num3 = 2003;
        boolean result = num1 == num2;//Như if/else :)
        System.out.println("num1 == num2:" + result);
        Integer num4 = 2003;
        if(num2 == num3) {
            System.out.println("bang");
        }else {
            System.out.println("khong bang vi di so sanh toa do 2 vung new");
        }
        System.out.println("num3 vs num4(core true):" + num3.equals(num4));
        System.out.println("num3 vs num4(core true):" + num3.compareTo(num4));
        
    }
    
    public static void playWithPool() {
        Integer num1 = -127;
        Integer num2 = -127;
        System.out.println("num1 vs num2:" + (num1 == num2));
        //riêng cho boxing từ -128 -> 127 thì gói những thằng primitive/boxing trong đoạn này 
        //thì chúng chỉ dùng 1 vùng new,chung nếu chung lõi
        Integer num3 = new Integer(-127);//k trỏ chung vì dùng new rõ ràng tường minh
        System.out.println("num1 vs num3:" + (num1 == num3));
    }
}
