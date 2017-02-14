package com.example.myfirstapp;

/**
 * Created by android on 2/13/17.
 */

public class Calculator {
    private int sum;

    public Calculator() {
        sum = 0;
    }

    public int add(int term) {
        sum =+ term;
        return sum;
    }

    public int subtract(int term) {
        sum =- term;
        return sum;
    }

    public void clear() {
        sum = 0;
    }

    public int getSum() {
        return sum;
    }
}
