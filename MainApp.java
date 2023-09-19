import Shop.*;
import java.util.Scanner;

public class MainApp {
  private static Scanner kbd = new Scanner(System.in);
  public static void main(String[] args) {
    
    // String input = kbd.nextLine();

    // System.out.println("Welcome to my Shop");
    // System.out.print("What is your role? (Customer: 0 / Manager: 1)");

    ShoppingMall mall = new ShoppingMall();
    mall.displayShops();
    mall.addShop(new CarShop("Kitty Shop", 10));
    // mall.addShop(new Shop("instrument"));
    mall.addShop(new CarShop("Pussy Shop", 11));

    

    mall.displayShops();

    // if (input == "0"){
      
      
    // }
    // else if (input == "1") {

      

    // }
    // else if (input == "2"){
      
    // }
    // else {
    //   System.out.println("What are you doing");
    //   MainApp.Clear();
    // }
    
    
    kbd.close();
  }


  private static void Clear() {
            // Check if the console supports ANSI escape codes
            if (System.console() == null) {
              System.out.println("Sorry, ANSI escape codes are not supported in this terminal.");
              return;
          }
  
          // ANSI escape code to clear the terminal screen
          String clearScreen = "\033[H\033[2J";
  
          // Print the escape code to clear the screen
          System.out.print(clearScreen);
          
          // Optional: Print a message after clearing the screen
          System.out.println("Terminal cleared!");
  }
}
