package Shop;

abstract class Product {
  protected String productName;
  protected double productPrice;

  public Product(String name, double price) {
    this.productName = name;
    this.productPrice = price;
  }

  public String GetName() {
    return productName;
  }

  public void SetName(String name) {
    this.productName = name;
  }

  public double GetPrice() {
    return this.productPrice;
  }

  abstract String GetInfo();
}
