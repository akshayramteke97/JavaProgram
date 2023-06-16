import java.util.ArrayList;
import java.util.TreeSet;
import java.util.*;

public class CollectionMethod {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(100);
		ts.add(30);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println(ts);

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(30);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		int index =Collections.binarySearch(al,100);
		System.out.println(index);
		Collections.shuffle(al);
		System.out.println(al);
		
		
	}
		
}
