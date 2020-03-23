package com.ads.eap.snakecryp.entities;

public class Food extends Object {
    public Food() {}

    public void setFood(char symbol) {
        setSymbol(symbol);
    }

    public void setOnRandomPlace(Screen screen, Food food) {
        screen.setObjectToScreen(
                (int) (Math.random() * (screen.getWidth() - 1)),
                (int) (Math.random() * (screen.getHeigth() -1)),
                food
        );
    }
}
