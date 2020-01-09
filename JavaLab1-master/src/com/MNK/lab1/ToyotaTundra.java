package com.MNK.lab1;

public class ToyotaTundra extends Pickup {

    public ToyotaTundra(int year, int mileage, int price) {
        super(year, mileage, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Модель: ToyotaTundra");
        super.showInfo();
    }
}
