package interfaceTest;

public class ChineseCooker implements FoodMemu {
    @Override
    public void food01() {
        System.out.println("中餐师傅做的food01");
    }

    @Override
    public void food02() {
        System.out.println("中餐师傅做的food02");
    }
}
