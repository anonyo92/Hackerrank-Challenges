/**
 * (?<=regex_2)regex_1
 * 
 * The positive lookbehind (?<=) asserts regex_1 to be immediately preceded by regex_2.
 * Lookbehind is excluded from the match (do not consume matches of regex_2), but only assert whether a match is possible or not.
 */

/* Match all the occurences of digit which are immediately preceded by odd digit. */

public class Solution {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("(?<=[13579])\\d");
	}
}