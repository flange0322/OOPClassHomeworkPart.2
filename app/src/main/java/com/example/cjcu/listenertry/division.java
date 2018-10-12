package com.example.cjcu.listenertry;

public class division extends AOperator {

    public division(){
        super();
    }

    public double getAns() throws DivisionException{

        if(num_B == 0) {
            throw new DivisionException();
        }
        return num_A/num_B;
    }
}
