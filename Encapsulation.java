class Human{
    // int age;  ----
    // String name;  -----
    private int age;
    private String name;
    public Human(){    // default constructor
        age=12;
        name="No name";
    }

    public Human(int a,String n){   //parameterized constructor
        age=a;
        name=n;
    }

    public  void setAge(int a){
        age=a;
    }
    public void setName(String n){
        name=n;
    }


    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }



}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj=new Human();

        // obj.age=13;     -----
        // obj.name="Deep";  ----
        System.out.println("Before setter the values by default constructor value");
        System.out.println(obj.getName()+" : "+obj.getAge());
        obj.setAge(20);
        obj.setName("Deep");
        System.out.println("After settings the values");
        System.out.println(obj.getName()+" : "+obj.getAge());

        System.out.println("Parameterized cosntructor--->");
        Human obj1=new Human(13,"Rishita");
        System.out.println(obj1.getName()+" : "+obj1.getAge());

    }
}
