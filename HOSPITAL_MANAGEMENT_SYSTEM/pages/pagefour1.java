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

public class pagefour1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
		
        VBox rootPage31 = new VBox(6);
		rootPage31.setPadding(new Insets(25, 0, 10, 25));

		
        Label headLinePage31 = new Label("      EMPLOYEE UPDATING   ");
        headLinePage31.setFont(Font.font("Verdana", FontWeight.BOLD, 28));
        Separator separatorPage31 = new Separator();
		
		HBox selectEmployeePage31=new HBox(10);
		Label selectEmployeelabelPage31=new Label("SELECT EMPLOYEE : ");
		ChoiceBox selectEmployeeChoiceBoxPage31 = new ChoiceBox(FXCollections.observableArrayList("DOCTOR", "NURSE", "OTHER STUFF"));
		selectEmployeePage31.getChildren().addAll(selectEmployeelabelPage31,selectEmployeeChoiceBoxPage31);
	
		
		Label space1Page31 = new Label();
		Label space2Page31 = new Label();
		Label space3Page31 = new Label();
		
		HBox nameHboxpage31 = new HBox(45);
		Label nameLblPage31 = new Label("NAME:");
		nameLblPage31.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		TextField nameTextFieldPage31 = new TextField();
		nameHboxpage31.getChildren().addAll(nameLblPage31, nameTextFieldPage31);

		HBox idHboxpage31 = new HBox(64);
		Label idLblPage31 = new Label("ID:");
		idLblPage31.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		TextField idTextFieldPage31 = new TextField();
		idHboxpage31.getChildren().addAll(idLblPage31, idTextFieldPage31);
		
		HBox sexHboxpage31 = new HBox(56);		
		Label sexLblPage31 = new Label("SEX:");
		sexLblPage31.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		final ToggleGroup groupPage31 = new ToggleGroup();
		RadioButton employeeMaleRButtonPage31 = new RadioButton("Male");
		employeeMaleRButtonPage31.setToggleGroup(groupPage31);
		RadioButton employeeFemaleRButtonPage31 = new RadioButton("Female");
		employeeFemaleRButtonPage31.setToggleGroup(groupPage31);
		sexHboxpage31.getChildren().addAll(sexLblPage31, employeeMaleRButtonPage31,employeeFemaleRButtonPage31);
		
		HBox hireDateHboxpage31 = new HBox(15);
		Label hireDateLblPage31 = new Label("HIRE DATE:");
		hireDateLblPage31.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		DatePicker dobPickerEmployeePage31 = new DatePicker();
		hireDateHboxpage31.getChildren().addAll(hireDateLblPage31, dobPickerEmployeePage31);
				
		HBox salaryHboxpage31 = new HBox(33);
		Label salaryLblPage31 = new Label("SALARY:");
		salaryLblPage31.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		TextField salaryTextFieldPage31= new TextField();
		salaryHboxpage31.getChildren().addAll(salaryLblPage31, salaryTextFieldPage31);
				
		HBox addressHboxpage31 = new HBox(23);
		Label addressLblPage31 = new Label("ADDRESS:");
		addressLblPage31.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		TextField addressTextFieldPage31 = new TextField();
		addressHboxpage31.getChildren().addAll(addressLblPage31, addressTextFieldPage31);
		
		HBox contactNoHboxpage31 = new HBox(4);
		Label contactNoLblPage31 = new Label("CONTACT NO:");
		contactNoLblPage31.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		TextField contactNoTextFieldPage31 = new TextField();
		contactNoHboxpage31.getChildren().addAll(contactNoLblPage31, contactNoTextFieldPage31);
		
		
		Label space4Page31=new Label();

		Label space5Page31= new Label();
		
		HBox updateBackHboxPage31=new HBox(6);
		
		Button updateBtnPage31 = new Button("UPDATE");
		updateBtnPage31.setLayoutX(100);
		updateBtnPage31.setLayoutY(300);
		//updateBtnPage31.setOnAction(e -> primaryStage.setScene(employeeManagementScene));
		Button backBtnPage31 = new Button("BACK");
		backBtnPage31.setLayoutX(350);
		backBtnPage31.setLayoutY(100);
		//backBtnPage31.setOnAction(e -> primaryStage.setScene(employeeManagementScene));
		Label spaceAddBackPage31=new Label("                                                                               ");
		updateBackHboxPage31.getChildren().addAll(updateBtnPage31,spaceAddBackPage31,backBtnPage31);
                
                
                
		rootPage31.getChildren().addAll(headLinePage31,separatorPage31,selectEmployeePage31,space1Page31,space2Page31,space3Page31,nameHboxpage31,idHboxpage31,sexHboxpage31,hireDateHboxpage31,salaryHboxpage31,addressHboxpage31,contactNoHboxpage31,space4Page31,space5Page31,updateBackHboxPage31);

	
               
        Scene employeeUpdatingScene = new Scene(rootPage31,450,500);
        primaryStage.setScene(employeeUpdatingScene);
        primaryStage.show();
    }

}
