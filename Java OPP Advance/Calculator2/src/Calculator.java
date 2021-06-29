
public class Calculator implements Operadores {
	private double var1;
	private double var2;
	private String signo;
	private double resultado;
	private static String[] math = {"+", "-", "*", "/"}; 
	
	public Calculator() {}
	
	//Getters and setters:
	public double getOperandOne() {
		return this.var1;
	}
	
	public void setOperandOne(String operand) {
		this.var1 = Double.parseDouble(operand);
	}
	
	public double getOperandTwo() {
		return this.var2;
	}
	public void setOperandTwo(String operand) {
		this.var2 = Double.parseDouble(operand);
	}
	
	public String getOperation() {
		return this.signo;
	}
	
	public void setOperation(String operation) {
		if (operation.length() > 1) {
			System.out.println("Utilice los parametros setteados por favor");
			return;
		}
		
		else {
			for (int i = 0; i < 4; i++) {
				if (math[i] == operation) {
					this.signo = operation;
				}
			}
		}
	}
	
	@Override
	public void performOperation() {
		 if(this.signo == "+") {
			 this.resultado = (this.var1 + this.var2);
		 }
		 else if(this.signo == "-") {
			 this.resultado = (this.var1 - this.var2);
		 }
		 else if(this.signo == "*") {
			 this.resultado = (this.var1 * this.var2);
		 }
		 else if (this.signo == "/") {
			 this.resultado = (this.var1 / this.var2);
		 }
	 }
	 
	 @Override 
	 public double getResults() {
		 System.out.println("Operacion: " + var1 + " " + signo + " " + var2 + " = " + resultado);
		 return resultado;
	 }
}