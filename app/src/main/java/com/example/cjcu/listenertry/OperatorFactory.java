package com.example.cjcu.listenertry;

public class OperatorFactory {

    public enum Operator{
        Add,
        Sub,
        Mul,
        Div,
        Pow,
    }
    public static AOperator create(Operator oper){
        AOperator ao = null;
        switch (oper){
            case Add:
                ao = new Add();
                break;
            case Sub:
                ao = new Sub();
                break;
            case Mul:
                ao = new mul();
                break;
            case Div:
                ao = new division();
                break;
            case Pow:
                ao = new Power();
                break;
            default:
                break;
        }
        return ao;
    }
}
