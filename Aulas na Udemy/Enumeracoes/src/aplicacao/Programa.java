package aplicacao;

import entidades.Pedidos;
import entidades.enums.PedidoStatus;
import java.util.Date;

public class Programa {
    public static void main(String[] args) {
        Pedidos pedido = new Pedidos(1080, new Date(), PedidoStatus.PENDING_PAYMENT);
        System.out.println(pedido);

        PedidoStatus ps1 = PedidoStatus.DELIVERED;
        PedidoStatus ps2 = PedidoStatus.valueOf("DELIVERED");

        System.out.println(ps1 + "\n" + ps2);
    }
}
