package com.intvdn.javaStarter.Extands;

public class BMW extends car {
    private String wheelSizes;  // Anivneri chapsery
    private String headlights;  // lusardzakner
     private String theColorOfTheHall;  // srahi guyny

    private boolean PanoramicRoof;  // panorama taniq


    public String getHeadlights() {
        return headlights;
    }

    public void setHeadlights(String headlights) {
        this.headlights = headlights;
    }

    public boolean isPanoramicRoof() {
        return PanoramicRoof;
    }

    public void setPanoramicRoof(boolean panoramicRoof) {
        PanoramicRoof = panoramicRoof;
    }

    public String getTheColorOfTheHall() {
        return theColorOfTheHall;
    }

    public void setTheColorOfTheHall(String theColorOfTheHall) {
        this.theColorOfTheHall = theColorOfTheHall;
    }

    public String getWheelSizes() {
        return wheelSizes;
    }

    public void setWheelSizes(String wheelSizes) {
        this.wheelSizes = wheelSizes;
    }

    public void prinTInfo(){
        super.printInfo();
        System.out.println("WhelSizes;" + wheelSizes);
        System.out.println("Headlights;" + headlights);
        System.out.println("TheColorOfTheHall;" + theColorOfTheHall);
        System.out.println("PanoramicRoof;" + (isPanoramicRoof() == true ? "Yes" : "No"));
    }
}