package com.intvdn.javaStarter.House;

public class test3house {
    public static void main(String[] args) {
        house house = new house();
        house.type = "Թաունհաուս";
        house.street = "Բյուզանդի փողոց";
        house.value = "120.000 $";
        house.condition = "Կառուցված";
        house.buildingType = "Քարե";
        house.totalArea = "220 s.m";
        house.numbersOFfloors = 2;
        house.numbersOFbathroom = 3;
        house.furniture = false;
        house.repair = "Չվերանորոգված";
        house.garage = "1 տեղ";
        house.landArea = "80 s.m";

        System.out.println(house.type);
        System.out.println(house.street);
        System.out.println(house.value);
        System.out.println(house.condition);
        System.out.println(house.buildingType);
        System.out.println(house.totalArea);
        System.out.println(house.numbersOFfloors);
        System.out.println(house.numbersOFbathroom);
        System.out.println(house.furniture);
        System.out.println(house.repair);
        System.out.println(house.garage);
        System.out.println(house.landArea);
    }
}

