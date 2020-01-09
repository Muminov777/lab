package com.MNK.lab1;

public class Hatchback extends Auto {

    public Hatchback(int year, int mileage, int price) {
        super(year, mileage, price);
    }

    @Override
    public void showInfo() {
        System.out.println("Тип кузова: Хетчбэк");
        super.showInfo();
    }
}
