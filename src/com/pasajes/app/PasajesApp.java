/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pasajes.app;

import com.pasajes.modelo.Vendedor;
import com.pasajes.persistencia.PersistenciaVendedores;
import com.pasajes.vista.LoginView;
import java.util.HashMap;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author lukab
 */
public class PasajesApp extends Application{
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        HashMap<String, Vendedor> vendedores = PersistenciaVendedores.cargar();
        
        LoginView login = new LoginView(stage, vendedores);
        stage.setScene(new Scene(login));
        stage.setTitle("Pasajes - Inicio de Sesion");
        
        stage.setOnCloseRequest(e -> PersistenciaVendedores.guardar(vendedores));
        
        stage.show();
    }
}
