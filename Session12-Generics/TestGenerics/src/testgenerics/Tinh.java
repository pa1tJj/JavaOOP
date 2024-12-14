/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testgenerics;

/**
 *
 * @author PHAN ANH TUAN
 * @param <T>
 */
public class Tinh<T extends Number> {//Number là lớp trừu tượng
    T[] t;

    public Tinh(T[] t) {
        this.t = t;
    }
    
    public double giaTriTrungBinhMang() {
        double sum = 0;
        for (T t1 : t) {
            sum += t1.doubleValue();
        }
        return sum / t.length;
    }
    
    public static void main(String[] args) {
        Integer a[] = {1, 4, 5};
        Tinh<Integer> tinh = new Tinh<>(a);
        double db = tinh.giaTriTrungBinhMang();
        System.out.println("gia tri trung binh mang:" + db);
        Double b[] = {4.5, 2.33, 6.777};
        Tinh<Double> tinh2 = new Tinh<>(b);
        System.out.println("gia tri bang:" + tinh2.giaTriTrungBinhMang());
    }
}
