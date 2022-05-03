package DSA.OOPS;

class Car {
    String carName;
    int wheel;
    int headlight;


    Car(String name, int wheel, int headlight)
    {
        this.carName = name;
        this.wheel = wheel;
        this.headlight = headlight;
    }

    public void display()
    {
        System.out.println("The car name is : " + this.carName + " Wheel is : " + this.wheel + " Headlight is : " + this.headlight);

    }

}

public class Constructor {
    public static void main(String[] args) {

        Car car1 = new Car("Ferrari",4,2);
        Car car2 = new Car("Tata",3,2);

        car1.display();
        car2.display();
    }

}
