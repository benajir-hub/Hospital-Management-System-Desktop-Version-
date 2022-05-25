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

public class secondPage extends Application{
	
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Hospital Management System");
		VBox rootPage1 = new VBox(6);
		rootPage1.setPadding(new Insets(20, 20, 20, 20));
		
		VBox headLinePage1 = new VBox(6);
		headLinePage1.setPadding(new Insets(30, 120, 30, 120));
        Label headLineLblPage1 = new Label("HOME PAGE");
        headLineLblPage1.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
		Separator separatorPage1 = new Separator();
		headLinePage1.getChildren().addAll(headLineLblPage1, separatorPage1); 
		
		
		VBox optionsPage1 = new VBox(30);
		optionsPage1.setPadding(new Insets(20, 100, 50, 100));
		Button employeeBtnPage1=new Button("EMPLOYEE MANAGEMENT");
		employeeBtnPage1.setMaxWidth(Double.MAX_VALUE);
		employeeBtnPage1.setPadding(new Insets(17,3,17,3));
		Button patientBtnPage1=new Button("PATIENT MANAGEMENT ");
		patientBtnPage1.setMaxWidth(Double.MAX_VALUE);
		patientBtnPage1.setPadding(new Insets(17,3,17,3));
		Button showInfoBtnPage1=new Button("     SHOW INFO     ");
		showInfoBtnPage1.setMaxWidth(Double.MAX_VALUE);
		showInfoBtnPage1.setPadding(new Insets(17,3,17,3));
		optionsPage1.getChildren().addAll(employeeBtnPage1, patientBtnPage1, showInfoBtnPage1);
		
		VBox logOutPage1 = new VBox(6);
		logOutPage1.setPadding(new Insets(0, 120, 80, 120));
		Button logOutBtnPage1=new Button("LOG OUT");
		logOutBtnPage1.setMaxWidth(Double.MAX_VALUE);
		logOutBtnPage1.setPadding(new Insets(17,3,17,3));
		logOutPage1.getChildren().addAll(logOutBtnPage1);
	
		rootPage1.getChildren().addAll(headLinePage1, optionsPage1, logOutPage1);
		
        Scene homePageScene = new Scene(rootPage1,450,500);
        primaryStage.setScene(homePageScene);
        primaryStage.show();
	}
}