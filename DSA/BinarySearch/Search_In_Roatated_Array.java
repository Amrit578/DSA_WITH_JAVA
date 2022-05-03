package DSA.BinarySearch;

//https://leetcode.com/problems/search-in-rotated-sorted-array/

public class Search_In_Roatated_Array {
    public static void main(String[] args) {

        int [] arr = {4,5,6,7,0,1,2};
        int target = 1;

        System.out.println(Search(arr,target));

    }
    static int Search(int [] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = start + (end - start)/2;

            if(arr[mid] == target)
            {
                return mid;
            }
            if(arr[start]<=arr[mid])
            {
                if(target>=arr[start] && target<arr[mid])
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
            else if(arr[mid]<=arr[end])
            {
                if(target>=arr[mid] && target<=arr[end])
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
