package DSA.Sorting.LeetCode_Sorting_Question;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
import java.util.ArrayList;
import java.util.List;

public class Find_all_disappear_number {
    public static void main(String[] args) {

        int [] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findAllMissing(arr);
        System.out.println(ans);


    }
    static List<Integer> findAllMissing(int [] nums)
    {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while(i<nums.length)
        {
            int correct = nums[i] - 1;
            if(nums[i]!=nums[correct])
            {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else
            {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1)
            {
                ans.add(j+1);
            }

        }
        return ans;
    }
}
