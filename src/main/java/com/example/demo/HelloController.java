package com.example.demo;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {


    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick1() {
        welcomeText.setText("1");
    }
    @FXML
    protected void onHelloButtonClick2() {
        welcomeText.setText("2");
    }
    @FXML
    protected void onHelloButtonClick3() {
        welcomeText.setText("3");
    }
    @FXML
    protected void onHelloButtonClick4 () {
        welcomeText.setText("4");
    }
    @FXML
    protected void onHelloButtonClick5 () {
        welcomeText.setText("5");
    }
    @FXML
    protected void onHelloButtonClick6 () {
        welcomeText.setText("6");
    }
    @FXML
    protected void onHelloButtonClick7 () {
        welcomeText.setText("7");
    }
    @FXML
    protected void onHelloButtonClick8 () {
        welcomeText.setText("8");
    }
    @FXML
    protected void onHelloButtonClick9 () {
        welcomeText.setText("9");
    }
    @FXML
    protected void onHelloButtonClick10 () {
        welcomeText.setText("/");
    }
    @FXML
    protected void onHelloButtonClick11 () {
        welcomeText.setText("*");
    }
    @FXML
    protected void onHelloButtonClick12 () {
        welcomeText.setText("-");
    }
    @FXML
    protected void onHelloButtonClick13 () {
        welcomeText.setText("0");
    }
    @FXML
    protected void onHelloButtonClick14 () {
        welcomeText.setText("+");
    }
    @FXML
    protected void onHelloButtonClick15 () {
        welcomeText.setText("=");
    }
    @FXML
    protected void onHelloButtonClick0() {
        Platform.exit();

    }
}