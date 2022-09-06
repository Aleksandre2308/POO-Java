package Entity;

import java.time.LocalDate;

public class Servico {
	// Garantia de integridade
	private int idServico;
	private String nome;
	private double preco;
	private LocalDate dataInicialServico;
	private String Status;
	
	// Construtores
	public Servico() {}
	
	public Servico(int idServico, String nome, double preco, LocalDate dataInicialServico) {
		cadastrar(idServico, nome, preco, dataInicialServico);
	}
	
	// Metodos do diagrama
	
	private void cadastrar(int idServico, String nome, double preco, LocalDate dataInicialServico) {
		setIdServico(idServico);
		setNome(nome);
		setPreco(preco);
		setDataInicialServico(dataInicialServico);
	}
	
	
	
	// Metodos set



	public void setIdServico(int idServico) {
		
		this.idServico = idServico;		
	}
	
	public void setNome(String nome) {
		
		if (!nome.isEmpty()) {
			this.nome = nome;
		} else {
			this.nome = "Serviço";
		}
	}

	public void setPreco(double preco) {
		
		this.preco = preco;
	}

	public void setDataInicialServico(LocalDate dataInicialServico) {
		this.dataInicialServico = dataInicialServico;
	}
	
	// Metodos get
	
	public int getIdentificador() {
		
		return idServico;		
	}
	
	public String getNome() {
		
		return nome;
	}

	public double getPreco() {
		
		return preco;
	}

	public LocalDate getDataInicialServico(LocalDate dataInicialServico) {
		return dataInicialServico;
	}
	
	
}