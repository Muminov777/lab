package com.MNK.lab1;

public class Auto extends Car {

    public Auto(int year, int mileage, int price) {
        super(year, mileage, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Тип: Легковой");
        super.showInfo();
    }
}
