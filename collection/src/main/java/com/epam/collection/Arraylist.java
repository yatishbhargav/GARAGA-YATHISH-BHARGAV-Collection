package com.epam.collection;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Arraylist<E> {
	public static final Logger logger = LogManager.getLogger(App.class);
	private int size=0;
	private static int capacity=10;
	private Object ele[];
	public Arraylist() {
		ele=new Object[capacity];
	}
	public void addElement(E e) {
		if(size==ele.length) {
			increaseSize();
		}
		ele[size++]=e;
	}
	private void increaseSize() {
		int newsize=ele.length*2;
		ele=Arrays.copyOf(ele, newsize);
	}

	@SuppressWarnings("unchecked")
	public E getElement(int i) {
		if(i<0 || i>=size) {
			throw new IndexOutOfBoundsException("Index out of range");
		}
		else {
			return (E) ele[i];
		}
	}
	
	@SuppressWarnings("unchecked")
	public E delete(int i) {
		if(i<0 || i>=size) {
			throw new IndexOutOfBoundsException("Index out of range");
		}
		Object x=ele[i];
		for(int k=i;k<size;k++) {
			ele[i]=ele[i+1];
		}
		size--;
		return (E)x;
	}
	public void print() {
		logger.info("List is :");
		for(int i=0;i<size;i++) {
			logger.info(ele[i]+" ");
		}
	}
}