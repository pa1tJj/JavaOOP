/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basicarray;

/**
 *
 * @author Admin
 */
public class BasicArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }

    public static void playWithPrimitiveArray() {
        //double a[100] //java cấm khai báo kích thước mảng,các ptu trong []
        double a[] = {1, 2, 3, 66};
        for (double x : a) {// với mọi x,thì x đang muốn lấy mọi giá trị của từng phần tử của v
            System.out.print(x + "");
        }
    }

    public static void playWithPrimitiveArrayV2() {
        int a1[] = {5, 10, 15, 20};
        int a2[] = new int[]{5, 10, 15, 20};
        int a3[] = new int[5];
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " ");
        }
    }

    public static void playWithStudentArray() {
        Student s[] = new Student[100];
        s[0] = new Student("ierhr", "phan", 22, 7.5);
    }
}
