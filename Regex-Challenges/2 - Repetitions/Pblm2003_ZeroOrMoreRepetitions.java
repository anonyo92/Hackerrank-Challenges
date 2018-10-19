/**  Match S using the following conditions:
 *
 *	S should begin with 2 or more digits.
 *	After that, S should have 0 or more lowercase letters.
 *	S should end with 0 or more uppercase letters.
 */

public class Solution {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("^[\\d]{2,}[a-z]*[A-Z]*$");
	}
}