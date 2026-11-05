package need_of_interface;


interface Computer{
    void code();
}

class Desktop implements Computer{
    public void code(){
        System.out.println("coding in desktop...");
    }
}

class Laptop implements Computer{
    public void code(){
        System.out.println("coding in Laptop...");
    }
}
class Developer{
    public void dev(Computer comp){
        comp.code();
    }
}


public class Demo {
    public static void main(String[] args) {
        Computer comp=new Desktop();
        

        Developer obj=new Developer();
        obj.dev(comp);
        

    }
}
