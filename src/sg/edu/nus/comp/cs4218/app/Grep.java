package sg.edu.nus.comp.cs4218.app;

import java.io.InputStream;

import sg.edu.nus.comp.cs4218.Application;

public interface Grep extends Application {

	/**
	 * Returns string containing lines which match the specified pattern in
	 * Stdin
	 * @param pattern String specifying a regular expression in JAVA format
	 * @param stdin InputStream containing arguments from Stdin
	 */
	public String grepFromStdin(String pattern, InputStream stdin);

	/**
	 * Returns string containing lines which match the specified pattern in the
	 * given file
	 * @param pattern String specifying a regular expression in JAVA format
	 * @param fileName String specifying name of the file
	 */
	public String grepFromOneFile(String pattern, String fileName);

	/**
	 * Returns string containing lines which match the specified pattern in the
	 * given files
	 * @param pattern String specifying a regular expression in JAVA format
	 * @param fileNames Array of file names
	 */
	public String grepFromMultipleFiles(String pattern, String[] fileNames);
	
	/**
	 * Returns string that doesn't contain lines which match the specified pattern 
	 * in Stdin
	 * @param pattern String specifying a regular expression in JAVA format
	 * @param stdin InputStream containing arguments from Stdin
	 */
	public String grepInvertFromStdin(String pattern, InputStream stdin);

	/**
	 * Returns string that doesn't contain lines which match the specified pattern
	 * given file
	 * @param pattern String specifying a regular expression in JAVA format
	 * @param fileName String specifying name of the file
	 */
	public String grepInvertFromOneFile(String pattern, String fileName);

	/**
	 * Returns string that doesn't contain lines which match the specified pattern 
	 * in the given files
	 * @param pattern String specifying a regular expression in JAVA format
	 * @param fileNames Array of file names
	 */
	public String grepInvertFromMultipleFiles(String pattern, String[] fileNames);
}
