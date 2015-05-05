package com.proyecto.gmwork.proyectoandroid.controller;


import com.proyecto.gmwork.proyectoandroid.Model.Cliente;
import com.proyecto.gmwork.proyectoandroid.Model.Pedido;
import com.proyecto.gmwork.proyectoandroid.Model.Producto;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by mateo on 30/04/15.
 */
public class PersistencyController {
    public void hacerLogin(String username, String password) {
    }

    public void guardarDatosBajados() {
    }

    public void removeProducto(String nombre) {
    }


    public Cliente mostrarClientes() {
        return null;
    }

    public Cliente filtrarCliente(String nombre) {
        return null;
    }

    public void editarCliente(String nif, int edad, String nombre, String apellidos, double latitud, double longitud, Date proximaVisita) {
    }

    public void crearCliente(String nif, int edad, String nombre, String apellidos, double latitud, double longitud, Date proximaVisita) {
    }

    public void crearPedido(Date fecha, Cliente cliente, ArrayList<Producto> productos) {
    }

    public void removePedido(long id, String client, Date fecha) {
    }

    public ArrayList<Pedido> mostrarPedido() {
        return null;
    }


}
