package DSA.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

public class TwoSumII_Input_Array_Is_Sorted {
    public static void main(String[] args) {

        int [] arr = {2,7,11,15};
        int target = 9;


        System.out.println(Arrays.toString(TwoSum(arr,target)));
    }
    static int [] TwoSum(int [] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

        while(start<end)
        {
            if(arr[start]+arr[end]<target)
            {
                start++;
            }
            else if(arr[start] + arr[end] > target)
            {
                end --;
            }
            else
            {
                return new int[]{start+1,end+1};
            }
        }
        return new int[]{-1,-1};
    }

}
