import java.util.Enumeration;
import java.util.Vector;

public class VictorPra {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(20);
		v.add(30);
		v.add(50);
		Enumeration em=v.elements();
		while(em.hasMoreElements()) {
			Object object=em.nextElement();
			System.out.println(object);
		}
	}
}
