package DSA.Arrays_Question;

//https://leetcode.com/problems/shuffle-the-array/

import java.util.Arrays;

public class Shuffle_The_Array {
    public static void main(String[] args) {

        int [] arr = {2,5,1,3,4,7};
        int n = 3;

        System.out.println(Arrays.toString(shuffle(arr,n)));
    }
    static int [] shuffle(int [] arr, int n)
    {
        int [] ans = new int[2*n];

        int j = 0;
        for (int i = 0; i < ans.length; i = i+2) {
            ans[i] = arr[j];
            ans[i+1] = arr[j+n];
            j++;
        }
        return ans;
    }
}
