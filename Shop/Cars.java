package Shop;

public class Cars extends Product {
    private CarBrand brand;

    public Cars(String name) {
        super(name, 0);
        this.brand = CarBrand.DEFAULT;
    }

    public Cars(String name, double price) {
        super(name, price);
        this.brand = CarBrand.DEFAULT;
    }

    public Cars(String name, double price, CarBrand brand) {
        super(name, price);
        this.brand = brand;
    }

    public String GetBrand() {
        return brand.toString();
    }
    @Override
    public String GetInfo() {
        return String.format("Car's name: %s, Price: $%.2f, Brand: %s", GetName(), GetPrice(), GetBrand());
    }

    public enum CarBrand {
        DEFAULT,
        LAMBORGHINI,
        BMW,
        FERRARI,
        ROLLSROYCE,
        MASERATI,
        TESLA,
        PORSCHE,
    }
}