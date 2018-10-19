/** Match , with following condition(s):
 *	
 *	S consists of 8 digits.
 *	S must have "---", "-", "." or ":" separator such that string S gets divided in 4 parts, with each part having exactly two digits.
 *	S string must have exactly one kind of separator.
 *	Separators must have integers on both sides.
 * Examples:
 *	Valid 
 *		12-34-56-78
 *		12:34:56:78
 *		12---34---56---78
 *		12.34.56.78
 *	
 *	Invalid 
 *		1-234-56-78
 *		12-45.78:10
 */
 
$Regex_Pattern = '/^[\d]{2}(?|(\-)|(\-\-\-)|(\.)|(\:))[\d]{2}\1[\d]{2}\1[\d]{2}$/';