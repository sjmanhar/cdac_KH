public class Car {
    // Attributes (State)
    int litersOfGas;
    int kilometersRun;
    double efficiency; // km per liter

    // Constructor
    public Car(int gas, double efficiency) {
        this.litersOfGas = gas;
        this.efficiency = efficiency;
        this.kilometersRun = 0;
    }

    // Behaviors (Methods)
    public void drive(int distance) {
        if (litersOfGas * efficiency >= distance) {
            kilometersRun += distance;
            litersOfGas -= distance / efficiency;
            System.out.println("Car drove " + distance + " km. Gas left: " + litersOfGas + " liters.");
        } else {
            System.out.println("Not enough gas to drive " + distance + " km.");
        }
    }

    public void loadGas(int gas) {
        litersOfGas += gas;
        System.out.println("Added " + gas + " liters of gas. Total gas: " + litersOfGas + " liters.");
    }

    public void checkOdometer() {
        System.out.println("Car has run " + kilometersRun + " km.");
    }

    public static void main(String[] args) {
        Car car = new Car(10, 15); // 10 liters of gas, 15 km per liter efficiency
        car.drive(50);
        car.loadGas(5);
        car.checkOdometer();
    }
}
