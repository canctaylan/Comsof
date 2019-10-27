package comsof;

import org.junit.Test;

public class ShortestPathTest {
	
	/**
	   * Test method for testing shortestPath method in 
	   * the Graph class. To test different source and destinations
	   * change the inputs given to the method
	   */
	@Test
	public void shortestPathTest()
	{
		Graph graph = new Graph();
		graph.shortestPath("N11","N34");
	}

}
