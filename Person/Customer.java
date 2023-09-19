package Person;

public class Customer {
    private String customerName;
    private double customerCash;

    public Customer(String customerName, double customerCash) {
        this.customerName = customerName;
        this.customerCash = customerCash;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCustomerCash() {
        return customerCash;
    }

    //public boolean canAfford() {
        
    //     if (customerCash >= ){
    //         return true;
    //     }else return false;
     //}

    public String GetInfo() {

        String message = "";
        message = message.concat("Customer Name: " + customerName + "\n");
        message = message.concat("Customer Cash: " + customerCash + "\n");

        return message;
    }

    public static void main(String[] args) {
        Customer customer1 = new Customer("John", 1500);
        customer1.GetInfo();
    }
}