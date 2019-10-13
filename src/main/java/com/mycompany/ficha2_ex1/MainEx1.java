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
public class MainEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa pessoa1 = new Pessoa("Tiago", 20);
        Pessoa pessoa2 = new Pessoa("Vitor", 21);
        Pessoa pessoa3 = new Pessoa("Carlos", 21);
        Pessoa pessoa4 = new Pessoa("Joao", 21);
        
        LinkedList<Pessoa> lista = new LinkedList<>();
        
        lista.add(pessoa1);
        lista.add(pessoa2);
        
        //lista.print();
        
        //teste remover item
        lista.add(pessoa3);
        //lista.add(pessoa4);
        
       // lista.print();
        
        lista.delete(pessoa3);
       
        lista.print();



    }
    
}
