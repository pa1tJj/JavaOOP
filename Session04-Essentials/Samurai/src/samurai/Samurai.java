package samurai;

import java.util.Scanner;

public class Samurai {

    public static void main(String[] args) {
        inputProfile();
    }

    public static void inputProfileBig() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten: ");
        name = sc.nextLine().toUpperCase();
        try {
            System.out.print("nhap yob: ");
            yob = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            //CPU se chay đến chố này nếu có hiện tượng lỗi TẠP(vd:nhập liền kí tự và sô-2001HT)
            //chỗ này là nơi xử lí hậu quả lỗi TẠP
            //k có lỗi TẠP thì bỏ qua câu lệnh này
            //e là thứ JVM gửi cho mình báo rằng có lỗi TẠP
            //Eception e = new Exception(nội dung thông báo lỗi...)
            //cách xử lí:
            yob = 69;
        }

        System.out.print("nhap dia chi: ");
        address = sc.nextLine().toUpperCase();
        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Yob: " + yob);
    }

    public static void inputProfile() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten: ");
        name = sc.nextLine().toUpperCase();
        while (true) {
            try {
                System.out.print("nhap yob: ");
                yob = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Wrong input...re-Enter!");
            }
        }

        System.out.print("nhap dia chi: ");
        address = sc.nextLine().toUpperCase();
        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Yob: " + yob);
    }
}
