package com.lodbrock;

public class Main {

    public static void main(String[] args) {
        Cube cube;

        try {
            cube  = new Cube(5);
            System.out.println("The length of the side is " + cube.getSideLength());
            System.out.println("The area of one side is " + cube.getOneSideArea());
            System.out.println("The area of all sides is " + cube.getSideArea());
            System.out.println("The volume of the cube is " + cube.getVolume());
            System.out.println("The diagonal of one side is " + cube.getOneSideDiagonal());
            System.out.println("The diagonal of cube is " + cube.getDiagonal());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}
