/** Match S with the following conditions:
 *	S must be of length 6.
 *	First character should not be a digit.
 *	Second character should not be a lowercase vowel.
 *	Third character should not be b, c, D or F.
 *	Fourth character should not be a whitespace character ( \r, \n, \t, \f or <space> ).
 *	Fifth character should not be a uppercase vowel.
 *	Sixth character should not be a . or , symbol.
*/

public class Solution {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("^[\\D][^aeiou][^bcDF][\\S][^AEIOU][^\\.,]$");
	}
}