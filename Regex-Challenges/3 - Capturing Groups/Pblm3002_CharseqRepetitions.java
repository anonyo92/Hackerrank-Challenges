/** Match  with the following condition:
 * S should have 3 or more consecutive repetitions of ok.
 */

public class Solution {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("(ok){3,}");
	}
}