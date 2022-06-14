package LeetCode.EasyLevel;

import java.util.Arrays;

public class RotateK {
    public static void main(String[] args) {
        RotateK rotateK = new RotateK();
        int [] nums = {1, 2, 3, 4, 5, 6, 7};
        rotateK.rotate(nums, 3);
    }



    public void rotate(int[] nums, int k) {
        if(k == 0) return;
        if(nums == null || nums.length == 0) return;

        for (int i=0; i<k; i++) {
            int j = nums.length-1;
            int temp = nums[j];

            for (; j > 0; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
