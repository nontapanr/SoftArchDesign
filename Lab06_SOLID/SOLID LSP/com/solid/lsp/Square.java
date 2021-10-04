package com.solid.lsp;

public class Square extends Rectangle {

    private int side;
    
    Square(int side) {
        super(side, side);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    // @Override
    // public void setWidth(int width) {
    //     this.setSide(width);
    // }

    // @Override
    // public void setHeight(int height) {
    //     this.setSide(height);
    // }

    // public void setSide(int side) {
    //     super.setWidth(side);
    //     super.setHeight(side);
    // }

}
