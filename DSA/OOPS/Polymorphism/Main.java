package DSA.OOPS.Polymorphism;

public class Main {
    public static void main(String[] args) {

        Shapes shape = new circle();
        circle Circle = new circle();
        Square sqr = new Square();

        shape.area();
        Circle.area();
        sqr.area();

    }
}
