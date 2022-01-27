
public class Endereco {
	
	private String tipoEndereco;
	private String logradouro;
	private String numero;
	private String bairro;
	private String cep;
	
	public Endereco(String tipoEndereco, String logradouro, String numero, String bairro, String cep) {
		super();
		this.tipoEndereco = tipoEndereco;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
	}
	
	public String getTipoEndereco() {
		return tipoEndereco;
	}
	public void setTipoEndereco(String tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	

}
