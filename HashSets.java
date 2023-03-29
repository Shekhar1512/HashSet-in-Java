package javaPrograms;
import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
	
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		
		//insertion operation
		set.add(10);
		set.add(11);
		set.add(12);
		set.add(13);   //not store duplicate elements
		
//		search operation
		if(set.contains(12)) {
			System.out.println("yes");
		}
		
//		delete operation
		set.remove(12);
		
		if(!set.contains(12)) {
			System.out.println("No \"12\" it is deleted");
		}
		
//		print your set
		
		System.out.println(set); //order print no guarantee
		
//		Iterator approach
		Iterator<Integer> it = set.iterator();
		
		System.out.println("next:-  "+it.next());
		System.out.print("using has.next():-  ");
		
		
//		size of set
		System.out.println("size is "+set.size());
		
		while(it.hasNext()) {
			System.out.print(it.next()+"  ");
		}
		
		System.out.println();
		
		//using enhance for loop
		System.out.print("using for loop iteration:-  ");
		
		for(int i:set) {
			System.out.print(i+"  ");
		}
	}
	

	

}
