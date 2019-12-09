package week3.day6.classroom;

import java.util.LinkedHashMap;
import java.util.Map;


public class LearnMap {
	
	public static void main(String[] args) {
		int count = 1;
		String name = "kirthekeea";
		char[] array1= name.toCharArray();
		Map<Character,Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < array1.length; i++) {
			if(map.containsKey(array1[i])) {
				//count++;
				map.get(array1[i]);
			map.put(array1[i], count);
				//map.get(array1[i] + 1);
				
			}
			else {
			map.put(array1[i], 1);
			}
			
		}
		System.out.println(map);
	}

}
