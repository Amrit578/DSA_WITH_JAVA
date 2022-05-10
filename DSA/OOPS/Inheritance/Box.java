package DSA.OOPS.Inheritance;

public class Box {

    double l;
    double w;
    double h;

    double weight;

    Box()
    {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    Box(double cube)
    {
        this.h = cube;
        this.w = cube;
        this.l = cube;
    }

    Box(double l, double w, double h,double weight) {
        this.l = l;
        this.w = w;
        this.h = h;
        this.weight = weight;

    }

    Box(Box old)
    {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public void display()
    {
        System.out.println("Hello world");
    }
}
