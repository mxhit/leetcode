package leetcode.easy;

// PROBLEM NO. 1295
public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};

        System.out.println(new EvenNumberOfDigits().findNumbers(nums));
        System.out.println(new EvenNumberOfDigits().findNumbers2(nums));
    }

    // Not the most optimized solution but does the job
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num:
             nums) {
            if (String.valueOf(num).length() % 2 == 0) count++;
        }

        return count;
    }

    // Most optimized solution
    public int findNumbers2(int[] nums) {
        int count = 0;

        for (int num:
             nums) {
            if ((int)(Math.log10(num) + 1) % 2 == 0) count++;
        }

        return count;
    }
}
