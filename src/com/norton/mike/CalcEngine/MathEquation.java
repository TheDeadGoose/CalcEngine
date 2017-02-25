package com.norton.mike.CalcEngine;

/**
 * Created by NortonM on 22/02/2017.
 */
public class MathEquation {
    private char opCode = 'a';
    private double leftVal, rightVal, result;

    public double getLeftVal() {return leftVal;}
    public void setLeftVal(double leftVal) {this.leftVal = leftVal;}
    public double getRightVal() {return rightVal;}
    public void setRightVal(double rightVal) {this.rightVal = rightVal;}
    public char getOpcode() {return opCode;}
    public void setOpCode(char opCode) {this.opCode = opCode;}
    public double getResult() {return result;}


    public MathEquation() {}

    public MathEquation(char opCode){
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public void execute (double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        execute();
    }


    public void execute (int leftVal, int rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        execute();

        result = (int)result;
    }

    public void execute()
    {
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = leftVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error - invalid op code");
                result = 0.0d;
                break;
        }
    }


}
