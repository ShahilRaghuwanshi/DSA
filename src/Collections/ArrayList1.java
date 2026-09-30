package Collections;
import java.util.*;
public class ArrayList1 {
   public static void main(String[]args) {
	   List<Integer> list= new ArrayList<>();
	   //add()
	   list.add(10);
	   list.add(20);
	   list.add(30);
	   list.add(40);
	   list.add(40);
	   System.out.println(list);
	   
	   //remove()
	   list.remove(1);
	   System.out.println(list);
	   
	   //get()
	   System.out.println(list.get(1));
	   
	   //set()
	   list.set(1, 300);
	   System.out.println(list);
	   
	   //addAll()
	   List<Integer> list2 = new ArrayList<>();
	   list2.addAll(list);
	   list2.add(33);
	   list2.add(44);
	   list2.add(55);
	   System.out.println(list2);
	   
	   //size()
	   System.out.println(list.size());
	   
	   //removeAll()
	   list2.removeAll(list);
	   System.out.println(list2);
	   
	   //iterator
	   Iterator<Integer> it = list2.iterator();
	   while(it.hasNext()) {
		   System.out.println(it.next());
	   }
	   
	   //toArray
	   Object[] arr=list2.toArray();
	   for(Object obj:arr) {
		   System.out.println(obj);
	   }
	   
	   //contains()
	   System.out.println(list2.contains(44));
	   
	   list2.add(55);
	   list2.add(9);
	   
	   //sort
	   Collections.sort(list2);
	   System.out.println(list2);
	   
	   //clone
	   ArrayList<Integer> newlist = new ArrayList<>(list2);	  
	   System.out.println(newlist);
	   
	   //ensureCapacity
	   ArrayList<Integer> list4=new ArrayList<>();
	   list4.ensureCapacity(100);
	   
	   //isEmpty
	   System.out.println(list4.isEmpty());
	   
	   //indexOf
	   System.out.println(list2.indexOf(33));
	   
   }
}
