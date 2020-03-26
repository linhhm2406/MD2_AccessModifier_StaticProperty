public class Car {
    private int id;
    private String name;
    private String engine;

    public static int numberOfCars;

    public Car(int id, String name, String engine){
        this.id = id;
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    void displayCars(){
        System.out.printf("%-5d%-10s%-10s\n",id,name,engine);
    }

    static void displayNumberOfCar(){
        System.out.println("Number of Car : " + numberOfCars);
    }
}
