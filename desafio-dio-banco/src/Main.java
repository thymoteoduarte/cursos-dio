
public class Main {

	public static void main(String[] args) {
		Cliente thymoteo = new Cliente();
		thymoteo.setNome("Thymoteo Duarte");
		thymoteo.setTelefone("99999-0000");
		thymoteo.setCpf("012.345.678-99");
		thymoteo.setEndereco(new Endereco("Rua", "John Pi", "75", "Centro", "55555-000"));
		
		Conta cc = new ContaCorrente(thymoteo);
		Conta cp = new ContaPoupanca(thymoteo);
		
		cp.depositar(999);
		cp.transferir(199, cc);
		
		cc.imprimirExtrato();
		System.out.println();
		cp.imprimirExtrato();
		System.out.println();
		
		cp.pagamento(200);
		cc.pagamento(99);
		
		cc.imprimirExtrato();
		System.out.println();
		cp.imprimirExtrato();
		System.out.println();
		
		thymoteo.imprimirCadastro();
	}

}
