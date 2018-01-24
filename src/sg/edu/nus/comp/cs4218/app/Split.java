package sg.edu.nus.comp.cs4218.app;

import java.io.IOException;
import java.io.InputStream;

import sg.edu.nus.comp.cs4218.Application;

public interface Split extends Application {
	
	/**
	 * Split a file into fixed size pieces. Default: 1,000 lines 
	 * per output file, and whatever lines are left for the 
	 * last split. Output splits naming convention: prefix + counter.
	 * Default prefix is "x". Default counter is aa, ab, ..., zz, 
	 * zaa, zab, ..., zzz, zzaa, etc. For example: xaa, xab, etc.
	 * @param fileName String of source file name
	 * @throws IOException when source file could not be read or 
	 * output splits could not be written
	 */
	public void splitFile(String fileName)
			throws IOException;
	
	/**
	 * Split a file into fixed size pieces with specified number of 
	 * lines. Output splits naming convention: prefix + counter.
	 * Default prefix is "x". Default counter is aa, ab, ..., zz, 
	 * zaa, zab, ..., zzz, zzaa, etc. For example: xaa, xab, etc.
	 * @param fileName String of source file name
	 * @param linesPerFile Int of lines to have in the output file 
	 * @throws IOException when source file could not be read or 
	 * output splits could not be written
	 */
	public void splitFileByLines(String fileName, int linesPerFile)
			throws IOException;
	
	/**
	 * Split a file into fixed size pieces with the specified bytes. 
	 * Output splits naming convention: prefix + counter. Default 
	 * prefix is "x". Default counter is aa, ab, ..., zz, zaa, zab, 
	 * ..., zzz, zzaa, etc. For example: xaa, xab, etc.
	 * @param fileName String of source file name
	 * @param bytesPerFile Int of bytes of each file split
	 * @throws IOException when source file could not be read or 
	 * output splits could not be written
	 */
	public void splitFileBySize(String fileName, int bytesPerFile)
			throws IOException;
	
	/**
	 * Split a file into fixed size pieces. Default: 1,000 lines 
	 * per output file, and whatever lines are left for the 
	 * last split. Output splits naming convention: prefix + counter.
	 * Default counter is aa, ab, ..., zz, zaa, zab, ..., zzz, zzaa, 
	 * etc. For example (assuming prefix is "x"): xaa, xab, etc.
	 * @param fileName String of source file name
	 * @param prefix String of output file prefix 
	 * @throws IOException when source file could not be read or 
	 * output splits could not be written
	 */
	public void splitFileWithPrefix(String fileName, String prefix)
			throws IOException;
	
	/**
	 * Split a file into fixed size pieces with specified number of 
	 * lines. Output splits naming convention: prefix + counter.
	 * Default counter is aa, ab, ..., zz, zaa, zab, ..., zzz, zzaa, 
	 * etc. For example (assuming prefix is "x"): xaa, xab, etc.
	 * @param fileName String of source file name
	 * @param prefix String of output file prefix 
	 * @param linesPerFile Int of lines to have in the output file 
	 * @throws IOException when source file could not be read or 
	 * output splits could not be written
	 */
	public void splitFileWithPrefixByLines(String fileName, String prefix, int linesPerFile)
			throws IOException;
	
	/**
	 * Split a file into fixed size pieces with the specified bytes. 
	 * Output splits naming convention: prefix + counter.
	 * Default counter is aa, ab, ..., zz, zaa, zab, ..., zzz, zzaa, 
	 * etc. For example (assuming prefix is "x"): xaa, xab, etc.
	 * @param fileName String of source file name
	 * @param prefix String of output file prefix 
	 * @param bytesPerFile Int of bytes of each file split
	 * @throws IOException when source file could not be read or 
	 * output splits could not be written
	 */
	public void splitFileWithPrefixBySize(String fileName, String prefix, int bytesPerFile)
			throws IOException;
	
	/**
	 * Split a Stdin arg into fixed size pieces. Default: 1,000 lines 
	 * per output file, and whatever lines are left for the 
	 * last split. Output splits naming convention: prefix + counter.
	 * Default prefix is "x". Default counter is aa, ab, ..., zz, 
	 * zaa, zab, ..., zzz, zzaa, etc. For example: xaa, xab, etc.
	 * @param stdin InputStream of Stdin arg to be split
	 * @throws IOException when output splits could not be written
	 */
	public void splitStdin(InputStream stdin)
			throws IOException;
	
	/**
	 * Split a Stdin arg into fixed size pieces with specified number 
	 * of lines. Output splits naming convention: prefix + counter.
	 * Default prefix is "x". Default counter is aa, ab, ..., zz, 
	 * zaa, zab, ..., zzz, zzaa, etc. For example: xaa, xab, etc.
	 * @param stdin InputStream of Stdin arg to be split
	 * @param linesPerFile Int of lines to have in the output file
	 * @throws IOException when output splits could not be written
	 */
	public void splitStdinByLines(InputStream stdin, int linesPerFile)
			throws IOException;
	
	/**
	 * Split a Stdin arg into fixed size pieces with the specified 
	 * bytes.Output splits naming convention: prefix + counter.
	 * Default prefix is "x". Default counter is aa, ab, ..., zz, 
	 * zaa, zab, ..., zzz, zzaa, etc. For example: xaa, xab, etc.
	 * @param stdin InputStream of Stdin arg to be split
	 * @param bytesPerFile Int of bytes of each file split
	 * @throws IOException when output splits could not be written
	 */
	public void splitStdinBySize(InputStream stdin, int bytesPerFile)
			throws IOException;
	
	/**
	 * Split a Stdin arg into fixed size pieces. Default: 1,000 lines 
	 * per output file, and whatever lines are left for the 
	 * last split. Output splits naming convention: prefix + counter.
	 * Default counter is aa, ab, ..., zz, zaa, zab, ..., zzz, zzaa, 
	 * etc. For example (assuming prefix is "x"): xaa, xab, etc.
	 * @param stdin InputStream of Stdin arg to be split
	 * @param prefix String of output file prefix
	 * @throws IOException when output splits could not be written
	 */
	public void splitStdinWithPrefix(InputStream stdin, String prefix)
			throws IOException;
	
	/**
	 * Split a Stdin arg into fixed size pieces with specified number 
	 * of lines. Output splits naming convention: prefix + counter.
	 * Default counter is aa, ab, ..., zz, zaa, zab, ..., zzz, zzaa, 
	 * etc. For example (assuming prefix is "x"): xaa, xab, etc.
	 * @param stdin InputStream of Stdin arg to be split
	 * @param prefix String of output file prefix
	 * @param linesPerFile Int of lines to have in the output file
	 * @throws IOException when output splits could not be written
	 */
	public void splitStdinWithPrefixByLines(InputStream stdin, String prefix, int linesPerFile)
			throws IOException;
	
	/**
	 * Split a Stdin arg into fixed size pieces with the specified 
	 * bytes. Output splits naming convention: prefix + counter.
	 * Default counter is aa, ab, ..., zz, zaa, zab, ..., zzz, zzaa, 
	 * etc. For example (assuming prefix is "x"): xaa, xab, etc.
	 * @param stdin InputStream of Stdin arg to be split
	 * @param prefix String of output file prefix
	 * @param bytesPerFile Int of bytes of each file split
	 * @throws IOException when output splits could not be written
	 */
	public void splitStdinWithPrefixBySize(InputStream stdin, String prefix, int bytesPerFile)
			throws IOException;

}
