package com.MNK.lab1;

public class ToyotaYaris extends Hatchback {

    public ToyotaYaris(int year, int mileage, int price) {
        super(year, mileage, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Модель: ToyotaYaris");
        super.showInfo();
    }
}
