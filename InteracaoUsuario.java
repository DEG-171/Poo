import java.util.Scanner;

public class InteracaoUsuario {

			InteracaoUsuario visao = new InteracaoUsuario();

			Scanner entrada = new Scanner(System.in);

			public int requisitaInteiro(String message) {
				System.out.println(message);
				return entrada.nextInt();
			}

			public void messageOut(String message) {
				System.out.println(message);
			}
}

