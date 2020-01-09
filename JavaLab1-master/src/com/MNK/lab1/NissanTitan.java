package com.MNK.lab1;

public class NissanTitan extends Pickup {

    public NissanTitan(int year, int mileage, int price) {
        super(year, mileage, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Модель: NissanTitan");
        super.showInfo();
    }
}
