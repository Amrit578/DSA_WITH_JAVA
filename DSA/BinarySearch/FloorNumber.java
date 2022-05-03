package DSA.BinarySearch;

import java.util.Scanner;

// Floor Number is Find the greatest number which is smaller than target or equal to target

public class FloorNumber {
    public static void main(String[] args) {

        int [] arr = {5,10,11,13,15,16,19,22};
        int target = 21;

        System.out.println(floor(arr,target));

    }
    static int floor(int [] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(target == arr[mid])
            {
                return mid;
            }

            if(target<arr[mid])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return end;
    }
}
