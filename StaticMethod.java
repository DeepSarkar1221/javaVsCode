
class Mobile{

    String brand;
    int price;
    static String name;  // it is a static varible so the name is a one var that accessed by any obj
}

public class StaticMethod {
    public static void main(String[] args) {
        
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=12000;
        Mobile.name="Smart Phone";

        Mobile obj2=new Mobile();
        obj2.brand="Samsung";
        obj2.price=1300000;
        Mobile.name="Phone";

        System.out.println(obj1.brand+" : "+obj1.price+" : "+obj1.name);
        System.out.println(obj2.brand+" : "+obj2.price+" : "+obj2.name);


    }    
}
