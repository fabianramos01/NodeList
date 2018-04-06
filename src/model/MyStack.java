package model;

import java.util.ArrayList;

public class MyStack<T> {

	private NodeList<T> list;
	
	public MyStack() {
		list = new NodeList<>();
	}
	
	public Node<T> createNode(T info) {
		return list.createNode(info);
	}
	
	public void push(Node<T> node) {
		list.addFirst(node);
	}
	
	public Node<T> pop() {
		return list.getFirst();
	}
	
	public Node<T> peek() {
		return list.getHead();
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