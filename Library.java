public class Library{
	public static int documentAccess(String[] records, String[] userGroups, String[] roomRights){
		int counter = 0;
		for(int i = 0; i < records.length;i++){
			String sp = records[i].split(" ");
			for(String ug: userGroups){
				if(ug.equals(sp[1]){
					for(String rr :roomRights){
						if(rr.equals(sp[2]) counter++;
					}
				}
			}
		}
	}
}