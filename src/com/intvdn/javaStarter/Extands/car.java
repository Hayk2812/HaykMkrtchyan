//Parent class || super class;

package com.intvdn.javaStarter.Extands;

public class car {
    private String name;
    private int year;
    private String model;
    private String Type;
   private double  motor;
    private String gearBox;  // poxancumatup
    private int runOut;      // vazq
    private String steeringWheel;  // xek
   private boolean clearedCustoms;  // maksazertvat

    private String color;

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return Type;
    }

    public void setType(String bodyType) {
        this.Type = bodyType;
    }

    public boolean isClearedCustoms() {
        return clearedCustoms;
    }

    public void setClearedCustoms(boolean clearedCustoms) {
        this.clearedCustoms = clearedCustoms;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = gearBox;
    }

    public int getRunOut() {
        return runOut;
    }

    public void setRunOut(int runOut) {
        this.runOut = runOut;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public String getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo(){
        System.out.println("Name;" + name);
        System.out.println("Year;" + year);
        System.out.println("Model;" + model);
        System.out.println("Type;" + Type);
        System.out.println("Mator;" + motor);
        System.out.println("GearBox;" + gearBox);
        System.out.println("RunOut;" + runOut);
        System.out.println("SteeringWheel;" + steeringWheel);
        System.out.println("ClearedCustoms;" + (clearedCustoms== true ? "Yes" : "No"));
        System.out.println("Color;" + color);
        System.out.println("Price;" + price);
    }
}


