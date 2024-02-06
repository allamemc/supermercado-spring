package com.example.supermercadodawonline.servicios;

import com.example.supermercadodawonline.model.jpa.Detalle;
import com.example.supermercadodawonline.model.jpa.Pedido;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;

@Service
@SessionScope
public class Carrito {
    private Pedido pedido;
    private ArrayList<Detalle> detalles;

    public Carrito() {
        detalles = new ArrayList<Detalle>();
        pedido = null;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public ArrayList<Detalle> getDetalles() {
        return detalles;
    }
}
