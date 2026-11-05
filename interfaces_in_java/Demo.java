package interfaces_in_java;

// class-class->extends
// class-interface -> implements
// interface-interface -> extends

interface A{
    int age=10; //in interface all variables are static and final

    void show();  //by default all methods are abstruct public
    void fly();
}
class B implements A,Y{

    
    public void show() {
       System.out.println("show...");
    }

  
    public void fly() {
        System.out.println("fly...");
    }

    public void run(){
        System.out.println("running ...");
    }

}

interface X{
    void run();
}
interface Y extends X{

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


        // obj1.run();       not found bcz the obj1 is refer A interface but in A there is no run  

        B obj3=new B();  
        obj3.run();    //Just for run method we do ----> X obj=new B(); obj.run();


    }
}
