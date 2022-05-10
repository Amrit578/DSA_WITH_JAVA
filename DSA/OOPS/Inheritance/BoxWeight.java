package DSA.OOPS.Inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight()
    {
        this.weight = -1;
    }

    BoxWeight(BoxWeight other)
    {
        super(other);
        weight = other.weight;
    }

    BoxWeight(double w, double l, double h,double weight)
    {
        super(l,w,h,weight); //super call the parent class constructor
                      // use to initialise value present in parent class
        this.weight = weight;
    }
}
