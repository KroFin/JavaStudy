package map;

public class Vip implements Comparable<Vip>{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Vip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //重写接口中的方法

    @Override
    public int compareTo(Vip o) {
        return this.age - o.age;
    }
}
