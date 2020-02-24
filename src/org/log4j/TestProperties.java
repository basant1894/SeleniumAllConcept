package org.log4j;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestProperties extends TestBaseProp {
	
	@BeforeClass
	public void init() throws IOException {
			
	}
	@Test
	public void testproperties() throws IOException{
		String name=getObject("Name");
		System.out.println(name);
	}

}
