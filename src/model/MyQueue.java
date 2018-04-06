package model;

import java.util.ArrayList;

public class MyQueue<T> {

	private NodeList<T> list;
	
	public MyQueue() {
		list = new NodeList<>();
	}

	public Node<T> createNode(T info) {
		return list.createNode(info);
	}

	public void enqueue(Node<T> node) {
		list.addLast(node);
	}

	public Node<T> dequeue() {
		return list.getFirst();
	}

	public void print() {
		list.print();
	}
	
	public ArrayList<T> getList() {
		return list.getInfoList();
	}
	
	public int size() {
		return list.size();
	}
}