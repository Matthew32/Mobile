package com.proyecto.gmwork.proyectoandroid.Model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;
import com.proyecto.gmwork.proyectoandroid.Model.PedidoProducto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by mateo on 30/04/15.
 */
@DatabaseTable(tableName = "PEDIDO")
public class Pedido {
    @DatabaseField(generatedId = true)
    private long id;
    @DatabaseField
    private Date fecha;
    @DatabaseField
    private String estado;
    @DatabaseField(foreign = true, foreignAutoRefresh = true)
    private Cliente cliente;
    @ForeignCollectionField
    private ForeignCollection<PedidoProducto> liniaProducto;
    
    public Pedido() {
    }
    
    public Pedido(Date fecha, String estado) {
        this.fecha = fecha;
        this.estado = estado;
    }
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public Date getFecha() {
        return fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ForeignCollection<PedidoProducto> getLiniaProducto() {
        return liniaProducto;
    }

    public void setLiniaProducto(ForeignCollection<PedidoProducto> liniaProducto) {
        this.liniaProducto = liniaProducto;
    }

    public void addLiniaProducto(PedidoProducto pPro) {
        this.liniaProducto.add(pPro);
        pPro.setPedido(this);
        
    }
}
