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
public class Vendedor implements Serializable{
    private String nombre;
    private String pin;

    public Vendedor(String nombre, String pin) {
        this.nombre = nombre;
        this.pin = pin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
    
    public boolean validarPin(String entrada){
        return this.pin.equals(entrada);
    }
    
}
