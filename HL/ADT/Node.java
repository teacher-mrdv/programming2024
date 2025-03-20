/*
 * This is the definition (class) of a node for an ADT
 * Singly-linked node
 *  _____________
 * | data | next |
 * | (int)|(Node)|
 * |______|______|
 *
 * null = empty, non-existent, void
 * 
 */

public class Node
{
	int data ; // data contained in our node; it can be any data type
	Node next; // self-reference (Node refers/links/points to another node)

	// empty constructor (OOP) creates an empty node (initialises the data and next variables to defaults)
	public Node() { }

	// custom constructor that creates and initialises a node with data (integer "d" in this example)
	public Node(int d)
	{
		data = d;
		next = null;
	}
	// ^^^^^ this is an example of overloading methods ^^^^^^

	// is the (current) node linked to another node or does it point to null?
	public boolean hasNext()
	{	return next != null;
	}

	// similar to String's equals, allows to check if two Nodes have the same data
	public boolean equals(Node another)
	{	// this refers to the Node before the . e.g.: node1.equals(node2);
		// this = node1 and another is node2
		return this.data == another.data;
	}

	// similar to String's compareTo, allows us to compare two Nodes' data
	public int compareTo(Node another)
	{	return this.data - another.data;
	}

	/* this allows us to "print" a node
	 * (returns a String representatin of a node)
	 */
	public String toString()
	{	return data + ""; // auto casting to String
		//also: return Integer.toString(data);
	}
}

