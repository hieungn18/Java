import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Vbox;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;

public class CarsMovingDemo extends Application
{
   public void start(Stage primaryStage)
   {
      Group root = new Group();
      Scene scene1 = new Scene(root,900,600);
      primaryStage.setScene(scene1);
      primaryStage.setTitle("E11.19 CarsMovingDemo By Hieu Nguyen");
      primaryStage.show();
      }
      }