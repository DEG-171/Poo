import java.util.Scanner;

public class Interacao {

	private Scanner scan;
	public Interacao() {
		scan = new Scanner(System.in);
	}
	
	public int pedirInt(){
		//coloca uma interacao melhor
		return scan.nextInt();
	}
	
	public String pedirNome(){
		//também melhorar essa UI
		return scan.nextLine();
	}
	
	public void mostrarMensagem(String msg){
		System.out.println(msg);
	}

}
