public class Bike extends Vehicle{
    public Bike(String name, int speed) {
        super(name, speed);
    }

    @Override
    void displayinfo() {
        System.out.println("Bike Name: " + getName() + ", Speed: " + getSpeed() + "km / h");
    }
}
