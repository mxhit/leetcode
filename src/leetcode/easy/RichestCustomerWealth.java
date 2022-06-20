package leetcode.easy;

import java.util.Arrays;

// PROBLEM NO. 1672
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 5},
                {7, 3},
                {3, 5}
        };

        System.out.println(new RichestCustomerWealth().maximumWealth(accounts));
    }

    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int[] account : accounts) {
            int wealth = Arrays.stream(account).sum();

            if (maxWealth < wealth) maxWealth = wealth;
        }

        return maxWealth;
    }
}
