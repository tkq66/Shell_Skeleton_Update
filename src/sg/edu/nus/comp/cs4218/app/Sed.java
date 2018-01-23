package sg.edu.nus.comp.cs4218.app;

import java.io.InputStream;

import sg.edu.nus.comp.cs4218.Application;

public interface Sed extends Application {

	/**
	 * Returns string containing lines with the first matched substring (of that line)
	 * replaced in file
	 * @param pattern String specifying a regular expression in JAVA format
	 * @param replacement String to replace the matched pattern
	 * @param fileName String specifying name of the file
	 */
	public String replaceFirstSubStringInFile(String pattern, String replacement, String fileName);
	
	/**
	 * Returns string containing lines with the xth matched substring (of that line)
	 * replaced in file
	 * @param pattern String specifying a regular expression in JAVA format
	 * @param replacement String to replace the matched pattern
	 * @param x Integer specifying the index of the substring to be replaced
	 * @param fileName String specifying name of the file
	 */
	public String replaceXthSubStringInFile(String pattern, String replacement, int x, String fileName);

	/**
	 * Returns string containing lines with first matched substring (of that line)
	 * replaced in Stdin
	 * @param pattern String specifying a regular expression in JAVA format
	 * @param replacement String to replace the matched pattern
	 * @param stdin InputStream containing arguments from Stdin
	 */
	public String replaceFirstSubStringFromStdin(String pattern, String replacement, InputStream stdin);
	
	/**
	 * Returns string containing lines with the xth matched substring (of that line) 
	 * replaced in Stdin
	 * @param pattern String specifying a regular expression in JAVA format
	 * @param replacement String to replace the matched pattern
	 * @param x Integer specifying the index of the substring to be replaced
	 * @param stdin InputStream containing arguments from Stdin
	 */
	public String replaceXthSubStringsFromStdin(String pattern, String replacement, int x, InputStream stdin);


	/**
	 * Returns string containing lines when invalid replacement string is
	 * provided
	 * @param pattern String specifying a regular expression in JAVA format
	 * @param replacement String to replace the matched pattern
	 */
	public String replaceSubstringWithInvalidReplacement(String pattern, String replacement);

	/**
	 * Returns string containing lines when invalid regex is provided
	 * @param pattern String specifying a regular expression in JAVA format
	 * @param replacement String to replace the matched pattern
	 */
	public String replaceSubstringWithInvalidRegex(String pattern, String replacement);

}
