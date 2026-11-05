package abstracts;



abstract class Car{    //abstruct class
    public void playMusic(){
        System.out.println("Music playing...");
    }
    abstract public void drive();
}

class Tata extends Car{   // concrete class
    public void drive(){
        System.out.println("driving...");
    }
}




public class Demo {
    public static void main(String[] args) {
        
        Car obj=new Tata();  // we can't make any obj of abstruct class
        obj.drive();
    }
}
