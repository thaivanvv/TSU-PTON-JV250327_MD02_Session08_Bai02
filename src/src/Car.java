public class Car extends Vehicle{
    public Car(String name, int speed) {
        super(name,speed);
    }

    @Override
    void displayinfo() {
        System.out.println("Car Name: " + getName() + ", Speed: " + getSpeed() + "km / h");
    }
}
