package Entity;

public class Automovel {
	// Atributos privados
	private Cliente dono;
	private String marca;
	private String modelo;
	private String cor;
	private String placa;
	private int ano;
	private Orcamento orcamentoServico;
	
	// Construtores
	public Automovel(String marca) {
		setMarca(marca);
	}
	
	public Automovel(String marca, String modelo) {
		setMarca(marca);
		setModelo(modelo);
	}
	
	public Automovel(String marca, String modelo, String cor, String placa, int ano) {
		setMarca(marca);
		setModelo(modelo);
		setCor(cor);
		setPlaca(placa);
		setAno(ano);
	}
	
	// Metodos set

	public void setMarca(String marca) {
		if (!marca.isEmpty()) {
			this.marca = marca;
		} else {
			this.marca = "Generica";
		}
	}

	public void setModelo(String modelo) {
		if (!modelo.isEmpty()) {
			this.modelo = modelo;
		} else {
			this.modelo = "Generico";
		}
	}

	public void setCor(String cor) {
		if (!cor.isEmpty()) {
			this.cor = cor;
		} else {
			this.cor = "-";
		}
	}

	public void setPlaca(String placa) {
		if (!placa.isEmpty() && (placa.length() == 7)) {
			this.placa = placa;
		} else {
			this.placa = "-";
		}
	}
	
	public void setAno(int ano) {
		if((ano >= 1971) && (ano <= 2030)) {
			this.ano = ano;
		} else {
			this.ano = 2022;
		}
	}

	public void setDono(Cliente dono) {
		
	}
	
	public void setOrcamento(Orcamento orcamentoServico) {
		
	}
	
	// Metodos get
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	public int getAno() {
		return this.ano;
	}
	
}
