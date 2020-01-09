package com.MNK.lab1;

public class NissanMicra extends Hatchback {

    public NissanMicra(int year, int mileage, int price) {
        super(year, mileage, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Модель: NissanMicra");
        super.showInfo();
    }
}
