import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;

public class thirdPage extends Application{
	
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Hospital Management System");
		VBox rootPage2 = new VBox(6);
		rootPage2.setPadding(new Insets(20, 20, 20, 20));
		
		VBox headLinePage2 = new VBox(6);
		headLinePage2.setPadding(new Insets(30, 30, 30, 30));
        Label headLineLblPage2 = new Label("EMPLOYEE MANAGEMENT");
        headLineLblPage2.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
		Separator separatorPage2 = new Separator();
		headLinePage2.getChildren().addAll(headLineLblPage2, separatorPage2); 
		
		
		VBox optionsPage2 = new VBox(30);
		optionsPage2.setPadding(new Insets(0, 100, 50, 100));
		Button addEmployeeBtnPage2=new Button("ADD EMPLOYEE");
		addEmployeeBtnPage2.setMaxWidth(Double.MAX_VALUE);
		addEmployeeBtnPage2.setPadding(new Insets(17,3,17,3));
		Button manageEmployeeBtnPage2=new Button("MANAGE EMPLOYEE");
		manageEmployeeBtnPage2.setMaxWidth(Double.MAX_VALUE);
		manageEmployeeBtnPage2.setPadding(new Insets(17,3,17,3));
		optionsPage2.getChildren().addAll(addEmployeeBtnPage2, manageEmployeeBtnPage2);
		
		VBox backPage2 = new VBox(6);
		backPage2.setPadding(new Insets(0, 120, 80, 120));
		Button backBtnPage2=new Button("Back");
		backBtnPage2.setMaxWidth(Double.MAX_VALUE);
		backBtnPage2.setPadding(new Insets(17,3,17,3));
		backPage2.getChildren().addAll(backBtnPage2);
	
		rootPage2.getChildren().addAll(headLinePage2, optionsPage2, backPage2);
		
        Scene employeeManagementScene = new Scene(rootPage2,450,500);
        primaryStage.setScene(employeeManagementScene);
        primaryStage.show();
	}
}