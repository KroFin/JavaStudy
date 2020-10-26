package interfaceTest;

public class Customer implements Comparable<Customer>{

    private FoodMemu foodMemu;

    Customer (){};

    public Customer(FoodMemu foodMemu){
        this.foodMemu = foodMemu;
    }

    public FoodMemu getFoodMemu() {
        return foodMemu;
    }

    public void setFoodMemu(FoodMemu foodMemu) {
        this.foodMemu = foodMemu;
    }

    public void order(){
        foodMemu.food01();
    }

    @Override
    public int compareTo(Customer o) {
        return 0;
    }
}
