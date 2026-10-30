public class Hello {

    public static void main(String[] args){


    int num1=20;
    float num2=20.5f;
    double num3=20.5;
    long num=2000000000L;
    byte num4=100;
    short num5=1000;

    boolean isJavaFun = true;

    System.out.println(2);


    // Type casting
    int a = 10;
    double b = a; // Implicit casting
    System.out.println(b);
    int c=2;
    
    byte d=10; 
    // d=c;// error bcz c is int and d is byte, so we need to do explicit casting
    d=(byte)c; // explicit casting
    System.out.println(d);
    int nums=260;
    byte nums2=3;
    nums2=(byte)nums; // explicit casting
    System.out.println(nums2); // output will be 4 because 260%256=4.. here 256 is the range of byte data type
    byte nums3=127;
    byte nums4=8;
    int result=nums3*nums4; // here result will be 128 but the range of byte is -128 to 127 so it will not fit in  byte so we put in int data type   
    System.out.println(result);

    
    }
}
