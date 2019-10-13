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

    public boolean delete(T element) {

        if (this.count == 0) {
            System.out.println("Lista vazia!");
            return false;
        } else {
            //pre whlie
            Node<T> previous, current;
            previous = null;
            current = this.head;
            boolean found = false;

            //ciclo
            while (current != null && !found) {
                if (current.getElement().equals(element)) {
                    found = true;
                } else {
                    previous = current;
                    current = current.getNext();
                }
            }

            //eliminar agora
            if (found) {
                if (previous == null) {
                    if (this.count == 1) {
                        this.tail = null;
                    }
                    this.head = current.getNext();
                } else {
                    previous.setNext(current.getNext());
                }

                if (current.equals(this.tail)) {
                    this.tail = previous;
                }

                this.count--;
                return true;

            } else {
                System.out.println("O item nao existe na lista");
                return false;
            }

        }

    }

    public void print() {
        Node<T> current = this.head;

        while (current != null) {
            System.out.println(current.getElement().toString());
            current = current.getNext();
        }

        System.out.println(this.count);
        
        if (this.head !=null) {
            System.out.println("head    "+this.head.getElement().toString());
        }
        
        if (this.tail !=null) {
            System.out.println("tail    "+this.tail.getElement().toString());
        }
    }

}
