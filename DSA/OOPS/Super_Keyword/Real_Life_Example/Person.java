package DSA.OOPS.Super_Keyword.Real_Life_Example;

public class Person {
    String name;
    int age;
    static String company;


    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
        Person.company = "TATA";
    }
}
