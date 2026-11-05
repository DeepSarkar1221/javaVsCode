package interfaces_in_java;

interface A{
    int age=10; //in interface all variables are static and final

    void show();  //by default all methods are abstruct public
    void fly();
}
class B implements A{

    
    public void show() {
       System.out.println("show...");
    }

  
    public void fly() {
        System.out.println("fly...");
    }

}

public class Demo {
    public static void main(String[] args) {
        // A obj;  // A is not a class so we dont make its object by new A();

        A obj1=new B(); //method-1

        A obj2=new A() {  // method- 2
            public void show() {
            System.out.println("show 2...");
            }

        
            public void fly() {
                System.out.println("fly 2...");
            }
        };
        obj1.show();
        obj2.show();


    }
}
