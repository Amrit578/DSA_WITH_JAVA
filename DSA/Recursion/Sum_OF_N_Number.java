package DSA.Recursion;

import java.util.Scanner;

public class Sum_OF_N_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.println(sum(num));
    }
    static int sum(int num)
    {
        if(num == 0)
        {
            return 0;
        }

        return num + sum(num-1);
    }
}
