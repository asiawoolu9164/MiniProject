package Shop;

public class Car_Parts extends Product{
    private String PartType;


    public Car_Parts(String name){
        super(name,0);
    }
    public Car_Parts(String name , double price){
        super(name,price);
    }
    public Car_Parts(String name,double price ,String PartType){
        super(name,price);
        this.PartType = PartType;
    }
    public String GetPart(){
        return PartType;
    }

    public String GetInfo(){
        return  String.format("Part Name : "+GetName(),"Part Price : "+GetPrice());
    }
}
