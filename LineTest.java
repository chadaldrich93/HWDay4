package com.st.day4hw;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LineTest {

	@Test
	void slopeTest() {
		Line a = new Line(1,2,3,4);
		assertEquals(a.getSlope(), 1);
	}
	
	@Test
	void distanceTest() {
		Line a = new Line(0,0,0,4);
		assertEquals(a.getDistance(), 4);
	}
    
	@Test
	void parallelTest() {
		Line a = new Line(-1,0,1,0);
		Line b = new Line(-3,0,3,0);
		assertTrue(a.parallelTo(b));
	}
}
