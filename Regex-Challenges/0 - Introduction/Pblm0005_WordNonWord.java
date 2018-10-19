/** Match the pattern xxxXxxxxxxxxxxXxxx
 * Here, x denotes word characters, and X denotes non-word space characters.
*/

public class Solution {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("[\\w]{3}[\\W][\\w]{10}[\\W][\\w]{3}");
	}
}