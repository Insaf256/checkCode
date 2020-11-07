package ru.kpfu.itis.tasks.task_I;

import java.util.Date;

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

    /*public PoweredDevice(Date PRODACTIONDATE, String color, double COST) {
        this(PRODACTIONDATE, color, COST, false);
    }*/

    public boolean getIsOn() {
        return this.isOn;
    }

    public void onOff () {
        this.isOn = !isOn;
    }

    public boolean getProdactionDAte() {
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
        if (this.PRODACTIONDATE == obj.PRODACTIONDATE &&
            this.color == obj.color &&
            this.COST == obj.COST) {
            return true;
        }

    }

    @Override
    public int hashCode() {
        int result = Object.hash(PRODACTIONDATE, color, COST);
        if (getIsOn) {
            result += 1;
        }
        return result;
    }

    @Override
    public String toString() {
        return this.color + "device is " + (this.isOn) ? "on" : "off";
    }
}