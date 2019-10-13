/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ficha2_ex1;

/**
 *
 * @author vitor
 */
public class LinkedListSentinela<T> {

    private int count;
    private Node<T> head;
    private Node<T> tail;

    public LinkedListSentinela() {
        this.count = 0;
        this.head = new Node<>(null);
        this.tail = new Node<>(null);

        this.head.setNext(this.tail);
    }

    public int getCount() {
        return count;
    }



    public void add(T novo) {
        Node<T> newNode = new Node<T>(novo);

        newNode.setNext(this.head.getNext());
        this.head.setNext(newNode);
        this.count++;
    }

    public boolean delete(T novo) {
        boolean found = false;
        Node<T> previous = this.head;
        Node<T> current =this.head.getNext();

        

        while (current.getElement() != null ) {
            if (current.getElement().equals(novo)) {
                previous.setNext(current.getNext());
                this.count--;
                return true;

            } else {
                previous = current;
                current = current.getNext();
            }
        }
        
        return false;
        
        

    }

    public void print() {
         Node<T> current = this.head.getNext();

        while (current != this.tail) {

            System.out.println(current.getElement().toString());

            current = current.getNext();
        }

        System.out.println(this.count);
    }

}
