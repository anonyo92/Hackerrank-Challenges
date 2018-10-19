/** Match only and exactly strings of form: abc.def.ghi.jkl , 
 * where each variable a,b,c,d,e,f,g,h,i,j,k,l can be any single character except the newline. 
 */
public class Solution
{
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("((.){3}\\.){3}(.){3}");
	}
}
