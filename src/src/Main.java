public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyata",120);
        Vehicle Bike = new Bike("Yamaha",80);

        car.start();
        car.displayinfo();
        Bike.start();
        Bike.displayinfo();
    }
}