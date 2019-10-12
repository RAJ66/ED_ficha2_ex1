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
        this.head = new Node<>();
        this.tail = new Node<>();

        this.head.setNext(this.tail);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    public void add(T novo) {
        Node<T> newNode = new Node<T>(novo);

        newNode.setNext(this.head.getNext());
        this.head.setNext(newNode);
        this.count++;
    }

    public void delete(T novo) {
        boolean found = false;
        Node<T> previous = new Node<T>();
        Node<T> current = new Node<T>();

        current = this.head.getNext();
        previous = this.head;

        while (current != null && !found) {
            if (current.getElement().equals(novo)) {
                previous.setNext(current.getNext());
                this.count--;
                found = true;

            } else {
                previous = current;
                current = current.getNext();
            }
        }

    }

    public void print() {
        Node<T> current = new Node<>();
        current = this.head.getNext();

        while (current != this.tail) {

            System.out.println(current.getElement().toString());

            current = current.getNext();
        }

        System.out.println(this.count);
    }

}
