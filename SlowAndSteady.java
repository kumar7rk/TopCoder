//call this method-
/*
		try {
			SlowAndSteady.WinsTheRace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
*/

package TopCoder;
import java.util.Random;

public class SlowAndSteady {

	public static void WinsTheRace()throws InterruptedException{
		int totalTime = 0;
		
		Random random = new Random();
		
		int[]r = new int[10];
		
		r[0] = random.nextInt(5000);
		r[1] = random.nextInt(5000);
		r[2] = random.nextInt(5000);
		r[3] = random.nextInt(5000);
		
		r[4] = random.nextInt(1000);
		r[5] = random.nextInt(2000);
		
		r[6] = random.nextInt(5000);
		r[7] = random.nextInt(5000);
		r[8] = random.nextInt(5000);
		
		for (int time : r) totalTime+=time;
		
		Thread.sleep(r[0]);
		System.out.println("Initiaiting system");
		Thread.sleep(r[1]);
		System.out.println("System initiation completed");
		Thread.sleep(r[2]);
		System.out.println("Loading file information");
		Thread.sleep(r[3]);
		System.out.println("Fetching the speed of the files");
		Thread.sleep(r[4]);
		System.out.println("Showing the data now");
		Thread.sleep(r[5]);
		// after
		Thread.sleep(r[6]);
		System.out.println("End showing speeds of all the files");
		Thread.sleep(r[7]);
		System.out.println("Program terminating");
		Thread.sleep(r[8]);
		System.out.println("Program termination completed");
		
		System.out.println("Total time for loading: "+totalTime+"\n Cheers to your patience");
		System.out.println(totalTime>10000? "That's a long wait man":"");
	}
}
