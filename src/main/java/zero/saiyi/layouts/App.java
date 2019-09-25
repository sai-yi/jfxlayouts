package zero.saiyi.layouts;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
    	// change LayoutNames.{name}.toString()
    	// to view the other layout sample
    	// example ( LayoutNames.TilePane.toString();
    	
    	String layoutname= LayoutNames.FlowPane.toString();
    	
        scene = new Scene(loadFXML(layoutname),450,280);
        
        stage.setTitle(layoutname+" Layout");
        stage.setScene(scene);
        stage.show();
    }

//    static void setRoot(String fxml) throws IOException {
//        scene.setRoot(loadFXML(fxml));
//    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml.toLowerCase()+"layout.fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}