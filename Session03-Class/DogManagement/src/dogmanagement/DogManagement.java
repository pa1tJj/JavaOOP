
package dogmanagement;

import data.Dog;


public class DogManagement {

    
    public static void main(String[] args) {
        //lấy khuôn Dog ra để tạo thông tin
        Dog chiHo = new Dog("CHI HO",2021,0.5);
        chiHo.bark();
        Dog ngaoDa = new Dog("Ngao Da", 2022, 0.6);
        ngaoDa.bark();
        chiHo.setNewWeight(2.5);
        chiHo.bark();
        int chYob = chiHo.getYob();
        System.out.println("chi Ho yob: " + chYob);
        System.out.println("ngao Da yob: " + ngaoDa.getYob());
        String chDetail = chiHo.toString();
        System.out.println("CH Detail: " + chDetail);
        System.out.println("ND Detail: " + ngaoDa.toString());
        System.out.println("Get Age:" + ngaoDa.getAge());
    }
    
}
