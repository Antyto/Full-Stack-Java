
public class BankAccountTest {
	public static void main (String[] args) {
		
		BankAccount Antonieta = new BankAccount(200.530, 80.645);
		BankAccount Ricardo = new BankAccount(300.150, 120.837);
		BankAccount Sebastian = new BankAccount(150.922, 80.443);
		BankAccount Nicolas = new BankAccount(150.922, 80.452);
		
		Antonieta.saldoBanco();
		Ricardo.saldoBanco();
		Sebastian.saldoBanco();
		Nicolas.saldoBanco();
		System.out.println();
		
		System.out.println("Total de cliente en el banco asciende a:  " + BankAccount.cuentasCreadas);
		System.out.println();
				
		Antonieta.depositoCtas(100.350, "check");
		Ricardo.giroDinero(55.782, "save");
		Sebastian.giroDinero(30.899, "check");
		Nicolas.giroDinero(15.287, "check");
		System.out.println();
		
		Antonieta.saldoBanco();
		Ricardo.saldoBanco();
		Sebastian.saldoBanco();
		Nicolas.saldoBanco();
		System.out.println();
		
		System.out.println("Saldo en banco es de $" + BankAccount.cantidadDineroAlmacenado);
		
	}
}