package Shop;

// Concrete subclass CarShop
public class CarShop extends Shop {
    private int numberOfCars;

    public CarShop(String name, int numberOfCars) {
        super(name);
        this.numberOfCars = numberOfCars;
    }

    public int getNumberOfPets() {
        return numberOfCars;
    }

    @Override
    public void displayShopInfo() {
        System.out.println("Shop Name: " + getShopName());
        System.out.println("Type: Car Shop");
        System.out.println("Number of Cars: " + numberOfCars);
    }

    @Override
    public String GetCategory(){
      return "Car Shop";
    }

}