package DSA.BinarySearch;


// Ceiling Number is Find the smallest number which is greater than target or equal to target

public class CeilingNumber {
    public static void main(String[] args) {

        int [] arr = {5,10,12,14,15,16,18,19,22};
        int target = 17;

        System.out.println(ceiling(arr,target));

    }
    static int ceiling(int [] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        if(target>arr[arr.length-1])
        {
            return -1;
        }
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return start;
    }
}
