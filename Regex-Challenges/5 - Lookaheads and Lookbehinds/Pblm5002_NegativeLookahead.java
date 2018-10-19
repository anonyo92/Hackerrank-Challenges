/**
 * regex_1(?!regex_2)
 *
 * The negative lookahead (?!) asserts regex_1 not to be immediately followed by regex_2.
 * Lookahead is excluded from the match (do not consume matches of regex_2), but only assert whether a match is possible or not.
 */

/* Match all characters which are not immediately followed by that same character */

public class Solution {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("(.)(?!\\1)");
	}
}