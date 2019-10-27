package comsof;

import java.util.HashMap;

public class Graph {
	
	public static HashMap<String,Edge> graph;
    
    public Graph() 
    { 
		Node n11 = new Node("N11");
		Node n12 = new Node("N12");
		Node n13 = new Node("N13");
		Node n14 = new Node("N14");
		
		Node n21 = new Node("N21");
		Node n22 = new Node("N22");
		Node n23 = new Node("N23");
		Node n24 = new Node("N24");
		
		Node n31 = new Node("N31");
		Node n32 = new Node("N32");
		Node n33 = new Node("N33");
		Node n34 = new Node("N34");
		
		Edge edge1 = new Edge(8, 2,n11,n12);
		Edge edge2 = new Edge(-5, 1,n12,n13);
		Edge edge3 = new Edge(3, 2, n13,n14);
		
		Edge edge4 = new Edge(1, 1,n11,n21);
		Edge edge5 = new Edge(4, 2,n12,n22);
		Edge edge6 = new Edge(1, 2,n13,n23);
		Edge edge7 = new Edge(4, 2,n14,n24);
		
		Edge edge8 = new Edge(2, 2,n21,n22);
		Edge edge9 = new Edge(2, 2,n22,n23);
		Edge edge10 = new Edge(9, 2,n23,n24);
		
		Edge edge11 = new Edge(3, 2,n21,n31);
		Edge edge12 = new Edge(6, 1,n22,n32);
		Edge edge13 = new Edge(6, 1,n23,n33);
		Edge edge14 = new Edge(4, 2,n24,n34);
		
		Edge edge15 = new Edge(4, 2,n31,n32);
		Edge edge16 = new Edge(3, 2,n32,n33);
		Edge edge17 = new Edge(3, 2,n33,n34);
		
		graph = new HashMap<String, Edge>();
		
		graph.put("E1", edge1);
		graph.put("E2", edge2);
		graph.put("E3", edge3);
		graph.put("E4", edge4);
		graph.put("E5", edge5);
		graph.put("E6", edge6);
		graph.put("E7", edge7);
		graph.put("E8", edge8);
		graph.put("E9", edge9);
		graph.put("E10", edge10);
		graph.put("E11", edge11);
		graph.put("E12", edge12);
		graph.put("E13", edge13);
		graph.put("E14", edge14);
		graph.put("E15", edge15);
		graph.put("E16", edge16);
		graph.put("E17", edge17);
    } 
	
	public static void main(String[] args) {
		
		Graph newGraph = new Graph();
		
		newGraph.shortestPath("N11","N34");

	}
	
	/**
	   * Calculates the shortest path using Bellman Ford Algorithm
	   * Prints total cost and a list of nodes in the path.
	   * @param src The starting node  
	   * @param dest The destination/target node.
	   */
	public void shortestPath(String src, String dest)
	{
		 
		HashMap<String,Integer> distance = new HashMap<String, Integer>();
		HashMap<String,String> nodeList = new HashMap<String, String>();
  
        for (int i = 1; i <= 4; i++) 
        {
        	for(int j = 1; j<=4;j++)
        	{
        		String edgeName = "N"+i+j;
        		distance.put(edgeName, Integer.MAX_VALUE);
        	}
       
        }
        distance.put(src, 0); 
  
        for (int i = 1; i <= 12; ++i) { 
            for (int j = 1; j <= 17; ++j) { 
            	String edgeName = "E"+j;
                Edge edge = graph.get(edgeName);
				String u1 = edge.getNodeOne().getName();
                String v1 = edge.getNodeTwo().getName();
                int cost = edge.getCost();
                int capacity = edge.getCapacity();
                
                if(distance.get(u1) != Integer.MAX_VALUE && distance.get(u1) + cost < distance.get(v1) && capacity>0)
                {              	
                	distance.put(v1, distance.get(u1)+cost);
                	nodeList.put(v1, u1);
                	edge.setCapacity(capacity-1);
                }
            } 
        } 
        
        System.out.println("Total cost: "+distance.get(dest));
        String name = dest;
        System.out.println("List of nodes: ");
        String listOfNodes="";
        while(name!=src)
        {
        	listOfNodes = nodeList.get(name)+" " + listOfNodes;
        	
        	name = nodeList.get(name);
        }
        System.out.print(listOfNodes+dest);
        
    } 
  
}
