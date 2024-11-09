public class Triangle {
    static int numOfSides = 3;
    double base;
    double height;
    double sideOne;
    double sidetwo;
    double sideThree;

    public Triangle(double base, double height, double sideOne,
                    double sidetwo, double sideThree) {
        this.base = base;
        this.height = height;
        this.sideOne = sideOne;
        this.sidetwo = sidetwo;
        this.sideThree = sideThree;
    }

    public double findArea() {
        return (this.base * this.height) / 2;
    }
}
