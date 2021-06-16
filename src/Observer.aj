
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
public aspect Observer {
	pointcut succes(): execution(void changeColor(..));
	after() returning :succes(){
		MouseEvent event= (MouseEvent) thisJoinPoint.getArgs()[0];
		Button btn = (Button)event.getSource();
		String color;
		
		switch(btn.getId()) {
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
		System.out.println("La pantalla cambio a color: "+color);
		
	}
}
