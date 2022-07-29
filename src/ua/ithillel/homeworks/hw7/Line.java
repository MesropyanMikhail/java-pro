package ua.ithillel.homeworks.hw7;

public class Line {
    Point firstPoint;
    Point secondPoint;

    public Line(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    double getLineLength() {
        double lineLength;
        lineLength = Math.sqrt(Math.pow(secondPoint.getX() - firstPoint.getX(), 2) + Math.pow(secondPoint.getY() - firstPoint.getY(), 2));
        return TriangleControl.round(lineLength);
    }
}
