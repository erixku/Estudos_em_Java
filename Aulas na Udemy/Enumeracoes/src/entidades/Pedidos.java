package entidades;

import entidades.enums.PedidoStatus;
import java.util.Date;

public class Pedidos {
    private Integer id;
    private Date momento;
    private PedidoStatus status;

    public Pedidos(Integer id, Date momento, PedidoStatus status) {
        this.id = id;
        this.momento = momento;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedidos{" +
                "id=" + id +
                ", momento=" + momento +
                ", status=" + status +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public PedidoStatus getStatus() {
        return status;
    }

    public void setStatus(PedidoStatus status) {
        this.status = status;
    }
}
