package com.example.cjcu.listenertry.priceCalculator;

public class CashRandom extends CashSuper {

    @Override
    public double acceptCash(double money) {
        double random = Math.random()*100+1;
        if(random <10)
            return 0;
        else if(random <30)
            return money * 0.3;
        else if(random <50)
            return money *0.9;
        else
            return money;
    }
}
