public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(15,8,15,6,9);
        Triangle triangle2 = new Triangle(20,10,50,30,10);

        System.out.println("triangle1 base = " + triangle1.base +
                ", triangle1 height = " + triangle1.height);
        
        double area1 = triangle1.findArea();
        System.out.println("Area of the triangle1 = " + area1);

    }
}
