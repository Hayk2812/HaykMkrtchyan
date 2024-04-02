package com.intvdn.javaStarter.car;

import com.intvdn.javaStarter.car.car;

public class test2car {
    public static void main(String[] args) {
        car car = new car();
        car.name = "Mersedes - Bendz";
        car.model = "S - Class";
        car.bodyType = "Սեդան";
        car.age = 2013;
        car.motor = 5.0;
        car.runOut = 60000;
        car.clearedCustoms = true;
        car.gearBox = "Ավտոմատ";
        car.steeringWheel = "Ձախ";

        System.out.println(car.name);
        System.out.println(car.model);
        System.out.println(car.bodyType);
        System.out.println(car.age);
        System.out.println(car.motor);
        System.out.println(car.runOut);
        System.out.println(car.clearedCustoms);
        System.out.println(car.gearBox);
        System.out.println(car.steeringWheel);

    }
}
