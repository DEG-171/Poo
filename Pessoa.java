
public class Pessoa {

	private String nome;
	private int cpf;
	private int idade;
	private int eventosRegistrados;

	private Evento[] eventos;

	public Pessoa(String nome, int cpf, int idade, int numEventos) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;

		eventosRegistrados = 0;
		eventos = new Evento[numEventos];
	}

	public boolean RegistrarEvento(Evento evento) {
		if (eventosRegistrados < eventos.length) {
			for (int i = 0; i < eventosRegistrados; i++) {
				if (eventos[i].equals(evento)) {
					return false;
				}
			}

			eventos[eventosRegistrados] = evento;
			eventosRegistrados++;
			return true;
		}
		return false;
	}

	public int getEventosRegistrados() {
		return eventosRegistrados;
	}

	public void setEventosRegistrados(int eventosRegistrados) {
		this.eventosRegistrados = eventosRegistrados;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Evento[] getEventos() {
		return eventos;
	}

	public void setEventos(Evento[] eventos) {
		eventosRegistrados++;
		this.eventos = eventos;
	}

}
