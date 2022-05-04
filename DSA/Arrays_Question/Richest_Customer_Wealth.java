package DSA.Arrays_Question;

//https://leetcode.com/problems/richest-customer-wealth/


public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        int [] [] arr = {
                {1,2,3},
                {3,2,1}
        };


        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int [][] arr)
    {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}
