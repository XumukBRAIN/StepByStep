package LeetCode.EasyLevel;

public class RemoveDuplicates {
        public static void main(String[] args) {
                RemoveDuplicates duplicates = new RemoveDuplicates();
                int [] nums = {1, 1, 2, 2, 3, 4, 5, 5, 5};

                System.out.println(duplicates.removeDuplicates(nums));
        }




        public int removeDuplicates(int[] nums) {
                if (nums.length == 0)
                        return 0;

                int i = 1;
                for (int j = 1; j < nums.length; j++) {
                        if (nums[j] != nums[i]) {
                                i++;
                                nums[i] = nums[j];
                        }
                }
                return i;
        }

}
