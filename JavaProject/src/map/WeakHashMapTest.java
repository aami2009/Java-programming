package map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
 
public class WeakHashMapTest {
	public static void main(String[] args) {
		returnSome();
	}
	   static Long returnSome(){
		try{
			Map hashMap= new HashMap();
			Map weakHashMap = new WeakHashMap();
			String keyHashMap = new String("keyHashMap");
			String keyWeakHashMap = new String("keyWeakHashMap");
			hashMap.put(keyHashMap, "Atul200");
			
			weakHashMap.put(keyWeakHashMap, "Atul");
			System.gc();
			System.out.println("Before: hash map value:"+hashMap.get("keyHashMap")+" and weak hash map value:"+weakHashMap.get("keyWeakHashMap"));
			keyHashMap = null;
			keyWeakHashMap = null;
			System.gc();
			System.out.println("After: hash map value:"+hashMap.get("keyHashMap")+" and weak hash map value:"+weakHashMap.get("keyWeakHashMap"));
			throw new NullPointerException();
			
			
		}catch(Exception ex){
			System.out.println("--------catch-------------");
			System.exit(0);
			return null;
		}finally{
			System.out.println("--------Finally-------------");
		}
	}
}