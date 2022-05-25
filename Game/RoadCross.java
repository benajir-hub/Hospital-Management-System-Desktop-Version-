
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RoadCross extends Application implements Runnable {
    Group root;
    Group backgroundGroup;
    Group actorGroup;
    final Image[] images = new Image[5];
    final ImageView[] pics = new ImageView[5];
    
    final Image human = new Image("human.png");
    final ImageView humanPic = new ImageView(human);
   
	
	
    Scene scene;
    Stage stage;
    Thread thread;

    @Override
    public void run() {
        try {
            while(true){
                Thread.sleep(30);
                
                /*for(int a=0;a<5;a++){
                if (pics[a].intersects(backgroundGroup.getLayoutBounds())) {
                
                actorGroup.setVisible(false);
                System.out.println("success");
                
                }}*/
                
                if (actorGroup.intersects(backgroundGroup.getBoundsInLocal())) {
                
                actorGroup.setVisible(true);
                System.out.println("You Are Finished");
                
                }
                
                
                backgroundGroup.setLayoutX(backgroundGroup.getLayoutX()-1);
                double rootRightBound = backgroundGroup.getLayoutX()+backgroundGroup.getLayoutBounds().getWidth();
                if(rootRightBound<0){
                    backgroundGroup.setLayoutX(scene.getWidth());
                }
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // final Image[] images = new Image[5];
         //final ImageView[] pics = new ImageView[5];
        root = new Group();
        scene = new Scene(root, 360, 280, Paint.valueOf("#ccc"));
        stage = primaryStage;
        stage.setScene(scene);
        stage.show();
        
        //Rectangle[] r = new Rectangle[15];
        double X=20, Y=50;
        for(int i=0; i<5; ++i){
            X+=70;
            
            final Image image = images[i] =new Image(getClass().getResourceAsStream("r" +(i+1)+ ".png"));
            final ImageView pic = pics[i] =new ImageView(images[i]);
            
            pics[i].setFitWidth(60);
            pics[i].setPreserveRatio(true);
            pics[i].setLayoutX(X);
            pics[i].setLayoutY(Y);
         
        }
        
        backgroundGroup = new Group(pics);
        
       
        actorGroup = new Group(humanPic);
        
        humanPic.setFitWidth(20);
        humanPic.setPreserveRatio(true);
        humanPic.setLayoutX(100);
        humanPic.setLayoutY(100);
        
        
        
        
        Button up = new Button("UP");
        up.setOnAction(e->{
            for(int i=0; i<10; i++){
                humanPic.setLayoutY(humanPic.getLayoutY()-1);
                //actor.setLayoutX(actor.getLayoutX()+1);
            }
            
        });
        
        Button down = new Button("DOWN");
        down.setOnAction(e->{
            for(int i=0; i<10; i++){
                humanPic.setLayoutY(humanPic.getLayoutY()+1);
                //actor.setLayoutX(actor.getLayoutX()+1);
            }
            
        });
        Button left = new Button("LEFT");
        left.setOnAction(e->{
            for(int i=0; i<10; i++){
                humanPic.setLayoutX(humanPic.getLayoutX()-1);
                //actor.setLayoutX(actor.getLayoutX()+1);
            }
            
        });
        
        Button right = new Button("RIGHT");
        right.setOnAction(e->{
            for(int i=0; i<10; i++){
                humanPic.setLayoutX(humanPic.getLayoutX()+1);
                
                
                //actor.setLayoutX(actor.getLayoutX()+1);
            }
            
        });
        
        HBox hb1=new HBox(5);
        hb1.getChildren().addAll(up,down,left,right);
        
        
        
        root.getChildren().addAll(backgroundGroup, actorGroup, hb1);
                
        thread = new Thread(this);
        thread.start(); //calls the run function
    }
}
