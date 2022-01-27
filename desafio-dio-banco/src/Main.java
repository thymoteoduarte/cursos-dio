
public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco("Banco DIO");
		
		Cliente thymoteo = new Cliente();
		thymoteo.setNome("Thymoteo Duarte");
		thymoteo.setTelefone("99999-0000");
		thymoteo.setCpf("012.345.678-99");
		thymoteo.setEndereco(new Endereco("Rua", "John Pi", "75", "Centro", "55555-000"));
		
		Conta cc = new ContaCorrente(thymoteo);
		Conta cp = new ContaPoupanca(thymoteo);
		banco.addContas(cc);
		banco.addContas(cp);
		
		cp.depositar(999);
		cp.transferir(199, cc);
		
		cc.imprimirExtrato(banco);
		System.out.println();
		cp.imprimirExtrato(banco);
		System.out.println();
		
		cp.pagamento(200);
		cc.pagamento(99);
		
		cc.imprimirExtrato(banco);
		System.out.println();
		cp.imprimirExtrato(banco);
		System.out.println();
		
		thymoteo.imprimirCadastro();
		
		System.out.println();
		banco.imprimirContas(banco);
	}

}
