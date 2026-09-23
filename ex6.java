interface RemoteControl {
    void turnOn();
    void turnOff();
}

abstract class Appliance {
    abstract void displayAppliance();
}

class SmartTV extends Appliance implements RemoteControl {

    void displayAppliance() {
        System.out.println("Appliance : Smart TV");
    }

    public void turnOn() {
        System.out.println("Smart TV is turned ON");
    }

    public void turnOff() {
        System.out.println("Smart TV is turned OFF");
    }
}

public class ex6 {
    public static void main(String[] args) {

        Appliance appliance = new SmartTV();

        appliance.displayAppliance();

        RemoteControl remote = new SmartTV();

        remote.turnOn();
        remote.turnOff();
    }
}