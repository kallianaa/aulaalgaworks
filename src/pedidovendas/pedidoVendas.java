package pedidovendas;

public class pedidoVendas {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        pedido.codigo = 1234;
        pedido.subtotal = 100.0;
        pedido.desconto = 10.0;

//        System.out.println("Código: " + pedido.getCodigo() + ", Subtotal: " + pedido.getSubtotal() +
//                ", Desconto: " + pedido.getDesconto() + ", Total: " + pedido.getTotal());

        System.out.println("Código do pedido: " + pedido.getCodigo());
        System.out.println("o Subtotal do pedido: " + pedido.getSubtotal());
        System.out.println("O desconto do pedido: " + pedido.getDesconto());
        System.out.println("o total do seu pedido: " + pedido.getTotal());

    }
}
