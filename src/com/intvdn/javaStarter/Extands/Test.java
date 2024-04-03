package com.intvdn.javaStarter.Extands;

public class Test {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        Maybach maybach = new Maybach();
        Urus urus = new Urus();

        bmw.setName("BMW");
        bmw.setYear(2019);
        bmw.setModel("X7");
        bmw.setType("SUV");
        bmw.setMotor(3.0);
        bmw.setGearBox("Automat");
        bmw.setRunOut(22500);
        bmw.setSteeringWheel("Dzax");
        bmw.setClearedCustoms(true);
        bmw.setColor("Black");
        bmw.setPrice(94000);
        bmw.setWheelSizes("R21");
        bmw.setHeadlights("Ksenon");
        bmw.setTheColorOfTheHall("gray");
        bmw.prinTInfo();
        System.out.println("************");

        maybach.setName("Maybach");
        maybach.setYear(2017);
        maybach.setModel("Maybach S-Class");
        maybach.setType("Sedan");
        maybach.setMotor(4.7);
        maybach.setGearBox("Automat");
        maybach.setRunOut(94000);
        maybach.setSteeringWheel("Dzax");
        maybach.setClearedCustoms(true);
        maybach.setColor("Black");
        maybach.setPrice(87000);
        maybach.setCompany("Subsidiary (GmbH)");
        maybach.setFounder("Wilhelm Maybach");
        maybach.setSuccessor("Mercedes-Maybach");
        maybach.setHeadquarters("Stuttgart, Germany");
        maybach.setProducts("Luxury vehicles");
        maybach.printINfo();
        System.out.println("***********");


       urus.setName("Lamburghini");
       urus.setYear(2023);
       urus.setModel("Urus");
       urus.setType("Suv");
       urus.setMotor(4.0);
       urus.setGearBox("Automat");
       urus.setRunOut(9400);
       urus.setSteeringWheel("Dzax");
       urus.setClearedCustoms(true);
       urus.setColor("whithe");
       urus.setPrice(306000);
       urus.setManufacturer("Lamborghini");
       urus.setDesigner("Filippo Perini && Mitja Borkert ");
       urus.setPlatform("Volkswagen Group MLB Evo");
       urus.setWheelbase(3.002);
       urus.setLength(5.113);
       urus.setWidth(2.017);
       urus.setHeight(1.638);
       urus.PrintInfo();


    }
}
