package DSA.Arrays_Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum2_Unique_pair {
    public static void main(String[] args) {
        int [] arr = {2,2,4,3,1,6,6,7,5,9,1,8,9};
        int target = 10;

        System.out.println(Sum_Two(arr,target));
    }
    static List<List<Integer>> Sum_Two(int [] arr, int target)
    {
        List<List<Integer>> ans = new ArrayList<>();
        int left = 0;
        int right = arr.length-1;
        Arrays.sort(arr);
        while(left<right)
        {
            int sum = arr[left] + arr[right];
            if(left!=0 && arr[left] == arr[left-1])
            {
                left++;
                continue;
            }
            if(sum == target)
            {
                List<Integer> subres = new ArrayList<>();
                subres.add(arr[left]);
                subres.add(arr[right]);

                ans.add(subres);
                left++;
                right--;

            }else if(sum<target)
            {
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
    }
}
