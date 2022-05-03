package DSA.HashMap;
import java.util.*;

//creating a class
class Student{
    int age;
    int percent;
    String address;

    //create a constructor
    Student(int age, int percent, String address)
    {
        this.age = age;
        this.percent = percent;
        this.address = address;
    }
}

public class Class_Example {
    public static void main(String[] args) {

        Map<String, Student>school = new HashMap<>();  //create a hashmap


        school.put("Amrit", new Student(27,60,"Banglore")); //declare value
        school.put("Sunisht", new Student(34,90,"Delhi"));

/*    ******************************************************************************************************************
      System.out.println(school.get("Amrit").address + " " +  school.get("Amrit").percent); //print value
      *****************************************************************************************************************/



/*
        ----------------------------------------------------------------------------------------------------------------


        Print all Data

        for(Map.Entry<String, Student> hashmap : school.entrySet())
        {
            Student student = hashmap.getValue();
            System.out.println("Name : " + hashmap.getKey() + " Age : " + student.age + " Percent : " + student.percent + " Address : " + student.address);
        }


        ----------------------------------------------------------------------------------------------------------------*/



      /*  ****************************************************************************************************************
        school.get("Amrit").age = 37;  //Update the Amrit age

        System.out.println("-------------------");

        System.out.println("After Updating");
        for(Map.Entry<String, Student> hashmap : school.entrySet())
        {
            Student student = hashmap.getValue();
            System.out.println("Name : " + hashmap.getKey() + " Age : " + student.age + " Percent : " + student.percent + " Address : " + student.address);
        }

        *****************************************************************************************************************/



        /*----------------------------------------------------------------------------------------------------------------

        System.out.println("Before Updating the School data....");
        for(Map.Entry<String, Student> hashmap : school.entrySet())
        {
            Student student = hashmap.getValue();
            System.out.println("Name : " + hashmap.getKey() + " Age : " + student.age + " Percent : " + student.percent + " Address : " + student.address);
        }



        //Another way to update data
        Student AmritStudent = school.get("Amrit");
        school.put("Amrit", new Student(AmritStudent.age + 10,AmritStudent.percent + 5,AmritStudent.address + "Canada"));


        System.out.println("-----------------------------");
        System.out.println("After amrit moving canada");
        for(Map.Entry<String, Student> hashmap : school.entrySet())
        {
            Student student = hashmap.getValue();
            System.out.println("Name : " + hashmap.getKey() + " Age : " + student.age + " Percent : " + student.percent + " Address : " + student.address);
        }

        ----------------------------------------------------------------------------------------------------------------*/

    }
}
