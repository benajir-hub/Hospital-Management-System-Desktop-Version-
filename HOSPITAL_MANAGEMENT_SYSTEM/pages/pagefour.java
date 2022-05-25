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

public class pagefour extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
		
        VBox rootPage3 = new VBox(6);
		rootPage3.setPadding(new Insets(25, 0, 10, 25));

		
        Label headLinePage3 = new Label("      EMPLOYEE ADDING   ");
        headLinePage3.setFont(Font.font("Verdana", FontWeight.BOLD, 28));
        Separator separatorPage3 = new Separator();
		
		HBox selectEmployeePage3=new HBox(10);
		Label selectEmployeelabelPage3=new Label("SELECT EMPLOYEE : ");
		ChoiceBox selectEmployeeChoiceBoxPage3 = new ChoiceBox(FXCollections.observableArrayList("DOCTOR", "NURSE", "OTHER STUFF"));
		selectEmployeePage3.getChildren().addAll(selectEmployeelabelPage3,selectEmployeeChoiceBoxPage3);
	
		
		Label space1Page3 = new Label();
		Label space2Page3 = new Label();
		Label space3Page3 = new Label();
		
		HBox nameHboxpage3 = new HBox(45);
		Label nameLblPage3 = new Label("NAME:");
		nameLblPage3.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		TextField nameTextFieldPage3 = new TextField();
		nameHboxpage3.getChildren().addAll(nameLblPage3, nameTextFieldPage3);

		HBox idHboxpage3 = new HBox(64);
		Label idLblPage3 = new Label("ID:");
		idLblPage3.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		TextField idTextFieldPage3 = new TextField();
		idHboxpage3.getChildren().addAll(idLblPage3, idTextFieldPage3);
		
		HBox sexHboxpage3 = new HBox(56);		
		Label sexLblPage3 = new Label("SEX:");
		sexLblPage3.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		final ToggleGroup group = new ToggleGroup();
		RadioButton employeeMaleRButtonPage3 = new RadioButton("Male");
		employeeMaleRButtonPage3.setToggleGroup(group);
		RadioButton employeeFemaleRButtonPage3 = new RadioButton("Female");
		employeeFemaleRButtonPage3.setToggleGroup(group);
		sexHboxpage3.getChildren().addAll(sexLblPage3, employeeMaleRButtonPage3,employeeFemaleRButtonPage3);
		
		HBox hireDateHboxpage3 = new HBox(15);
		Label hireDateLblPage3 = new Label("HIRE DATE:");
		hireDateLblPage3.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		DatePicker dobPickerEmployeePage3 = new DatePicker();
		hireDateHboxpage3.getChildren().addAll(hireDateLblPage3, dobPickerEmployeePage3);
				
		HBox salaryHboxpage3 = new HBox(33);
		Label salaryLblPage3 = new Label("SALARY:");
		salaryLblPage3.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		TextField salaryTextFieldPage3 = new TextField();
		salaryHboxpage3.getChildren().addAll(salaryLblPage3, salaryTextFieldPage3);
				
		HBox addressHboxpage3 = new HBox(23);
		Label addressLblPage3 = new Label("ADDRESS:");
		addressLblPage3.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		TextField addressTextFieldPage3 = new TextField();
		addressHboxpage3.getChildren().addAll(addressLblPage3, addressTextFieldPage3);
		
		HBox contactNoHboxpage3 = new HBox(4);
		Label contactNoLblPage3 = new Label("CONTACT NO:");
		contactNoLblPage3.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		TextField contactNoTextFieldPage3 = new TextField();
		contactNoHboxpage3.getChildren().addAll(contactNoLblPage3, contactNoTextFieldPage3);
		
                
                Label space4Page3=new Label();
		
				Label space5Page3= new Label();
                
                HBox addBackHboxPage3=new HBox(6);
                
                Button addBtnPage3 = new Button("ADD");
                addBtnPage3.setLayoutX(100);
                addBtnPage3.setLayoutY(300);
				//backBtnPage3.setOnAction(e -> primaryStage.setScene(employeeManagementScene));
                Button backBtnPage3 = new Button("BACK");
                backBtnPage3.setLayoutX(350);
                backBtnPage3.setLayoutY(100);
				//backBtnPage3.setOnAction(e -> primaryStage.setScene(employeeManagementScene));
                Label spaceAddBackPage3=new Label("                                                                               ");
                addBackHboxPage3.getChildren().addAll(addBtnPage3,spaceAddBackPage3,backBtnPage3);
                
                
                
		
		
		rootPage3.getChildren().addAll(headLinePage3,separatorPage3,selectEmployeePage3,space1Page3,space2Page3,space3Page3,nameHboxpage3,idHboxpage3,sexHboxpage3,hireDateHboxpage3,salaryHboxpage3,addressHboxpage3,contactNoHboxpage3,space4Page3,space5Page3,addBackHboxPage3);

	
               
        Scene employeeAddingScene = new Scene(rootPage3,450,500);
        primaryStage.setScene(employeeAddingScene);
        primaryStage.show();
    }

}
