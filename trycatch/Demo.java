package trycatch;



public class Demo {
    public static void main(String[] args) {
        int i=20;
        int j=0;

        try{
            j=18/i;
            if(j==0)
                throw new ArithmeticException("I don't understand");
        }
        catch(ArithmeticException e){
            System.out.println("In arithmatic exception block :"+e);
            
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("In Out of bound exception block"+e);
        }
        catch(Exception e){
            System.out.println("i am in exception block"+e);
        }
    }
}
