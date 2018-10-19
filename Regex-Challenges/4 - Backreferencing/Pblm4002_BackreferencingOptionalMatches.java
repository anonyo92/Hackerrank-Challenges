/** Match S with following condition(s):
 *
 *	S consists of 8 digits.
 *	S may have "-" separator such that string S gets divided in 4 parts, with each part having exactly two digits. (Eg. 12-34-56-78)
 */

public class Solution {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("^[\\d]{8}$|^([\\d]{2}\\-){3}[\\d]{2}$");
	}
}