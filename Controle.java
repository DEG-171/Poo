import java.util.Scanner;

public class Controle {

	static private RH rh;

	private static Evento[] eventos;
	static int eventosRegistrados;

	public static void main(String[] args) {
		eventosRegistrados = 0;
		int escolha = 0;
		Scanner scan = new Scanner(System.in);

		Interacao ui = new Interacao();

		while (escolha != -1) {
			escolha = ui.escolhaInicial();

			// variáveis a serem utilizadas para registrar coisas
			Pessoa pessoa = null;
			Evento evento = null;

			String nome = null;
			String autor = null;
			int preco = 0;
			int dataDia = 0, dataMes = 0, dataAno = 0;
			String local = null;

			switch (escolha) {
/* Pessoa */case 1:
				int escolhaPessoa = ui.escolhaPessoa();
				if (escolhaPessoa != 5) {

					switch (escolhaPessoa) {
					case 1:
						rh.resgistrarPessoa(ui.pedirString("Insira o nome"), ui.pedirInt("Insira o cpf"),
								ui.pedirInt("Insira a idade"), 3);
						break;
					case 2:
						rh.excluirPessoa(ui.pedirInt("Insira o cpf da pessoa a ser excluida"));
						break;
					case 3:
						int escolhaconsulta = ui.escolhaConsulta();
/* switch de consultas */ switch (escolhaconsulta) {
						case 1:
							nome = ui.pedirString("Insira o nome");
							autor = ui.pedirString("Insira o autor");
							preco = ui.pedirInt("Insira o preco");
							dataDia = ui.pedirInt("Insira o dia");
							dataMes = ui.pedirInt("Insira o mes");
							dataAno = ui.pedirInt("Insira o ano");
							local = ui.pedirString("Insira o local");
							evento = checarEvento(nome, autor, preco, formatarData(dataDia, dataMes, dataAno), local);
							ui.mostrarMensagem(
									"O número de pessoa nesse evento foi de: " + rh.ConsultaNumPessoas(evento));
							break;

						case 2:
							dataDia = ui.pedirInt("Insira o dia");
							dataMes = ui.pedirInt("Insira o mes");
							dataAno = ui.pedirInt("Insira o ano");
							ui.mostrarMensagem("O número de pessoa nesse evento nessa data foi de: "
									+ rh.ConsultaNumPessoas((formatarData(dataDia, dataMes, dataAno))));
							break;

						case 3:
							ui.mostrarMensagem("O número de pessoa nesse evento nessa data foi de: "
									+ rh.PessoaEmEvento(ui.pedirString("Insira o nome das pessoas"),
											ui.pedirString("Insira o nome das pessoas")));
							break;
						default:
							break;
						}
						break;
					case 4:
						pessoa = rh.consultarPessoa(ui.pedirInt("Insira o cpf da pessoa"));
						nome = ui.pedirString("Insira o nome");
						autor = ui.pedirString("Insira o autor");
						preco = ui.pedirInt("Insira o preco");
						dataDia = ui.pedirInt("Insira o dia");
						dataMes = ui.pedirInt("Insira o mes");
						dataAno = ui.pedirInt("Insira o ano");
						local = ui.pedirString("Insira o local");
						pessoa.RegistrarEvento(
								criarEvento(nome, autor, preco, formatarData(dataDia, dataMes, dataAno), local));
						break;
					default:
						break;
					}
				}

				break;

/* Eventos */case 2:
				escolha = ui.escolhaEvento();

				switch (escolha) {
				case 1:
					nome = ui.pedirString("Insira o nome");
					autor = ui.pedirString("Insira o autor");
					preco = ui.pedirInt("Insira o preco");
					dataDia = ui.pedirInt("Insira o dia");
					dataMes = ui.pedirInt("Insira o mes");
					dataAno = ui.pedirInt("Insira o ano");
					local = ui.pedirString("Insira o local");
					registrarEvento(criarEvento(nome, autor, preco, formatarData(dataDia, dataMes, dataAno), local));
					break;

				default:
					break;
				}

				break;
			case 3:
				escolha=-1;
				break;

			default:
				break;
			}

			
		}
		scan.close();

	}

	public static Evento checarEvento(String nome, String autor, int preco, int[] data, String local) {
		Evento evento = new Evento(nome, autor, preco, data, local);
		for (int i = 0; i < eventosRegistrados; i++) {
			if (eventos[i].equals(evento)) {
				return evento;
			}
		}
		return null;
	}

	static public Evento criarEvento(String nome, String autor, int preco, int[] data, String local) {
		Evento evento;
		return evento = new Evento(nome, autor, preco, data, local);
	}

	public static boolean registrarEvento(Evento evento) {
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

	public void registrarEventoParaPessoa(int posicaoPes, int posicaoEvent) {
		rh.getPessoas()[posicaoPes].RegistrarEvento(eventos[posicaoEvent]);
	}

	static public int[] formatarData(int dia, int mes, int ano) {
		int[] data = new int[3];
		data[0] = dia;
		data[1] = mes;
		data[2] = ano;
		return data;
	}

}
