package com.epam.collection;

@SuppressWarnings("rawtypes")
public class App extends Arraylist
{

    @SuppressWarnings("unchecked")
public static void main( String[] args )
    {
        Arraylist<Integer> list=new Arraylist();
        list.addElement(10);
        list.addElement(5);
        list.addElement(6);
        list.addElement(7);
        list.addElement(3);
        list.addElement(6);
        list.addElement(7);
        list.addElement(5);
        list.addElement(4);
        list.addElement(4);
        list.addElement(17);
        list.addElement(15);
        list.addElement(16);
        logger.info(list.getElement(6));
        list.delete(4);
        list.print();
    }
}