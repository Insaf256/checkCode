import java.util.Date;
import java.util.Objects;

public class Xerox extends Printer {
    private boolean connectByWifi; //есть ли такая возможность?

    public Xerox(Date PRODACTIONDATE, String color, double COST,
        boolean isOn, Model MODEL, String type, int ramSize, boolean connectByWifi) {
        super(PRODACTIONDATE, color, COST, isOn, MODEL, type, ramSize);
        this.connectByWifi = connectByWifi;
    }

    public void xeroxPaper() {
        this.scanPaper();
        this.print(" ");
    }

    public void scanPaper() {
        // System.out.println("Scan paper succesfully");
    }


    public boolean isConnectByWifi() {
        return connectByWifi;
    }

    public void setConnectByWifi(boolean connectByWifi) {
        this.connectByWifi = connectByWifi;
    }

    @Override
    public boolean equals(Object obj) {
        Xerox object = (Xerox) obj;
        return super.equals(obj) && this.connectByWifi == object.connectByWifi;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.connectByWifi);
    }

    @Override
    public String toString() {
        String str = (this.isOn) ? "on" : "off";
        return this.type + " " + this.color + " xerox is " + str;
    }
}