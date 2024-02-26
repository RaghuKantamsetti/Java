package org.collectionstasks.java;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class syncHashMap {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "virat");
		map.put(2, "rohit");
		map.put(3, "pant");
		map=Collections.synchronizedMap(map);
		synchronized (map) { 
            Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();  
            while (itr.hasNext()) {  
                System.out.println(itr.next());  
            }  
		}
	}

}
