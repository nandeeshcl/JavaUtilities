package collectionPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1 {
	
	public static void main(String[] args) {
		
		Set set=new HashSet();
		
		set.add("Appu");
		set.add("Shivu");
		set.add("Raghu");
		
		
		System.out.println("Printing all at once");
		System.out.println(set);
		System.out.println();
		
		System.out.println("Pinting using for each loop");
		for(Object obj:set)
		{
			System.out.println("Set elements are: "+obj);
			
		}
		
		System.out.println();
		
		System.out.println("Printing using Iterator");
		
		Iterator it=set.iterator();
		
		while(it.hasNext())
		{
			Object s=it.next();
			if(s.equals("Raghu"))
			{
			System.out.println("Matching Set element is: "+s);
			}
		}
		
		
		
	}

}
