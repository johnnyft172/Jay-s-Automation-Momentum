package JavaBasics;

public class Car {

    String name;
    int price;
    String engine;

    public Car(String name, int price, String engine){
        this.name = name;
        this.price = price;
        this.engine = engine;
    }

    public static void main(String[] args) {

        Car obj1 = new Car("Tesla", 10, "Automatic");
        Car obj2 = new Car("Audi", 20, "Auotmatic");
        Car obj3 = new Car("Honda", 5, "Manual");

        System.out.println(obj1.name + " " + obj1.price + " " + obj1.engine);
        System.out.println(obj2.name + " " + obj2.price + " " + obj2.engine);
        System.out.println(obj3.name + " " + obj3.price + " " + obj3.engine);
    }

}
