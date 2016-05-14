package Conta;

public class ContaCorrente implements Conta {
	
	private double saldo;
	private double taxaOperacao = 0.50;
	
	public void depositar ( double valor ) {
		this.saldo += valor - this.taxaOperacao ;
	}

	public void sacar ( double valor ) {
		this.saldo -= valor + this. taxaOperacao ;
	}

	public double getSaldo () {
		return this.saldo ;
	}		

}
