package DSA.Recursion;

import java.util.Scanner;

public class Reverse_A_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        reverse(num);
    }
    static void reverse(int num)
    {
        if(num<10)
        {
            System.out.print(num);
            return;
        }
        else
        {
            System.out.print(num%10);
            reverse(num/10);
        }
    }
}
