package LeetCode.EasyLevel;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class TwoSum {
    public static void main(String[] args) {
        TwoSum task2 = new TwoSum();
        int [] num = {1, 5, 3, 7, 8, 4};
        int target = 13;

        System.out.println(Arrays.toString(task2.twoSum(num, target)));
        System.out.println(Arrays.toString(task2.twoSums(num, target)));

    }
    //1 способ (возвращаем числа)
    public int[] twoSum(int[] num, int target) {
        Set<Integer>integers=new HashSet<>();
        for (int j : num) {
            int sumCandidate = target - j;
            if (!integers.contains(sumCandidate)) {
                integers.add(j);
                continue;
            }
            return new int[]{sumCandidate, j};
        }
        return new int[0];
    }

    //2 способ (возвращаем индексы)
    public int[] twoSums(int[] num, int target) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] == target - num[i]) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
}
