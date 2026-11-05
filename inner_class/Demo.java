package inner_class;




class A{
    int age;

    public void show(){
        System.out.println("in showing ...");
    }

    // class B{     //100
    //     public void show1(){
    //         System.out.println("in show1....");
    //     }
    // }

    static class B{    //101
        public void show1(){
            System.out.println("in static show1....");
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();

        // A.B obj1=obj.new B();//100    for non-static class

        A.B obj1= new A.B();   //101    for a stTIC CLASS

        obj1.show1();

    }
}
