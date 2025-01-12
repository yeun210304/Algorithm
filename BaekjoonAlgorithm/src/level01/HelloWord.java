package level01;

public class HelloWord {
	// 2557 Hello World
	public static void main(String[] args) {
		HelloWord helloWord = new HelloWord();
		
		String word = "Hello World!";
		
		helloWord.printWord(word);
	}

	public void printWord(String word) {
		System.out.printf("%s", word);
	}
}
