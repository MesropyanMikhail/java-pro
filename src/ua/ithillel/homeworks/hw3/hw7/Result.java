package ua.ithillel.homeworks.hw3.hw7;

public class Result {
    private Triangle equilateralSquareMin;
    private Triangle equilateralSquareMax;
    private Triangle isoscelesSquareMin;
    private Triangle isoscelesSquareMax;
    private Triangle rectangularSquareMin;
    private Triangle rectangularSquareMax;
    private Triangle arbitrarySquareMin;
    private Triangle arbitrarySquareMax;

    private Triangle equilateralPerimeterMin;
    private Triangle equilateralPerimeterMax;
    private Triangle isoscelesPerimeterMin;
    private Triangle isoscelesPerimeterMax;
    private Triangle rectangularPerimeterMin;
    private Triangle rectangularPerimeterMax;
    private Triangle arbitraryPerimeterMin;
    private Triangle arbitraryPerimeterMax;

    private int equilateralQuantity;
    private int isoscelesQuantity;
    private int rectangularQuantity;
    private int arbitraryQuantity;

    double getSquare(int type, boolean operation) {
        switch (type) {
            case (TriangleControl.EQUILATERAL):
                if (operation) {
                    return (equilateralSquareMax == null) ? Double.MIN_VALUE : equilateralSquareMax.getSquare();
                } else {
                    return (equilateralSquareMin == null) ? Double.MAX_VALUE : equilateralSquareMin.getSquare();
                }
            case (TriangleControl.ISOSCELES):
                if (operation) {
                    return (isoscelesSquareMax == null) ? Double.MIN_VALUE : isoscelesSquareMax.getSquare();
                } else {
                    return (isoscelesSquareMin == null) ? Double.MAX_VALUE : isoscelesSquareMin.getSquare();
                }
            case (TriangleControl.RECTANGULAR):
                if (operation) {
                    return (rectangularSquareMax == null) ? Double.MIN_VALUE : rectangularSquareMax.getSquare();
                } else {
                    return (rectangularSquareMin == null) ? Double.MAX_VALUE : rectangularSquareMin.getSquare();
                }
            case (TriangleControl.ARBITRARY):
                if (operation) {
                    return (arbitrarySquareMax == null) ? Double.MIN_VALUE : arbitrarySquareMax.getSquare();
                } else {
                    return (arbitrarySquareMin == null) ? Double.MAX_VALUE : arbitrarySquareMin.getSquare();
                }
            default:
                return 0;
        }
    }

    double getPerimeter(int type, boolean operation) {
        switch (type) {
            case (TriangleControl.EQUILATERAL):
                if (operation) {
                    return (equilateralPerimeterMax == null) ? Double.MIN_VALUE : equilateralPerimeterMax.getPerimeter();
                } else {
                    return (equilateralPerimeterMin == null) ? Double.MAX_VALUE : equilateralPerimeterMin.getPerimeter();
                }
            case (TriangleControl.ISOSCELES):
                if (operation) {
                    return (isoscelesPerimeterMax == null) ? Double.MIN_VALUE : isoscelesPerimeterMax.getPerimeter();
                } else {
                    return (isoscelesPerimeterMin == null) ? Double.MAX_VALUE : isoscelesPerimeterMin.getPerimeter();
                }
            case (TriangleControl.RECTANGULAR):
                if (operation) {
                    return (rectangularPerimeterMax == null) ? Double.MIN_VALUE : rectangularPerimeterMax.getPerimeter();
                } else {
                    return (rectangularPerimeterMin == null) ? Double.MAX_VALUE : rectangularPerimeterMin.getPerimeter();
                }
            case (TriangleControl.ARBITRARY):
                if (operation) {
                    return (arbitraryPerimeterMax == null) ? Double.MIN_VALUE : arbitraryPerimeterMax.getPerimeter();
                } else {
                    return (arbitraryPerimeterMin == null) ? Double.MAX_VALUE : arbitraryPerimeterMin.getPerimeter();
                }
            default:
                return 0;
        }
    }

    void setSquare(Triangle value, int type, boolean operation) {
        switch (type) {
            case (TriangleControl.EQUILATERAL):
                if (operation) {
                    equilateralSquareMax = value;
                } else {
                    equilateralSquareMin = value;
                }
                break;
            case (TriangleControl.ISOSCELES):
                if (operation) {
                    isoscelesSquareMax = value;
                } else {
                    isoscelesSquareMin = value;
                }
                break;
            case (TriangleControl.RECTANGULAR):
                if (operation) {
                    rectangularSquareMax = value;
                } else {
                    rectangularSquareMin = value;
                }
                break;
            case (TriangleControl.ARBITRARY):
                if (operation) {
                    arbitrarySquareMax = value;
                } else {
                    arbitrarySquareMin = value;
                }
                break;
        }
    }

    void setPerimeter(Triangle value, int type, boolean operation) {
        switch (type) {
            case (TriangleControl.EQUILATERAL):
                if (operation) {
                    equilateralPerimeterMax = value;
                } else {
                    equilateralPerimeterMin = value;
                }
                break;
            case (TriangleControl.ISOSCELES):
                if (operation) {
                    isoscelesPerimeterMax = value;
                } else {
                    isoscelesPerimeterMin = value;
                }
                break;
            case (TriangleControl.RECTANGULAR):
                if (operation) {
                    rectangularPerimeterMax = value;
                } else {
                    rectangularPerimeterMin = value;
                }
                break;
            case (TriangleControl.ARBITRARY):
                if (operation) {
                    arbitraryPerimeterMax = value;
                } else {
                    arbitraryPerimeterMin = value;
                }
                break;
        }
    }

    public int getEquilateralQuantity() {
        return equilateralQuantity;
    }

    public void setEquilateralQuantity(int equilateralQuantity) {
        this.equilateralQuantity = equilateralQuantity;
    }

    public int getIsoscelesQuantity() {
        return isoscelesQuantity;
    }

    public void setIsoscelesQuantity(int isoscelesQuantity) {
        this.isoscelesQuantity = isoscelesQuantity;
    }

    public int getRectangularQuantity() {
        return rectangularQuantity;
    }

    public void setRectangularQuantity(int rectangularQuantity) {
        this.rectangularQuantity = rectangularQuantity;
    }

    public int getArbitraryQuantity() {
        return arbitraryQuantity;
    }

    public void setArbitraryQuantity(int arbitraryQuantity) {
        this.arbitraryQuantity = arbitraryQuantity;
    }
}