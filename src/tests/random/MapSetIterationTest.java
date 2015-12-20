package tests.random;

import java.util.*;
import java.util.Map.Entry;

public class MapSetIterationTest {

	public static void main(String[] args) {
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		Map<Integer, String> map = new Hashtable<Integer, String>();
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1, "test1");
		map.put(-103, "bc");
		map.put(0, "tb");
		map.put(10, null);
		
		System.out.println("====First Method====");
		Set<Integer> keySet = map.keySet();
		for(int i: keySet) {
			System.out.println(i + "\t" + map.get(i));
		}
		
		System.out.println("====Second Method====");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for(Entry<Integer, String> entry: entrySet) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
		
		System.out.println("====Third Method=====");
		
		Iterator<Integer> iter = keySet.iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			System.out.println(key + "\t" + map.get(key));
		}
		
		System.out.println("====Fourth Method====");
		
		Iterator<Entry<Integer, String>> iter1 = entrySet.iterator();
		while(iter1.hasNext()) {
			Entry<Integer, String> entry = iter1.next();
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
	}

}
