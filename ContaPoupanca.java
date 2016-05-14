package Conta;

public class ContaPoupanca implements Conta {
	
	private double saldo;

	public void sacar(double valor) {
		this.saldo -= valor;
	}

	public void depositar(double valor) {
		this.saldo += valor;
		
	}

	public double getSaldo() {
		return this.saldo;
	}

}