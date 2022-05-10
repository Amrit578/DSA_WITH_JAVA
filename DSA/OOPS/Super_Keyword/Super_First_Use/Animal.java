package DSA.OOPS.Super_Keyword.Super_First_Use;


// Super is to refer immediate parent class instance variable

import DSA.OOPS.Interfaces.extendDemo.A;

public class Animal {
    String color;

    Animal(String color)
    {
        this.color = color;
    }
    Animal()
    {
        this.color = "RED";
    }

     public void display()
    {
        System.out.println("Color is : " + this.color);
    }
    public static void main(String[] args) {
        Animal a1 = new Animal("Red");

        a1.display();
    }
}
