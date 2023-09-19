package Shop;

public class Animal_Toy extends Product{
    private String ToyType;//


    public Animal_Toy(String name){
        super(name,0);
    }
    public Animal_Toy(String name , double price){
        super(name,price);
    }
    public Animal_Toy(String name,double price ,String ToyType){
        super(name,price);
        this.ToyType = ToyType;
    }
    public String GetToy(){
        return ToyType;
    }

    public String GetInfo(){
        return  String.format("Toy Name : "+GetName(),"Toy Price : "+GetPrice());
    }
}
