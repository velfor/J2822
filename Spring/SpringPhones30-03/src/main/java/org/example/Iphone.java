package org.example;

public class Iphone implements Phone {
    private Samsung samsung;

    public Iphone(Samsung samsung){
        this.samsung = samsung;
    }

    @Override
    public void makeOutgoingCall() {
        System.out.println("Iphone calling");
        samsung.takeIncomeCall();
    }

    @Override
    public void takeIncomeCall() {
        System.out.println("Iphone taking income call");
    }
}
