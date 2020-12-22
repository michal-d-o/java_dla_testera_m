package zadanie_05;

public class Computer {

    protected String name;
    protected String type;
    protected int disc;
    protected int ram;
    protected boolean state;

    public Computer(String name, String type, int disc, int ram) {
        this.name = name;
        this.type = type;
        this.disc = disc;
        this.ram = ram;
        this.state = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDisc() {
        return disc;
    }

    public void setDisc(int disc) {
        this.disc = disc;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void switchOn() {
        System.out.println("Super. State = true");
        state = true;
    }

    public void switchOff() {
        state = false;
    }

    public boolean getState() {
        return state;
    }

}
