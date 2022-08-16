package Models;

public class Triangle {
    private int side1, side2, side3;
    private String triangleType;
    /* set range for testing */
    private int min = ValueDefault.TRIANGLE_MIN_SIZE;
    private int max = ValueDefault.TRIANGLE_MAX_SIZE;

    public Triangle(int a, int b, int c) {
        this.side1 = a;
        this.side2 = b;
        this.side3 = c;
    }

    /* Methods */
    public boolean isTriangle() {
        boolean isTriangle = false;
        if ((side1 < side2 + side3) && (side2 < side1 + side3) && (side3 < side2 + side1)) {
            isTriangle = true;
        }
        return isTriangle;
    }

    public String classifyTriangle() {
        boolean isOutOfRange =  (min <= side1) && (side1 <= max) ||
                                (min <= side2) && (side2 <= max) ||
                                (min <= side3) && (side3 <= max);

        if (isOutOfRange) {
            return "OUT_OF_RANGE";
        }

        if (isTriangle()) {
            if ((side1 == side2) && (side2 == side3))
                triangleType = "EQUILATERAL";
            else if ((side1 != side2) && (side1 != side3) && (side2 != side3))
                triangleType = "SCALENE";
            else
                triangleType = "ISOSCELES";
        } else
            triangleType = "IsNotTriangle";
        return triangleType;
    }

    /*--------------------------------------*/
    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public String getTriangleType() {
        return triangleType;
    }

    public void setTriangleType(String triangleType) {
        this.triangleType = triangleType;
    }
}
