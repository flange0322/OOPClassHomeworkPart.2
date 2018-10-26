package com.example.cjcu.listenertry.Calculator;

public class Sub extends AOperator {

    public Sub(){
        super();
    }

    @Override
    public double getAns() {
        return num_A-num_B;
    }
}
