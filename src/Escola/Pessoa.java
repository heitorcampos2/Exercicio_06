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
public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    //////////////////////////
    public Pessoa(String n, String e, String t){
        setNome(n);
        setEndereco(e);
        setTelefone(t);
        
    }
    //////////////////////////
    public String getNome(){
        return this.nome;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    //////////////////////////
    public void setNome(String n){
        this.nome = n;
    }
    
    public void setEndereco(String e){
        this.endereco = e;
    }
    
    public void setTelefone(String t){
        this.telefone = t;
    }
    //////////////////////////
    
}
