package LeetCode.EasyLevel;

public class NumIdenticalPairs {
    public static void main(String[] args) {
        NumIdenticalPairs task3 = new NumIdenticalPairs();
        int[] arr = {1, 2, 3, 1, 1, 3};
        System.out.println(task3.numIdenticalPairs(arr));
    }
    public int numIdenticalPairs(int[] num) {
        int result = 0;
        for(int i = 0; i < num.length; i++){
            for(int j = i + 1; j < num.length; j++){
                if(num[i] == num[j] && i < j){
                    result++;
                }

            }
        }
        return result;
    }
}
