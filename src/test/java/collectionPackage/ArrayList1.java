package collectionPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {

		List list = new ArrayList();

		// add
		list.add(20);
		list.add("Sample");
		list.add(20.22);
		list.add(null);
		list.add(20);

		// to check size
		System.out.println("Size is: " + list.size());
		// to print all using iterartor
		Iterator it = list.iterator();

		while (it.hasNext()) {
			System.out.println("Array list values are: " + it.next());
		}

	}

}
