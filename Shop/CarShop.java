package Shop;

// Concrete subclass CarShop
public class CarShop extends Shop {
    private int BrandOfCars;

    public CarShop(String name, int BrandOfCars) {
        super(name);
        this.BrandOfCars = BrandOfCars;
    }

    public int getNumberOfPets() {
        return BrandOfCars;
    }

    @Override
    public void displayShopInfo() {
        System.out.println("Shop Name: " + getShopName());
        System.out.println("Type: Car Shop");
        System.out.println("Model of Cars: " + BrandOfCars);
    }

    @Override
    public String GetCategory(){
      return "Car Shop";
    }

}