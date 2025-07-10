/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pasajes.vista;

import com.pasajes.modelo.Vendedor;
import java.util.HashMap;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author lukab
 */
public class LoginView extends VBox{
    public LoginView(Stage stage, HashMap<String, Vendedor> vendedores){
        setSpacing(10);
        setPadding(new javafx.geometry.Insets(20));
        
        Label lblUser = new Label("Usuario");
        TextField campoUsuario = new TextField();
        Label mensaje = new Label();
        Button btnIngresar = new Button("Ingresar");
        PasswordField campoPin = new PasswordField();

        btnIngresar.setOnAction(e -> {
            String usuario = campoUsuario.getText();
            String pin = campoPin.getText();
            
            Vendedor vendedor = vendedores.get(usuario); 
            
            if(vendedor!=null && vendedor.validarPin(pin)){
                MenuView menu = new MenuView(stage, vendedores);
                stage.setScene(new Scene(menu));
            }else{
                mensaje.setText("Usuario o PIN incorrecto");
            }
        });
        
        
        getChildren().addAll(lblUser, campoUsuario, campoPin, btnIngresar, mensaje);
    }
}
