package LeetCode.EasyLevel;

import java.util.Arrays;

public class SmallerNumbersThanCurrent {

    public static void main(String[] args) {
        int[] nums = {8, 1, 2 ,4, 3};
        int[] answer = smallerNumbersThanCurrent(nums);

        System.out.println(Arrays.toString(answer));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int counter = 0;
            for (int num : nums) {
                if (nums[i] > num) {
                    counter++;
                }
                answer[i] = counter;
            }
        }
        return answer;
    }

}
