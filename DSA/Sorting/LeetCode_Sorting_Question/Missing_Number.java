package DSA.Sorting.LeetCode_Sorting_Question;


//https://leetcode.com/problems/missing-number/

public class Missing_Number {
    public static void main(String[] args) {
        int [] arr = {3,0,1};

        System.out.println(missing(arr));
    }
    static int missing(int [] nums)
    {
        int i = 0;
        while (i<nums.length)
        {
            int correct = nums[i] ;
            if(nums[i]<nums.length && nums[i]!=nums[correct])
            {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j)
            {
                return j;
            }

        }
        return nums.length;
    }
}
