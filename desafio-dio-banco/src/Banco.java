import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nome;
	private List<Conta> contas = new ArrayList<Conta>();

	
	public Banco(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void addContas(Conta conta) {
		contas.add(conta);
	}
	
	public void imprimirContas(Banco banco) {
		System.out.println("\n=========== "+banco.getNome()+" ===========");
		System.out.println("=== LISTA DE CONTAS DO BANCO ===");
		for(int i=0;i<contas.size();i++){
		    System.out.println("AGENCIA: "+contas.get(i).getAgencia());
		    System.out.println("CONTA: "+ contas.get(i).getNumero());
		    System.out.println("--------------------------------");
		}
	}

}
