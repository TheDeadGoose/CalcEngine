package com.norton.mike.CalcEngine;

public class Main {

	public static void main(String[] args) {

		//useOverload();
		//useInheritance();
		String[] statements = {
				"divide 100.0 50.0",
				"add 25.0 92.0",
				"subtract 225.0 17.0",
				"multiply 11.0 3.0"
		};

		CalculateHelper helper = new CalculateHelper();
		for(String statement:statements) {
			helper.process(statement);
			System.out.println(helper);
		}


	}

		public void useOverload() {
			//char[] opCodes = {'d', 'a', 's', 'm'};
			//double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d},
			//		rightVals = {50.0d, 92.0d, 17.0d, 3.0d},
			//		results = new double[opCodes.length];

			//double val1 = 100, val2 = 50, result;
			//char opCode = 'd';

			MathEquation[] equations = new MathEquation[4];
			equations[0] = new MathEquation('d', 100.0d, 50.0d);
			equations[1] = new MathEquation('a', 25.0d, 92.0d);
			equations[2] = new MathEquation('s', 225.0d, 17.0d);
			equations[3] = new MathEquation('m', 11.0d, 3.0d);


			for (MathEquation equation : equations) {
				equation.execute();
				System.out.print("Result = ");
				System.out.println(equation.getResult());
			}

			System.out.println();
			System.out.println("Using Overloads");
			System.out.println();

			double leftDouble = 9.0d, rightDouble = 4.0d;
			int leftInt = 9, rightInt = 4;

			MathEquation equationOverload = new MathEquation('d');
			equationOverload.execute(leftDouble, rightDouble);

			System.out.print("result=");
			System.out.println(equationOverload.getResult());

			equationOverload.execute(leftInt, rightInt);

			System.out.print("result=");
			System.out.println(equationOverload.getResult());



			equationOverload.execute(leftDouble, rightInt);

			System.out.print("result=");
			System.out.println(equationOverload.getResult());

		}

		public void useInheritance(){
		System.out.println();
		System.out.println("Using inheritance");
		System.out.println();

		CalculateBase[] calculators = {
				new Divider(100.0d, 50.0d),
				new Adder(25.0d, 92.0d),
				new Subtracter(225.0d, 17.0d),
				new Multiplier(11.0d, 3.0d)
		};

		for(CalculateBase calculator:calculators){
			calculator.calculate();
			System.out.print("result =");
			System.out.println(calculator.getResult());
		}
	}




//	public static MathEquation create(double leftVal, double rightVal, char opCode) {
//		MathEquation equation = new MathEquation();
//		equation.setLeftVal(leftVal);
//		equation.setRightVal(rightVal);
//		equation.setOpCode(opCode);
//
//		return equation;
//	}
}
