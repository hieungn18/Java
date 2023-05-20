/**
 Programer : Hieu Nguyen
 Assigment: PE11.24 DrawCircle 
 Date: July 24 2021
 Description: 
 */
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
/*
   Write a program that prompts the user to enter the x- and y-positions of a center point and a radius, using text fields
   When the user clicks a “Draw” button, draw a circle with that center and radius in a component.
*/
public class DrawCircleDemo extends Application
{
   public void start(Stage primaryStage)
   {
      Pane root = createRootPane();
      Scene scene1 =  new Scene(root);
      primaryStage.setScene(scene1);
      primaryStage.setTitle("DrawCircle by Hieu Nguyen");
      primaryStage.show();
      }
       public Pane createRootPane()
   {
      Label xLabel = new Label("X-Coordinate:");
      TextField xField = new TextField(""+0);
      
      Label yLabel = new Label("y-Coordinate:");
      TextField yField = new TextField(""+0);
      
      Label radiusLabel = new Label("Radius:");
      TextField radiusField = new TextField(""+0);


      Button drawButton = new Button("DRAW");
      Insets insets = new Insets(100);
      
      BorderPane bPane = new BorderPane();
      bPane.setMinSize(500,500);
      
      Pane pane1 = new VBox(xLabel, xField, yLabel, yField, radiusLabel, radiusField);
      bPane.setTop(pane1);
      bPane.setCenter(drawButton);
      Insets insetsButton = new Insets(10);
      BorderPane.setMargin(drawButton, insetsButton);
      
      Pane fillerPane = new Pane();
      fillerPane.setMinSize(200,200);
      bPane.setBottom(fillerPane);
      BorderPane.setMargin(fillerPane, insets);
      
      

      drawButton.setOnAction(event ->
         {
         int x = Integer.parseInt(xField.getText());
         int y = Integer.parseInt(yField.getText());
         int radius = Integer.parseInt(radiusField.getText());
         
         Circle ball = new Circle(x, y, radius);
         
         Pane ballPane = new Pane(ball);
         ballPane.setMinSize(200,200);
         bPane.setBottom(ballPane);
         BorderPane.setMargin(ballPane, insets);        
      });

      return bPane;
      }//end of main 
}//end of class