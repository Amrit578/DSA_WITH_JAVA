package DSA.Arrays_Question;

import java.util.ArrayList;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies {
    public static void main(String[] args) {
        int [] arr = {2,3,5,1,3};
        int extraCandies = 3;

        List<Boolean> ans = greatestCandies(arr,extraCandies);
        System.out.println(ans);

    }
    static List<Boolean> greatestCandies(int [] arr, int extraCandies)
    {
        List<Boolean> ans = new ArrayList<>(arr.length);

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,arr[i]);
        }

        for(int i : arr)
        {
            ans.add(i>=max-extraCandies);
        }
        return ans;
    }
}
