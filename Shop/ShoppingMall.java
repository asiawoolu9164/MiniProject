package Shop;

import java.util.ArrayList;

public class ShoppingMall {
    private ArrayList<Shop> shops;

    public ShoppingMall() {
        shops = new ArrayList<Shop>();
    }

    public void addShop(Shop shop) {
        shops.add(shop);
    }

    public void displayShops() {
        for (Shop shop : shops) {
            shop.displayShopInfo();
            System.out.println("--------------");
        }
    }
}
