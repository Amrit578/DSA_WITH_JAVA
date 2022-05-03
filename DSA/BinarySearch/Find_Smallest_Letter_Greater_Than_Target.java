package DSA.BinarySearch;


//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {

        int [] arr = {'c','f','j'};
        int target = 'c';

        System.out.println(smallest(arr,target));
    }
    static char smallest(int [] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        while (start<=end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid]>target)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return (char) arr[start % arr.length];
    }

}
