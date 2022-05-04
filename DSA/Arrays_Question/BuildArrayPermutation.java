package DSA.Arrays_Question;

//https://leetcode.com/problems/build-array-from-permutation/

import java.util.Arrays;

public class BuildArrayPermutation {
    public static void main(String[] args) {

        int [] arr = {0,1,2,5,3,4};
        System.out.println(Arrays.toString(buildArray(arr)));
    }
    static int [] buildArray(int [] arr)
    {
        int n = arr.length;
        int [] ans = new int[n];

        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[arr[i]];
        }
        return ans;
    }
}
