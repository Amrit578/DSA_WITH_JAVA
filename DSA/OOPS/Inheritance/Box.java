package DSA.OOPS.Inheritance;

public class Box {
    int w;
    int h;
    int l;


    public Box() {
        this.w = -1;
        this.h = -1;
        this.l = -1;
    }

    public Box(int side) {
        this.w = side;
        this.h = side;
        this.l = side;
    }


    public Box(int w, int h, int l) {
        this.w = w;
        this.h = h;
        this.l = l;
    }

    public Box(Box other) {
        this.w = other.w;
        this.h = other.h;
        this.l = other.l;
    }


}
