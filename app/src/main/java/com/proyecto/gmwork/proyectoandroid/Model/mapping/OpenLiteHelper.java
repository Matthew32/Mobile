package com.proyecto.gmwork.proyectoandroid.Model.mapping;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.proyecto.gmwork.proyectoandroid.Model.Categoria;
import com.proyecto.gmwork.proyectoandroid.Model.Cliente;
import com.proyecto.gmwork.proyectoandroid.Model.Pedido;
import com.proyecto.gmwork.proyectoandroid.Model.PedidoProducto;
import com.proyecto.gmwork.proyectoandroid.Model.Producto;
import com.proyecto.gmwork.proyectoandroid.Model.Usuario;
import com.proyecto.gmwork.proyectoandroid.R;

import java.sql.SQLException;

/**
 * Created by Matthew on 06/05/2015.
 */
public class OpenLiteHelper extends OrmLiteSqliteOpenHelper {
    private static final String DATABASE_NAME = "db.lite";
    private static final int DATABASE_VERSION = 1;

    public OpenLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION,
                /**
                 * R.raw.ormlite_config is a reference to the ormlite_config.txt file in the
                 * /res/raw/ directory of this project
                 * */
                R.raw.ormlite_config);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, Categoria.class);
            TableUtils.createTable(connectionSource, Cliente.class);
            TableUtils.createTable(connectionSource, Pedido.class);
            TableUtils.createTable(connectionSource, PedidoProducto.class);
            TableUtils.createTable(connectionSource, Producto.class);
            TableUtils.createTable(connectionSource, Usuario.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            TableUtils.dropTable(connectionSource, Categoria.class, false);
            TableUtils.dropTable(connectionSource, Cliente.class, false);
            TableUtils.dropTable(connectionSource, Pedido.class, false);
            TableUtils.dropTable(connectionSource, PedidoProducto.class, false);
            TableUtils.dropTable(connectionSource, Producto.class, false);
            TableUtils.dropTable(connectionSource, Usuario.class, false);
            onCreate(database, connectionSource);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
