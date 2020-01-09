package com.MNK.lab1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("======= 8T6B Muminov N. K. =======");

        Car racingCar = new RacingCar(2018, 500, 100000);
        Car hearse = new Hearse(1991, 10000, 5000);
        Car dumpTruck = new DumpTruck(2000, 100000, 30000);
        Car nissanMicra = new NissanMicra(2005, 200000, 15000);
        Car toyotaTundra = new ToyotaTundra(2018, 30000, 50000);

        List<Car> cars = Arrays.asList(racingCar, hearse, dumpTruck, nissanMicra, toyotaTundra);
        for (Car car : cars) {
            car.showInfo();
        }
    }
}