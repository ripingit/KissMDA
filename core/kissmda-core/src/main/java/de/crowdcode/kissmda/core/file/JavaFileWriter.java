package de.crowdcode.kissmda.core.file;

import java.io.File;
import java.io.IOException;

import javax.inject.Inject;

import de.crowdcode.kissmda.core.Context;

/**
 * Java File Writer.
 * 
 * @author idueppe
 * @since 1.0 Date: 18.11.12 Time: 21:24
 */
public class JavaFileWriter {

	@Inject
	private FileWriter fileWriter;

	public void createJavaFile(final Context context, final String packageName,
			final String className, final String classContent)
			throws IOException {

		// Create the package directories from context information
		String directoryToBeCreated = packageName.replace(".", File.separator);

		fileWriter.createFile(context, directoryToBeCreated, className
				+ ".java", classContent);
	}
}
