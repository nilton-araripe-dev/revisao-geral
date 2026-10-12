public abstract class Pedido{
    private String cliente;
    private double valor;

    public Pedido(String cliente, double valor){
        this.cliente = cliente;
        this.valor = valor;

        if (valor < 0){
            throw new IllegalArgumentException("O valor do pedido não pode ser negativo");
        }
    }
    public String getCliente(){
        return cliente;
    }
    public double getValor(){
        return valor;
    }
    public abstract double calcularTotal();
    public void exibirInfo(){
        System.out.println("Cliente: " + getCliente() + " Valor do pedido: " + calcularTotal());
    }
}