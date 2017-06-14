public class Pessoa {
	// Atributos
	String nome;
	int numMaxDeEventos = 20;
	int cpf;
	int idade;
	Evento[] eventosComparecer;

	// Cadastrar nova pessoa
	public Pessoa(int cpf, String nome, int idade) {
		eventosComparecer = new Evento[numMaxDeEventos];

		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;

	}

	public void eventos_desejados(Evento evento) {
		for (int i = 0; i < numMaxDeEventos; i++) {
			if (eventosComparecer[i].eventos_iguais(evento)) {
				return;
			}
		}
		for (int j = 0; j < numMaxDeEventos; j++) {
			if (eventosComparecer[j].getNome() == null) {
				eventosComparecer[j] = evento;
				return;
			}
		}
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
