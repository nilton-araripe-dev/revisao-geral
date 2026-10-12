public class PedidoVip extends Pedido implements Calculavel{
    public PedidoVip(String cliente, double valor){
        super(cliente,valor);
    }
    @Override
    public double calcularTotal(){
        return getValor() * 0.85;
    }
}
