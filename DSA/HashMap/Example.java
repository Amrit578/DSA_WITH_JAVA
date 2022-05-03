package DSA.HashMap;

import java.util.*;

public class Example {
    public static void main(String args[])
    {
        // initialising a hashmap
        Map<String, Integer> hashmap = new HashMap<String, Integer>();

        // put function
        hashmap.put("Amrit",21);
        hashmap.put("Sunisht",21);
        hashmap.put("Shobhna",22);
        hashmap.put("Snigdha",45);

        System.out.println("Age of Snigdha : "+ hashmap.get("Snigdha"));

        //remove
//        hashmap.remove("Snigdha");
//        System.out.println(hashmap.get("Snigdha"));


        //check if the "Snigdha" is in the map or not
        if(!hashmap.containsKey("Snigdha"))
        {
            System.out.println("Snigdha is not there in the map");
        }



        //print all the value of the map

        /*{
            "Amrit"(key) : 21(Value);
            "Sunisht" : 21;
            "Shobhna" : 22;
        }*/




        //Entry -> <Key, Value> in the map
        //Map -> Lots of Entries
        for (HashMap.Entry<String,Integer> entry:hashmap.entrySet())
        {
            System.out.println("Name : " + entry.getKey() + ", Age : " + entry.getValue());
        }


        //Integer, Integer
        //Height : No. of people with that height;
        //

        System.out.println("Hashmap : " + hashmap);

    }
}
