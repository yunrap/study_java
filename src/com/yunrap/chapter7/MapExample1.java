package com.yunrap.chapter7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample1 {

	
	private HashMap<String, Integer> asciiMap = new HashMap<String, Integer>();
	
	
	public static void main(String[] args) {
		MapExample1 example = new MapExample1();
		example.init();
		example.execute();
	}

	public void init() {
		for(int i=65; i<=90; i++)
		{
			asciiMap.put(String.valueOf((char) i), i);
		}
	}
	
	public void execute() {
		//entrySet() 메소드 사용 방법 
		Set<Entry<String, Integer>> entrySet = asciiMap.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			System.out.print("key 값" + entry.getKey() + "value 값" + entry.getValue());
		}
		System.out.print("\n");

		Collection<Integer> values = asciiMap.values();
		for(Integer value : values)
		{
			System.out.print(value+" ");
		}
		System.out.print("\n");
		
		Set<String> keySet = asciiMap.keySet();
		for(String key : keySet)
		{
			System.out.print(asciiMap.get(key)+ " ");
		}
	}
		
}
