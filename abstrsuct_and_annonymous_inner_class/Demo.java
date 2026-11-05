package abstrsuct_and_annonymous_inner_class;

abstract class A {
    abstract public void show();

    abstract public void fly();
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A() {

            public void show() {

                System.out.println("show...");
            }

            public void fly() {
                System.out.println("fly ...");
            }

        };

        obj.show();
        obj.fly();
    }
}
