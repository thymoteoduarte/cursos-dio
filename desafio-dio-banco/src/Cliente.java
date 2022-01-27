
public class Cliente {
	
	private String nome;
	private String telefone;
	private String cpf;
	private Endereco endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	protected void imprimirCadastro() {
		System.out.println("=== CADASTRO CLIENTE ===");
		System.out.println("Nome: "+nome);
		System.out.println("CPF: "+cpf);
		System.out.println("Telefone: "+telefone);
		System.out.print("Endereço: ");
		System.out.print(endereco.getTipoEndereco()+" ");
		System.out.print(endereco.getLogradouro()+",");
		System.out.print(endereco.getNumero()+" - ");
		System.out.print(endereco.getBairro()+" / ");
		System.out.print("CEP "+endereco.getCep());
	}
	
}
