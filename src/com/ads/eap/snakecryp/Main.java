package com.ads.eap.snakecryp;

import com.ads.eap.snakecryp.entities.Food;
import com.ads.eap.snakecryp.entities.Screen;
import com.ads.eap.snakecryp.entities.Snake;
import com.ads.eap.snakecryp.entities.Wall;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // @Constants
        final int SCREENW = 20;
        final int SCREENH = 10;
        final int SNAKEX  = SCREENW / 2;
        final int SNAKEY  = SCREENH / 2;

        // @Screen
        Screen screen = new Screen();
        screen.setScreen(SCREENW,SCREENH);
        screen.initScreen();

        // @Wall
        Wall wall = new Wall();
        wall.addWallRow(screen, wall, 0);
        wall.addWallRow(screen, wall, screen.getHeigth() - 1);
        wall.addWallColumn(screen, wall, 0);
        wall.addWallColumn(screen, wall, screen.getWidth() - 1);

        // @Snake
        Snake snake = new Snake();
        snake.setSnake('@', SNAKEX, SNAKEY);

        // @Food
        Food food = new Food();
        food.setFood('*');

        // @Init
        screen.setObjectToScreen(snake.getX(), snake.getY(), snake);
        food.setOnRandomPlace(screen, food);
        Scanner sc = new Scanner(System.in);
        char input;
        boolean isRunning = true;

        while (isRunning) {
            screen.printScreen();
            switch (input = sc.nextLine().charAt(0)) {
                case 'a':
                    snake.moveLeft(screen, snake);
                    break;
                case 'd':
                    snake.moveRight(screen, snake);
                    break;
                case 'w':
                    snake.moveUp(screen, snake);
                    break;
                case 's':
                    snake.moveDown(screen, snake);
                    break;
            }
        }

    }
}
