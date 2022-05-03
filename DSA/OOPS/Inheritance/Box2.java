package DSA.OOPS.Inheritance;

public class Box2 extends Box {
    int weight;

    public Box2()
    {
        this.weight = -1;
    }

    Box2(int w, int l, int h, int weight)
    {
        super(w,h,l);
        this.weight = weight;
    }



}
