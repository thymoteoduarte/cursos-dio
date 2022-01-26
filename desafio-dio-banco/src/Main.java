
public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		cp.depositar(999);
		cp.transferir(199, cc);
		
		cc.imprimirExtrato();
		System.out.println();
		cp.imprimirExtrato();
	}

}
