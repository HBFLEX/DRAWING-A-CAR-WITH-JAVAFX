package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;

public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception{
        
        Group root = new Group();
        Scene scene = new Scene(root, 600, 300, Color.CORNFLOWERBLUE);
        stage.setScene(scene);
        
        // config stage
        stage.setTitle("Car Drawing");
        stage.setResizable(false);
        Image icon = new Image("resources/favicon.png");
        stage.getIcons().add(icon);
        
        // title
        Text header = new Text("DRAWING A CAR WITH JAVA");
        header.setX(110);
        header.setY(50);
        header.setFont(Font.font("trebuchet", 30));
        header.setFill(Color.ANTIQUEWHITE);
        
        // underline
        Line underline = new Line();
        underline.setStartX(110);
        underline.setStartY(55);
        underline.setEndX(500);
        underline.setEndY(55);
        underline.setFill(Color.BURLYWOOD);
        underline.setOpacity(0.3);
        
        // the car
        // front
        Rectangle head = new Rectangle();
        head.setX(110);
        head.setY(100);
        head.setWidth(150);
        head.setHeight(130);
        head.setFill(Color.LIME);
        head.setOpacity(0.3);
        
        // front window
        Rectangle window = new Rectangle();
        window.setX(140);
        window.setY(130);
        window.setWidth(40);
        window.setHeight(40);
        window.setFill(Color.GOLDENROD);
        window.setStrokeWidth(2);
        window.setStroke(Color.BLACK);
        
        // back
        Rectangle back = new Rectangle();
        back.setX(260);
        back.setY(130);
        back.setWidth(200);
        back.setHeight(100);
        
        // front tire
        Circle frontTire = new Circle();
        frontTire.setCenterX(210.0);
        frontTire.setCenterY(218.0);
        frontTire.setRadius(40);
        frontTire.setFill(Color.BROWN);
        frontTire.setStrokeWidth(3);
        frontTire.setStroke(Color.BLACK);
        
        // back tire
        Circle backTire = new Circle();
        backTire.setCenterX(400.0);
        backTire.setCenterY(218.0);
        backTire.setRadius(40);
        backTire.setFill(Color.BROWN);
        backTire.setStrokeWidth(3);
        backTire.setStroke(Color.BLACK);
        
        // start lane road
        Line startLane = new Line();
        startLane.setStartX(0);
        startLane.setStartY(200);
        startLane.setEndX(109);
        startLane.setEndY(200);
        
        Line midLane = new Line();
        midLane.setStartX(0);
        midLane.setStartY(246);
        midLane.setEndX(30);
        midLane.setEndY(246);
        midLane.setStrokeWidth(5);
        midLane.setStroke(Color.ANTIQUEWHITE);
        
        Line midLane2 = new Line();
        midLane2.setStartX(60);
        midLane2.setStartY(246);
        midLane2.setEndX(100);
        midLane2.setEndY(246);
        midLane2.setStrokeWidth(5);
        midLane2.setStroke(Color.ANTIQUEWHITE);
        
        Line midLane3 = new Line();
        midLane3.setStartX(130);
        midLane3.setStartY(246);
        midLane3.setEndX(170);
        midLane3.setEndY(246);
        midLane3.setStrokeWidth(5);
        midLane3.setStroke(Color.ANTIQUEWHITE);
        
        Line midLane4 = new Line();
        midLane4.setStartX(248);
        midLane4.setStartY(246);
        midLane4.setEndX(287);
        midLane4.setEndY(246);
        midLane4.setStrokeWidth(5);
        midLane4.setStroke(Color.ANTIQUEWHITE);
        
        Line midLane5 = new Line();
        midLane5.setStartX(330);
        midLane5.setStartY(246);
        midLane5.setEndX(364);
        midLane5.setEndY(246);
        midLane5.setStrokeWidth(5);
        midLane5.setStroke(Color.ANTIQUEWHITE);
        
        Line midLane6 = new Line();
        midLane6.setStartX(440);
        midLane6.setStartY(246);
        midLane6.setEndX(479);
        midLane6.setEndY(246);
        midLane6.setStrokeWidth(5);
        midLane6.setStroke(Color.ANTIQUEWHITE);
        
        Line midLane7 = new Line();
        midLane7.setStartX(520);
        midLane7.setStartY(246);
        midLane7.setEndX(559);
        midLane7.setEndY(246);
        midLane7.setStrokeWidth(5);
        midLane7.setStroke(Color.ANTIQUEWHITE);
        
        Line midLane8 = new Line();
        midLane8.setStartX(590);
        midLane8.setStartY(246);
        midLane8.setEndX(600);
        midLane8.setEndY(246);
        midLane8.setStrokeWidth(5);
        midLane8.setStroke(Color.ANTIQUEWHITE);
        
        // start lane end road
        Line startLaneEnd = new Line();
        startLaneEnd.setStartX(460);
        startLaneEnd.setStartY(200);
        startLaneEnd.setEndX(600);
        startLaneEnd.setEndY(200);
        
        // end lane road
        Line endLane = new Line();
        endLane.setStartX(0);
        endLane.setStartY(300);
        endLane.setEndX(600);
        endLane.setEndY(300);
        
        // add nodes to scene graph
        root.getChildren().add(header);
        root.getChildren().add(underline);
        root.getChildren().add(head);
        root.getChildren().add(back);
        root.getChildren().add(window);
        root.getChildren().add(frontTire);
        root.getChildren().add(backTire);
        root.getChildren().add(startLane);
        root.getChildren().add(startLaneEnd);
        root.getChildren().add(endLane);
        root.getChildren().add(midLane);
        root.getChildren().add(midLane2);
        root.getChildren().add(midLane3);
        root.getChildren().add(midLane4);
        root.getChildren().add(midLane5);
        root.getChildren().add(midLane6);
        root.getChildren().add(midLane7);
        root.getChildren().add(midLane8);
        
        stage.show();
    }
    
    public static void main(String[] args){
        launch(args);
    }
    
}
