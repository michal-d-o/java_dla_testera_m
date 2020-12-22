package zadanie_05;

public class PC extends Computer{

    private boolean powerSupply;

    public PC(String name, String type, int disc, int ram, boolean powerSupply) {
        super(name, type, disc, ram);
        this.powerSupply = powerSupply;
    }

    public void setPowerSupply(boolean newPowerSupply) {
        powerSupply = newPowerSupply;
    }


    @Override
    public void switchOn() {
        System.out.println("PC - Checking power supply");
        if(powerSupply == true){
            super.switchOn();
        } else {
            System.out.println("Warning - the power supply is not connected!");
        }

    }
}
