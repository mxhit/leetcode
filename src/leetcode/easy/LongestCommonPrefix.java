package leetcode.easy;

import java.util.Arrays;
import java.util.stream.Stream;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] words = {"flower","flower","flower","flower"};

        System.out.println(new LongestCommonPrefix().betterSolution(words));
    }

    public String longestCommonPrefix(String[] strs) {
        String largestPrefix = "";
        boolean isLargestFound = false;

        String smallestWord = Arrays.stream(strs).sorted((e2, e1) -> e1.length() > e2.length() ? -1 : 1)
                .findFirst().get();
        int lengthCount = smallestWord.length();

        for (int i = lengthCount; i >= 0 && !isLargestFound ; i--) {
            String prefix = i == 0 ? String.valueOf(smallestWord.charAt(0)) : smallestWord.substring(0, i);

            for (String word:
                 strs) {
                if (!word.startsWith(prefix)) {
                    largestPrefix = "";
                    break;
                } else {
                    largestPrefix = prefix;
                }
            }

            if (prefix.equals(largestPrefix)) {
                isLargestFound = true;
            }

        }

        return largestPrefix;
    }

    public String betterSolution(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        Arrays.sort(strs);
        String first = strs[0]; // shortest word
        String last = strs[strs.length - 1]; // longest word
        int c = 0;
        while(c < first.length())
        {
            /*
            * Check each alphabet of the shortest word with the longest word
            * */
            if (first.charAt(c) == last.charAt(c))
                c++;
            else
                break;
        }
        return c == 0 ? "" : first.substring(0, c);
    }
}
