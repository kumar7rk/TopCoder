package TopCoder;

public class ReadingBooks {
	public static void main(String[] args) {
		String[] readParts = {"introduction", "story", "introduction", "edification", "story", "introduction"};
		int res = countBooks(readParts);
		System.out.println(res);
	}
	public static int countBooks(String[]readParts){
		int read = 0;
		for (int i = 0; i < readParts.length-2;) {
			String current = readParts[i];
			String next = readParts[i+1];
			String last = readParts[i+2];
			if (!current.equals(next) && !next.equals(last)&& !last.equals(current)) {
				System.out.println(i);
				read++;
				i += 3;
			}
			else
				i++;
		}
		return read;
	}
}