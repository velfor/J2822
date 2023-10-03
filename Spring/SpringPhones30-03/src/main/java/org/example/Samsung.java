package org.example;

public class Samsung implements Phone{
    @Override
    public void makeOutgoingCall() {
        System.out.println("Samsung calling");

    }

    @Override
    public void takeIncomeCall() {
        System.out.println("Samsung taking income call");
    }
}
