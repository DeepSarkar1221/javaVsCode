
class Mobile{

    String brand;
    int price;
    static String name;  // it is a static varible so the name is a one var that accessed by any obj




    public Mobile(){ //constructor
        brand="";
        price=100;
        System.out.println("from constructor blocks");
    }

    static {                //static block
        name="Mobile phone";
        System.out.println("from static block");
    }





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
    public static void main(String[] args){
        
        Mobile obj1=new Mobile();
        Mobile obj2=new Mobile();

        //when we creat any number of obj then the staetic block loads but it loads only once 


        //when we odn't create any obj then we can load the static block by------>
        // Class.forName("Mobile");





        obj1.brand="Apple";
        obj1.price=12000;
        Mobile.name="Smart Phone";

       
        obj2.brand="Samsung";
        obj2.price=1300000;
        Mobile.name="Phone";

        obj1.show();
        obj2.show();

        Mobile.show1(); //id:101

        Mobile.show2(obj2); // id :100




    }    
}
