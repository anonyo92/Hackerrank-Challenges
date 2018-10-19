/**
 * (?<!regex_2)regex_1
 * 
 * The negative lookbehind (?<!) asserts regex_1 not to be immediately preceded by regex_2.
 * Lookbehind is excluded from the match (do not consume matches of regex_2), but only assert whether a match is possible or not.
 */

/* Match all the occurences of characters which are not immediately preceded by vowels (a, e, i, u, o, A, E, I, O, U). */

public class Solution {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("(?<![aeiouAEIOU]).");
	}
}