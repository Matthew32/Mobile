package com.proyecto.gmwork.proyectoandroid.controller.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.j256.ormlite.dao.Dao;
import com.proyecto.gmwork.proyectoandroid.Model.Categoria;
import com.proyecto.gmwork.proyectoandroid.Model.Cliente;
import com.proyecto.gmwork.proyectoandroid.Model.Pedido;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mateo on 30/04/15.
 */
public class PedidoDAOController {
    private Dao<Pedido, Long> daoPe;

    public void addPedido(Pedido cat) {
        try {
            daoPe.create(cat);
        } catch (SQLException ex) {
            Log.i("errorSQL", ex.getMessage());
        }
    }

    public List<Pedido> getPedidos() throws SQLException {
        List<Pedido> todos = daoPe.queryForAll();
        return todos;
    }

    public Pedido filtrarPedido(Pedido cat) {
        return null;
    }

    public void EditarPedido(Pedido cat) {
    }
}
