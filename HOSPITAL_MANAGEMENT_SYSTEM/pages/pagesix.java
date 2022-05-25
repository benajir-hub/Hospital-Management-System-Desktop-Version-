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

public class pagesix extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("HOSPITAL MANAGEMENT SYSTEM");
        VBox rootPage4a = new VBox(6);
		rootPage4a.setPadding(new Insets(25, 0, 10, 25));
			
		
        Label headLinePage4a = new Label("       ADMIT PATIENT   ");
        headLinePage4a.setFont(Font.font("Verdana", FontWeight.BOLD, 28));
		Separator separatorPage4a = new Separator();
		
		Label space1Page4a = new Label();
		Label space2Page4a = new Label();
		Label space3Page4a = new Label();
		
		HBox nameHboxpage4a = new HBox(45);
		Label nameLblPage4a = new Label("NAME:");
		nameLblPage4a.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		TextField nameTextFieldPage4a = new TextField();
		nameHboxpage4a.getChildren().addAll(nameLblPage4a, nameTextFieldPage4a);
		
		HBox idHboxpage4a = new HBox(64);
		Label idLblPage4a = new Label("ID:");
		idLblPage4a.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		TextField idTextFieldPage4a = new TextField();
		idHboxpage4a.getChildren().addAll(idLblPage4a, idTextFieldPage4a);

		HBox sexHboxpage4a = new HBox(56);		
		Label sexLblPage4a = new Label("SEX:");
		sexLblPage4a.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		final ToggleGroup groupPage4a = new ToggleGroup();
		RadioButton patientMaleRButtonPage4a = new RadioButton("Male");
		patientMaleRButtonPage4a.setToggleGroup(groupPage4a);
		RadioButton patientFemaleRButtonPage4a = new RadioButton("Female");
		patientFemaleRButtonPage4a.setToggleGroup(groupPage4a);
		sexHboxpage4a.getChildren().addAll(sexLblPage4a, patientMaleRButtonPage4a, patientFemaleRButtonPage4a);
		
		HBox admitDatePatientHboxpage4a = new HBox(8);
		Label admitDateLblPage4a = new Label("ADMIT DATE:");
		admitDateLblPage4a.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		DatePicker admitDatePickerPatientPage4a = new DatePicker();
		admitDatePatientHboxpage4a.getChildren().addAll(admitDateLblPage4a, admitDatePickerPatientPage4a);
		
		
		HBox patientDetailsHboxPage4a = new HBox(30);
		Label patientDetailsLblPage4a = new Label("DETAILS:");
		patientDetailsLblPage4a.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		TextField patientDetailsTextfieldPage4a = new TextField();
		patientDetailsHboxPage4a.getChildren().addAll(patientDetailsLblPage4a, patientDetailsTextfieldPage4a);
				
		HBox patientAddressHboxPage4a = new HBox(25);
		Label patientAddressLblPage4a = new Label("ADDRESS:");
		patientAddressLblPage4a.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		TextField patientAddressTextfieldPage4a = new TextField();
		patientAddressHboxPage4a.getChildren().addAll(patientAddressLblPage4a, patientAddressTextfieldPage4a);
		
		HBox patientContactNoHboxPage4a = new HBox(5);
		Label patientContactNotLblPage4a = new Label("CONTACT NO:");
		patientContactNotLblPage4a.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		TextField patientContactNoTextfieldPage4a = new TextField();
		patientContactNoHboxPage4a.getChildren().addAll(patientContactNotLblPage4a, patientContactNoTextfieldPage4a);
                
		Label space4Page4a=new Label();

		Label space5Page4a= new Label();
                
		HBox admitBackHboxPage3=new HBox(6);		
		Button admitBtnPage4a = new Button("ADMIT");
        admitBtnPage4a.setLayoutX(100);
		admitBtnPage4a.setLayoutY(300);
		//admitBtnPage4a.setOnAction(e -> primaryStage.setScene(patientManagementScene));
		Button backBtnPage4a = new Button("BACK");
		backBtnPage4a.setLayoutX(350);
		backBtnPage4a.setLayoutY(100);
		//backBtnPage4a.setOnAction(e -> primaryStage.setScene(patientManagementScene));
		Label spaceAdmitBackPage4a=new Label("                                                                               ");
		admitBackHboxPage3.getChildren().addAll(admitBtnPage4a,spaceAdmitBackPage4a,backBtnPage4a);

		
	    
		

		
		rootPage4a.getChildren().addAll(headLinePage4a,space1Page4a,space2Page4a,space3Page4a,nameHboxpage4a,idHboxpage4a,sexHboxpage4a,admitDatePatientHboxpage4a,patientDetailsHboxPage4a,patientAddressHboxPage4a,patientContactNoHboxPage4a,space4Page4a,space5Page4a,admitBackHboxPage3);

        
		

	
               
        Scene admitPatientScene = new Scene(rootPage4a,450,500);
        primaryStage.setScene(admitPatientScene);
        primaryStage.show();
    }

}
