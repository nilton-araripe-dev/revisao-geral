public class PedidoNormal extends Pedido implements Calculavel{
    public PedidoNormal(String cliente, double valor){
        super(cliente, valor);
    }
    @Override 
    public double calcularTotal(){
        return getValor();
    }
}
