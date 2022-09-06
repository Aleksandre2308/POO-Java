package Entity;

public class Endereco {
	private String cep;			// CEP
	private String rua;			// Rua
	private String bairro; 		// Bairro
	private String complemento; // Complemento
	private String numero;			// Numero

	public Peca() {
		setCep("");
		setRua("");
		setBairro("");
		setComplemento("");
		setNumero("")
	}

	public Peca(String cep, String rua, String bairro, String complemento, String numero) {
		setCep(cep);
		setRua(rua);
		setBairro(bairro));
		setComplemento(complemento);
		setNumero(numero)
	}

	public void setCep(String cep) {
		if (!cep.isBlank() || !cep.isEmpty())
			this.cep = cep;
		else
			this.cep = "n/a";
	}

	public String getCep() {
		return this.cep;
	}

	public void setRua(String rua) {
		if (!rua.isBlank() || !rua.isEmpty())
			this.rua = rua;
		else
			this.rua = "n/a";
	}

	public String getRua() {
		return this.rua;
	}

	public void setBairro(String bairro) {
		if (!bairro.isBlank() || !bairro.isEmpty())
			this.bairro = bairro;
		else
			this.bairro = "n/a";
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setComplemento(String complemento) {
		if (!complemento.isBlank() || !complemento.isEmpty())
			this.complemento = complemento;
		else
			this.complemento = "n/a";
	}

	public String getComplemento() {
		return this.complemento;
	}
	
	public void setNumero(String numero) {
		if (!numero.isBlank() || !numero.isEmpty())
			this.numero = numero;
		else
			this.numero = "n/a";
	}

	public double getNumero() {
		return this.numero;
	}
	
	/*
	 * Ainda n�o sabemos se essa classe ter� outra utilidade fora da classe Cliente 
	*/
	
}
