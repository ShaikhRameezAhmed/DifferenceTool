package com.DifferenceFinder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.io.IOUtils;

import com.github.difflib.DiffUtils;
import com.github.difflib.UnifiedDiffUtils;
import com.github.difflib.algorithm.DiffException;
import com.github.difflib.patch.AbstractDelta;
import com.github.difflib.patch.Patch;
import com.github.difflib.patch.PatchFailedException;

public class Client {
	public static final String PATH_FILE_FIRST = "C:\\Users\\e032587\\Desktop\\test.properties";
	public static final String PATH_FILE_SECOND = "C:\\Users\\e032587\\Desktop\\test-Copy.properties";

	public static void main(String[] args) throws DiffException, PatchFailedException  {
		
		try (InputStream in = new FileInputStream(new File(PATH_FILE_FIRST));
				InputStream in2 = new FileInputStream(new File(PATH_FILE_SECOND))) {
			
			List<String> stringLines = IOUtils.readLines(in);
			List<String> stringLines2 = IOUtils.readLines(in2);
			Patch<String> patch = DiffUtils.diff(stringLines, stringLines2);
			
			List<String> result = DiffUtils.patch(stringLines, patch);

			
			for(AbstractDelta<String> delta:patch.getDeltas()) {
				System.out.println(delta);
			}
			
			for(String each:result) {
				System.out.println(each);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
