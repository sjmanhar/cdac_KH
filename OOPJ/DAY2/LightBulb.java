public class LightBulb {
	boolean isOn;
	
	public void switchOn(){
		isOn = true;
		System.out.println("Switch on");
	}
	public void switchOff(){
		isOn = false ;
		System.out.println("Switch off");
	}
	
	public void checkStatus() {
        if (isOn) {
            System.out.println("The LightBulb is currently ON.");
        } else {
            System.out.println("The LightBulb is currently OFF.");
        }
    }


public static void main(String[] args){
	LightBulb bulb = new LightBulb();
	 bulb.switchOn();
        bulb.checkStatus();
        bulb.switchOff();
        bulb.checkStatus();