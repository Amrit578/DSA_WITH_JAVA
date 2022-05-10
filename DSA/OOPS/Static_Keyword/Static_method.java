package DSA.OOPS.Static_Keyword;

public class Static_method {
    public static void main(String[] args) {

       fun();
    }

    static void fun()
    {
        Static_method obj = new Static_method();

        obj.greeting();
    }

   void greeting()
    {
        System.out.println("Hello");
    }
}
