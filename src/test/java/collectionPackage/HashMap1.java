package collectionPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		
		/*HashMap<String,String>  map=new HashMap<String,String> ();
		
		map.put("email", "appu@gmail.com");
		map.put("password", "a@123");
		
		System.out.println(map);
		System.out.println(map.size());
		
		Set<String>  set=map.keySet();
		
		for(String key:set)
		{
			System.out.println("Key is: "+key+"  Value is: "+map.get(key));
		}
		*/
		
		//adding email list to map
		HashMap<String,List<String>> m=new HashMap<String,List<String>>();
		
		//create String list
		List<String> list=new ArrayList<String>();
		
		list.add("a@gmail.com");
		list.add("b@gmail.com");
		
		m.put("email", list);
		
        Set<String>  s=m.keySet();
		
		for(String k:s)
		{
			System.out.println("Key is: "+k+"  Value is: "+m.get(k));
		}
		
		

	}

}
