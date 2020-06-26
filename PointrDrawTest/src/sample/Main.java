package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import point.*;

import java.util.Random;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group pane = new Group();
        Scene scene = new Scene(pane, 500, 300);
        Random rand = new Random();

        double randomXCoordinate = rand.nextInt(50_001)/100.0; //[0.00; 500.00]
        double randomYCoordinate = rand.nextInt(30_001)/100.0; //[0.00; 300.00]

        Point p1 = new Point(new double[]{randomXCoordinate, randomYCoordinate});
        randomXCoordinate = rand.nextInt(50_001)/100.0; //[0.00; 500.00]
        randomYCoordinate = rand.nextInt(30_001)/100.0; //[0.00; 300.00]

        Point p2 = new Point(new double[]{randomXCoordinate, randomYCoordinate});

        // проверки дали правоъгълника излиза от сцената
        Rectangle r1 = new Rectangle(p1, 50, 30);
        Rectangle r2 = new Rectangle(p2, 20, 20);

        Line l1 = new Line(p1, new Point(new double[]{
                p1.getCoords()[0] + 50,
                p1.getCoords()[1] + 30}));
        Line l2 = new Line(p2, new Point(new double[]{
                p2.getCoords()[0] + 20,
                p2.getCoords()[1] + 20}));
        Line l3 = new Line(new Point(new double[]{
                p1.getCoords()[0],
                p1.getCoords()[1] + 30}),
                new Point(new double[]{
                p1.getCoords()[0] + 50,
                p1.getCoords()[1]}));
        Line l4 = new Line(new Point(new double[]{
                p2.getCoords()[0],
                p2.getCoords()[1] + 20}),
                new Point(new double[]{
                p2.getCoords()[0] + 20,
                p2.getCoords()[1]}));

        r1.draw(pane);
        r2.draw(pane);
        l1.draw(pane);
        l2.draw(pane);
        l3.draw(pane);
        l4.draw(pane);

        primaryStage.setTitle("Shapes");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
