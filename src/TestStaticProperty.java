public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car(1,"Audi","Skyactiv");
        Car car2 = new Car(2,"Mazda","Skyactiv");
        Car car3 = new Car(3,"BMW","Skyactiv");

        car1.displayCars();
        car2.displayCars();
        car3.displayCars();

        Car.displayNumberOfCar();
    }
}
