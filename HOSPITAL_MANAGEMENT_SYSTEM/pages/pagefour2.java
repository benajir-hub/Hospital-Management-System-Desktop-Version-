import javafx.geometry.Insets;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.scene.shape.Line;
import javafx.scene.control.Separator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ChoiceBox;
import javafx.collections.FXCollections;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Orientation;

public class pagefour2 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
		
        VBox rootPage32 = new VBox(6);
		rootPage32.setPadding(new Insets(25, 0, 10, 25));

		
        Label headLinePage32 = new Label("      EMPLOYEE DELETING   ");
        headLinePage32.setFont(Font.font("Verdana", FontWeight.BOLD, 28));
        Separator separatorPage32 = new Separator();
		
		HBox selectEmployeePage32=new HBox(10);
		Label selectEmployeelabelPage32=new Label("SELECT EMPLOYEE : ");
		ChoiceBox selectEmployeeChoiceBoxPage32 = new ChoiceBox(FXCollections.observableArrayList("DOCTOR", "NURSE", "OTHER STUFF"));
		selectEmployeePage32.getChildren().addAll(selectEmployeelabelPage32,selectEmployeeChoiceBoxPage32);
	
		
		Label space1Page32 = new Label();
		Label space2Page32 = new Label();
		Label space3Page32 = new Label();
		
		HBox nameHboxpage32 = new HBox(45);
		Label nameLblPage32 = new Label("NAME:");
		nameLblPage32.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		TextField nameTextFieldPage32 = new TextField();
		nameHboxpage32.getChildren().addAll(nameLblPage32, nameTextFieldPage32);

		HBox idHboxpage32 = new HBox(64);
		Label idLblPage32 = new Label("ID:");
		idLblPage32.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		TextField idTextFieldPage32 = new TextField();
		idHboxpage32.getChildren().addAll(idLblPage32, idTextFieldPage32);
		
		
		Label space4Page32=new Label();

		Label space5Page32= new Label();
		
		HBox deleteBackHboxPage32=new HBox(6);
		Button deleteBtnPage32 = new Button("DELETE");
		deleteBtnPage32.setLayoutX(100);
		deleteBtnPage32.setLayoutY(300);
		//deleteBtnPage32.setOnAction(e -> primaryStage.setScene(employeeManagementScene));
		Button backBtnPage32 = new Button("BACK");
		backBtnPage32.setLayoutX(350);
		backBtnPage32.setLayoutY(100);
		//backBtnPage32.setOnAction(e -> primaryStage.setScene(employeeManagementScene));
		Label spaceAddBackPage32=new Label("                                                                               ");
		deleteBackHboxPage32.getChildren().addAll(deleteBtnPage32,spaceAddBackPage32,backBtnPage32);
                
                
                
		rootPage32.getChildren().addAll(headLinePage32,separatorPage32,selectEmployeePage32,space1Page32,space2Page32,space3Page32,nameHboxpage32,idHboxpage32,space4Page32,space5Page32,deleteBackHboxPage32);

	
               
        Scene employeeDeletingScene = new Scene(rootPage32,450,500);
        primaryStage.setScene(employeeDeletingScene);
        primaryStage.show();
    }

}
