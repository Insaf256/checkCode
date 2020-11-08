import java.util.Date;
import java.util.Objects;

public class PoweredDevice {
    protected final Date PRODACTIONDATE;
    protected boolean isOn;
    protected String color;
    protected final double COST;

    public PoweredDevice(Date PRODACTIONDATE, String color, 
        double COST, boolean isOn) {
        this.PRODACTIONDATE = PRODACTIONDATE;
        this.color = color;
        this.COST = COST;
        this.isOn = isOn;
    }

    public void onOff () {
        this.isOn = !isOn;
    }

    public boolean getIsOn() {
        return this.isOn;
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
        PoweredDevice object = (PoweredDevice) obj;
        return  this.PRODACTIONDATE != null &&
                this.PRODACTIONDATE.equals(object.PRODACTIONDATE) &&
                this.color != null &&
                this.color.equals(object.color) &&
                this.COST == object.COST;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), PRODACTIONDATE, color, COST, isOn);
    }

    @Override
    public String toString() {
        String str = (this.isOn) ? "on" : "off";
        return this.color + " device is " + str;
    }
}