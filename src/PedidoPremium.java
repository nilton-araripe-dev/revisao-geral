public class PedidoPremium extends Pedido implements Calculavel{
    public PedidoPremium(String cliente, double valor){
        super(cliente,valor);
    }
    @Override 
    public double calcularTotal(){
        return getValor() * 0.75;
    }
}