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

public class pagefive extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("HOSPITAL MANAGEMENT SYSTEM");
        VBox rootPage4 = new VBox(10);
		
		rootPage4.setPadding(new Insets(25, 0, 10, 25));

		
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
		admitPatientHboxPage4.getChildren().addAll(gapAdmitPatientLblPage4,admitPatientBtnPage4);
		
		
		Label space4Page4 = new Label();
		
		
		HBox dischargePatientHboxPage4=new HBox();
		Label gapDischargePatientLblPage4=new Label("                                       ");
		Button dischargePatientBtnPage4=new Button("DISCHARGE PATIENT");
		dischargePatientBtnPage4.setPadding(new Insets(17,3,17,3));
		dischargePatientHboxPage4.getChildren().addAll(gapDischargePatientLblPage4, dischargePatientBtnPage4);
		
		Label space5Page4=new Label();
		Label space6Page4=new Label();
		Label space7Page4=new Label();
                
		HBox backHboxPage4=new HBox();
		Label gapBackLblPage4=new Label("                                                                                                      ");
		Button backBtnPage4=new Button("BACK");
		backBtnPage4.setLayoutX(350);
		backBtnPage4.setLayoutY(100);
		//backBtnPage4.setOnAction(e -> primaryStage.setScene(homePageScene));
		backHboxPage4.getChildren().addAll(gapBackLblPage4,backBtnPage4);
                
        rootPage4.getChildren().addAll(headLinePage4,separatorPage4,space1Page4,space2Page4,space3Page4,admitPatientHboxPage4,space4Page4,dischargePatientHboxPage4,space5Page4,space6Page4,space7Page4,backHboxPage4);

        

	
               
        Scene patientManagementScene = new Scene(rootPage4,450,500);
        primaryStage.setScene(patientManagementScene);
        primaryStage.show();
    }
}