/** Match word starting with vowel (a,e,i,o, u, A, E, I , O or U).
 *	The matched word can be of any length. The matched word should consist of letters (lowercase and uppercase both) only.
 *	The matched word must start and end with a word boundary.
 */

public class Solution {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("\\b[aeiouAEIOU][a-zA-z]*\\b");
	}
}