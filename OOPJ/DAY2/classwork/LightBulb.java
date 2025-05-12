public class LightBulb {
    // Attributes (State)
    boolean isOn;

    // Behaviors (Methods)
    public void switchOn() {
        isOn = true;
        System.out.println("LightBulb is now ON.");
    }

    public void switchOff() {
        isOn = false;
        System.out.println("LightBulb is now OFF.");
    }

    public void checkStatus() {
        if (isOn) {
            System.out.println("The LightBulb is currently ON.");
        } else {
            System.out.println("The LightBulb is currently OFF.");
        }
    }

    public static void main(String[] args) {
        LightBulb bulb = new LightBulb();
        bulb.switchOn();
        bulb.checkStatus();
        bulb.switchOff();
        bulb.checkStatus();
    }
}
