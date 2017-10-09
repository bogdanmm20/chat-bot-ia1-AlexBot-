/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbot.alexbot;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author georg
 */
public class Main extends Application {
    
    public static Stage primaryStage;
    public static BorderPane mainLayout;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Main.primaryStage = primaryStage;
        Main.primaryStage.setTitle("AlexBot");
        //primaryStage.initStyle(StageStyle.UNDECORATED);

        showLoginWindow();
    }
    
    public void showChatWindow(String nume, String varsta, String ocupatie) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("ChatWindow.fxml"));
        mainLayout = loader.load();
        Scene scene = new Scene(mainLayout);
        primaryStage.setScene(scene);
        
        
        ChatWindowController controller = loader.getController();
        controller.setStage(primaryStage);
        controller.setUser(nume, varsta, ocupatie);
        System.out.println("1 " + nume);
        
        primaryStage.show();

    }
    
    private void showLoginWindow() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("LoginWindow.fxml"));
        mainLayout = loader.load();
        Scene scene = new Scene(mainLayout);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
    
}
