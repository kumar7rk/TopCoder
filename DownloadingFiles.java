package TopCoder;

public class DownloadingFiles {

	public static void main(String[] args) throws InterruptedException {
		String[] tasks = {"1 10","1 20","2 40"};
		double res = actualTime(tasks);
		System.out.println(res);
	}

	public static double actualTime(String[] tasks) throws InterruptedException {
		double totalTime = 0;
		double totalSpeed = 0;
		for (int i = 0; i < tasks.length; i++) {
			String[] t = tasks[i].split(" ");
			totalSpeed+=Integer.parseInt(t[0]);
			totalTime+=(Integer.parseInt(t[0])*Integer.parseInt(t[1]));
		}
		return totalTime/(double)totalSpeed;
	}
}
