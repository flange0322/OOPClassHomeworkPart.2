package com.example.cjcu.listenertry.priceCalculator;

public class CashReturn extends CashSuper {

    private int moneycondition = 1;
    private int moneyReturn = 1;

    public CashReturn(int moneycondition,int moneyReturn){
        this.moneycondition = moneycondition;
        this.moneyReturn = moneyReturn;
    }
    @Override
    public double acceptCash(double money) {
        double count = Math.floor(money / moneycondition);
        double result = money - (moneyReturn * count);
        return result;
    }

}
