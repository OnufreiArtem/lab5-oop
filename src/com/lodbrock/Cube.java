package com.lodbrock;


/**
 * This class represent the cube.
 * You can use this class to find volume, area and diagonal of one or all sides of cube.
 * @version : 20.41 01 Oct 2020
 * @author Artem Onufrei
 */

public class Cube {
    private double sideLength = -1;

    public Cube() {
    }

    public Cube(double sideLength) throws Exception {
        this.setSideLength(sideLength);
    }

    public Cube(double diagonal, boolean isDiagonal) throws Exception{
        if(diagonal < 0)
            throw new Exception("The length of the diagonal cannot be less than zero");
        if (isDiagonal)
            this.setSideLength(Math.sqrt(diagonal/Math.sqrt(2)));
        else
            this.setSideLength(diagonal);
    }

    public double getOneSideArea() throws Exception{
        return Math.pow(getSideLength(), 2);
    }

    public double getSideArea() throws Exception{
        return getOneSideArea() * 6;
    }

    public double getVolume() throws Exception{
        return Math.pow(getSideLength(), 3);
    }

    public double getOneSideDiagonal() throws Exception{
        return getSideLength() * Math.sqrt(2);
    }

    public double getDiagonal() throws Exception {
        double squareOneSideDiagonal = Math.pow(this.getOneSideDiagonal(), 2);
        double squareSideLength = Math.pow(this.getSideLength(), 2);
        return  Math.sqrt(squareOneSideDiagonal + squareSideLength);
    }

    public double getSideLength() throws Exception {
        if (sideLength < 0)
            throw new Exception("You need to initialize cube before using it");
        return sideLength;
    }

    public void setSideLength(double sideLength) throws Exception{
        if(sideLength < 0)
            throw new Exception("The length of the side cannot be less than zero");
        this.sideLength = sideLength;
    }
}
