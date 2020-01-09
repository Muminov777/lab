package com.MNK.lab1;

public class Hearse extends SpecialCar {

    public Hearse(int year, int mileage, int price) {
        super(year, mileage, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Назначение: Катафалк");
        super.showInfo();
    }
}
