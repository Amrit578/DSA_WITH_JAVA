package DSA.OOPS.Super_Keyword.Real_Life_Example;

public class Emp extends Person{
    int salary;

    public Emp(String name, int age,int salary) {
        super(name, age);
        this.salary = salary;
    }

    public void display()
    {
        System.out.println("The name is : " + this.name + " The age is : " + this.age + " Company name : " + Person.company + " Salary : " + this.salary);
    }
}
