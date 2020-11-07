package ru.kpfu.itis.tasks.task_I;

import java.util.Date;

public class Xerox extends Printer {

    public Xerox(Data PRODACTIONDATE, String color, double COST,
        boolean isOn, Model MODEL, String type, int ramSize) {
        super(PRODACTIONDATE, color, COST, isOn, MODEL, type, ramSize);
    }

    public void xeroxPaper() {
        this.scanPaper();
        this.print();
    }

    public void scanPaper() {
        // System.out.println("Scan paper succesfully");
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

    public String getRamSize() {
        return this.ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
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
            this.COST == obj.COST &&
            this.MODEL.equals(MODEL) &&
            this.type = type &&
            this.ramSize = ramSize) {
            return true;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return this.type + " " + this.color + "xerox is " + (this.isOn) ? "on" : "off";
    }
}