package test;

//import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class testingOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayListMultipleTypes list = new ArrayListMultipleTypes();
		list.add("DotaMan");
		list.add(1);
		list.add(3.0);
		list.add('c');	
		
		Object index0 = (list.checkAndGet(0));
		System.out.println(index0);
		
		System.out.println(list);
		
		list.remove(2);
		
		System.out.println(list);
		System.out.println(list.size());
		
		list.clear();
		System.out.println(list);
		
		list.add("Shevi");
		list.add(1);
		list.add('a');
		Book book = new Book("Python Java", "DotaMan");
		list.add(book);
		
		System.out.println(list);
		Object BookIndex = (list.checkAndGet(3));
		System.out.println((((Book) BookIndex).getTitle()));
		
    } 
	
}