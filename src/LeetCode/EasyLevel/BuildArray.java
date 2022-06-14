package LeetCode.EasyLevel;

import java.util.Arrays;

public class BuildArray {
    public static void main(String[] args) {
        BuildArray task5 = new BuildArray();
        int[] num = {0, 2, 1, 5, 3, 4};
        //System.out.println(Arrays.toString(task5.buildArray(num)));
        System.out.println(Arrays.toString(task5.buildArray2(num)));
    }

    public int[] buildArray(int[] nums) {
        for(int i = 1; i < nums.length-2; i++){
            for(int j = 0; j < nums.length-2; j++){
                if(nums[i]<nums[j]){
                    int x = nums[j];
                    nums[j]=nums[i];
                    nums[i] = x;
                }
            }
        }
        return nums;
    }

    public int[] buildArray2(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            nums[i] *= n;
        }
        for(int i=0;i<n;i++){
            nums[i] += nums[nums[i]/n]/n;
        }
        for(int i=0;i<n;i++){
            nums[i] %= n;
        }
        return nums;
    }

}
