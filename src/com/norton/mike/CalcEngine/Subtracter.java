package com.norton.mike.CalcEngine;

/**
 * Created by NortonM on 23/02/2017.
 */
public class Subtracter extends CalculateBase {
    Subtracter(){}

    Subtracter(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double value = getLeftVal() - getRightVal();
        setResult(value);
    }
}
