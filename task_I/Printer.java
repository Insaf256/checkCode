import java.util.Date;
import java.util.Objects;

public class Printer extends PoweredDevice {
    protected int ramSize;
    protected final Model MODEL;
    protected String type; //laser or струйный or... 

    public Printer(Date PRODACTIONDATE, String color, double COST,
        boolean isOn, Model MODEL, String type, int ramSize) {
        super(PRODACTIONDATE, color, COST, isOn);
        this.MODEL = MODEL;
        this.type = type;
        this.ramSize = ramSize;
    }

    public void print (String str) {
        System.out.print(str);
    }

    public boolean getIsOn() {
        return this.isOn;
    }

    public void onOff () {
        this.isOn = !isOn;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRamSize() {
        return this.ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public Date getProdactionDAte() {
        return this.PRODACTIONDATE;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCost() {
        return this.COST;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Printer object = (Printer) obj;
        return  this.PRODACTIONDATE != null &&
                this.PRODACTIONDATE.equals(object.PRODACTIONDATE) &&
                this.color != null &&
                this.color.equals(object.color) &&
                this.COST == object.COST &&
                this.MODEL != null &&
                this.MODEL.equals(object.MODEL) &&
                this.type != null &&
                this.type.equals(object.type) &&
                this.ramSize == object.ramSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), MODEL.hashCode(), type, ramSize);
    }

    @Override
    public String toString() {
        String str = (this.isOn) ? "on" : "off";
        return this.type + " " + this.color + " printer is " + str;
    }
}
