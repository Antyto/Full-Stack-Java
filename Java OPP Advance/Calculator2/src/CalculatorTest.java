public class CalculatorTest {
	public static void main(String[] args) {
		Calculator suma = new Calculator();
		Calculator resta = new Calculator();
		Calculator multiplicacion = new Calculator();
		Calculator division = new Calculator();
		
		suma.setOperandOne("2.2");
		suma.setOperandTwo("2.9");
		suma.setOperation("+");
		suma.performOperation();
		suma.getResults();
		System.out.println();

		resta.setOperandOne("-9.5");
		resta.setOperandTwo("12");
		resta.setOperation("-");
		resta.performOperation();
		resta.getResults();
		System.out.println();
		
		multiplicacion.setOperandOne("15");
		multiplicacion.setOperandTwo("40");
		multiplicacion.setOperation("*");
		multiplicacion.performOperation();
		multiplicacion.getResults();
		System.out.println();
		
		division.setOperandOne("500");
		division.setOperandTwo("3.5");
		division.setOperation("/");
		division.performOperation();
		division.getResults();
		System.out.println();
		
	}

}
