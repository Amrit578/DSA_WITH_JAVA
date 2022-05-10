package DSA.OOPS.Static_Keyword;


public class InnerClass {
    static class Test
    {
        String name;
        public Test(String name)
        {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Test obj = new Test("Kunal");
        Test obj2 = new Test("Amrit");
        System.out.println(obj.name);
        System.out.println(obj2.name);
    }
}
