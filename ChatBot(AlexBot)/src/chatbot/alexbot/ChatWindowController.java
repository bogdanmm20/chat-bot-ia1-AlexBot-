/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbot.alexbot;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 *
 * @author georg
 */
public class ChatWindowController {

    private Stage stage;
    private ChatWindowController controller;
    
    private String nume;
    private String varsta;
    private String ocupatie;

    @FXML
    private TextArea messageWindow;
    @FXML
    private Label conversationWindow;
    @FXML
    private Button sendButton;

    @FXML
    private void initialize() {
       // messageWindow.setText("");
        //conversationWindow.setText("");

        StringBuilder sb = new StringBuilder();

        sendButton.setOnAction((ActionEvent e) -> {
           // messageWindow.get
                    
            sb.append(messageWindow.getText()).append("\n");
            
            String conversationStr = sb.toString();
        
            conversationWindow.setText(conversationStr);
            
            messageWindow.setText("");
        });
        
        
        
        
        

    }
    
    public void setUser(String nume, String varsta, String ocupatie){
        this.nume = nume;
        this.varsta = varsta;
        this.ocupatie = ocupatie;
        
        welcomeMessage();
    }
    
    private void welcomeMessage(){
        conversationWindow.setText("Salut mai " + this.nume + "\n");
    }
    
    public void setStage(Stage stage){
        this.stage = stage;
    }
    
    
}
