package com.example.supermercadodawonline.model.jpa;

import jakarta.persistence.*;

@Entity
public class Detalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int linea;
    @ManyToOne
    @JoinColumn(name="idpedido")
    private Pedido pedido;
    @ManyToOne
    @JoinColumn(name="idproducto")
    private Producto producto;
    private float precio;
    private int unidades;
    private float descuento;

    public Detalle() {
    }

    private float subtotal() {
        return precio*unidades;
    }
    private float importeDescontado() {
        return subtotal()*descuento;
    }
    private float total() {
        return subtotal()-importeDescontado();
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return producto.getNombre() + " - " + unidades + " unidades - " +
                precio + " euros";
    }
}
