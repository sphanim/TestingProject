import java.util.HashMap;
import java.util.Map;

public class Array_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"Mohan","Jaya","Raj","Hari","Sai","Hari","Phani",};
		int counter,maxCount=0;
		String maxCountString=null;
		Map<String, Integer> map=new HashMap<>();
		for(int i=0;i<names.length;i++) {
			if(map.containsKey(names[i])) {
				map.put(names[i],map.get(names[i])+1);
			}
			else {
				map.put(names[i],1);
			}
	}
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			System.out.println("Key: "+entry.getKey()+" Counter: "+entry.getValue());
			if(entry.getValue()>maxCount) {
				maxCount=entry.getValue();
				maxCountString=entry.getKey();
			}
		}
		System.out.println("Max Count: "+maxCount+ " String: "+maxCountString);
	}

}
