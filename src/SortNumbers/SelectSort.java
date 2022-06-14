package SortNumbers;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int [] nums = {4, 2, 5, 10, 3, 9, 7, 6, 8, 1};
        System.out.println(Arrays.toString(nums));


        for(int left = 0; left < nums.length; left++){
            int minIndex = left;
            for(int j = left; j < nums.length; j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            int swap = nums[left];
            nums[left] = nums[minIndex];
            nums[minIndex] = swap;
        }
        System.out.println(Arrays.toString(nums));
    }
}
