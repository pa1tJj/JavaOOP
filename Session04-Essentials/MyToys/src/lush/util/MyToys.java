package lush.util;

import java.util.Scanner;


public class MyToys {

    //chứa đặc điểm/hành ví là static,cho sử dụng thì sử dung public
    //một class bình thường thì vừa có thể static vừa non-static
    public static final double PI = 3.14;

    //biến k cho thay đổi value trừ lần đầu tiên khai báo
    public static int getInteger() {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Input n:");
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Wrong input...re-enter");
            }
        } while (true);
    }
     public static int getInteger(String msg) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println(msg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Wrong input...re-enter");
            }
        } while (true);
    }
}
