package com.proyecto.gmwork.proyectoandroid.Model;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.proyecto.gmwork.proyectoandroid.Model.PedidoProducto;
/**
 * Created by mateo on 30/04/15.
 */
@DatabaseTable(tableName = "LINIAPRODUCTO")
public class PedidoProducto {
    @DatabaseField(generatedId = true)
    private long id;
    @DatabaseField(foreign = true, foreignAutoRefresh = true)
    private Producto producto;
    @DatabaseField(foreign = true, foreignAutoRefresh = true)
    private Pedido pedido;
    @DatabaseField
    private double cantidad;

    public PedidoProducto() {
    }

    public PedidoProducto(Producto producto, Pedido pedido, double cantidad) {
        this.producto = producto;
        this.pedido = pedido;
        this.cantidad = cantidad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
}
