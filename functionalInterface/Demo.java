package functionalInterface;

@FunctionalInterface 
interface A{
    public void show();
}



public class Demo {
    
    public static void main(String[] args) {
        
        A obj=new A() {
            public void show(){
                System.out.println("in show");
            }
        };
        obj.show();



    }
}
