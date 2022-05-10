package DSA.OOPS.Inheritance;

public class BoxPrice extends BoxWeight{

    double cost;

    BoxPrice(){
        super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }


    public BoxPrice(double w, double l, double h, double weight, double cost) {
        super(w, l, h,weight);
        this.cost = cost;
    }
}
