package sg.edu.nus.comp.cs4218.app;

import sg.edu.nus.comp.cs4218.Application;

public interface Mkdir extends Application {

	/**
	 * Create a directory in the current directory.
	 * @param directoryName String of the directory name
	 */
	public void createDirectory(String directoryName);
	
	/**
	 * Create a multiple directories in the current directory.
	 * @param directoryNames Array of multiple directory names
	 */
	public void createMultipleDirectories(String[] directoryNames);
	
	/**
	 * Create a directory specified by the given path.
	 * @param path String of a path leading to a new directory name
	 */
	public void createDirectoryFromPath(String path);
	
	/**
	 * Create multiple directories specified by the given paths array.
	 * @param paths Array of paths leading to new directory names
	 */
	public void createMultipleDirectoriesFromPaths(String[] paths);
	
}
