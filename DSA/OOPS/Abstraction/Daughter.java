package DSA.OOPS.Abstraction;

public class Daughter extends Parent{
    public Daughter(int age)
    {
        super(age);
    }
    @Override
    void career() {
        System.out.println("Daughter wants to be a coder");
    }

    @Override
    void partner()
    {
        System.out.println("Daughter love boy");
    }
}
