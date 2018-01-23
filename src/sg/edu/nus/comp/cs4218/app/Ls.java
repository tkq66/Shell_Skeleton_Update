package sg.edu.nus.comp.cs4218.app;

import sg.edu.nus.comp.cs4218.Application;

public interface Ls extends Application {
	
	/**
	 * Returns string listing file information.
	 * @param fileName String specifying name of the file
	 */
	public String listFileInformation(String fileName);
	
	/**
	 * Returns string listing multiple files information.
	 * @param fileName String specifying name of the file
	 */
	public String listFilesInformation(String[] fileNames);
	
	/**
	 * Returns string listing directories inside the current path
	 * @param currentPath String specifying the current working directory
	 */
	public String listDirectoryFromCurrentPath(String currentPath);
	
	/**
	 * Returns string listing directories recursively inside the current path
	 * @param currentPath String specifying the current working directory
	 */
	public String listDirectoryRecursivelyFromCurrentPath(String currentPath);
	
	/**
	 * Returns string listing directories and files inside the current path
	 * @param currentPath String specifying the current working directory
	 */
	public String listAllFromCurrentPath(String currentPath);
	
	/**
	 * Returns string listing directories and files recursively inside the current path
	 * @param currentPath String specifying the current working directory
	 */
	public String listAllRecursivelyFromCurrentPath(String currentPath);
	
	/**
	 * Returns string listing directories inside the given path
	 * @param path String specifying a valid directory path
	 */
	public String listDirectoryFromPath(String path);
	
	/**
	 * Returns string listing directories recursively inside the given path
	 * @param path String specifying a valid directory path
	 */
	public String listDirectoryRecursivelyFromPath(String path);
	
	/**
	 * Returns string listing directories and files inside the given path
	 * @param path String specifying a valid directory path
	 */
	public String listAllFromPath(String path);
	
	/**
	 * Returns string listing directories and files recursively inside the given path
	 * @param path String specifying a valid directory path
	 */
	public String listAllRescursivelyFromPath(String path);

}
