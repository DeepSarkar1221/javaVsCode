package abstracts;



abstract class Car{
    public void playMusic(){
        System.out.println("Music playing...");
    }
    abstract public void drive();
}

class Tata extends Car{
    public void drive(){
        System.out.println("driving...");
    }
}




public class Demo {
    public static void main(String[] args) {
        
        Car obj=new Tata();
        obj.drive();
    }
}
