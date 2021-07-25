package lab.streams;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamFile {

	public static void main(String[] args) throws Exception {

		// Get a number of lines from a file using Lambda Stream
		Stream<String> lines = Files.lines(Paths.get("c:/HPLJP1000_P1500_Series.log"), Charset.defaultCharset());
		long numbersLines = lines.count();
		System.out.println(numbersLines);
		lines.close();

	}

}
