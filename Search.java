import java.io.File;
import java.util.Scanner;
import java.util.stream.Stream;



public class Search{
	
		private Scanner read;
		
		public void openFile() {
		try {
			read = new Scanner( new File("Source1.txt"));
		}
		catch(Exception e) {
			System.out.println("File not found!");
		}
		}
		public void scanFile() {
		System.out.println("Please enter the name or a part of the name you are searching for: ");
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		boolean t = false;
		while(read.hasNext()) {
		String a = read.next();
		
		if(a.contains(word)) {
			Stream<String> stream = Stream.of(a);
			stream.filter(str -> str.endsWith(word)).forEach(System.out::println);
			t=true;
		}
		
		}
		if(t==false) {
			System.out.println("There is no such name or part of a name in this file.");
		}
		
		
	}
		public void closeFile() {
			read.close();

		}

}
