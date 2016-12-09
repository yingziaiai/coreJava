package com.javaBasicCollection.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

//http://www.cnblogs.com/skywang12345/p/3308833.html
public class VectorTest {
public static void main(String[] args) {
	Vector vector = new Vector();
	vector.add("hello");
	vector.add("world");
	vector.add("world2");
	vector.add("world3");
	System.out.println(vector.indexOf("world3"));
	System.out.println(vector.capacity());
	System.out.println(vector.size());
	
	for (int i = 0; i < vector.size(); i++) {
		System.out.println(vector.get(i));
	}
	
	Enumeration enums = vector.elements();
	while(enums.hasMoreElements()){
		System.out.println(enums.nextElement());
	}
	
	Iterator iterator = vector.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
		
	}
	
}
}
