package enums;


enum Laptop{
    Mackbook(10000),Xps(299),Lenevo,Asus(1000);

    private int price;

    Laptop(){
        this.price=10;
    }

    private Laptop(int price){
        this.price=price;
    }

    public int getPrice() {
        return price;
    }
    

}
public class Demo2 {
    public static void main(String[] args) {
        Laptop lap=Laptop.Mackbook;
        System.out.println(lap+" : "+lap.getPrice());

        for(Laptop laps : Laptop.values()){
            System.out.println(laps.name() +" : "+laps.getPrice());
        }

    }
}
