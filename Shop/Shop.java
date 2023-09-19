package Shop;

import java.util.ArrayList;

abstract class Shop {
    private String Shopname;
    private ArrayList<Product> products;

    public Shop(String name) {
        this.Shopname = name;
        this.products = new ArrayList<Product>();
    }

    public String getShopName() {
        return Shopname;
    }

    public void addProduct(Product product){
        products.add(product);
    }
    
    public void sellProduct(Product product){
        products.remove(product);
    }

    public String showShopProducts(){
        String item = "";
        for (Product product : products) {
            item += "," + product.GetName();
        }

        return item;
    }

    public abstract void displayShopInfo();

    public abstract String GetCategory();
    
}