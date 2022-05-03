package DSA.BinarySearch;
//https://leetcode.com/problems/kth-missing-positive-number/
public class Kth_Missing_Positive_number {
    public static void main(String[] args) {

        int [] arr = {2,3,4,7,11};
        int k = 5;

        System.out.println(missing(arr,k));
    }
    static int missing(int [] arr, int k)
    {
        int start = 0;
        int end = arr.length-1;
        int closetMid = 0;
        while (start<=end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid] - (mid+1) < k)
            {
                closetMid = mid+1;
                start = mid+1;
            }
            else
            {
                end = mid - 1;
            }


        }
        return k+closetMid;
    }
}
