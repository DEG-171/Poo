
public class EventoPromocional extends Evento {

	int codigoPromocao;
	int desconto;

	public EventoPromocional(String nome, String autor, int preço, int[] data, String local, int codigoPromocao,
			int desconto) {
		super(nome, autor, preço, data, local);
		this.codigoPromocao = codigoPromocao;
		this.desconto = desconto;
	}

	public int getCodigoPromocao() {
		return codigoPromocao;
	}

	public void setCodigoPromocao(int codigoPromocao) {
		this.codigoPromocao = codigoPromocao;
	}

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}

}
