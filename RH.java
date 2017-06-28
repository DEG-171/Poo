
public class RH {

	private Pessoa[] pessoas;
	private int pessoasRegistradas;

	public RH(int numeroPessoas) {
		pessoas = new Pessoa[numeroPessoas];
		pessoasRegistradas = 0;

	}
	
	public Pessoa consultarPessoa(int cpf){
		for (int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getCpf()==cpf){
				return pessoas[i];
			}
		}
		return null;
	}
	
	public void excluirPessoa(int cpf){
		for (int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getCpf()==cpf){
				pessoas[i]=null;
				for(int j = i; j<pessoasRegistradas-i; j++){
					pessoas[j]=pessoas[j+1];
				}
				break;
			}
		}
	}

	public void resgistrarPessoa(String nome, int cpf, int idade, int numEventos) {
		if (pessoasRegistradas < pessoas.length) {
			pessoas[pessoasRegistradas] = new Pessoa(nome, cpf, idade, numEventos);
			pessoasRegistradas++;
		}
	}

	public int ConsultaNumPessoas(Evento evento) {
		int total = 0;
		for (Pessoa p : pessoas) {
			for (int i = 0; i < p.getEventosRegistrados(); i++) {
				if (p.getEventos()[i].equals(evento)) {
					total++;
					break;
				}
			}
		}

		return total;
	}

	public int ConsultaNumPessoas(int data[]) {
		int total = 0;
		for (Pessoa p : pessoas) {
			for (int i = 0; i < p.getEventosRegistrados(); i++) {
				if (p.getEventos()[i].equals(data)) {
					total++;
					break;
				}
			}
		}

		return total;
	}

	public boolean PessoaEmEvento(String nomeP, String nomeE) {
		boolean existe = false;
		for (Pessoa p : pessoas) {
			if (p.getNome().equals(nomeP))
				for (Evento event : p.getEventos()) {
					if (event.getNome().equals(nomeE)) {
						existe = true;
						break;
					}
				}
		}
		return existe;
	}

	public Pessoa[] getPessoas() {
		return pessoas;
	}

	public void setPessoas(Pessoa[] pessoas) {
		this.pessoas = pessoas;
	}

	public int getPessoasRegistradas() {
		return pessoasRegistradas;
	}

	public void setPessoasRegistradas(int pessoasRegistradas) {
		this.pessoasRegistradas = pessoasRegistradas;
	}

}
