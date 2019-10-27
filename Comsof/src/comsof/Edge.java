package comsof;

public class Edge {
	
	public int cost;
	
	public int capacity;
	
	public Node nodeOne;
	
	public Node nodeTwo;
	

	public Edge(int cost, int capacity, Node nodeOne, Node nodeTwo) {
		this.cost = cost;
		this.capacity = capacity;
		this.nodeOne = nodeOne;
		this.nodeTwo = nodeTwo;
	}
	
	public Node getNodeOne() {
		return nodeOne;
	}

	public void setNodeOne(Node nodeOne) {
		this.nodeOne = nodeOne;
	}

	public Node getNodeTwo() {
		return nodeTwo;
	}

	public void setNodeTwo(Node nodeTwo) {
		this.nodeTwo = nodeTwo;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	

}
