/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testiheritance;

/**
 *
 * @author Admin
 */
public class xe{
    protected String tenXe;
    protected String hangXe;
    
    public xe(String tenXe, String hangXe) {
        this.tenXe = tenXe;
        this.hangXe = hangXe;
    }
    
    public void in() {
        System.out.print("ten xe:" + tenXe);
        System.out.print("\nhang xe:" + hangXe);
    }
}
