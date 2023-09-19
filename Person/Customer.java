package Person;

public class Customer {
    private String cName;
    private double cCash;

    public Customer(String cName, double cCash) {
        this.cName = cName;
        this.cCash = cCash;
    }

    public String getcName() {
        return cName;
    }

    public double getcCash() {
        return cCash;
    }

    public boolean canAfford(double price) {
        if (cCash >= price) {
            return true;
        } else {
            return false;
        }
    }

    public String GetInfo() {

        String message = "";
        message = message.concat("Customer Name: " + cName + "\n");
        message = message.concat("Customer Cash: " + cCash + "\n");

        return message;
    }

    public static void main(String[] args) {
        Customer customer1 = new Customer("Dove", 2000);
        customer1.GetInfo();
    }
}