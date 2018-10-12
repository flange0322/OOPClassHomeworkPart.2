package com.example.cjcu.listenertry;

public class OperatorFactory {

    public static AOperator create(String oper){
        AOperator ao = null;
        switch (oper){
            case "+":
                ao = new Add();
                break;
            case "-":
                ao = new Sub();
                break;
            case "*":
                ao = new mul();
                break;
            case "/":
                ao = new division();
                break;
            default:
                break;
        }
        return ao;
    }
}
