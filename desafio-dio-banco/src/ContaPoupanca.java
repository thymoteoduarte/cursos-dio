
public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato(Banco banco) {
		System.out.println("********** "+banco.getNome()+" **********");
		System.out.println("*** Extrato Conta Poupança ***");
		super.imprimirInfosComuns();
	}
}
