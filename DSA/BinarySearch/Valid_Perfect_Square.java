package DSA.BinarySearch;


import java.util.Scanner;

//https://leetcode.com/problems/valid-perfect-square/
public class Valid_Perfect_Square {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();


        System.out.println(valid(num));

    }
    static boolean valid(int num)
    {
        int start = 1;
        int end = num;
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(mid * mid == num)
            {
                return true;
            }
            else if(mid * mid < num)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return false;
    }
}
