package basics;

import java.lang.reflect.Array;
class Mobile{
    String brand;
    int price;
    static String color;

    public void show(){
        System.out.println(brand + " || " + price + " || " + color);
    }
}
public class VariablesAndDataTypes {
    public static void main(String[] args) {
        // Variables
        int age = 25;
        double salary = 50000.50;
        char nameInitial = 'A';
        boolean isEmployed = true;
        String name = "Omkar";
        float height = 5.8f;
        int[] numbers = {1, 2, 3, 4, 5};

        // Static variables
        Mobile mobile1 = new Mobile();
        mobile1.brand = "Samsung";
        mobile1.price = 20000;
        Mobile.color = "Black"; //here we can set color with using Class(preferred) and Object too



        Mobile mobile2 = new Mobile();
        mobile2.brand = "Apple";
        mobile2.price = 100000;


        //from above now color is set to black
        System.out.println("Before changing color");
        mobile1.show();
        mobile2.show();

        Mobile.color = "White";
        //now color is set to white
        System.out.println("After changing color to white");
        mobile1.show();
        mobile2.show();
    }
}
