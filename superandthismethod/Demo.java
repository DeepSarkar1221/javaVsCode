package superandthismethod;



class A{
    public A(){
        System.out.println("From A");
    }
    public A(int n){
        System.out.println("From int A");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("From B");

    }
    public B(int n){
        // super(n);   ***** this method called its parent constructor
        this();  // /////this method call this own constructor
        System.out.println("From B int");
    }

}


public class Demo {
    public static void main(String[] args) {
        
        B obj =new B();
        B obj1 = new B(3);
    }
}
