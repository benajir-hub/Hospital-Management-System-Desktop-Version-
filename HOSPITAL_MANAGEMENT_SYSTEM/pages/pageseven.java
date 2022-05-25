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

public class pageseven extends Application {
  
  @Override
  public void start(Stage primaryStage) {
      
      
    primaryStage.setTitle("Hospital Management System");

    VBox rootPage5 = new VBox();
	//rootPage5.setPadding(new Insets(20));
    //Scene showInfoScene = new Scene(rootPage5,450,500);
    
    VBox showInfoVboxPage5=new VBox();
    showInfoVboxPage5.setPadding(new Insets(20, 75, 0, 70));
    Label headLinePage5 = new Label("SHOW INFORMATION");
    headLinePage5.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
	Separator separatorPage5 = new Separator();
    showInfoVboxPage5.getChildren().addAll(headLinePage5, separatorPage5);
    
    
    VBox optionsPage5=new VBox();
    optionsPage5.setPadding(new Insets(30,160,0,160));
    optionsPage5.setSpacing(30);

    Button employeeInfoBtnPage5 = new Button("EMPLOYEE");
	employeeInfoBtnPage5.setMaxWidth(Double.MAX_VALUE);
	employeeInfoBtnPage5.setPadding(new Insets(17,3,17,3));
    Button patientInfoBtnPage5 = new Button("PATIENT");
	patientInfoBtnPage5.setMaxWidth(Double.MAX_VALUE);
	patientInfoBtnPage5.setPadding(new Insets(17,3,17,3));
	optionsPage5.getChildren().addAll(employeeInfoBtnPage5,patientInfoBtnPage5);
    
    
    VBox backVboxPage5=new VBox();
    backVboxPage5.setPadding(new Insets(80,160,0,160));
    Button backBtnPage5=new Button("Back");
    backBtnPage5.setMaxWidth(Double.MAX_VALUE);
	backBtnPage5.setPadding(new Insets(17,3,17,3));
    backVboxPage5.getChildren().addAll(backBtnPage5);
    
   // sInfoBackbtn.setOnAction(e -> primaryStage.setScene(dischargePatient9Scene));
    //sInfoDoctorBtn.setOnAction(e -> primaryStage.setScene(searchInformationDoctor));
    
    
    rootPage5.getChildren().addAll(showInfoVboxPage5,optionsPage5,backVboxPage5);
	
    Scene showInfoScene = new Scene(rootPage5,450,500);
	primaryStage.setScene(showInfoScene);
    primaryStage.show();
  }
}