abstract class Vehicle {
    private String name;
    private int speed;
    abstract void displayinfo();
    void start(){
        System.out.println("Vehicle starting...");
    }

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
}
