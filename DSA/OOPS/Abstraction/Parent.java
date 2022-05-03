package DSA.OOPS.Abstraction;

public abstract class Parent {

    int age;

    public Parent(int age) {
        this.age = age;
    }
    static void hello()
    {
        System.out.println("Hey Google");
    }
    void normal()
    {
        System.out.println("Yes , you can do it");
    }
    abstract void career();
    abstract void partner();

}
