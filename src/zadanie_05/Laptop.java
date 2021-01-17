package zadanie_05;

public class Laptop extends Computer{

    private int batteryLevel;

    public Laptop(String name, String type, HDD disc, RAM ram, int batteryLevel) {
        super(name, type, disc, ram);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void switchOn(){
        System.out.println("Laptop - Checking battery level");
        if(batteryLevel > 0){
            super.switchOn();
        } else {
            System.out.println("Battery level is too low!");
        }

    }

    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;
    }
}