package DSA.Arrays_Question;

import java.util.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/

public class Running_Sum_Of_1D_Array {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4};
        System.out.println(Arrays.toString(sum(arr)));

    }
    static int [] sum(int [] arr)
    {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }
}
