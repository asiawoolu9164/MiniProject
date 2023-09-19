import Shop.*;
import java.util.Scanner;

public class MainApp {
  private static Scanner kbd = new Scanner(System.in);
  public static void main(String[] args) {
    
    String input = kbd.nextLine();

    System.out.println("Welcome to my Shop");
    System.out.print("What is your role? (Customer: 0 / Manager: 1)");

    ShoppingMall mall = new ShoppingMall(input, input);
    mall.displayCarsInMall();
    mall.addCarToMall(new Cars("Sporty Speeds", 10));
    mall.addCarToMall(new Cars("Car Create", 11));
  }
}