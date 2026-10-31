
class Calculator{


    public int fromClass(){

        System.out.println("I am from Calculator Class");
        return 0;
    }
}




public class ClassFunction {
    

    public static void main(String[] args) {
        System.out.println("I am in Main function now");
        Calculator calc=new Calculator();
        calc.fromClass();
        
    }
}
