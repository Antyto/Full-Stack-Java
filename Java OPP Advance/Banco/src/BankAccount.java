
import java.util.Random;

public class BankAccount {
	
	private String numeroCuenta;
	private double cuentaCorriente;
	private double cuentaAhorro;
	
	public static int cuentasCreadas;
	public static int cantidadDineroAlmacenado;
	private static Random aleatorio = new Random();
	
	private static String numAleatorio() {
		return Integer.toString(aleatorio.nextInt((1000000000)+1000000000));
	}
	
	public BankAccount() {
		this.numeroCuenta = BankAccount.numAleatorio();
		this.cuentaCorriente = 0;
		this.cuentaAhorro = 0;
		cuentasCreadas++;
		
	}
	
	public BankAccount(double corriente, double ahorro) {
		this.numeroCuenta = BankAccount.numAleatorio();
		this.cuentaCorriente = corriente;
		this.cuentaAhorro = ahorro;
		cuentasCreadas++;
		cantidadDineroAlmacenado +=(this.cuentaCorriente + this.cuentaAhorro);
	}
	
	
	public double getCuentaCorriente() {
		return cuentaCorriente;
	}
	
	public void setCuentaCorriente(double corriente) {
		this.cuentaCorriente = corriente;
	}
	

	public double getCuentaAhorro() {
		return cuentaAhorro;
	}
	public void setCuentaAhorro(double ahorro) {
		this.cuentaAhorro = ahorro;
	}
	
	
	public void depositoCtas(double deposito, String cuenta) {
		if (cuenta == "corriente" || cuenta == "check") {
			this.cuentaCorriente += deposito;
			cantidadDineroAlmacenado += deposito;
			System.out.println("El dinero depositado es de $ " + deposito + " en la cuenta n°" + this.numeroCuenta);
		}
		else if (cuenta =="ahorro" || cuenta == "save") {
			this.cuentaAhorro += deposito;
			cantidadDineroAlmacenado += deposito;
			System.out.println("El dinero depositado es de $ " + deposito + " en la cuenta n°" + this.numeroCuenta);
		}
		else {
			System.out.println("Nada que decir");
		}
	}
	
	
	public void giroDinero(double giro, String cuenta) {
		if (cuenta == "corriente" || cuenta == "check") {
			if (giro <= this.cuentaCorriente) {
				this.cuentaCorriente -= giro;
				cantidadDineroAlmacenado -= giro;
				System.out.println("El dinero retirado es de $" + giro + " desde la cuenta n°" + this.numeroCuenta);
			}
			else {
				System.out.println("Saldo insuficiente :(");
				System.out.println("Su saldo es de $" + this.getCuentaCorriente());
			}
		}
		else if (cuenta == "savingBalance" || cuenta == "save") {
			if (giro <= this.cuentaAhorro) {
				this.cuentaAhorro -= giro;
				cantidadDineroAlmacenado -= giro;
				System.out.println("Usted ha girado un monto de " + giro + " desde la cuenta n°" + this.numeroCuenta);
			}
			else {
				System.out.println("Oh dear, your saving account has not enough funds to proceed :(");
				System.out.println("Your saving account balance is: $" + this.getCuentaAhorro());
			}
		}
		else {
			System.out.println ("No tiene saldo");
		}
	}
	

	public void saldoBanco() {
		System.out.println("El saldo en banco es de $" + (this.getCuentaCorriente() + this.getCuentaAhorro()));
	}
	
}


