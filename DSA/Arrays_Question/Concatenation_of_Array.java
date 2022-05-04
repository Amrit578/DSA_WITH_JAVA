package DSA.Arrays_Question;

import java.util.Arrays;

//https://leetcode.com/problems/concatenation-of-array/

public class Concatenation_of_Array {
    public static void main(String[] args) {

        int [] arr = {1,2,1};
        System.out.println(Arrays.toString(concat(arr)));
    }
    static int [] concat(int [] arr)
    {
        int n = arr.length;
        int [] ans = new int[2*n];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
            ans[i+n] = arr[i];
        }
        return ans;
    }
}
