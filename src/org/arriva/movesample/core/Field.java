package org.arriva.movesample.core;

public abstract class Field {

    protected int rowCount;
    protected int colCount;

    public int getRowCount() {
        return rowCount;
    }

    public int getColCount() {
        return colCount;
    }

    public Field(int colCount, int rowCount) {
        this.rowCount = rowCount;
        this.colCount = colCount;
    }

    public abstract void generateInitialState();
    public abstract void moveLeft();
    public abstract void moveRight();
    public abstract void moveDown();
    public abstract void moveUp();

}
