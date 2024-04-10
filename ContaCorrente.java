public class ContaCorrente {
	
	private int numerodaconta;
	private double saldo;
	
	public ContaCorrente(int n, double s) {
		this.numerodaconta = n;
		this.saldo = s;
	}
	
	public double getsaldo() {
		return saldo;
	}
	
	public void setsaldo(double s) {
		this.saldo = s;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;	
		} else {
			System.out.println("Saldo insufuciente");
		}	
	}
		public String toString() {
			return "\nConta: " + numerodaconta+
					"\nSaldo: R$ " + saldo;
		}
}	
