package data;





public class Student {
    private  String id;//static-nằm  vùng nhớ riêng mà object nào cũng dùng chung
    private String name;//vùng nhớ dùng chung cho các object cùng class //static-dữ liệu chỉnh sửa theo object variable cuối cùng
    //KHÔNG DÙNG STATIC CHO NHỮNG THỨ(ĐẶC ĐIỂM HAY HÀM) CỦA RIÊNG TỪNG OBJECT
    private int yob;
    private double gpa;
    public Student (String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + '}';
    }
    
    public void showProfile() {
        System.out.printf("|%8s|%-25s|%4d|%4.1f|\n",id, name, yob, gpa);
    }
    
    public int getAge() {
        return 2023 - yob;
    }
    
}
