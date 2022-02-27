package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mohit Dodhia
 */
public class RomanToInteger {

	public static void main(String[] args) {
		int ans = new RomanToInteger().romanToInt("VI");

		System.out.println(ans);
	}

	public int romanToInt(String s) {
		Map<Character, Integer> romanNumbers = new HashMap<>();
		romanNumbers.put('I', 1);
		romanNumbers.put('V', 5);
		romanNumbers.put('X', 10);
		romanNumbers.put('L', 50);
		romanNumbers.put('C', 100);
		romanNumbers.put('D', 500);
		romanNumbers.put('M', 1000);

		int number = 0;

		int i = s.length() - 1;

		while (i >= 0) {
			number += romanNumbers.get(s.charAt(i));

			if (i > 0 && romanNumbers.get(s.charAt(i - 1)) < romanNumbers.get(s.charAt(i)) ) {
				number -= romanNumbers.get(s.charAt(i - 1));

				i--;
			}

			i--;
		}

		return number;
	}
}
