
public class Controle {

	private static Evento[] eventos; 
	public Controle() {
		
	}

	public static void main(String[] args) {
		//oi sla
		
		
		//preencher pessoas e eventos e os eventos nas pessoas¬¬
		eventos=new Evento[3];
		int[] data = new int[3];
		data = formatarData(11,11,1111);
		eventos[0] = new Evento("Loolapalooza","alguem",35,data,"SP");
		data = formatarData(22,22,2222);
		eventos[1] = new Evento("RocknRio","outroalguem",111,data,"RJ");
		data = formatarData(22,22,2222);
		eventos[2] = new Evento("RocknRio","outroalguem",111,data,"RJ");
//		data = formatarData(33,33,3333);
//		eventos[2] = new Evento("Camerata","vos",23,data,"SC");
		System.out.println(eventos[1].equals(eventos[2]));
		
		RH rh = new RH(3);
		rh.resgistrarPessoa("Hachi",123,18,3);
		rh.resgistrarPessoa("Tyel",666,32,3);
		rh.resgistrarPessoa("Welby",321,25,3);
		
		rh.getPessoas()[0].RegistrarEvento(eventos[0]);
		rh.getPessoas()[0].RegistrarEvento(eventos[1]);
		System.out.println(rh.getPessoas()[0].RegistrarEvento(eventos[2]));
//		rh.getPessoas()[0].RegistrarEvento(eventos[2]);
		rh.getPessoas()[1].RegistrarEvento(eventos[0]);
		
		System.out.println(rh.ConsultaNumPessoas(eventos[0]));
		System.out.println(rh.ConsultaNumPessoas(data));
		
		// FAZER OUTRO EVENTO COM ALGUMAS COISA PARECIDAS P VER O COMPARADOR
		
		
		//pedir o q quer
		
		
		

	}
	
	static public int[] formatarData(int dia, int mes, int ano){
		int[] data = new int[3];
		data[0]=dia;
		data[1]=mes;
		data[2]=ano;
		return data;
	}

}
