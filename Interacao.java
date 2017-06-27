import java.util.Scanner;

public class Interacao {

	private Scanner scan;

	public Interacao() {
		scan = new Scanner(System.in);
	}

	public int pedirInt() {
		// System.out.println(msgn);
		return scan.nextInt();
	}
	
	public int pedirInt(String msgn) {
		System.out.println(msgn);
		return scan.nextInt();
	}

	public String pedirString(String msgn) {
		System.out.println(msgn);
		return scan.nextLine();
	}

	public void mostrarMensagem(String msg) {
		System.out.println(msg);
	}

	public int escolhaInicial(){
		int escolha;
		mostrarMensagem("O que gostaria de fazer?");
		mostrarMensagem("1- Pessoas");
		mostrarMensagem("2- Eventos");
		mostrarMensagem("3- Sair");
		return escolha = pedirInt();
	}
	
	public int escolhaPessoa() {
		int escolha;
		mostrarMensagem("O que gostaria de fazer?");
		mostrarMensagem("1- Registrar Pessoa");
		mostrarMensagem("2- Excluir Pessoa");
		mostrarMensagem("3- Consultar Pessoa");
		mostrarMensagem("4- Registrar Evento em Uma Pessoa");
		mostrarMensagem("5- Voltar");
		return escolha = pedirInt();
	}
	
	public int escolhaEvento() {
		int escolha;
		mostrarMensagem("O que gostaria de fazer?");
		mostrarMensagem("1- Criar Evento");
		mostrarMensagem("2- Editar Evento");
		mostrarMensagem("3- Excluir Evento");
		mostrarMensagem("4- Consultar Evento");
		mostrarMensagem("5- Voltar");
		return escolha = pedirInt();
	}
	
	public int escolhaConsulta() {
		int escolha;
		mostrarMensagem("O que gostaria de fazer?");
		mostrarMensagem("1- Numero Pessoas em Evento");
		mostrarMensagem("2- Numero Pessoas em Eventos na data");
		mostrarMensagem("3- Pessoas com Certo Nome em Certo Evento");
		mostrarMensagem("5- Voltar");
		return escolha = pedirInt();
	}

}
