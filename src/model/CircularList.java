package model;

import java.util.ArrayList;

public class CircularList<T>{

	private NodeList<T> list;
	
	public CircularList() {
		list = new NodeList<>();
	}
	
	public Node<T> createNode(T t) {
		return list.createNode(t);
	}
	
	public void addNode(Node<T> node) {
		Node<T> actual = list.getHead();
		if (actual != null) {
			while (actual.getNext() != list.getHead()) {
				actual = actual.getNext();
			}
			actual.setNext(node);
		} else {
			list.setHead(node);
		}
		node.setNext(list.getHead());
	}
	
	public Node<T> getFirst() {
		Node<T> first = list.getHead();
		list.setHead(first.getNext());
		return first;
	}
	
	public ArrayList<T> getList() {
		ArrayList<T> infoList = new ArrayList<>();
		Node<T> actual = list.getHead();
		while (actual != null && actual.getNext() != list.getHead()) {
			infoList.add(actual.getInfo());
			actual = actual.getNext();

		}
		infoList.add(actual.getInfo());
		return infoList;
	}
	
	public void printList() {
		Node<T> actual = list.getHead();
		while (actual != null && actual.getNext() != list.getHead()) {
			System.out.println(actual.getInfo());
			actual = actual.getNext();
		}
		System.out.println(actual.getInfo());
	}
}