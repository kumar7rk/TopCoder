import java.util.*;
public class Library{
	public static int documentAccess(String[] records, String[] userGroups, String[] roomRights){

		ArrayList<String> arrayList = new ArrayList<>();
		for(int i = 0; i < records.length;i++){
			String sp[] = records[i].split(" ");
			for(String rr :roomRights){
				if(rr.equals(sp[1])) 
					for(String ug: userGroups){
						if(ug.equals(sp[2])){
							if(!arrayList.contains(sp[0])) arrayList.add(sp[0]);
					}
				}
			}
		}
		return arrayList.size();
	}
}