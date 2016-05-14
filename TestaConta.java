package Conta;

public class TestaConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		cc.depositar(1000);
		cp.depositar(1000);

		cc.sacar(100);
		cp.sacar(100);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());

	}

}