package com.proyecto.gmwork.proyectoandroid.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matthew on 05/05/2015.
 */
public class Categoria {

    private long id;
    private String nombre;
    private double descuento;
    private List productos = new ArrayList<Producto>();

    public Categoria() {
    }

    public Categoria(String nombre, double descuento) {
        this.nombre = nombre;
        this.descuento = descuento;
    }

    public long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public List getProductos() {
        return productos;
    }

    public void setProductos(List productos) {
        this.productos = productos;
    }

    public void addProducto(Producto pro) {
        this.productos.add(pro);
        pro.setCategoria(this);

    }
}
