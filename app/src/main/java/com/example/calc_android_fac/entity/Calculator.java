package com.example.calc_android_fac.entity;

public class Calculator {

    Double result = null;
    Double firstArg = null;
    Double secondArg = null;
    ArifmeticActions arifmeticActions = ArifmeticActions.EMPTY;


    public Double plus() {
        result = firstArg + secondArg;
        return result;
    }

    public Double mines(Double d) {
        result = firstArg - secondArg;
        return result;
    }

    public Double multiply(Double d) {
        result = firstArg * secondArg;
        return result;
    }

    public Double divide(Double d) {
        result = firstArg / secondArg;
        return result;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public Double getFirstArg() {
        return firstArg;
    }

    public void setFirstArg(Double firstArg) {
        this.firstArg = firstArg;
    }

    public Double getSecondArg() {
        return secondArg;
    }

    public void setSecondArg(Double secondArg) {
        this.secondArg = secondArg;
    }

    public ArifmeticActions getArifmeticActions() {
        return arifmeticActions;
    }

    public void setArifmeticActions(ArifmeticActions arifmeticActions) {
        this.arifmeticActions = arifmeticActions;
    }

    public void eq() {
        switch (arifmeticActions) {
            case PLUS:
                result = firstArg + secondArg;
                break;
            case MINUS:
                result = firstArg - secondArg;
                break;
            case MULTIPLY:
                result = firstArg * secondArg;
                break;
            case DIVIDE:
                result = firstArg / secondArg;
                break;
        }

        firstArg = 0 + result;
        secondArg = null;
        arifmeticActions = ArifmeticActions.EMPTY;
        System.out.println();
    }
}
