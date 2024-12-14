
package studentprofile;

import java.util.Scanner;

public class StudentProfile {

    
    public static void main(String[] args) {
        inputProfile();
    }
    public static void inputProfile() {
        String name,address;
        int yob;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten: ");
        name = sc.nextLine().toUpperCase();
        System.out.print("nhap yob: ");
        yob = sc.nextInt();//nextInt là convert data từ bàn phím 
        sc.nextLine();
        System.out.print("nhap dia chi: ");
        address = sc.nextLine().toUpperCase();
        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Yob: " + yob);
    }
}
