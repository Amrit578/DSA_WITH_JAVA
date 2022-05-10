package DSA.OOPS.Static_Keyword;


class A{
    String name;
    int age;
     static long population;

    public A(String name, int age) {
        this.name = name;
        this.age = age;
        A.population += 1;
    }

    public void display()
    {
        System.out.println("The name is : "+this.name + " The Age is : "+this.age + " Population is : " + A.population);
    }
}

public class StaticExample {
    public static void main(String[] args) {
        A obj = new A("Amrit",21);
        A obj2 = new A("Sunisht",22);

        obj.display();
        obj2.display();

    }
}
