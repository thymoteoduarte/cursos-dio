
public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato(Banco banco) {
		System.out.println("********** "+banco.getNome()+" **********");
		System.out.println("*** Extrato Conta Corrente ***");
		super.imprimirInfosComuns();
		
	}	
}
