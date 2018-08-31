/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector;

import java.util.Vector;
import javax.swing.JOptionPane;
import pilhas.Livro;

/**
 *
 * @author Samuel
 */
public class Teste_vector {
    public static void main(String[] args) {
        Vector vetor = new Vector();
        
    Livro l1 = new Livro();
    Livro l2 = new Livro();
    Livro l3 = new Livro();
    Livro l4 = new Livro();
     Livro l5 = new Livro();
     Livro l6 = new Livro();
    
    
           l1.setAssunto("Livro de Java");
           l2.setAssunto("Livro de EDA");
           l3.setAssunto("Livro de SO");
           l4.setAssunto("Livro de ADS");
           //l4.setAutor("Arlindo");
           l5.setAssunto("Livro de AC");
           l6.setAssunto("Livro de II");
           
         vetor.addElement(l1);
         vetor.addElement(l2);
         vetor.addElement(l3);
         vetor.addElement(l4);
         /**
          * adiciona um objecto num indice especifico,
         *se essa posicao estiver ocupada sera afastado para directa
          */
         
        vetor.insertElementAt(l5, 3);
        System.out.println(vetor);
        /*
        *substitui o elemento da posição indice pelo objecto dado. 
        */
        //vetor.setElementAt(l6, 2);
       // System.out.println(vetor);
        /*
        *retorna o objecto presente no indice.  
        */
        //System.out.println(vetor.elementAt(0));
        
        /*
        *remove todos os elementos do vector.  
        */
//        vetor.clear();
       // System.out.println(vetor);
        
        
        /*
        *remove o elemento na posição indice. 
        */
       // vetor.remove(1);
       // System.out.println(vetor);
        
        /*
        *retorna uma cópia do vector.  
        */
        //vetor.clone();
        //System.out.println(vetor);
        
        /*
         *verifica se o objecto especificado é um componente deste vector 
         */
        System.out.println(vetor.contains(l2));
        
        /*
        *devolve o primeiro objecto(indice 0) do vector. 
        */
        System.out.println(vetor.firstElement());
        System.out.println(vetor.size()); // retorna o tamaho do vector
        JOptionPane.showMessageDialog(null, vetor);        
    }
}
