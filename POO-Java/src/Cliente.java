
public class Cliente {
	// Atributos privados
	private String nome;
	private String cpf;
	private String endereco;
	private Automovel[] veiculo;
	private static int contCliente;

	// Construtores
	public Cliente(String nome) {
		setNome(nome);
		contCliente++;
	}

	public Cliente(String nome, String cpf) {
		setNome(nome);
		setCpf(cpf);
		contCliente++;
	}

	public Cliente(String nome, String cpf, String endereco) {
		setNome(nome);
		setCpf(cpf);
		setEndereco(endereco);
		contCliente++;
	}

	// Metodos set

	public void setNome(String nome) {
		if (!nome.isEmpty()) {
			this.nome = nome;
		} else {
			this.nome = "Cliente " + contCliente;
		}
	}

	public void setCpf(String cpf) {
		if (!cpf.isEmpty() && (cpf.length() == 11)) {
			this.cpf = cpf;
		} else {
			this.cpf = "-----------";
		}
	}

	public void setEndereco(String endereco) {
		if (!endereco.isEmpty()) {
			this.endereco = endereco;
		} else {
			this.endereco = "-";
		}
	}

	// Metodos get

	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public String getEndereco() {
		return this.endereco;
	}
}
