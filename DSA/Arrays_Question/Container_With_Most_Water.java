package DSA.Arrays_Question;

//https://leetcode.com/problems/container-with-most-water/

public class Container_With_Most_Water {
    public static void main(String[] args) {

        int [] arr = {1,8,6,2,5,4,8,3,7};

        System.out.println(Maximum_Water(arr));

    }
    static int Maximum_Water(int [] height)
    {
        int i = 0;
        int j = height.length-1;

        int water = 0;
        while(i<j)
        {
            int width = j-i;
            int h = Math.min(height[i],height[j]);

            water = Math.max(water,h*width);

            if(height[i]<height[j])
            {
                i++;
            }
            else {
                j--;
            }

        }
        return water;
    }
}
