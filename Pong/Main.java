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
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Random;

public class Main extends Application {
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 600;
    public static final int BALL_RADIUS = 15;
    public static final int PADDLE_WIDTH = 25;
    public static final int PADDLE_HEIGHT = 100;

    private static Random random;

    private boolean gameStarted;
    //для мяча
    private int ballSpeedX = 1;
    private int ballSpeedY = 1;
    private double leftPlayerYPos = WINDOW_HEIGHT/2;
    private double rightPlayerYPos = WINDOW_HEIGHT/2;

    private double ballXPos = WINDOW_WIDTH / 2;
    private double ballYPos = WINDOW_HEIGHT / 2;

    private int leftScore = 0;
    private int rightScore = 0;

    private double leftPlayerXPos = 10;
    private double rightPlayerXPos = WINDOW_WIDTH - PADDLE_WIDTH - 10;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Canvas canvas = new Canvas(WINDOW_WIDTH, WINDOW_HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Timeline tl = new Timeline(new KeyFrame(Duration.millis(10),e -> run(gc)));
        tl.setCycleCount(Timeline.INDEFINITE);
        //primaryStage.setScene(new Scene(new StackPane(canvas)));
        canvas.setOnMouseClicked(e ->  gameStarted = true);
        canvas.setOnMouseMoved(e ->  leftPlayerYPos  = e.getY());
        primaryStage.setScene(new Scene(new StackPane(canvas)));
        primaryStage.show();
        tl.play();
    }
    private void run(GraphicsContext gc){
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
        gc.setFill(Color.WHITE);
        gc.fillRect(WINDOW_WIDTH/2-2, 0, 4, WINDOW_HEIGHT);
        gc.fillText(leftScore + "\t\t\t\t\t\t\t\t" + rightScore, WINDOW_WIDTH / 2, 100);
        gc.fillRect(rightPlayerXPos, rightPlayerYPos, PADDLE_WIDTH, PADDLE_HEIGHT);
        gc.fillRect(leftPlayerXPos, leftPlayerYPos, PADDLE_WIDTH, PADDLE_HEIGHT);
        if(gameStarted){
            //движение мяча
            ballXPos += ballSpeedX;
            ballYPos += ballSpeedY;
            gc.fillOval(ballXPos, ballYPos, BALL_RADIUS, BALL_RADIUS);
            //типа ИИ для правого игрока
            if(ballXPos < 3 * WINDOW_WIDTH  / 4) {
                rightPlayerYPos = ballYPos - PADDLE_HEIGHT / 2;
            }
            else{
                rightPlayerYPos =  ballYPos > rightPlayerYPos + PADDLE_HEIGHT / 2 ?
                        rightPlayerYPos + 1 : rightPlayerYPos - 1;
            }

            //проверяем выход мяча за границы поля
            if(ballXPos < leftPlayerXPos){
                rightScore++;
                gameStarted = false;
            }
            if (ballXPos > rightPlayerXPos){
                leftScore++;
                gameStarted = false;
            }
            if(ballYPos < 0 || ballYPos > WINDOW_HEIGHT){
                ballSpeedY = -ballSpeedY;
            }
            //отбивание мяча от ракеток
            //от правой ракетки
            if( ballXPos + BALL_RADIUS > rightPlayerXPos &&
                    ballYPos >= rightPlayerYPos && ballYPos <= rightPlayerYPos+PADDLE_HEIGHT)
            {
                if (ballSpeedX > 0) ballSpeedX++;
                else ballSpeedX--;
                if (ballSpeedY > 0) ballSpeedY++;
                else ballSpeedY--;
                ballSpeedX = -ballSpeedX;
                //ballSpeedY = -ballSpeedY;
            }
            if( ballXPos  < leftPlayerXPos + BALL_RADIUS &&
                    ballYPos >= leftPlayerYPos && ballYPos <= leftPlayerYPos+PADDLE_HEIGHT)
            {
                if (ballSpeedX > 0) ballSpeedX++;
                else ballSpeedX--;
                if (ballSpeedY > 0) ballSpeedY++;
                else ballSpeedY--;
                ballSpeedX = -ballSpeedX;
                //ballSpeedY = -ballSpeedY;
            }



        }
        else{//игра не началась
            gc.setStroke(Color.YELLOW);
            gc.setTextAlign(TextAlignment.CENTER);
            gc.strokeText("Click to Start", WINDOW_WIDTH / 2, WINDOW_HEIGHT / 2);
            ballXPos = WINDOW_WIDTH / 2;
            ballYPos = WINDOW_HEIGHT / 2;
            if (random.nextInt(2) == 0){
                ballSpeedX = 1;
            }
            else{
                ballSpeedX = -1;
            }
            if (random.nextInt(2) == 0){
                ballSpeedY = 1;
            }
            else{
                ballSpeedY = -1;
            }
        }


    }
   /* public static void main(String args[]){
        launch(args);
    }*/
}
