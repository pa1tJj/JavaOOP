/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testiheritance;

/**
 *
 * @author Admin
 */
public class oto extends xe{
    public int giaBan;
    public int tocDo;
    public oto(String tenXe, String hangXe, int giaBan, int tocDo) {
        super(tenXe, hangXe);
        this.giaBan = giaBan;
        this.tocDo = tocDo;
    }
    
    @Override
    public void in() {
        super.in();
        System.out.print("\ngia ban" + giaBan);
        System.out.print("\ntoc do:" + tocDo);
    }
}
