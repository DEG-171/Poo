public class EventoPromo extends Evento {
 
    // Atributos
    String codigoPromocao;
    double desconto;
 
    //Construtor
    public EventoPromo(double preco, int[] data, String local, String nome,String autor,String codigoPromocao,double desconto) {
        super(preco,data, local,nome,autor);
        this.desconto = desconto;
        this.codigoPromocao = codigoPromocao;
    }
 
    // Getter and Setters
    public String getCodigoPromocao() {
        return codigoPromocao;
    }
 
    public void setCodigoPromocao(String codigoPromocao) {
        this.codigoPromocao = codigoPromocao;
    }
 
    public double getDesconto() {
        return desconto;
    }
 
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
 
}
