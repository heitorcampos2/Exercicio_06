/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escola;

/**
 *
 * @author ifnmg
 */
public class TestaDisciplina {
    public static void main(String[] args){
        
        Disciplina d1 = new Disciplina("Filosofia","002","3°");
        
        System.out.println("Disciplina: "+d1.getNome());
        System.out.println("Disciplina: "+d1.getCodigo());
        System.out.println("Disciplina: "+d1.getPeriodo());
    }
}
