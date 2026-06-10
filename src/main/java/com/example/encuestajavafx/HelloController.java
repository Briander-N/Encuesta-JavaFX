package com.example.encuestajavafx;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;

public class HelloController {

    //Labels
    @FXML
    private Label lblT1;
    @FXML
    private Label lblT2;
    @FXML
    private Label lblQ1;
    @FXML
    private Label lblQ2;
    @FXML
    private Label lblQ3;
    @FXML
    private Label lblQ4;
    @FXML
    private Label lblPuntaje;
    @FXML
    private Label lblResultados;

    //TextField
    @FXML
    public TextField txtQ1;
    @FXML
    public TextField txtQ3;


    //Combo Box
    @FXML
    private ComboBox<String> cmbQ2;
    @FXML
    private ComboBox<String> cmbQ4;


    //Inicializar ComboBox
    @FXML
    public void initialize(){
        cmbQ2.getItems().addAll("Wii U", "Virtual Boy", "GameCube");
        cmbQ4.getItems().addAll("Nintendo DS", "Wii", "GameBoy Advance");
    }

    //Metodos
    @FXML
    public void calcularPuntaje(){
        String respuesta1 = txtQ1.getText().trim();
        String respuesta2 = cmbQ2.getValue();
        String respuesta3 = txtQ3.getText().trim();
        String respuesta4 = cmbQ4.getValue();


        int puntaje = 0;

        if(respuesta1.toLowerCase().equals("jumpman")){
            puntaje += 5;
        }
        if (respuesta2.equals("Virtual Boy")){
            puntaje += 5;
        }
        if (respuesta3.toLowerCase().equals("kazuya")){
            puntaje += 5;
        }
        if (respuesta4.equals("Nintendo DS")){
            puntaje += 5;
        }

        lblResultados.setText(String.valueOf(puntaje) + "!");

    }


}
