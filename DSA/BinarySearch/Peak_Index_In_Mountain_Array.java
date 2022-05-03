package DSA.BinarySearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class Peak_Index_In_Mountain_Array {
    public static void main(String[] args) {

        int [] arr = {0,1,2,0};

        System.out.println(peak(arr));

    }
    static int peak(int [] arr)
    {
        int start = 0;
        int end = arr.length;
        while(start<end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end = mid;
            }
            else
            {
                start = mid + 1;
            }
        }
        return start;
    }
}
