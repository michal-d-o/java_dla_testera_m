package zadanie_05;

import java.util.Objects;

public class Computer {

    protected String name;
    protected String type;
    protected HDD disc;
    protected RAM ram;
    protected boolean state;

    public Computer(String name, String type, HDD disc, RAM ram) {
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

    public HDD getDisc() {
        return disc;
    }

    public void setDisc(HDD disc) {
        this.disc = disc;
    }

    public RAM getRam() {
        return ram;
    }

    public void showRamSize() {
        System.out.println(ram.getSize());
    }


    public void setRam(RAM ram) {
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

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", disc=" + disc +
                ", ram=" + ram +
                ", state=" + state +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return state == computer.state &&
                Objects.equals(name, computer.name) &&
                Objects.equals(type, computer.type) &&
                Objects.equals(disc, computer.disc) &&
                Objects.equals(ram, computer.ram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, disc, ram, state);
    }
}
