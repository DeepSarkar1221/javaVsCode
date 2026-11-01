class Student{
    int marks;
    String name;
    int age;
}

public class ArrayOfObjects {
    public static void main(String[] args) {

        Student s1=new Student();
        s1.name="Deep";
        s1.age=20;
        s1.marks=100;
        Student s2=new Student();
        s2.name="Akash";
        s2.age=21;
        s2.marks=100;
        Student s3=new Student();
        s3.name="Rishita";
        s3.age=19;
        s3.marks=99;

        //Array of objects
        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;


        //Normal loop
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name+" has obtain :"+students[i].marks);
        }

        System.out.println("\n");
        System.out.println("In enhanced for loop----->");
        for(Student s:students){
            System.out.println(s.name+" has obtain :"+s.marks);
        }



    }
}
