package com.example.calc_android_fac.entity;

public class Calculator {

    Double result = 0.0;

    public Double plus(Double d) {
        result += d;
        return result;
    }

    public Double mines(Double d) {
        result -= d;
        return result;
    }

    public Double multiply(Double d) {
        result *= d;
        return result;
    }

    public Double divide(Double d) {
        result /= d;
        return result;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
}
