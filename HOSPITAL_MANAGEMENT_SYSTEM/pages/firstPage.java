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

public class firstPage extends Application{
	
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Start Page");
		VBox rootPage0 = new VBox(6);
		rootPage0.setPadding(new Insets(20, 20, 20, 20));
		
		VBox headLinePage0 = new VBox(6);
		headLinePage0.setPadding(new Insets(0, 0, 0, 0));
		Label spacePage0 = new Label();
        Label headLineLblPage0 = new Label("Hospital Management System");
        headLineLblPage0.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
		Separator separatorPage0 = new Separator();
		headLinePage0.getChildren().addAll(spacePage0, headLineLblPage0, separatorPage0); 
		
		VBox pic = new VBox(10);
		pic.setPadding(new Insets(20, 120, 0, 120));
		Image image = new Image("image.png");
		ImageView hospitalImageView = new ImageView();
		hospitalImageView.setImage(image);
        hospitalImageView.setFitWidth(200);
        hospitalImageView.setPreserveRatio(true);
		hospitalImageView.setSmooth(true);
        hospitalImageView.setCache(true);
		pic.getChildren().addAll( hospitalImageView); 
		 
	
		
		VBox idPassPage0 = new VBox(6);
		idPassPage0.setPadding(new Insets(20, 120, 20, 120));
		Label idLebel = new Label("USER ID");
		idLebel.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		TextField idTextField = new TextField();
		Label passLebel = new Label("PASSWORD");
		passLebel.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		PasswordField passwordText = new PasswordField();
		idPassPage0.getChildren().addAll(idLebel, idTextField, passLebel, passwordText);
		
		VBox logIn = new VBox(6);
		logIn.setPadding(new Insets(0, 120, 80, 120));
		Button logInBtn=new Button("LOG IN");
		logInBtn.setMaxWidth(Double.MAX_VALUE);
		logIn.getChildren().addAll(logInBtn);
	
		rootPage0.getChildren().addAll(headLinePage0,  pic, idPassPage0, logIn);
		
        Scene startPageScene = new Scene(rootPage0, 450, 500);
        primaryStage.setScene(startPageScene);
        primaryStage.show();
	}
}