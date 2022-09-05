package Entity;

public class Peca {
	private String idPeca;		// Identificador
	private String nome;	// Nome
	private String fab; 	// Fabricante
	private double preco;	// Valor

	public Peca() {
		setIdPeca("");
		setNome("");
		setFab("");
		setPreco(0.0);
	}

	public Peca(String idPeca, String nome, String fab, double preco) {
		setIdPeca(idPeca);
		setNome(nome);
		setFab(fab));
		setPreco(preco);
	}

	public void setIdPeca(String idPeca) {
		if (!idPeca.isBlank() || !idPeca.isEmpty())
			this.idPeca = idPeca;
		else
			this.idPeca = "ID generico de peca";
	}

	public String getIdPeca() {
		return this.idPeca;
	}

	public void setNome(String nome) {
		if (!nome.isBlank() || !nome.isEmpty())
			this.nome = nome;
		else
			this.nome = "Peca generica";
	}

	public String getNome() {
		return this.nome;
	}

	public void setFab(String fab) {
		if (!fab.isBlank() || !fab.isEmpty())
			this.fab = fab;
		else
			this.fab = "Fabricante generico";
	}

	public String getFab() {
		return this.fab;
	}

	public void setPreco(double preco) {
		if (preco > 0.0)
			this.preco = preco;
		else
			this.preco = 120.0;
	}

	public double getPreco() {
		return this.preco;
	}
	
	/*	
	 * Ainda n�o sabemos como vamos implementar os m�todos
	 * cadastrar(), excluir() e alterar().
	 * Espa�o reservado para a implementa��o desses.
	*/
	static public void pesquisarPeca(Peca peca)
	{
		//	Espa�o para complementar c�digo posteriormente
		//	Vai envolver intera��o com um banco de dados
	}
	static public void pesquisarPeca(Automovel automovel)
	{
		//	Espa�o para complementar c�digo posteriormente
		//	Vai envolver intera��o com um banco de dados
	}
}
