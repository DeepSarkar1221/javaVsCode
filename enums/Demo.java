package enums;


enum Student{
    Running,Sitting,Swiming,Pending;
}
public class Demo {

    public static void main(String[] args) {
        // int i=9;
        Student ss[]=Student.values();
        for (Student s:ss){
            System.out.println(s.ordinal()+" : "+s);
        }
        Student s=Student.Running;
        if(s==Student.Pending)
            System.out.println("Plx Runn");
        
        switch (s) {
            case Running:
                System.out.println("All good");
                break;
            case Sitting:
                System.out.println("Plz srt run");
                break;
            default:
                break;
        }

    }
    
}
