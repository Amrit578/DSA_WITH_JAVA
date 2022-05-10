package DSA.Arrays_Question;

//https://leetcode.com/problems/median-of-two-sorted-arrays/

public class Median_Of_two_Sorted_Array {
    public static void main(String[] args) {

        int [] a1 = {1,2};
        int [] a2 = {3,4};

        System.out.println(median_array(a1,a2));

    }
    static double median_array(int [] a1, int [] a2)
    {
        int len = a1.length + a2.length;

        int i = 0;
        int j = 0;
        int k = 0;

        int [] merge = new int[len];

        while(i<a1.length && j<a2.length)
        {
            if(a1[i] < a2[j])
            {
                merge[k] = a1[i];
                i++;
                k++;
            }
            else {
                merge[k] = a2[j];
                j++;
                k++;
            }
        }

        while(i<a1.length)
        {
            merge[k] = a1[i];
            i++;
            k++;
        }
        while(j<a2.length)
        {
            merge[k] = a2[j];
            j++;
            k++;
        }

        double median = 0.0;
        int mid = merge.length/2;
        if(merge.length%2 == 1)
        {
            median = merge[mid];
        }
        else {
            median = (merge[mid] + merge[mid-1])/2.0;
        }

        return median;
    }
}
