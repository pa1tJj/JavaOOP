/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daluong;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PHAN ANH TUAN
 */
public class MultipleThreads extends Thread{
    String name;
    
    @Override
    public void run(){
        while(true) {
            name = Thread.currentThread().getName();// Thread.currentThread() - Đây là phương thức tĩnh, trả về một đối tượng của lớp Thread,có thể gọi ở bất kỳ đâu mà không cần tạo đối tượng của lớp Thread. getName() - trả về tên của Thread
            System.out.println(name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(MultipleThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void main(String[] args) {
        MultipleThreads t1 = new MultipleThreads();
        MultipleThreads t2 = new MultipleThreads();
        t1.setName("Thread1");
        t2.setName("Thread2");
        t1.start();//Phương thức này chính thức tạo ra một đối tượng thread. Và JVM sẽ tự động gọi phương thức run của đối tượng
        t2.start();
        System.out.println("so luong dang chay:" + Thread.activeCount());
    }
}
