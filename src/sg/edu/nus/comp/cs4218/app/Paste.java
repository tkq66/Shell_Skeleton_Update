package sg.edu.nus.comp.cs4218.app;

import java.io.InputStream;

import sg.edu.nus.comp.cs4218.Application;

public interface Paste extends Application {
	
	/**
	 * Returns string of Stdin in which Stdin have only 1 argument.
	 * @param stdin InputString containing arguments from Stdin
	 */
	public String printSingleArgStdin(InputStream stdin);
	
	/**
	 * Returns string of line-wise concatenated (tab-separated) Stdin arguments.
	 * @param stdin InputString containing arguments from Stdin
	 */
	public String mergeStdin(InputStream stdin);
	
	/**
	 * Returns string inside a file. 
	 * @param fileName String of file to be read from
	 */
	public String printSingleFile(String fileName);
	
	/**
	 * Returns string of line-wise concatenated (tab-separated) files. 
	 * @param fileNames Array of file names to be read and merged.
	 */
	public String mergeFiles(String[] fileNames);
	
	/**
	 * Returns string of line-wise concatenated (tab-separated) files and Stdin arguments.
	 * @param fileNames Array of file names to be read and merged.
	 * @param stdin InputString containing arguments from Stdin
	 */
	public String mergeFilesAndStdin(String[] fileNames, InputStream stdin);

}
