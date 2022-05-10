package DSA.OOPS.Super_Keyword.Super_Second_USe;
// Super ois used to invoke parent class method.
// Method overridden.
// If the subclass contain same method as parent class. use super keyword
public class Dog extends Animal{
    void eat()
    {
        System.out.println("Dog is eating");
    }

    void bark()
    {
        System.out.println("Dog is barking");
    }

    void display()
    {
        super.eat();
        eat();
        bark();
    }


    public static void main(String[] args) {
        Dog d1 = new Dog();

        d1.display();
    }
}
