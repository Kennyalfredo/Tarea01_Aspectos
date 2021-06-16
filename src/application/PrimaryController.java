package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
public class PrimaryController {
	
	public String color;
	@FXML
	private VBox vbox;
    
	@FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    void changeColor(MouseEvent event) {
    	Button btnb = (Button) event.getSource();
    	switch(btnb.getId()) {
    	case "btn1":
    		color="black";
    		break;
    	case "btn2":
    		color="orange";
    		break;
    	case "btn3":
    		
    		color="green";
    		break;
    	default:
    		color="#FFFFFF";
    		break;
    	}
    	
    	
    	vbox.setStyle("-fx-background-color: "+color);
    }

}
