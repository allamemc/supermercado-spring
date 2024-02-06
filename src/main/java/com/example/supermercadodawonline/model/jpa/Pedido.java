package com.example.supermercadodawonline.model.jpa;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
public class Pedido {
    @Id
    private int idpedido;
    @ManyToOne
    @JoinColumn(name="idcliente")
    private Cliente cliente;
    private Date fechapedido;
    private Date fechaentrega;
    @OneToMany(mappedBy="pedido")
    private List<Detalle> detalles;

    public Pedido() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechapedido() {
        return fechapedido;
    }

    public void setFechapedido(Date fechapedido) {
        this.fechapedido = fechapedido;
    }

    public Date getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(Date fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public List<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Detalle> detalles) {
        this.detalles = detalles;
    }
}
