package com.example.javaAssignments.Assignment10;

public class SListTest {
    public static void main(String args[])
    {
        Node<Integer> k = new Node<>();  // creating an object of outer class Node
        SListIterator<Integer> h = k.iterator(); // creating innerclass object with the help of outer class object
        //h.add(5,0);  //This gives an Exception
        //h.add(6,1);  //this gives an exception
        h.add(1);
        // h.add(6,1);   //Exception
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5,0);
        h.add(6,3);
        h.remove(2);
        h.add(7);
        h.add(8,4);
        h.remove(1);
        System.out.println(k.toString());
    }

}
