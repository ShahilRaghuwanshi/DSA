package Collections;
import java.util.*;
public class ArrayListDemo {
public static void main(String[] args) {
	//making list
	ArrayList<Integer> list= new ArrayList<>();
	
	Collection<Integer> list2= new ArrayList<>();
	
	//insert the specific element in array list
	list.add(10);
	list.add(20);
	list.add(30);
	
	//remove specific element from arraylist
	list.remove(0);
	System.out.println(list);
	List<Integer> list1= new ArrayList<>();
	list1.add(40);
	list1.add(50);
	list1.add(60);
	
	list.addAll(list1);
	System.out.println(list);
	list.remove(1);
	System.out.println(list);
	list.removeAll(list1);
	System.out.println(list);
	System.out.println(list.size());
	list.clear();
	System.out.println(list);
	System.out.println(list.size());
	list.add(30);
	list.add(10);
	list.add(6);
	Collections.sort(list);
	System.out.println(list);
	
	
}
}







