package print;

public class Cat extends Animal{

    @Override
    public void move(){
        System.out.println("猫在移动");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
