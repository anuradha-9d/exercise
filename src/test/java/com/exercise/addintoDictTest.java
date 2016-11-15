package com.exercise;
import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class addintoDictTest {


		@Test
		public void testHashMapUpdate() {
			Map<String, String> map = new HashMap<String,String>();
			
			map.put("take", "carry or bring with one");
			map.put("jump", "move suddenly and quickly in a specified way");
			map.put("walk", "an act of traveling or an excursion on foot");
			map.put("run", "an act or spell of running");
			map.put("dance", "move in a quick and lively way");
			map.put("help", "serve someone with");
			map.put("run", "an act or spell of running again");
			
			Assert.assertEquals(map.get("run"), "an act or spell of running again");
		}
		
		@Test
		public void testHashMapInsert() {
			Map<String, String> map = new HashMap<String,String>();
			
			map.put("take", "carry or bring with one");
			map.put("jump", "move suddenly and quickly in a specified way");
			map.put("walk", "an act of traveling or an excursion on foot");
			map.put("run", "an act or spell of running");
			
			Assert.assertEquals(map.get("run"), "an act or spell of running");
		}
		
				
	}



