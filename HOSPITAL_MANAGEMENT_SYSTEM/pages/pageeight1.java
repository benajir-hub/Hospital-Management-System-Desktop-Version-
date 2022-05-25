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
import javafx.scene.control.ChoiceBox;


public class pageeight1 extends Application {
  
  @Override
  public void start(Stage primaryStage) {
      
    
    primaryStage.setTitle("Hospital Management System");

	VBox rootPage61=new VBox();

	
	VBox patientInfoVboxPage61=new VBox();
    patientInfoVboxPage61.setPadding(new Insets(20, 40, 20, 50));
    Label headLinePage61 = new Label("PATIENT INFORMATION");
    headLinePage61.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
	Separator separatorPage61 = new Separator();
    patientInfoVboxPage61.getChildren().addAll(headLinePage61, separatorPage61);


    HBox idSearchPage61=new HBox(40);
    idSearchPage61.setPadding(new Insets(20,10,10,30));
    Label patientIdLblPage61=new Label("ID:				");
    TextField patientIdTextFieldPage61=new TextField();
    Button patientIdSearchButtonPage61=new Button("   Search   ");
	idSearchPage61.getChildren().addAll(patientIdLblPage61,patientIdTextFieldPage61,patientIdSearchButtonPage61);
    
    
    TableView patientInfoTableViewPage61=new TableView();
    TableColumn patientNameColumnPage61 = new TableColumn("NAME"); 
    TableColumn patientSexColumnPage61 = new TableColumn("SEX"); 
    TableColumn patientAdmitDateColumnPage61 = new TableColumn("ADMIT DATE"); 
    TableColumn patientDischargeDateColumnPage61 = new TableColumn("DIS. DATE"); 
    TableColumn patientAddressColumnPage61 = new TableColumn("ADDRESS"); 
    TableColumn patientContactColumnPage61 = new TableColumn("CNTCT"); 
    
    patientInfoTableViewPage61.getColumns().addAll(patientNameColumnPage61,patientSexColumnPage61,patientAdmitDateColumnPage61,patientDischargeDateColumnPage61,patientAddressColumnPage61,patientContactColumnPage61);
    
    
    try{
            // Setting personList to table as a observable list
            patientInfoTableViewPage61.setItems(FXCollections.observableArrayList());
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    patientInfoTableViewPage61.setLayoutY(150);
    
    
    VBox backVboxPage61=new VBox();
    backVboxPage61.setPadding(new Insets(50,20,30,300));
    Button backBtnPage61=new Button("      Back      ");
	//backBtnPage61.setOnAction(e -> primaryStage.setScene(showInfoScene));
    backVboxPage61.getChildren().addAll(backBtnPage61);
	
	rootPage61.getChildren().addAll(patientInfoVboxPage61,idSearchPage61,patientInfoTableViewPage61,backVboxPage61);
	
	
    Scene patientInfoScene = new Scene(rootPage61,450,500);
	primaryStage.setScene(patientInfoScene);
    primaryStage.show();
  }
}