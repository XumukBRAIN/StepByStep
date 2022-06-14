package SortNumbers;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 3, 1};
        //           ||  ||
        //          next key
        System.out.println(Arrays.toString(nums));

        for(int i = 1; i < nums.length; i++){
            int key = nums[i];
            //key = 2;

            int next = i - 1;
            //next = 0;

            while (next >= 0 && nums[next] > key){
                nums[next + 1] = nums[next];
                next = next - 1;
            }
            nums[next + 1] = key;
        }
        System.out.println(Arrays.toString(nums));
    }
}
