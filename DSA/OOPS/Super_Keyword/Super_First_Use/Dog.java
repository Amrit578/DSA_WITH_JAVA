package DSA.OOPS.Super_Keyword.Super_First_Use;

// Super is to refer immediate parent class instance variable

public class Dog extends Animal {
    String color;

    Dog(String color)
    {
        this.color = color;
    }

    public void display()
    {
        System.out.println(super.color);
        System.out.println(color);
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("WHITE");
        d1.display();

    }
}
