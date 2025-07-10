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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author lukab
 */
public class ConsultaVentaView extends VBox{
    public ConsultaVentaView(Stage stage, HashMap<String, Vendedor> vendedores, ArrayList<Venta> ventas) {
        setSpacing(10);
        setPadding(new javafx.geometry.Insets(20));
        
        Label lbl = new Label("Sus ventas");
        Label algo = new Label();
        
        Button btnSalir = new Button("Salir");
        
        for(int i = 0; i > ventas.size(); i++){
            algo.setText(ventas.toString());
        }
        
        btnSalir.setOnAction(e -> {
            MenuView menu = new MenuView(stage, vendedores);
            stage.setScene(new Scene(menu));
        });
        
        getChildren().addAll(lbl, algo, btnSalir);
    }
    
}
