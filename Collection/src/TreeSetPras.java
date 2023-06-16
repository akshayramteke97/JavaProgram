import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPras {
	public static void main(String[] args) {
		TreeSet ts =new TreeSet();
		ts.add(10);
		ts.add(50);
		ts.add(80);
		ts.add(60);
		ts.add(11);
		ts.add(15);
//		for(Object ele:ts) {
//			System.out.println(ele);
//		}
//		for (Iterator iterator = ts.iterator(); iterator.hasNext();) {
//			Object object = (Object) iterator.next();
//			System.out.println(object);
//		}
//		Iterator iterator=ts.iterator();
//		while(iterator.hasNext()) {
//			Object object =iterator.next();
//			System.out.println(object);
//		}
		for(Iterator iterator=ts.iterator();iterator.hasNext();) {
			Object object=iterator.next();
			System.out.println(object);
		}
		
	}
}
