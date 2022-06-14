package SortNumbers;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] nums = {4, 2, 5, 10, 3, 9, 7, 6, 8, 1};
        System.out.println(Arrays.toString(nums));

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i]<nums[j]){
                    int x = nums[j];
                    nums[j] = nums[i];
                    nums[i] = x;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
