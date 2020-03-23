package com.ads.eap.snakecryp.entities;

public class Wall extends Object {
    public Wall() {
        this.setWallSymbol('#');
    }

    public void setWallSymbol(char symbol) {
        setSymbol(symbol);
    }

    public void addWallRow(Screen screen, Wall wall, int row) {
        for (int i = 0; i < screen.getWidth(); i++) {
            screen.setObjectToScreen(i, row, wall);
        }
    }

    public void addWallColumn(Screen screen, Wall wall, int column) {
        for (int i = 0; i < screen.getHeigth(); i++) {
            screen.setObjectToScreen(column, i, wall);
        }
    }
}
