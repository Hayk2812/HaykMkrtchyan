package com.intvdn.javaStarter.Extands;

public class Urus extends car{
    private String manufacturer;
    private String designer;
    private String platform;
    private double wheelbase;
    private double length;
    private double width;
    private double height;



    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public double getWheelbase() {
        return wheelbase;
    }

    public void setWheelbase(double wheelbase) {
        this.wheelbase = wheelbase;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void PrintInfo(){
        super.printInfo();
        System.out.println("Manufacturer;" + manufacturer);
        System.out.println("Manufacturer;" + designer);
        System.out.println("Manufacturer;" + platform);
        System.out.println("Manufacturer;" + wheelbase);
        System.out.println("Manufacturer;" + height);
        System.out.println("Manufacturer;" + length);
        System.out.println("Manufacturer;" + width);
    }
}
