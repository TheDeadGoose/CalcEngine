package com.norton.mike.CalcEngine;

/**
 * Created by NortonM on 23/02/2017.
 */
public class Divider extends CalculateBase {
    Divider(){}

    Divider(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate()
    {
        double value = getLeftVal() / getRightVal();
        setResult(value);
    }
}
