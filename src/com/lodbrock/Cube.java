package com.lodbrock;


/**
 * This class represent the cube.
 * You can use this class to find volume, area and diagonal of one or all sides of cube.
 * @version : 20.41 01 Oct 2020
 * @author Artem Onufrei
 */

public class Cube {
    private double sideLength;

    public Cube() {
    }

    public Cube(double sideLength) throws IllegalArgumentException {
        if(sideLength < 0)
            throw new IllegalArgumentException("The length of the side cannot be less than zero");
        this.setSideLength(sideLength);
    }


    public double getOneSideArea(){
        return Math.pow(getSideLength(), 2);
    }

    public double getSideArea(){
        return getOneSideArea() * 6;
    }

    public double getVolume(){
        return Math.pow(getSideLength(), 3);
    }

    public double getOneSideDiagonal(){
        return getSideLength() * Math.sqrt(2);
    }

    public double getDiagonal(){
        double squareOneSideDiagonal = Math.pow(this.getOneSideDiagonal(), 2);
        double squareSideLength = Math.pow(this.getSideLength(), 2);
        return  Math.sqrt(squareOneSideDiagonal + squareSideLength);
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) throws IllegalArgumentException {
        if(sideLength < 0)
            throw new IllegalArgumentException("The length of the side cannot be less than zero");
        this.sideLength = sideLength;
    }
}
