/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pasajes.persistencia;

import com.pasajes.modelo.Vendedor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/**
 *
 * @author lukab
 */
public class PersistenciaVendedores {
    private static final String ARCHIVO = "vendedores.dat";
    
    public static void guardar(HashMap<String, Vendedor> vendedores){
       try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))){
           oos.writeObject(vendedores);
       }catch(IOException ioe){
           System.out.println("Error guardando cuenta "+ ioe.getMessage());
       }
        
    }
    
    public static HashMap<String, Vendedor> cargar(){
        File archivo = new File(ARCHIVO);
        if(!archivo.exists()){
            HashMap<String, Vendedor> vendedores = new HashMap<>();
            vendedores.put("Usuario1", new Vendedor("luka", "1234"));
            vendedores.put("usuario2", new Vendedor("luka2", "5678"));
            return vendedores;
        }
        
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO))){
           return (HashMap<String, Vendedor>) ois.readObject();
        }catch(ClassNotFoundException|IOException ioe){
           System.out.println("Error guardando las cuentas "+ ioe.getMessage());
        }
        return null;
    }
}
