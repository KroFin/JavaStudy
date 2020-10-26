package interfaceTest;

public class Main {
    public static void main(String[] args) {
        FoodMemu cooker01 = new ChineseCooker();
        Customer customer01 = new Customer(cooker01);

        FoodMemu cooker02 = new UsaCooker();
        Customer customer02 = new Customer(cooker02);

        customer01.order();

        customer02.order();
    }
}
