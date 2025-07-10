/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pasajes.vista;

import com.pasajes.modelo.Vendedor;
import com.pasajes.modelo.Venta;
import java.util.ArrayList;
import java.util.HashMap;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author lukab
 */
public class VentaView extends VBox{
    public VentaView(Stage stage, HashMap<String, Vendedor> vendedores) {
        setSpacing(10);
        setPadding(new javafx.geometry.Insets(20));
        
        Label lblOrigen = new Label("Ingrese origen");
        TextField campoOrigen = new TextField();
        
        Label lblDestino = new Label("Ingrese destino");
        TextField campoDestino = new TextField();
        
        Label lblCantidadPasajes = new Label("Ingrese la cantidad de pasajes que vendio");
        TextField campoCantidadPasajes = new TextField();
        
        Button btnCargarVenta = new Button("Cargar venta");
        Button btnSalir = new Button("Salir");
        Label resultado = new Label();
        
        ArrayList<Venta> ventas = new ArrayList<>();
           
        btnCargarVenta.setOnAction(e -> {
            try{
                double cantidadPasajes = Double.parseDouble(campoCantidadPasajes.getText());
                Venta venta = new Venta(campoOrigen.getText(), campoDestino.getText(), cantidadPasajes);             
                ventas.add(venta);
                resultado.setText("Venta agregada");
            }catch(NumberFormatException nfe){
                resultado.setText("Ingrese un numero valido");
            }
        });
        
        btnSalir.setOnAction(e -> {
            MenuView menu = new MenuView(stage, vendedores);
            stage.setScene(new Scene(menu));
        });
        
        getChildren().addAll(lblOrigen, campoOrigen, lblDestino, campoDestino,
                lblCantidadPasajes, campoCantidadPasajes, btnCargarVenta, btnSalir, resultado);
    }
    
}
