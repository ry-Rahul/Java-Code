class car {
    public void start() {
        System.out.println("car started");
    }

    public void accelerate() {
        System.out.println("car is Accelerated");
    }

    public void changeGear() {
        System.out.println("Car Gear Change");
    }
}
class luxaryCar extends car {
    

    public void changeGear() {
        System.out.println("Automatic gear");
    }
    public void openRoof() {
        System.out.println("Sun Roof is opened");
    }
}
public class overridingCAr {
    public static void main(String[] args) {
        car c = new luxaryCar();
        c.start();
        c.accelerate();
        c.changeGear();
        // c.openRoof();
    }
}
