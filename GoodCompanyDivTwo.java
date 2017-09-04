package TopCoder;
import java.util.ArrayList;
public class GoodCompanyDivTwo{
	public static void main(String[] args){
		int[] superior = 
		{-1, 0, 0, 1, 1, 3, 0, 2, 0, 5, 2, 5, 5, 6, 1, 2, 11, 12, 10, 4, 7, 16, 10, 9, 12, 18, 15, 23, 20, 7, 4}
		;
		int[] workType = 
		{4, 6, 4, 7, 7, 1, 2, 8, 1, 7, 2, 4, 2, 9, 11, 1, 10, 11, 4, 6, 11, 7, 2, 8, 9, 9, 10, 10, 9, 8, 8}
		;
		int res = countGood(superior,workType);
		System.out.println(res);
	}
	public static int countGood(int[] superior, int[] workType){
		int count = 0;
		for(int i = 0; i< superior.length;i++){
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
			boolean flag = true;
			arrayList.add(i);
			for(int j = 1; j< superior.length;j++) 
				if(superior[j]==i) arrayList.add(j);
			
			for(int j = 0;j<arrayList.size();j++){
				if(!arrayList1.contains(workType[arrayList.get(j)])) arrayList1.add(workType[arrayList.get(j)]);
				else {
					flag = false;
					break;
				}
			}
			if(flag) count++;
		}
		return count;
	}
	
}