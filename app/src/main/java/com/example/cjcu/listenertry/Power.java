package com.example.cjcu.listenertry;

public class Power extends AOperator {

    public Power(){
        super();
    }

    @Override
    public double getAns(){
        return Math.pow(num_A,num_B);
    }
}
