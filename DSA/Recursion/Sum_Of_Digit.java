package DSA.Recursion;

import java.util.Scanner;

public class Sum_Of_Digit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        System.out.println(sum(num));

    }
    static int sum(int num)
    {
        if(num == 0)
        {
            return 0;
        }

        return (num%10) + sum(num/10);
    }
}
