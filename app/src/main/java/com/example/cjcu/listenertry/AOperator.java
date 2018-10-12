package com.example.cjcu.listenertry;

public abstract class AOperator {
    protected double num_A;
    protected double num_B;

    public AOperator(){
        this.num_A = 0;
        this.num_B = 0;
    }
    public void setNum_A(double num_A){
        this.num_A = num_A;
    }

    public void setNum_B(double num_B){
        this.num_B = num_B;
    }

    public void setNumbers(double num_A,double num_B){
        setNum_A(num_A);
        setNum_B(num_B);
    }

    public abstract double getAns() throws DivisionException;
}
