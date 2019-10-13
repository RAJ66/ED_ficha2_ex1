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

     public void delete(T element){
        boolean found = false;
        if(this.count == 0){
            System.out.println("Lista vazia!");
        }
        else{
            Node<T> previous = new Node<>();
            Node<T> current = new Node<>();
            
            if(this.head.getElement().equals(element)){
                this.head = this.head.getNext();
                this.count--;
                System.out.println("Item removido!");
            }
            else{
                current = this.head.getNext();
                previous = this.head;
                
                while(current!=null && !found){
                    if(current.getElement().equals(element)){
                        previous.setNext(current.getNext());
                        this.count--;
                        System.out.println("Item removido!");
                        found = true;
                    }
                    else{
                        previous = current;
                        current = current.getNext();
                    }
                }
            } 
        }
    }

    public void print() {
         Node<T> current    = this.head;
        
        while(current!=null){
            System.out.println(current.getElement().toString());
            current = current.getNext();
        }
        
        
        System.out.println(this.count);
    }

}
