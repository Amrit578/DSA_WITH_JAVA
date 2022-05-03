package DSA.BinarySearch;

//https://leetcode.com/problems/single-element-in-a-sorted-array/


public class Single_Element_In_Sorted_Array {
    public static void main(String[] args) {

        int [] arr = {1,1,2,3,3,4,4,8,8};

        System.out.println(singleElement(arr));

    }
    static int singleElement(int [] arr)
    {
        int start = 0;
        int end = arr.length-1;
        int n = arr.length;
        if(n == 1)
        {
            return arr[0];
        }

        if(arr[0] != arr[1])
        {
            return arr[0];
        }

        if(arr[n-1] != arr[n-2])
        {
            return arr[n-1];
        }

        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1])
            {
                return arr[mid];
            }
            else if(arr[mid] == arr[mid-1])
            {
                int low = start - mid + 1;
                if(low%2 == 0)
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid - 2;
                }
            }

            else if(arr[mid] == arr[mid+1])
            {
                int right = end - mid + 1;
                if(right%2 == 0)
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 2;
                }
            }


        }
        return -1;
    }
}
