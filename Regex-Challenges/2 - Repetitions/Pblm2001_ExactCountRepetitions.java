/** Match S using the following conditions:
 *	
 *	S must be of length equal to 45.
 *	The first 40 characters should consist of letters(both lowercase and uppercase), or of even digits.
 *	The last 5 characters should consist of odd digits or whitespace characters.
 */

public class Solution {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("^[a-zA-Z02468]{40}[13579\\s]{5}$");
	}
}