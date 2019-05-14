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
public class TestaPessoa {
        public static void main(String[] args){
        
        Pessoa a1 = new Pessoa("Fulano","Rua Um dois","(38) 9 9999-9999");
        //a1.setNome("Larissa");
        //a1.setMatricula("007");
        
        System.out.println("Nome: "+a1.getNome());
        System.out.println("Matricula: "+a1.getEndereco());
        System.out.println("Matricula: "+a1.getTelefone());
        
      
        
    }
}
