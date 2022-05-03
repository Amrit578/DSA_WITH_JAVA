package DSA.Sorting.LeetCode_Sorting_Question;

import java.util.*;

public class FindAllDuplicateNumber {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};

        List<Integer> ans = allDuplicate(arr);
        System.out.println(ans);

    }
    static List<Integer> allDuplicate(int [] arr)
    {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while(i<arr.length)
        {
            if(arr[i]!=i+1)
            {
                int correct = arr[i] - 1;
                if(arr[i] != arr[correct])
                {
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                }
                else {
                    ans.add(arr[i]);
                }
            }
            else {
                i++;
            }
        }
        return ans;
    }
}
