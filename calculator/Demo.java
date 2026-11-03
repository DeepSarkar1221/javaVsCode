package calculator;

public class Demo {
    public static void main(String[] args) {
        Calc obj=new Calc();
        int a=obj.add(1,4);
        System.out.println(a);


        AdvCalc obj1=new AdvCalc();
        int b=obj1.mul(90,34 );
        System.out.println(b);


        MultilevelInheritance obj3=new MultilevelInheritance();
        System.out.println(obj3.mod(19, 4));
        System.out.println(obj3.add(4, 8));


        

    }
    
}
