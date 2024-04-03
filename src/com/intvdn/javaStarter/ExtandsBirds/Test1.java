package com.intvdn.javaStarter.ExtandsBirds;

public class Test1 {
    public static void main(String[] args) {
        Ostrich ostrich = new Ostrich();
        Penguin penguin = new Penguin();

        ostrich.setName("Ostrich");
        ostrich.setFly(false);
        ostrich.setKingdom("Animals");
        ostrich.setHotBlooded(false);
        ostrich.setRun(true);
        ostrich.setSwim(false);
        ostrich.setWeight(145);
        ostrich.setHeight(2.5);
        ostrich.setCategory("Herbivores");
        ostrich.setToLayEggs(true);
        ostrich.PrintINFo();
        System.out.println("*************************");

        penguin.setName("Aptenodytes");
        penguin.setFly(false);
        penguin.setKingdom("Animals");
        penguin.setHotBlooded(false);
        penguin.setRun(true);
        penguin.setSwim(true);
        penguin.setFamily("Spheniscidae");
        penguin.setResidenceArea("Antarktida");
        penguin.PrintInfo();
    }
}
