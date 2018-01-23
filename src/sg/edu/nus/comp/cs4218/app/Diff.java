package sg.edu.nus.comp.cs4218.app;

import java.io.InputStream;

import sg.edu.nus.comp.cs4218.Application;

public interface Diff extends Application {
	
	/**
	 * Return string of diff between 2 files. Return empty string
	 * if the files are identical.
	 * @param fileNameA String of first file to diff
	 * @param fileNameB String of second file to diff
	 */
	public String diffTwoFiles(String fileNameA, String fileNameB);
	
	/**
	 * Return string of diff between 2 files. Print 'Files are
	 * identical' if the files are identical.
	 * @param fileNameA String of first file to diff
	 * @param fileNameB String of second file to diff
	 */
	public String diffTwoFilesShowSame(String fileNameA, String fileNameB);
	
	/**
	 * Return string of diff between 2 files. Return empty string
	 * if the files are identical. Ignore changes on blank lines.
	 * @param fileNameA String of first file to diff
	 * @param fileNameB String of second file to diff
	 */
	public String diffTwoFilesNoBlank(String fileNameA, String fileNameB);
	
	/**
	 * Return string of diff between 2 files. Return empty string
	 * if the files are identical. If files differ, only print 
	 * 'Files differ'.
	 * @param fileNameA String of first file to diff
	 * @param fileNameB String of second file to diff
	 */
	public String diffTwoFilesSimple(String fileNameA, String fileNameB);
	
	/**
	 * Return string of diff between 2 files. Print 'Files are
	 * identical' if the files are identical. Ignore changes
	 * on blank lines.
	 * @param fileNameA String of first file to diff
	 * @param fileNameB String of second file to diff
	 */
	public String diffTwoFilesShowSameAndNoBlank(String fileNameA, String fileNameB);
	
	/**
	 * Return string of diff between 2 files. Print 'Files are
	 * identical' if the files are identical. If files differ,
	 * only print 'Files differ'.
	 * @param fileNameA String of first file to diff
	 * @param fileNameB String of second file to diff
	 */
	public String diffTwoFilesShowSameAndSimple(String fileNameA, String fileNameB);
	
	/**
	 * Return string of diff between 2 files. Return empty string
	 * if the files are identical. Ignore changes on blank lines. 
	 * If files differ, only print 'Files differ'.
	 * @param fileNameA String of first file to diff
	 * @param fileNameB String of second file to diff
	 */
	public String diffTwoFilesNoBlankAndSimple(String fileNameA, String fileNameB);
	
	/**
	 * Return string of diff between 2 files. Print 'Files are
	 * identical' if the files are identical. Ignore changes
	 * on blank lines. If files differ, only print 'Files differ'.
	 * @param fileNameA String of first file to diff
	 * @param fileNameB String of second file to diff
	 */
	public String diffTwoFilesShowSameNoBlankAndSimple(String fileNameA, String fileNameB);
	
	/**
	 * Return string of diff between files in 2 directories 
	 * alphabetically and non-recursively. Ignore identical
	 * files.
	 * @param pathA String of path to first directory to diff
	 * @param pathB String of path to second directory to diff
	 */
	public String diffTwoDir(String pathA, String pathB);
	
	/**
	 * Return string of diff between files in 2 directories 
	 * alphabetically and non-recursively. Print 'Files are
	 * identical' if the files are identical.
	 * @param pathA String of path to first directory to diff
	 * @param pathB String of path to second directory to diff
	 */
	public String diffTwoDirShowSame(String pathA, String pathB);
	
	/**
	 * Return string of diff between files in 2 directories 
	 * alphabetically and non-recursively. Ignore changes on 
	 * blank lines.
	 * @param pathA String of path to first directory to diff
	 * @param pathB String of path to second directory to diff
	 */
	public String diffTwoDirNoBlank(String pathA, String pathB);
	
	/**
	 * Return string of diff between files in 2 directories 
	 * alphabetically and non-recursively. If files differ, 
	 * only print 'Files differ'.
	 * @param pathA String of path to first directory to diff
	 * @param pathB String of path to second directory to diff
	 */
	public String diffTwoDirSimple(String pathA, String pathB);
	
	/**
	 * Return string of diff between files in 2 directories 
	 * alphabetically and non-recursively. Print 'Files are
	 * identical' if the files are identical. Ignore changes
	 * on blank lines.
	 * @param pathA String of path to first directory to diff
	 * @param pathB String of path to second directory to diff
	 */
	public String diffTwoDirShowSameAndNoBlank(String pathA, String pathB);
	
	/**
	 * Return string of diff between files in 2 directories 
	 * alphabetically and non-recursively. Print 'Files are
	 * identical' if the files are identical. If files differ, 
	 * only print 'Files differ'.
	 * @param pathA String of path to first directory to diff
	 * @param pathB String of path to second directory to diff
	 */
	public String diffTwoDirShowSameAndSimple(String pathA, String pathB);
	
	/**
	 * Return string of diff between files in 2 directories 
	 * alphabetically and non-recursively. Ignore changes
	 * on blank lines. If files differ, only print 'Files differ'.
	 * @param pathA String of path to first directory to diff
	 * @param pathB String of path to second directory to diff
	 */
	public String diffTwoDirNoBlankAndSimple(String pathA, String pathB);
	
	/**
	 * Return string of diff between files in 2 directories 
	 * alphabetically and non-recursively. Print 'Files are
	 * identical' if the files are identical. Ignore changes
	 * on blank lines. If files differ, only print 'Files differ'.
	 * @param pathA String of path to first directory to diff
	 * @param pathB String of path to second directory to diff
	 */
	public String diffTwoDirShowSameAndNoBlankAndSimple(String pathA, String pathB);
	
	/**
	 * Return string of diff between a file and a Stdin arg. 
	 * Return empty string if they are identical.
	 * @param fileName String of file to diff
	 * @param stdin InputStream of Stdin arg to diff
	 */
	public String diffFileAndStdin(String fileName, InputStream stdin);
	
	/**
	 * Return string of diff between a file and a Stdin arg. 
	 * Return empty string if they are identical. Print 'File
	 * is identical' if they are identical.
	 * @param fileName String of file to diff
	 * @param stdin InputStream of Stdin arg to diff
	 */
	public String diffFileAndStdinShowSame(String fileName, InputStream stdin);
	
	/**
	 * Return string of diff between a file and a Stdin arg. 
	 * Return empty string if they are identical. Ignore
	 * changes on blank lines.
	 * @param fileName String of file to diff
	 * @param stdin InputStream of Stdin arg to diff
	 */
	public String diffFileAndStdinNoBlank(String fileName, InputStream stdin);
	
	/**
	 * Return string of diff between a file and a Stdin arg. 
	 * Return empty string if they are identical. If they
	 * differ, only print 'File differ'.
	 * @param fileName String of file to diff
	 * @param stdin InputStream of Stdin arg to diff
	 */
	public String diffFileAndStdinSimple(String fileName, InputStream stdin);
	
	/**
	 * Return string of diff between a file and a Stdin arg. 
	 * Return empty string if they are identical. Print 'File
	 * is identical' if they are identical. Ignore changes on
	 * blank lines.
	 * @param fileName String of file to diff
	 * @param stdin InputStream of Stdin arg to diff
	 */
	public String diffFileAndStdinShowSameAndNoBlank(String fileName, InputStream stdin);
	
	/**
	 * Return string of diff between a file and a Stdin arg. 
	 * Return empty string if they are identical. Print 'File
	 * is identical' if they are identical. If they differ, 
	 * only print 'File differ'.
	 * @param fileName String of file to diff
	 * @param stdin InputStream of Stdin arg to diff
	 */
	public String diffFileAndStdinShowSameAndSimple(String fileName, InputStream stdin);
	
	/**
	 * Return string of diff between a file and a Stdin arg. 
	 * Return empty string if they are identical. Ignore 
	 * changes on blank lines. If they differ, only print 
	 * 'File differ'.
	 * @param fileName String of file to diff
	 * @param stdin InputStream of Stdin arg to diff
	 */
	public String diffFileAndStdinNoBlankAndSimple(String fileName, InputStream stdin);
	
	/**
	 * Return string of diff between a file and a Stdin arg. 
	 * Return empty string if they are identical. Print 'File
	 * is identical' if they are identical. Ignore changes on
	 * blank lines. If they differ, only print 'File differ'.
	 * @param fileName String of file to diff
	 * @param stdin InputStream of Stdin arg to diff
	 */
	public String diffFileAndStdinShowSameAndNoBlankAndSimple(String fileName, InputStream stdin);
	
}
