package DSA.OOPS.Abstraction;

public class Son extends Parent{

    public Son(int age)
    {
        super(age);
    }
    @Override
    void career() {
        System.out.println("I am going to be Doctor");
    }

    @Override
    void partner()
    {
        System.out.println("Son love Girl");
    }
}
