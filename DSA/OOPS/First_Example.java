package DSA.OOPS;

class A {
    String name;
    int age;

    A()  //create constructor
    {
        this.age = 34;
        this.name = "Amrit";
    }

    public void display() {
        System.out.println("The name is : " + this.name + " The Age is : " + this.age);
    }
}
public class First_Example {
    public static void main(String[] args) {

    A obj = new A();
    obj.display();

    }
}
