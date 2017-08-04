package TopCoder;

public class Elections {

	public static void main(String[] args){
		
		String [] likelihoods = 
			{"111", "112", "121", "122", "211", "212", "221", "222"}	
		;
		int res = visit(likelihoods);
		System.out.println(res);
	}
	public static int visit(String[] likelihoods){
		double min = Double.MAX_VALUE;
		int loc = 0;
		double percentage = 0;
		
		for (int i = 0; i < likelihoods.length; i++) {
			int count = 0;
			for (int j = 0; j < likelihoods[i].length(); j++)
				if (likelihoods[i].charAt(j)=='1') count++;
			
			percentage = (count*1000)/likelihoods[i].length();
			if(percentage < min){
				min = percentage;
				loc = i;
			}
		}
		return loc;
	}
}
