
class Mobile{

    String brand;
    int price;
    static String name;  // it is a static varible so the name is a one var that accessed by any obj

    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }

    public static void show1(){
        
        System.out.println(name); // id:101
    }
    public static  void show2(Mobile obj){
        System.out.println(obj.brand+" : "+obj.price+" : "+name); // id:100
    }
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

        obj1.show();
        obj2.show();

        Mobile.show1(); //id:101

        Mobile.show2(obj2); // id :100




    }    
}
