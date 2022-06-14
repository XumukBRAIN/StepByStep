package LeetCode.EasyLevel;

import java.util.HashSet;
import java.util.Set;

public class IsHappy {
    public static void main(String[] args) {
        IsHappy task11 = new IsHappy();

        System.out.println(task11.isHappy(19));
        System.out.println(task11.isHappy(2));
    }

    public boolean isHappy(int n)
    {

        Set<Integer> set = new HashSet<>();
        int sum;
        int dig;
        while (set.add(n)) {
            sum = 0;
            while (n > 0) {
                dig = n%10;
                sum += dig*dig;
                n /= 10;
            }
            if (sum == 1)
                return true;
            else
                n = sum;
        }
        return false;
    }

}
