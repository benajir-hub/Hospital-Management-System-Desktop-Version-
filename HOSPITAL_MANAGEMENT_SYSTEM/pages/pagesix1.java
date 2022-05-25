import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Separator;


public class pagesix1 extends Application {
  
	@Override
	public void start(Stage primaryStage) throws Exception {


	primaryStage.setTitle("HOSPITAL MANAGEMENT SYSTEM");
	VBox rootPage4b = new VBox(6);
	rootPage4b.setPadding(new Insets(25, 0, 10, 25));

	VBox dischargePatientVboxPage4b = new VBox();
	Label headLinePage4b = new Label("       DISCHARGE PATIENT   ");
	headLinePage4b.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
	Separator separatorPage4b = new Separator();
	dischargePatientVboxPage4b.getChildren().addAll(headLinePage4b, separatorPage4b);	

	HBox idHboxpage4b = new HBox(75);
	idHboxpage4b.setPadding(new Insets(40,0,0,20));
	Label idLblPage4b = new Label("PATIENT's ID:");
	idLblPage4b.setFont(Font.font("Verdana", FontWeight.BOLD, 14));
	TextField idTextFieldPage4b = new TextField();
	idHboxpage4b.getChildren().addAll(idLblPage4b, idTextFieldPage4b);

	HBox dischargeDatePatientHboxpage4b = new HBox(40);
	dischargeDatePatientHboxpage4b.setPadding(new Insets(40,0,0,20));
	Label dischargeDateLblPage4b = new Label("DISCHARGE DATE:");
	dischargeDateLblPage4b.setFont(Font.font("Verdana", FontWeight.BOLD, 14));
	DatePicker dischargeDatePickerPatientPage4b = new DatePicker();
	dischargeDatePatientHboxpage4b.getChildren().addAll(dischargeDateLblPage4b, dischargeDatePickerPatientPage4b);


	HBox showBillHboxPage4b=new HBox(67);
	showBillHboxPage4b.setPadding(new Insets(40,10,0,20));
	Button ShowBillBtnPage4b=new Button("  SHOW BILL  ");
	ShowBillBtnPage4b.setMaxWidth(Double.MAX_VALUE);
	TextArea showBillAreaTextfieldPage4b=new TextArea();
	showBillAreaTextfieldPage4b.setMaxSize(220,120);
	showBillHboxPage4b.getChildren().addAll(ShowBillBtnPage4b,showBillAreaTextfieldPage4b);


	HBox dischargeBackHboxPage4b=new HBox(220);
	dischargeBackHboxPage4b.setPadding(new Insets(60,20,0,20));
	Button dischargeBtnPage4b=new Button("DISCHARGE");
	dischargeBtnPage4b.setMaxWidth(Double.MAX_VALUE);
	//dischargeBtnPage4b.setOnAction(e -> primaryStage.setScene(patientManagementScene));
	Button backBtnPage4b=new Button("     BACK     ");
	backBtnPage4b.setMaxWidth(Double.MAX_VALUE);
	//backBtnPage4b.setOnAction(e -> primaryStage.setScene(patientManagementScene));
	dischargeBackHboxPage4b.getChildren().addAll(dischargeBtnPage4b,backBtnPage4b);




	rootPage4b.getChildren().addAll(dischargePatientVboxPage4b,idHboxpage4b,dischargeDatePatientHboxpage4b,showBillHboxPage4b,dischargeBackHboxPage4b);
	rootPage4b.setPadding(new Insets(10));


	Scene dischargePatientScene = new Scene(rootPage4b,450,500);
	primaryStage.setScene(dischargePatientScene);
	primaryStage.show();
	}

 }