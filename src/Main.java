import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        ArrayList<Pedido> pedidos = new ArrayList<>();

        try{
            pedidos.add(new PedidoNormal("Vitor", 150));
        } catch (IllegalArgumentException e){
            System.out.println("O valor do pedido não opode ser negativo");
        }
        try{
            pedidos.add(new PedidoNormal("Marilia", 100));
        } catch (IllegalArgumentException e){
            System.out.println("O valor do pedido não pode ser negativo");
        }
        try{
            pedidos.add(new PedidoVip("Lorena", 7000));
        } catch (IllegalArgumentException e){
            System.out.println("O valor do pedido não pode ser negativo");
        }
        try{
            pedidos.add(new PedidoVip("Nilton", 5000));
        } catch (IllegalArgumentException e){
            System.out.println("O valor do pedido não pode ser negativo");
        }
        try{
            pedidos.add(new PedidoPremium("Ioena", 9000));
        } catch(IllegalArgumentException e){
            System.out.println("O valor do pedido não pode ser negativo");
        }

        for (Pedido p : pedidos){
            p.exibirInfo();
        }
    }
}