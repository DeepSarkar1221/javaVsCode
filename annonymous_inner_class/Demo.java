package annonymous_inner_class;


class A{
    // public void show1(){    //101
    //     System.out.println("int cls A");
    // }
    public void show(){
        System.out.println("int cls A");
    }
}

class B extends A{
        
    public void show(){
            System.out.println("int cls B");
        }
}


public class Demo {
    public static void main(String[] args) {
        A obj=new B();
        // obj.show();  --> //101   when in class A the show method name is different as in the B class then  then its give a error bcz we know the obj type is A bur show method is in the B 
         
        obj.show(); // it is the method of B not A class  ***Danger***
    }
    
}
