package com.norton.mike.CalcEngine;

/**
 * Created by NortonM on 23/02/2017.
 */
public class Adder extends CalculateBase {
    Adder(){}

    Adder(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }
}
