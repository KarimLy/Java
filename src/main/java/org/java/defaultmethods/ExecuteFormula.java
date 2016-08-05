package org.java.defaultmethods;

public class ExecuteFormula {

	public void execute() {
		
		
		Formula formula = new Formula() {

			@Override
			public double calculate(int a) {
				return sqrt(a * 100);
			}
		};
		
		double calculate = formula.calculate(100);     
		double sqrt = formula.sqrt(16);          

		System.out.println("Calculate : "+calculate);
		System.out.println("SQRT : "+sqrt);
	}

}
