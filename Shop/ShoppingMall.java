package Shop;

import java.util.ArrayList;

public class ShoppingMall {
    private String name;
    private String location;
    private ArrayList<Cars> carsInMall;

    public ShoppingMall(String name, String location) {
        this.name = name;
        this.location = location;
        this.carsInMall = new ArrayList<>();
    }

    public void addCarToMall(Cars carShop) {
        carsInMall.add(carShop);
    }

    public void displayCarsInMall() {
        System.out.println("Shopping Mall: " + name);
        System.out.println("Location: " + location);
        System.out.println("Cars in Mall:");
        for (Cars car : carsInMall) {
            System.out.println(car);
        }
    }
}