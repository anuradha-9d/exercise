/*Insert the following in a dictionary. 

	take -> carry or bring with one
	jump -> move suddenly and quickly in a specified way
	walk -> an act of traveling or an excursion on foot
	run -> an act or spell of running
	dance -> move in a quick and lively way
	help -> serve someone with
	run -> an act or spell of running

	If it’s a new word then insert or if it’s an existing word then update the dictionary. Verify that the insert and updates have happened correctly.
	*/

package com.exercise;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class addintoDict {
	

		Map<String, String> map;

		public addintoDict(Map<String, String> map){
			this.map=map;
		}

		public String getValue(String key){
			return this.map.get(key);
		}

		public static void main(String[] args) {
			Map<String, String> map = new HashMap<String,String>();
			
			map.put("take", "carry or bring with one");
			map.put("jump", "move suddenly and quickly in a specified way");
			map.put("walk", "an act of traveling or an excursion on foot");
			map.put("run", "an act or spell of running");
			map.put("dance", "move in a quick and lively way");
			map.put("help", "serve someone with");
			map.put("run", "an act or spell of running again");
			
			Set<Entry<String,String>> set = map.entrySet();
			
			Iterator<Entry<String,String>> it = set.iterator();
			while(it.hasNext()){
				Entry<String,String> entry = it.next();
				String a = entry.getKey();
				String b = entry.getValue();
					
				System.out.println("Key =" + a + " Value =" + b);
			}
			}

		}
