package Entity;

import java.time.LocalDate;

public class Servico {
	// Garantia de integridade
	private int idServico;
	private String nome;
	private double preco;
	private LocalDate dataInicialServico;
	private String status;
	
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
	
	public void alterar(int idServico, String nome, double preco, LocalDate dataInicialServico) {
		setIdServico(idServico);
		setNome(nome);
		setPreco(preco);
		setDataInicialServico(dataInicialServico);
	}
	
	public void excluir() {
		
	}
	
	public void pesquisarServico(Servico servico){
		
	}
	
	public void finalizarServico() {
		status = "Serviço Finalizado";
	}
	
	public void registrarPagamento(double quantia){
		
		if(quantia == preco) {
			status = "Aprovado";
		}else {
			status = "Pendencia no pagamento";
			preco = preco - quantia;
		}
		
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
	
	public int getIdServico() {
		
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
	
	public String getStatus() {
		
		return status;
	}
}