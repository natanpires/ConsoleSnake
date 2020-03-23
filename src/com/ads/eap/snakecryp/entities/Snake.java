package com.ads.eap.snakecryp.entities;

public class Snake extends Object {
    public Snake() {}

    public void setSnake(char symbol, int X, int Y) {
        setSymbol(symbol);
        setX(X);
        setY(Y);
    }

    public void moveLeft(Screen screen, Snake snake) {
        snake.setX(getX() - 1);
        screen.setObjectToScreen(snake.getX(), snake.getY(), snake);
        screen.cleanScreenPlace(snake.getX() + 1, snake.getY());
    }

    public void moveRight(Screen screen, Snake snake) {
        snake.setX(getX() + 1);
        screen.setObjectToScreen(snake.getX(), snake.getY(), snake);
        screen.cleanScreenPlace(snake.getX() - 1, snake.getY());
    }

    public void moveUp(Screen screen, Snake snake) {
        snake.setY(getY() - 1);
        screen.setObjectToScreen(snake.getX(), snake.getY(), snake);
        screen.cleanScreenPlace(snake.getX(), snake.getY() + 1);
    }

    public void moveDown(Screen screen, Snake snake) {
        snake.setY(getY() + 1);
        screen.setObjectToScreen(snake.getX(), snake.getY(), snake);
        screen.cleanScreenPlace(snake.getX(), snake.getY() - 1);
    }

}
