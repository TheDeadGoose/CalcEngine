package com.norton.mike.CalcEngine;

/**
 * Created by NortonM on 23/02/2017.
 */
public abstract class CalculateBase {
    private double leftVal, rightVal, result;

    public double getLeftVal(){ return leftVal;}
    public double getRightVal(){return rightVal;}
    public double getResult(){return result;}
    public void setLeftVal(double leftVal){
        this.leftVal = leftVal;
    }
    public void setRightVal(double rightVal){
        this.rightVal = rightVal;
    }
    public void setResult(double result){
        this.result = result;
    }
    CalculateBase(){}


    CalculateBase(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public abstract void calculate();

}
