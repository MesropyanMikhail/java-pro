package ua.ithillel.homeworks.hw7;

import java.util.Arrays;

public class TriangleControl {
    static Triangle[] triangles = new Triangle[]{};

    final public static int EQUILATERAL = 1;
    final public static int ISOSCELES = 2;
    final public static int RECTANGULAR = 3;
    final public static int ARBITRARY = 4;
    final static boolean MAX = true;
    final static boolean MIN = false;

    static void addTriangle(Triangle triangle) {

        int arraySize = triangles.length;

        if (arraySize > 0) {
            triangles = Arrays.copyOf(triangles, ++arraySize);
        } else {
            triangles = new Triangle[++arraySize];
        }
        triangles[arraySize - 1] = triangle;
    }

    public static Result minMaxSquarePerimeter(Result result) {
        for (Triangle triangle : triangles) {

            if (triangle.getSquare() > result.getSquare(triangle.getType(), MAX)) {
                result.setSquare(triangle, triangle.getType(), MAX);
            }
            if (triangle.getSquare() < result.getSquare(triangle.getType(), MIN)) {
                result.setSquare(triangle, triangle.getType(), MIN);
            }
            if (triangle.getPerimeter() > result.getPerimeter(triangle.getType(), MAX)) {
                result.setPerimeter(triangle, triangle.getType(), MAX);
            }
            if (triangle.getPerimeter() < result.getPerimeter(triangle.getType(), MIN)) {
                result.setPerimeter(triangle, triangle.getType(), MIN);
            }
        }
        return result;
    }

    public static Result getQuantity(Result result) {

        for (Triangle triangle : triangles) {
            if (triangle.getType() == EQUILATERAL) {
                result.setEquilateralQuantity(result.getEquilateralQuantity() + 1);
            } else if (triangle.getType() == ISOSCELES) {
                result.setIsoscelesQuantity(result.getIsoscelesQuantity() + 1);
            } else if (triangle.getType() == RECTANGULAR) {
                result.setRectangularQuantity(result.getRectangularQuantity() + 1);
            } else {
                result.setArbitraryQuantity(result.getArbitraryQuantity() + 1);
            }
        }
        return result;
    }

    public static double round(double value) {
        int temp = (int) Math.pow(10, 2);
        return (double) Math.round(value * temp) / temp;
    }
}
