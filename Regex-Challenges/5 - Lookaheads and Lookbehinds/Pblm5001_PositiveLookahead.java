/**
 * regex_1(?=regex_2)
 * 
 * The positive lookahead (?=) asserts regex_1 to be immediately followed by regex_2.
 * The lookahead is excluded from the match. It does not return matches of regex_2.
 * The lookahead only asserts whether a match is possible or not.
 */

/* Match all occurrences of o followed immediately by oo in S. */

public class Solution {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("o(?=oo)");
	}
}