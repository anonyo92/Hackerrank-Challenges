/** Match S under the following conditions:
 *	
 *	S must start with Mr., Mrs., Ms., Dr. or Er..
 *	The rest of the string must contain only one or more English alphabetic letters (upper and lowercase).
 */

public class Solution {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("^(Mr|Mrs|Ms|Dr|Er)\\.[a-zA-Z]+$");
	}
}