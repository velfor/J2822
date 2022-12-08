package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 600;
    public static final int BALL_RADIUS = 15;
    public static final int PADDLE_WIDTH = 25;
    public static final int PADDLE_HEIGHT = 100;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Canvas canvas = new Canvas(WINDOW_WIDTH, WINDOW_HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Timeline tl = new Timeline(new KeyFrame(Duration.millis(17),e -> run(gc)));
        tl.setCycleCount(Timeline.INDEFINITE);
        primaryStage.setScene(new Scene(new StackPane(canvas)));
        primaryStage.show();
        tl.play();
    }
    private void run(GraphicsContext gc){
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);

        gc.setFill(Color.WHITE);
        gc.fillRect(WINDOW_WIDTH/2-2, 0, 4, WINDOW_HEIGHT);


    }
    public static void main(String args[]){
        launch(args);
    }
}
