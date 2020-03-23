package com.ads.eap.snakecryp.entities;

public class Screen {
    private int width, height;
    private char[][] screenSize;

    public Screen() {}

    public void setScreen(int W, int H) {
        this.height = H;
        this.width  = W;
        this.setScreenSize();
    }

    private void setScreenSize() {
        this.screenSize = new char[this.height][this.width];
    }

    public void initScreen() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                this.screenSize[i][j] = '°';
            }
        }
    }

    public void printScreen() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print(this.screenSize[i][j]);
            }
            System.out.print("\n");
        }
    }

    public void cleanScreenPlace(int X, int Y) {
        this.screenSize[Y][X] = '°';
    }

    public int getWidth() {
        return width;
    }

    public int getHeigth() {
        return height;
    }

    public void setObjectToScreen(int X, int Y, Object object) {
         this.screenSize[Y][X] = object.getSymbol();
    }
}
