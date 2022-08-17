package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(101, "Swati");
		map.put(102, "Purva");
		map.put(103, "Vaishanvi");
		map.put(104, "Dhanshree");
		map.put(105, "Bharti");
		
           
            for(Map.Entry<Integer, String> m1:map.entrySet())
            {
            	System.out.println(m1.getKey()+": "+m1.getValue());
            }

	}

}
