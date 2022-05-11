package CollectionEg;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating arrayList
		List<String> al = new ArrayList<String>();
		
		//adding object to ArrayList
		al.add("Rose");
		al.add("Sunflower");
		al.add("Rose");//duplicate
		al.add(0,"lily");
		al.add(2,"Daisy");
		al.add("Mariegold");
		al.add(6,"Tulip");
		al.add("Orchid");
		al.add("Lotus");
		al.add(5,"Lavender");
		
		//printing ArrayList object 
		System.out.println(al);
		System.out.println("Size of arraylist : " + al.size());
		
		//removing element at index 5
		al.remove(5);
		
		//printing arraylist after remove
		System.out.println(al);
		System.out.println("Size of Arraylist : " + al.size());
		
		al.add("Lavender");
		al.add("Lotus");
		System.out.println(al);
		System.out.println(al);
		System.out.println("Size of arraylist : " + al.size ());
		System.out.println("Elements of index value is : " + al.get(3));
		}

}
