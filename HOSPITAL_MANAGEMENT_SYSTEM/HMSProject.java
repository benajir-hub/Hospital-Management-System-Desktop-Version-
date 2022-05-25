import java.lang.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.CheckBox;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javax.swing.JOptionPane;

abstract class Employee{

   String name;
   String id;
   String sex;
   String hireDate;
   int salary;
   String address;
   String contactNo;
   
   abstract  String getName();

}

class Doctor extends Employee{

    public Doctor(String name,String id,String sex, String hireDate,int salary, String address, String contactNo) {
        super.name=name;
        super.id=id;
        super.sex=sex;
        super.hireDate=hireDate;
        super.salary=salary;
        super.address=address;
        super.contactNo=contactNo;
        
    }


    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getSex() {
        return sex;
    }

    public String getHireDate() {
        return hireDate;
    }

    public int getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

}

class Nurse extends Employee{
    public Nurse(String name,String id,String sex, String hireDate,int salary, String address, String contactNo) {
        super.name=name;
        super.id=id;
        super.sex=sex;
        super.hireDate=hireDate;
        super.salary=salary;
        super.address=address;
        super.contactNo=contactNo;
        
    }
    public Nurse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    

}

class Stuff extends Employee{
    
    public Stuff(String name,String id,String sex, String hireDate,int salary, String address, String contactNo) {
        super.name=name;
        super.id=id;
        super.sex=sex;
        super.hireDate=hireDate;
        super.salary=salary;
        super.address=address;
        super.contactNo=contactNo;
        
    }
    public Stuff() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }


}
class Patient {
   String name;
   String id;
   String sex;
   String admitDate;
   String details;
   String address;
   String contactNo;
   String dischargeDate;

    public Patient(String name, String id, String sex, String admitDate, String details, String address, String contactNo) {
        this.name = name;
        this.id = id;
        this.sex = sex;
        this.admitDate = admitDate;
        this.details = details;
        this.address = address;
        this.contactNo = contactNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAdmitDate() {
        return admitDate;
    }

    public void setAdmitDate(String admitDate) {
        this.admitDate = admitDate;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

}





class Room{
    String roomID;
    int roomRent;

    public Room(String roomID, int roomRent) {
        this.roomID = roomID;
        this.roomRent = roomRent;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public int getRoomRent() {
        return roomRent;
    }

    public void setRoomRent(int roomRent) {
        this.roomRent = roomRent;
    }

}



public class HMSProject extends Application{
	
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Start Page");
		VBox rootPage0 = new VBox(6);
		rootPage0.setPadding(new Insets(20, 20, 20, 20));
		Scene startPageScene = new Scene(rootPage0, 450, 500);
	
		
		VBox rootPage1 = new VBox(6);
		rootPage1.setPadding(new Insets(20, 20, 20, 20));
		Scene homePageScene = new Scene(rootPage1,450,500);
		
		
		VBox rootPage2 = new VBox(6);
		rootPage2.setPadding(new Insets(20, 20, 20, 20));
		Scene employeeManagementScene = new Scene(rootPage2,450,500);
		
		
		VBox rootPage3 = new VBox(6);
		rootPage3.setPadding(new Insets(25, 0, 10, 25));
		Scene employeeAddingScene = new Scene(rootPage3,450,500);
		
		
		VBox rootPage31 = new VBox(6);
		rootPage31.setPadding(new Insets(25, 0, 10, 25));
		Scene employeeUpdatingScene = new Scene(rootPage31,450,500);
		
		
		VBox rootPage32 = new VBox(6);
		rootPage32.setPadding(new Insets(25, 0, 10, 25));
		Scene employeeDeletingScene = new Scene(rootPage32,450,500);
		
		
		VBox rootPage4 = new VBox(6);
		rootPage4.setPadding(new Insets(25, 0, 10, 25));
		Scene patientManagementScene = new Scene(rootPage4,450,500);
		
		
		VBox rootPage4a = new VBox(6);
		rootPage4a.setPadding(new Insets(25, 0, 10, 25));
		Scene admitPatientScene = new Scene(rootPage4a,450,500);
		
		
		VBox rootPage4b = new VBox(6);
		rootPage4b.setPadding(new Insets(20, 10, 10, 20));
		Scene dischargePatientScene = new Scene(rootPage4b,450,500);
		
		
		VBox rootPage5 = new VBox();
		rootPage5.setPadding(new Insets(20));
		Scene showInfoScene = new Scene(rootPage5,450,500);
	
	
		
		VBox rootPage6=new VBox();
		//rootPage6.setPadding(new Insets(5));
		Scene employeeInfoScene = new Scene(rootPage6,450,500);
		
		
		VBox rootPage61=new VBox();
		//rootPage61.setPadding(new Insets(5));
		Scene patientInfoScene = new Scene(rootPage61,450,500);
		
		
		/*                                    START_PAGE                                     */
		
		
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
			
			logInBtn.setOnAction(e -> {
				
				if(idTextField.getText().equals("USER") && passwordText.getText().equals("1234")){
					
					primaryStage.setScene(homePageScene);
					primaryStage.setTitle("Hospital Management System");
				}
                                else{
                                
                                  JOptionPane.showConfirmDialog(null, "Invalid username and password"); 
                                    //System.err.println("Invalid username and password");
                                    
                                    //Dialogs.showInformationDialog(stage, "I have a great message for you!", "Information Dialog", "title");
                                    
                                
                                }
			});
			
		logIn.getChildren().addAll(logInBtn);
	
		rootPage0.getChildren().addAll(headLinePage0,  pic, idPassPage0, logIn);
		
		
		
        
		/*                                    HOME_PAGE                                     */
		
		

		
		
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
		employeeBtnPage1.setOnAction(e -> primaryStage.setScene(employeeManagementScene));
		Button patientBtnPage1=new Button("PATIENT MANAGEMENT ");
		patientBtnPage1.setMaxWidth(Double.MAX_VALUE);
		patientBtnPage1.setPadding(new Insets(17,3,17,3));
		patientBtnPage1.setOnAction(e -> primaryStage.setScene(patientManagementScene));
		Button showInfoBtnPage1=new Button("     SHOW INFO     ");
		showInfoBtnPage1.setMaxWidth(Double.MAX_VALUE);
		showInfoBtnPage1.setPadding(new Insets(17,3,17,3));
		showInfoBtnPage1.setOnAction(e -> primaryStage.setScene(showInfoScene));
		optionsPage1.getChildren().addAll(employeeBtnPage1, patientBtnPage1, showInfoBtnPage1);
		
		VBox logOutPage1 = new VBox(6);
		logOutPage1.setPadding(new Insets(0, 120, 80, 120));
		Button logOutBtnPage1=new Button("LOG OUT");
		logOutBtnPage1.setMaxWidth(Double.MAX_VALUE);
		logOutBtnPage1.setPadding(new Insets(17,3,17,3));
		logOutBtnPage1.setOnAction(e -> {
					idTextField.clear();
                                        passwordText.clear();
					primaryStage.setScene(startPageScene);
					primaryStage.setTitle("Start Page");
				
			});
		logOutPage1.getChildren().addAll(logOutBtnPage1);
	
		rootPage1.getChildren().addAll(headLinePage1, optionsPage1, logOutPage1);
		
        
        
	
		
		/*                                    EMPLOYEE_MANAGEMENT                                     */
		
	
		
		
		VBox headLinePage2 = new VBox(6);
		headLinePage2.setPadding(new Insets(30, 30, 30, 30));
        Label headLineLblPage2 = new Label("EMPLOYEE MANAGEMENT");
        headLineLblPage2.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
		Separator separatorPage2 = new Separator();
		headLinePage2.getChildren().addAll(headLineLblPage2, separatorPage2); 
		
		
		VBox optionsPage2 = new VBox(30);
		optionsPage2.setPadding(new Insets(0, 100, 50, 100));
		Button addEmployeeBtnPage2=new Button("ADD EMPLOYEE");
		addEmployeeBtnPage2.setMaxWidth(Double.MAX_VALUE);
		addEmployeeBtnPage2.setPadding(new Insets(17,3,17,3));
		addEmployeeBtnPage2.setOnAction(e -> primaryStage.setScene(employeeAddingScene));
		Button updateEmployeeBtnPage2=new Button("UPDATE EMPLOYEE");
		updateEmployeeBtnPage2.setMaxWidth(Double.MAX_VALUE);
		updateEmployeeBtnPage2.setPadding(new Insets(17,3,17,3));
		updateEmployeeBtnPage2.setOnAction(e -> primaryStage.setScene(employeeUpdatingScene));
		Button deleteEmployeeBtnPage2=new Button("DELETE EMPLOYEE");
		deleteEmployeeBtnPage2.setMaxWidth(Double.MAX_VALUE);
		deleteEmployeeBtnPage2.setPadding(new Insets(17,3,17,3));
		deleteEmployeeBtnPage2.setOnAction(e -> primaryStage.setScene(employeeDeletingScene));
		optionsPage2.getChildren().addAll(addEmployeeBtnPage2, updateEmployeeBtnPage2, deleteEmployeeBtnPage2);
		
		VBox backPage2 = new VBox(6);
		backPage2.setPadding(new Insets(0, 120, 80, 120));
		Button backBtnPage2=new Button("Back");
		backBtnPage2.setMaxWidth(Double.MAX_VALUE);
		backBtnPage2.setPadding(new Insets(17,3,17,3));
		backBtnPage2.setOnAction(e -> primaryStage.setScene(homePageScene));
		backPage2.getChildren().addAll(backBtnPage2);
	
		rootPage2.getChildren().addAll(headLinePage2, optionsPage2, backPage2);
		
		
		
 
		/*                                    EMPLOYEE_ADDING                                     */
		
		



		
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
		final ToggleGroup groupPage3 = new ToggleGroup();
		RadioButton employeeMaleRButtonPage3 = new RadioButton("Male");
		employeeMaleRButtonPage3.setToggleGroup(groupPage3);
		RadioButton employeeFemaleRButtonPage3 = new RadioButton("Female");
		employeeFemaleRButtonPage3.setToggleGroup(groupPage3);
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
                
                
                    addBtnPage3.setOnAction((ActionEvent e) -> {
                    String query = "INSERT INTO Doctor VALUES ('"+nameTextFieldPage3.getText()+ "', '"+idTextFieldPage3.getText()+"', 'male', '01-jan-2015', "+salaryTextFieldPage3.getText()+",'"+addressTextFieldPage3.getText()+"','"+contactNoTextFieldPage3.getText()+"');";
                    System.out.println(query);
                    primaryStage.setScene(employeeManagementScene);
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        
                        Connection con=DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe","HR","123456"); 
                        Statement stmt=con.createStatement();
                        if(stmt.executeUpdate(query)==1){
                                System.out.println("Record Inserted Successfully !");
                                //primaryStage.setScene(employeeManagementScene);
                        }
                        
                        con.close();
                    }
                    catch(Exception ex){ 
                        System.out.println(ex);
                    }
                });
                
                
                
                
		//addBtnPage3.setOnAction(e -> primaryStage.setScene(employeeManagementScene));
		Button backBtnPage3 = new Button("BACK");
		backBtnPage3.setLayoutX(350);
		backBtnPage3.setLayoutY(100);
		backBtnPage3.setOnAction(e -> primaryStage.setScene(employeeManagementScene));
		Label spaceAddBackPage3=new Label("                                                                               ");
		addBackHboxPage3.getChildren().addAll(addBtnPage3,spaceAddBackPage3,backBtnPage3);
                
                
		rootPage3.getChildren().addAll(headLinePage3,separatorPage3,selectEmployeePage3,space1Page3,space2Page3,space3Page3,nameHboxpage3,idHboxpage3,sexHboxpage3,hireDateHboxpage3,salaryHboxpage3,addressHboxpage3,contactNoHboxpage3,space4Page3,space5Page3,addBackHboxPage3);

		
		
		
		
 
		/*                                    EMPLOYEE_UPDATING                                     */
		
		
		
		
		

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
		updateBtnPage31.setOnAction(e -> primaryStage.setScene(employeeManagementScene));
		Button backBtnPage31 = new Button("BACK");
		backBtnPage31.setLayoutX(350);
		backBtnPage31.setLayoutY(100);
		backBtnPage31.setOnAction(e -> primaryStage.setScene(employeeManagementScene));
		Label spaceAddBackPage31=new Label("                                                                               ");
		updateBackHboxPage31.getChildren().addAll(updateBtnPage31,spaceAddBackPage31,backBtnPage31);
                
                
                
		rootPage31.getChildren().addAll(headLinePage31,separatorPage31,selectEmployeePage31,space1Page31,space2Page31,space3Page31,nameHboxpage31,idHboxpage31,sexHboxpage31,hireDateHboxpage31,salaryHboxpage31,addressHboxpage31,contactNoHboxpage31,space4Page31,space5Page31,updateBackHboxPage31);


		
		
		
		/*                                    EMPLOYEE_DELETING                                     */
		
		
		
		
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
		deleteBtnPage32.setOnAction(e -> primaryStage.setScene(employeeManagementScene));
		Button backBtnPage32 = new Button("BACK");
		backBtnPage32.setLayoutX(350);
		backBtnPage32.setLayoutY(100);
		backBtnPage32.setOnAction(e -> primaryStage.setScene(employeeManagementScene));
		Label spaceAddBackPage32=new Label("                                                                               ");
		deleteBackHboxPage32.getChildren().addAll(deleteBtnPage32,spaceAddBackPage32,backBtnPage32);
                
                
                
		rootPage32.getChildren().addAll(headLinePage32,separatorPage32,selectEmployeePage32,space1Page32,space2Page32,space3Page32,nameHboxpage32,idHboxpage32,space4Page32,space5Page32,deleteBackHboxPage32);

	
		
		
		/*                                    PATIENT_MANAGEMENT                                     */
		
		
		
		
		Label headLinePage4 = new Label("  PATIENT MANAGEMENT ");
        headLinePage4.setFont(Font.font("Verdana", FontWeight.BOLD, 28));
        Separator separatorPage4 = new Separator();

		Label space1Page4 = new Label();
		Label space2Page4 = new Label();
		Label space3Page4 = new Label();
		
		
		HBox admitPatientHboxPage4=new HBox();
		Label gapAdmitPatientLblPage4=new Label("                                       ");
		Button admitPatientBtnPage4=new Button("    ADMIT PATIENT    ");
		admitPatientBtnPage4.setPadding(new Insets(17,3,17,3));
		admitPatientBtnPage4.setOnAction(e -> primaryStage.setScene(admitPatientScene));
		admitPatientHboxPage4.getChildren().addAll(gapAdmitPatientLblPage4,admitPatientBtnPage4);
		
		
		Label space4Page4 = new Label();
		
		
		HBox dischargePatientHboxPage4=new HBox();
		Label gapDischargePatientLblPage4=new Label("                                       ");
		Button dischargePatientBtnPage4=new Button("DISCHARGE PATIENT");
		dischargePatientBtnPage4.setPadding(new Insets(17,3,17,3));
		dischargePatientBtnPage4.setOnAction(e -> primaryStage.setScene(dischargePatientScene));
		
		dischargePatientHboxPage4.getChildren().addAll(gapDischargePatientLblPage4, dischargePatientBtnPage4);
		
		Label space5Page4=new Label();
		Label space6Page4=new Label();
		Label space7Page4=new Label();
                
		HBox backHboxPage4=new HBox();
		Label gapBackLblPage4=new Label("                                                                                                      ");
		Button backBtnPage4=new Button("BACK");
		backBtnPage4.setLayoutX(350);
		backBtnPage4.setLayoutY(100);
		backBtnPage4.setOnAction(e -> primaryStage.setScene(homePageScene));
		backHboxPage4.getChildren().addAll(gapBackLblPage4,backBtnPage4);
                
        rootPage4.getChildren().addAll(headLinePage4,separatorPage4,space1Page4,space2Page4,space3Page4,admitPatientHboxPage4,space4Page4,dischargePatientHboxPage4,space5Page4,space6Page4,space7Page4,backHboxPage4);

		
		
	
		
		
		/*                                    PATIENT_ADMIT                                     */
		
		
		
		
		
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
		admitBtnPage4a.setOnAction(e -> primaryStage.setScene(patientManagementScene));
		Button backBtnPage4a = new Button("BACK");
		backBtnPage4a.setLayoutX(350);
		backBtnPage4a.setLayoutY(100);
		backBtnPage4a.setOnAction(e -> primaryStage.setScene(patientManagementScene));
		Label spaceAdmitBackPage4a=new Label("                                                                               ");
		admitBackHboxPage3.getChildren().addAll(admitBtnPage4a,spaceAdmitBackPage4a,backBtnPage4a);

		
		rootPage4a.getChildren().addAll(headLinePage4a,space1Page4a,space2Page4a,space3Page4a,nameHboxpage4a,idHboxpage4a,sexHboxpage4a,admitDatePatientHboxpage4a,patientDetailsHboxPage4a,patientAddressHboxPage4a,patientContactNoHboxPage4a,space4Page4a,space5Page4a,admitBackHboxPage3);

		
		
	
		
		
		/*                                    PATIENT_DISCHARGE                                     */
		
		
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
	dischargeBtnPage4b.setOnAction(e -> primaryStage.setScene(patientManagementScene));
	Button backBtnPage4b=new Button("     BACK     ");
	backBtnPage4b.setMaxWidth(Double.MAX_VALUE);
	backBtnPage4b.setOnAction(e -> primaryStage.setScene(patientManagementScene));
	dischargeBackHboxPage4b.getChildren().addAll(dischargeBtnPage4b,backBtnPage4b);


	rootPage4b.getChildren().addAll(dischargePatientVboxPage4b,idHboxpage4b,dischargeDatePatientHboxpage4b,showBillHboxPage4b,dischargeBackHboxPage4b);
	//rootPage4b.setPadding(new Insets(10));

	

		
		
		/*                                                          SHOW_INFORMATION                                                      */
		
		
		
		
	
	VBox showInfoVboxPage5=new VBox();
    showInfoVboxPage5.setPadding(new Insets(20, 60, 0, 70));
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
	employeeInfoBtnPage5.setOnAction(e -> primaryStage.setScene(employeeInfoScene));
    Button patientInfoBtnPage5 = new Button("PATIENT");
	patientInfoBtnPage5.setMaxWidth(Double.MAX_VALUE);
	patientInfoBtnPage5.setPadding(new Insets(17,3,17,3));
	patientInfoBtnPage5.setOnAction(e -> primaryStage.setScene(patientInfoScene));
	optionsPage5.getChildren().addAll(employeeInfoBtnPage5,patientInfoBtnPage5);
    
    
    VBox backVboxPage5=new VBox();
    backVboxPage5.setPadding(new Insets(80,160,0,160));
    Button backBtnPage5=new Button("Back");
    backBtnPage5.setMaxWidth(Double.MAX_VALUE);
	backBtnPage5.setPadding(new Insets(17,3,17,3));
	backBtnPage5.setOnAction(e -> primaryStage.setScene(homePageScene));
    backVboxPage5.getChildren().addAll(backBtnPage5);

    rootPage5.getChildren().addAll(showInfoVboxPage5,optionsPage5,backVboxPage5);
	
	
	

	
	
	/*                                                          EMPLOYEE_INFORMATION                                                      */
	
	
	
	
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
    TableColumn employeeSexColumnPage6 = new TableColumn("SEX"); 
    TableColumn employeeHireDateColumnPage6 = new TableColumn("HIRE DATE"); 
    TableColumn employeeSalaryColumnPage6 = new TableColumn("SALARY"); 
    TableColumn employeeAddressColumnPage6 = new TableColumn("ADDRESS"); 
    TableColumn employeeContactColumnPage6 = new TableColumn("CNTCT"); 
    
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
	backBtnPage6.setOnAction(e -> primaryStage.setScene(showInfoScene));
    backVboxPage6.getChildren().addAll(backBtnPage6);
	
	rootPage6.getChildren().addAll(employeeInfoVboxPage6,selectEmployeePage6,idSearchPage6,employeeInfoTableViewPage6,backVboxPage6);
	
	
	
	/*                                                          EMPLOYEE_INFORMATION                                                      */


	
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
	backBtnPage61.setOnAction(e -> primaryStage.setScene(showInfoScene));
    backVboxPage61.getChildren().addAll(backBtnPage61);
	
	rootPage61.getChildren().addAll(patientInfoVboxPage61,idSearchPage61,patientInfoTableViewPage61,backVboxPage61);
	
	
	
	
	primaryStage.setScene(startPageScene);
	primaryStage.show();
	}
}