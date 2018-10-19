/** Your task is to write a regex that will match  using the following conditions:
 *	
 *	S should begin with 1 or more digits.
 *	After that, S should have 1 or more uppercase letters.
 *	S should end with 1 or more lowercase letters.
 */

public class Solution {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("^\\d+[A-Z]+[a-z]+$");
	}
}