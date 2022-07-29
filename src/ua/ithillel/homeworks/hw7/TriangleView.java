package ua.ithillel.homeworks.hw7;

public class TriangleView {

    public static void main(String[] args) {
        // равносторонний
        TriangleControl.addTriangle(new Triangle(new Point(0, 0), new Point(10., 17.32), new Point(20., 0)));
        TriangleControl.addTriangle(new Triangle(new Point(100., 10.), new Point(150., 96.60), new Point(200, 10.)));
        TriangleControl.addTriangle(new Triangle(new Point(30.5, 25.5), new Point(30.5, 50.5), new Point(52.15, 38.)));

        // равнобедренный
        TriangleControl.addTriangle(new Triangle(new Point(30., 50.), new Point(30., 100.), new Point(60., 75.)));
        TriangleControl.addTriangle(new Triangle(new Point(300., 500.), new Point(300., 500.), new Point(600., 750.)));
        TriangleControl.addTriangle(new Triangle(new Point(3., 5.), new Point(3., 10.), new Point(6., 7.5)));

        // прямоугольный
        TriangleControl.addTriangle(new Triangle(new Point(0., 0), new Point(100., 0), new Point(0, 10)));
        TriangleControl.addTriangle(new Triangle(new Point(10., 6.), new Point(20., 6.), new Point(10., 17.)));
        TriangleControl.addTriangle(new Triangle(new Point(26., 80.), new Point(16., 80.), new Point(16., 100.)));

        // произвольный
        TriangleControl.addTriangle(new Triangle(new Point(17.6, 42.75), new Point(8.1, 6.7), new Point(300.67, 4.9)));
        TriangleControl.addTriangle(new Triangle(new Point(75.4, 4.8), new Point(9.1, 0.78), new Point(9.1, 12.0)));
        TriangleControl.addTriangle(new Triangle(new Point(4.3, 21.7), new Point(7.32, 122.7), new Point(64.2, 45.56)));

        TriangleControl triangleControl = new TriangleControl();
        Result result = TriangleControl.getQuantity(new Result());
        System.out.println("Equilateral " + result.getEquilateralQuantity());
        System.out.println("Isosceles " + result.getIsoscelesQuantity());
        System.out.println("Rectangular " + result.getRectangularQuantity());
        System.out.println("Arbitrary " + result.getArbitraryQuantity());

        result = TriangleControl.minMaxSquarePerimeter(result);
        System.out.println("Max square equilateral " + result.getSquare(TriangleControl.EQUILATERAL, TriangleControl.MAX));
        System.out.println("Max square isosceles " + result.getSquare(TriangleControl.ISOSCELES, TriangleControl.MAX));
        System.out.println("Max square rectangular " + result.getSquare(TriangleControl.RECTANGULAR, TriangleControl.MAX));
        System.out.println("Max square arbitrary " + result.getSquare(TriangleControl.ARBITRARY, TriangleControl.MAX));

        System.out.println("Min square equilateral " + result.getSquare(TriangleControl.EQUILATERAL, TriangleControl.MIN));
        System.out.println("Min square isosceles " + result.getSquare(TriangleControl.ISOSCELES, TriangleControl.MIN));
        System.out.println("Min square rectangular " + result.getSquare(TriangleControl.RECTANGULAR, TriangleControl.MIN));
        System.out.println("Min square arbitrary " + result.getSquare(TriangleControl.ARBITRARY, TriangleControl.MIN));

        System.out.println("Min perimeter equilateral " + result.getPerimeter(TriangleControl.EQUILATERAL, TriangleControl.MAX));
        System.out.println("Max perimeter isosceles " + result.getPerimeter(TriangleControl.ISOSCELES, TriangleControl.MAX));
        System.out.println("Max perimeter rectangular " + result.getPerimeter(TriangleControl.RECTANGULAR, TriangleControl.MAX));
        System.out.println("Max perimeter arbitrary " + result.getPerimeter(TriangleControl.ARBITRARY, TriangleControl.MAX));

        System.out.println("Min perimeter equilateral " + result.getPerimeter(TriangleControl.EQUILATERAL, TriangleControl.MIN));
        System.out.println("Min perimeter isosceles " + result.getPerimeter(TriangleControl.ISOSCELES, TriangleControl.MIN));
        System.out.println("Min perimeter rectangular " + result.getPerimeter(TriangleControl.RECTANGULAR, TriangleControl.MIN));
        System.out.println("Min perimeter arbitrary " + result.getPerimeter(TriangleControl.ARBITRARY, TriangleControl.MIN));
    }
}