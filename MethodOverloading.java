class Calculator{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int add(int n1,int n2,int n3){ // here the two methods name is same but they differ only in parameter number .. or we can differ them as their parameter type..
        //Note: we can't differ them by their return type
        return n1+n2+n3;
    }
}


public class MethodOverloading {
    public static void main(String[] args) {
        Calculator obj=new Calculator();
       int result= obj.add(2,3);
       int r2=obj.add(2, 2,4);
       System.out.println("the First result is "+result);
       System.out.println("the Second result is "+r2);
    }
}
