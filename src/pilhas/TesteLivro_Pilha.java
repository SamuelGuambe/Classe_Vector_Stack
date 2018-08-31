/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhas;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Decleiana
 */
public class TesteLivro_Pilha {
    
    public static void main(String[] args) {
        
   
    
    Livro l1 = new Livro();
    Livro l2 = new Livro();
    Livro l3 = new Livro();
    Livro l4 = new Livro();
    
    
           l1.setAssunto("Livro de Java");
           l2.setAssunto("Livro de EDA");
           l3.setAssunto("SO");
           l4.setAssunto("ADS");
           
           
    
           
    Stack pilha = new Stack();
        //pilha.setSize(5);
      
    // insercao de objectos
        pilha.push(l1);
        pilha.push(l2);
        pilha.push(l3);
        pilha.push(l4);
        pilha.pop();
        
// JOptionPane.showMessageDialog(null, pilha);
       
// System.out.println(pilha.empty());  // Verifica se existe algum elemento 
 JOptionPane.showMessageDialog(null, pilha.peek()) ;
//    System.out.println("Topo da pilha: "+pilha.peek());
//    System.out.println(pilha.size()); // Espaco ocupado
//    System.out.println(pilha.capacity());// espaco total
 //   System.out.println(pilha);
//    pilha.pop(); // Remove o elemento que esta no topo da pilha
//    System.out.println("Topo da pilha: "+pilha.peek());
            
    }
}
