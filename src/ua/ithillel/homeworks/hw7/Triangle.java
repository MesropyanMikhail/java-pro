package ua.ithillel.homeworks.hw7;

public class Triangle {
    Point pointA;
    Point pointB;
    Point pointC;

    private int type;
    private double square;
    private double perimeter;
    private double lengthLineA;
    private double lengthLineB;
    private double lengthLineC;

    public Triangle(Point a, Point b, Point c) {
        this.pointA = a;
        this.pointB = b;
        this.pointC = c;

        setLengthLine();
        setType();
        setSquare();
        setPerimeter();
    }

    private void setLengthLine() {
        Line lineA = new Line(pointA, pointB);
        lengthLineA = lineA.getLineLength();
        Line lineB = new Line(pointB, pointC);
        lengthLineB = lineB.getLineLength();
        Line lineC = new Line(pointC, pointA);
        lengthLineC = lineC.getLineLength();
    }

    private void setType() {
        if (isEquilateral(lengthLineA, lengthLineB, lengthLineC)) {
            type = 1;
        } else if (isIsosceles(lengthLineA, lengthLineB, lengthLineC)) {
            type = 2;
        } else if (isRectangular(lengthLineA, lengthLineB, lengthLineC)) {
            type = 3;
        } else {
            type = 4;
        }
    }

    private boolean isEquilateral(double lengthLineA, double lengthLineB, double lengthLineC) {
        return (lengthLineA == lengthLineB) && (lengthLineB == lengthLineC);
    }

    private boolean isIsosceles(double lengthLineA, double lengthLineB, double lengthLineC) {
        return (lengthLineA == lengthLineB) || (lengthLineA == lengthLineC) || (lengthLineB == lengthLineC);
    }

    private boolean isRectangular(double lengthLineA, double lengthLineB, double lengthLineC) {
        if ((lengthLineA > lengthLineB) && (lengthLineA > lengthLineC)) {
            return correspondsPythagoras(lengthLineB, lengthLineC, lengthLineA);
        } else if (((lengthLineB > lengthLineA) && (lengthLineB > lengthLineC))) {
            return correspondsPythagoras(lengthLineA, lengthLineC, lengthLineB);
        } else {
            return correspondsPythagoras(lengthLineA, lengthLineB, lengthLineC);
        }
    }

    private boolean correspondsPythagoras(double firstLeg, double secondLeg, double hypotenuse) {
        return TriangleControl.round(Math.sqrt(Math.pow(firstLeg, 2) + Math.pow(secondLeg, 2))) == hypotenuse;
    }

    private void setSquare() {
        double semiPerimeter;
        semiPerimeter = (lengthLineA + lengthLineB + lengthLineC) / 2;
        square = TriangleControl.round(Math.sqrt(semiPerimeter * (semiPerimeter - lengthLineA) * (semiPerimeter - lengthLineB) * (semiPerimeter - lengthLineC)));
    }

    private void setPerimeter() {
        perimeter = TriangleControl.round(lengthLineA + lengthLineB + lengthLineC);
    }

    public int getType() {
        return type;
    }

    public double getSquare() {
        return square;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
