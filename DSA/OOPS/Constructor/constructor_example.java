package DSA.OOPS.Constructor;

class car{
    int wheel,seats,headlight;
    String price, color;
    float Use_year;
    boolean Grade;

    car(int wheel, int seats, int headlight, String price, String color, float use_year, boolean Grade) //creating a constructor
    {
        this.wheel = wheel;
        this.seats = seats;
        this.headlight = headlight;
        this.price = price;
        this.color = color;
        this.Use_year = use_year;
        this.Grade = Grade;
    }

    public void display()
    {
        System.out.println("The wheel is : "+this.wheel + "\nThe seats is : " + this.seats + "\nThe headlight is : " + this.headlight + "\nThe price is : " + this.price + "\nColor is : " + this.color + "\nUsed : " + this.Use_year + "\nCondition : " + this.Grade);
    }

}
public class constructor_example {
    public static void main(String[] args) {

        car car1 = new car(4,3,2,"45Lakh","Red",2.5f,true);

        car1.display();


    }
}
