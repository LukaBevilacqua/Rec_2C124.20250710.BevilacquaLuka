/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pasajes.modelo;

import java.io.Serializable;

/**
 *
 * @author lukab
 */
public class Venta implements Serializable{
    private String origen;
    private String destino;
    private int cantidadPasajes;
    private double precio;

    public Venta(String origen, String destino, int cantidadPasajes, double precio) {
        this.origen = origen;
        this.destino = destino;
        this.cantidadPasajes = cantidadPasajes;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCantidadPasajes() {
        return cantidadPasajes;
    }

    public void setCantidadPasajes(int cantidadPasajes) {
        this.cantidadPasajes = cantidadPasajes;
    }
    
    
}
