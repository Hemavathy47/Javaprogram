package set;

import java.util.HashMap;
import java.util.Map;

public class HashMapEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		map.put(101,"Mango");
		map.put(108,"Orange");
		map.put(105,"Banana");
		map.put(103, "Grapes");
		map.put(105, "Banana");//duplicate entry
		map.put(null, null); //null entry
		map.put(102, null);//null value
		//map.putIfAbsent(null,null)
		map.putIfAbsent(102, "CustardApple"); //102 was mapped with null,update 102
		map.putIfAbsent(101,"Watermelon"); //101 is already mapped with value
		
		
		for(Map.Entry m : map.entrySet()){
			System.out.println(m.getKey()+ " " + m.getValue());
			
		}
	        map.remove(103);
	        System.out.println("After removal");
	        for(Map.Entry m : map.entrySet()) {
	        	System.out.println(m.getKey() + " " + m.getValue()); 
	        }
	}

}
