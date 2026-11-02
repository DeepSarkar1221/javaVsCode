class Human{
    // int age;  ----
    // String name;  -----
    private int age;
    private String name;

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

        obj.setAge(20);
        obj.setName("Deep");
        System.out.println(obj.getName()+" : "+obj.getAge());
    }
}
