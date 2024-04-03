package com.intvdn.javaStarter.ExtandsBirds;

public class Birds {
    private String name;
    private boolean fly;

    private String kingdom;
    private boolean hotBlooded;

    private boolean run;
    private boolean swim;

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public boolean isHotBlooded() {
        return hotBlooded;
    }

    public void setHotBlooded(boolean hotBlooded) {
        this.hotBlooded = hotBlooded;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    public boolean isSwim() {
        return swim;
    }

    public void setSwim(boolean swim) {
        this.swim = swim;
    }
    public void printInfo() {
        System.out.println("Name;" + " " + name);
        System.out.println("Fly;" +" " + (fly == true? "Yes": "NO"));
        System.out.println("Kingdom;" +" " + kingdom);
        System.out.println("HotBlooded;" +" " + (hotBlooded == true? "Yes" : "No"));
        System.out.println("Run;" + " " +  (run == true? "Yes": "No"));
        System.out.println("Swim;" +" " +  (swim  == true ? "Yes": "No"));
    }
}
