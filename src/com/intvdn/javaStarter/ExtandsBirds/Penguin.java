package com.intvdn.javaStarter.ExtandsBirds;

public class Penguin extends Birds {
    private String family;
    private String residenceArea;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getResidenceArea() {
        return residenceArea;
    }

    public void setResidenceArea(String residenceArea) {
        this.residenceArea = residenceArea;
    }

    public void PrintInfo(){
        super.printInfo();
        System.out.println("Famyly;" + " " + family);
        System.out.println("ResidenceArea;" + " " +  residenceArea);
    }
}
