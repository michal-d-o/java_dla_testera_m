package zadanie_06;

public class Lapek extends Comp {

    private int batteryLevel;

    public Lapek(String name, String type, int disc, int ram, int batteryLevel) {
        super(name, type, disc, ram);
        this.batteryLevel = batteryLevel;
    }

    public int volumeUp() {
        return volumeLevel += 5;
    }

    @Override
    public int volumeUp(int up) {
        volumeLevel += up;
        if (volumeLevel >= 100) {
            return volumeLevel = 100;
        } else {
            if (volumeLevel <= 0) {
                return volumeLevel = 0;
            } else {
                return volumeLevel;
            }
        }
    }


    @Override
    public int volumeDown() {
        volumeLevel -= 2;
        if (volumeLevel <= 0) {
            return volumeLevel = 0;
        } else {
            return volumeLevel;
        }
    }


    @Override
    public int volumeDown(int down) {
        volumeLevel -= down;
        if (volumeLevel <= 0) {
            return volumeLevel = 0;
        } else {
            return volumeLevel;
        }
    }

    // other methods:
    @Override
    public void switchOn() {
        System.out.println("Laptop - Checking battery level");
        if (batteryLevel > 0) {
            super.switchOn();
        } else {
            System.out.println("Battery level is too low!");
        }

    }

    @Override
    public void switchOff() {
        System.out.println("Laptop name: " + name);
        state = false;
    }

    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;
    }
}
