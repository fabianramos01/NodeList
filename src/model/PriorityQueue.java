package model;

import java.util.ArrayList;
import java.util.Comparator;

public class PriorityQueue<T> {

	private NodeList<T> list;
	
	public PriorityQueue(Comparator<T> comparator) {
		list = new NodeList<>(comparator);
	}
	
	public Node<T> createNode(T info) {
		return list.createNode(info);
	}
	
	public void add(Node<T> node) {
		list.addPriority(node);
	}
	
	public Node<T> dequeue() {
		return list.getFirst();
	}
	
	public ArrayList<T> getList() {
		return list.getInfoList();
	}
	
	public void print() {
		list.print();
	}
	
	public static void main(String[] args) {
		PriorityQueue<Integer> list = new PriorityQueue<>(new IntComparator());
		list.add(list.createNode(3));
		list.add(list.createNode(5));
		list.add(list.createNode(1));
		list.add(list.createNode(7));
		list.add(list.createNode(4));
		list.add(list.createNode(2));
		list.print();
	}
}