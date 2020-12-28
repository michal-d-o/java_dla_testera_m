package zadanie_06;

public class Pecet extends Comp {

    private boolean powerSupply;

    public Pecet(String name, String type, int disc, int ram, boolean powerSupply) {
        super(name, type, disc, ram);
        this.powerSupply = powerSupply;
    }


    public int volumeUp() {
        return volumeLevel += 1;
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
        volumeLevel -= 1;
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

    public void setPowerSupply(boolean newPowerSupply) {
        powerSupply = newPowerSupply;
    }

    public void showPCName() {
        System.out.println("PC: " + name);
    }

    @Override
    public void switchOn() {
        System.out.println("PC - Checking power supply");
        if (powerSupply == true) {
            super.switchOn();
        } else {
            System.out.println("Warning - the power supply is not connected!");
        }
    }

    @Override
    public void switchOff() {
        System.out.println("PC name: " + name);
        state = false;
    }

}
