package com.mavenworks.DemoMavenForJenkins;

import org.junit.Test;

import junit.framework.TestCase;

public class TestWorkLog extends TestCase {
	
	WorkLog work=new WorkLog();

	@Test
	public void testAddToLog1() {
		
		assertEquals("Added log for Srini",work.addToLog("Srini") );
	}
	
	@Test
	public void testAddToLog2() {
		assertEquals("Added log for Kaviya",work.addToLog("Kaviya") );

	}
	
	@Test
	public void testAddLogins1() {
		assertEquals("Added login for Srini",work.addLogins("Srini") );

	}
	
	@Test
	public void testAddLogins2() {
		assertEquals("Added login for Kaviya",work.addLogins("Kaviya") );

	}
	
}
