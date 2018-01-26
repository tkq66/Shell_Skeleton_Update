package sg.edu.nus.comp.cs4218.app;

import java.io.InputStream;

import sg.edu.nus.comp.cs4218.Application;

public interface Cmp extends Application {
	
	public String cmpTwoFiles(String fileNameA, String fileNameB, Boolean isPrintCharDiff, Boolean isPrintSimplify, Boolean isPrintOffsetDiff)
			throws Exception;
	
	public String cmpFileAndStdin(String fileName, InputStream stdin, Boolean isPrintCharDiff, Boolean isPrintSimplify, Boolean isPrintOffsetDiff)
			throws Exception;
	
	public String cmpStdin(InputStream stdin, Boolean isPrintCharDiff, Boolean isPrintSimplify, Boolean isPrintOffsetDiff)
			throws Exception;

}
