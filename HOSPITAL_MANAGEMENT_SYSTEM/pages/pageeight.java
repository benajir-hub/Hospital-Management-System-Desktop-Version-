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


public class pageeight extends Application {
  
  @Override
  public void start(Stage primaryStage) {
      
    
    primaryStage.setTitle("Hospital Management System");

	VBox rootPage6=new VBox();

	
	VBox employeeInfoVboxPage6=new VBox();
    employeeInfoVboxPage6.setPadding(new Insets(20, 40, 20, 50));
    Label headLinePage6 = new Label("EMPLOYEE INFORMATION");
    headLinePage6.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
	Separator separatorPage6 = new Separator();
    employeeInfoVboxPage6.getChildren().addAll(headLinePage6, separatorPage6);
	
	HBox selectEmployeePage6=new HBox(40);
	selectEmployeePage6.setPadding(new Insets(20,10,10,30));
	Label selectEmployeelabelPage6=new Label("SELECT EMPLOYEE : ");
	ChoiceBox selectEmployeeChoiceBoxPage6 = new ChoiceBox(FXCollections.observableArrayList("DOCTOR", "NURSE", "OTHER STUFF"));
	selectEmployeePage6.getChildren().addAll(selectEmployeelabelPage6,selectEmployeeChoiceBoxPage6);


    HBox idSearchPage6=new HBox(40);
    idSearchPage6.setPadding(new Insets(20,10,10,30));
    Label employeeIdLblPage6=new Label("ID:				");
    TextField employeeIdTextFieldPage6=new TextField();
    Button employeeIdSearchButtonPage6=new Button("   Search   ");
	idSearchPage6.getChildren().addAll(employeeIdLblPage6,employeeIdTextFieldPage6,employeeIdSearchButtonPage6);
    
    
    TableView employeeInfoTableViewPage6=new TableView();
    TableColumn employeeNameColumnPage6 = new TableColumn("NAME"); 
    TableColumn employeeSexColumnPage6 = new TableColumn("Sex"); 
    TableColumn employeeHireDateColumnPage6 = new TableColumn("Hire Date"); 
    TableColumn employeeSalaryColumnPage6 = new TableColumn("Salary"); 
    TableColumn employeeAddressColumnPage6 = new TableColumn("Addrress"); 
    TableColumn employeeContactColumnPage6 = new TableColumn("Contact No"); 
    
    employeeInfoTableViewPage6.getColumns().addAll(employeeNameColumnPage6,employeeSexColumnPage6,employeeHireDateColumnPage6,employeeSalaryColumnPage6,employeeAddressColumnPage6,employeeContactColumnPage6);
    
    
    try{
            // Setting personList to table as a observable list
            employeeInfoTableViewPage6.setItems(FXCollections.observableArrayList());
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    employeeInfoTableViewPage6.setLayoutY(150);
    
    
    VBox backVboxPage6=new VBox();
    backVboxPage6.setPadding(new Insets(50,20,30,300));
    Button backBtnPage6=new Button("      Back      ");
	//backBtnPage6.setOnAction(e -> primaryStage.setScene(showInfoScene));
    backVboxPage6.getChildren().addAll(backBtnPage6);
	
	rootPage6.getChildren().addAll(employeeInfoVboxPage6,selectEmployeePage6,idSearchPage6,employeeInfoTableViewPage6,backVboxPage6);
	
	
    Scene employeeInfoScene = new Scene(rootPage6,450,500);
	primaryStage.setScene(employeeInfoScene);
    primaryStage.show();
  }
}