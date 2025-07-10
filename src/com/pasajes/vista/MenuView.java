/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pasajes.vista;

import com.pasajes.modelo.Vendedor;
import java.util.HashMap;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author lukab
 */
public class MenuView extends VBox{
    public MenuView(Stage stage, HashMap<String, Vendedor> vendedores){
        setSpacing(10);
        setPadding(new javafx.geometry.Insets(20));
        
        Label bienvenida = new Label("Bienvenido");
        
        Button btnVenta = new Button("Venta de pasajes");
        
        Button btnConsultaVentas = new Button("Ver mis ventas");
        
        Button btnSalir = new Button("Salir");
        
        btnVenta.setOnAction(e -> {
            VentaView vv = new VentaView(stage, vendedores);
            stage.setScene(new Scene(vv));
        });
        
        btnConsultaVentas.setOnAction(e -> {
            ConsultaVentaView cvv = new ConsultaVentaView(stage, vendedores);
            stage.setScene(new Scene(cvv));
        });
        
        btnSalir.setOnAction(e -> {
            LoginView login = new LoginView(stage, vendedores);
            stage.setScene(new Scene(login));
        });
        
        getChildren().addAll(bienvenida, btnVenta, btnConsultaVentas, btnSalir);
    }
}
