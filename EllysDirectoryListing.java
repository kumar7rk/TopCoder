package TopCoder;

public class EllysDirectoryListing {

	public static void main(String[] args) {
		String[] files = 
			{"This", ".", "is", "tricky", "test", ".."}
		;
		String res[] = getFiles(files);
		for (String s : res) System.out.print(s+ ", ");
	}

	public static String[] getFiles(String[] files) {
		int count = 0;
		for (int i = 0; i < files.length-2; i++) {
			String current = files[i];
			if (current.equals(".")||current.equals("..")) {
				if (count==0) {
					files[i] = files[files.length-1];
					files[files.length-1] = current;
					if (files[files.length-1].equals("..")|| files[files.length-1].equals(".")) i--;
					count++;
				}
				else if (count==1) {
					files[i] = files[files.length-2];
					files[files.length-2] = current;
					return files;
				}
			}
		}
		return files;
	}

}
