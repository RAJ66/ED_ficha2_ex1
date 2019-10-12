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
        } else {

            Node<T> previous = new Node<T>();
            Node<T> current = new Node<T>();
            
            if (novo.equals(this.head.getElement())) {
                this.head=this.head.getNext();
                this.count--;
                System.out.println("item removido");
            }else{
                current = this.head.getNext();
                previous = this.head;
                
                for(int i= 1;i<this.count;i++){
                    if (novo.equals(current.getElement())) {
                        previous.setNext(current.getNext());
                        this.count--;
                        System.out.println("item removido");
                        break;// depois passar para variavel dependendo da opiniao do prof

                    }else{
                        previous=current;
                        current= current.getNext();
                    }
            }
            }

        }

    }

    public void print() {
        Node<T> current = new Node<T>();
            current = this.head;
        for (int i = 0; i < this.count; i++) {
            System.out.println(current.getElement().toString());
            current = current.getNext();
            
        }
        
        
        System.out.println(this.count);
    }

}
