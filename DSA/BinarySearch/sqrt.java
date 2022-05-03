package DSA.BinarySearch;

import java.util.Scanner;

//https://leetcode.com/problems/sqrtx/

public class sqrt {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        System.out.println(square(num));

    }
    static int square(int num)
    {
        int start = 1;
        int end = num;
        int sqrt = 0;
        if(num == 0 || num == 1)
        {
            return num;
        }
        while(start<=end)
        {
            int mid = start + (end - start)/2;

             if(mid*mid<=num)
            {
                sqrt = mid;
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return sqrt;
    }
}
