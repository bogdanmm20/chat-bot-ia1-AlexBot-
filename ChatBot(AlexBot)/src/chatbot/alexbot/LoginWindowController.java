/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbot.alexbot;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 *
 * @author georg
 */
public class LoginWindowController {
    private Main main = new Main();
    
    @FXML
    private Button loginButton;
    
    @FXML
    private void initialize() {
        loginButton.setOnAction((ActionEvent e) -> {
            try {
                main.showChatWindow("George", "22", "Student");
            } catch (IOException ex) {
                System.out.println("Eroare la deschidere chat!");
            }
        });
    }
}
