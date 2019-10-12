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
public class LinkedList<T> {

    private int count;
    private Node<T> head;
    private Node<T> tail;

    public LinkedList() {
        this.count = 0;
        this.head = null;
        this.tail = null;
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

        if (this.count == 0) {
            this.head = newNode;
            this.tail = newNode;

        } else {
            newNode.setNext(head);
            this.head = newNode;
        }

        this.count++;

    }

    public void delete(T novo) {
        //caso esteja vazio
        if (count == 0) {
            System.out.println("Lista vazia");
        }
        if (count == 1) {
            if (this.head.getElement().equals(novo)) {
                this.head = null;
                this.tail = null;
            }
        } else {

            //criar previous e current
            Node<T> previous = new Node<T>();
            Node<T> current = new Node<T>();
            
            
        }

    }
    
     public void print(){
        System.out.println(this.head.getElement().toString());
        System.out.println(this.tail.getElement().toString());
        System.out.println(this.count);
    }

}
