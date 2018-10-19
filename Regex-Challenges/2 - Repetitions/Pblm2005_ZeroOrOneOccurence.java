/** Match a test string, , under the following conditions:
 *	
 *	S should consist of only lowercase and uppercase letters (no numbers or symbols).
 *	S should end in s.
 */

public class Solution {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("^[a-zA-Z]*e?s$");
	}
}