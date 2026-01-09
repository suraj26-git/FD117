package MyPackage;

public class Car {
       
	Engine engine;   // Engine is a field of Car (HAS-A relationship)

    Car(Engine engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
    
    public static void main(String[] args) {

        Engine e = new Engine();
        Car c = new Car(e);

        c.drive();
    }
}
