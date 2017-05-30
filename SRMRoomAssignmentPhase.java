package TopCoder;

import java.util.Arrays;

public class SRMRoomAssignmentPhase {

	public static void main(String[] args) {
		int[] ratings = 
			{544, 447, 730, 437, 1183, 348, 1176, 970, 657, 131, 847, 723, 180, 481, 1092, 814, 202, 733, 912, 587, 518, 1105, 758, 1081, 126, 645, 352, 656, 109, 354, 793, 944, 826, 900, 1059, 70, 272}	
		;
		int K = 4;
		int res = countCompetitors(ratings, K);
		System.out.println(res);

	}

	public static int countCompetitors(int[] ratings, int K) {
		int my_rating = ratings[0];
//		System.out.println(my_rating);
		Arrays.sort(ratings);
		int temp = 0;
		for( int i = 0; i < ratings.length/2; ++i ){ 
		  temp = ratings[i]; 
		  ratings[i] = ratings[ratings.length - i - 1]; 
		  ratings[ratings.length - i - 1] = temp; 
		}
		int res = 0;
		int len = ratings.length-1;
		for (int i = 0; i <=len ; i++) {
//			System.out.print(ratings[i]+ " ");
			if (ratings[i]==my_rating) {
//				System.out.println(i);
				res = i/K;
				break;
			}
		}
//		System.out.println();
		return res;
	}

}
