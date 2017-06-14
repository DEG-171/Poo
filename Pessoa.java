public class Pessoa {
	// Atributos
	String nome;
	int cpf;
	int idade;
	Evento[] eventosComparecer;

	// Cadastrar nova pessoa
	public Pessoa(int cpf, String nome, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;

	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String novonome) {
		this.nome = novonome;
	}


	public int getIdade() {
		return idade;
	}

	public void setIdade(int novaidade) {
		this.idade = novaidade;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int novocpf) {
		this.cpf = novocpf;
	}
}
