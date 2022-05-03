package DSA.Recursion;

import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int temp = rev(num,0);
        if(temp == num)
        {
            System.out.println("Yes Palindrome");
        }
        else
        {
            System.out.println("Sorry It is not palindrome");
        }
    }
    static int rev(int num, int temp)
    {
        if(num == 0)
        {
            return temp;
        }

        temp = (temp * 10) + (num%10);
        return rev(num/10,temp);
    }
}
