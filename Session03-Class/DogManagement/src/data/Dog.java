
package data;

//khuôn để tạo ra các object,đối tượng cần lưu trữ thông tin
public class Dog {
    private String name;
    private int yob;
    private double weight;
    public Dog(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }
    public void bark() {
        System.out.println("my name: " + name);
        System.out.println("my yob: " + yob);
        System.out.println("my weight: " + weight);
    }
    public void setNewWeight(double newWeight) {
        weight = newWeight;
    }
    public int getYob() {
        return yob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    @Override
    public String toString() {
        //return "Dog{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
        String tmp = String.format("|" + name + "|" + yob + "|" + weight + "|");
        return tmp;
    }
    public int getAge() {
        return 2023 - yob;
    }
}
