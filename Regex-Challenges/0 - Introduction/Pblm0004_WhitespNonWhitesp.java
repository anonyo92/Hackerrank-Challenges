/** match the pattern XXxXXxXX
 * Here, x denotes whitespace characters, and X denotes non-white space characters.
*/

public class Solution {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("[\\S]{2}[\\s][\\S]{2}[\\s][\\S]{2}");
	}
}