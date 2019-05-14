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
public class Disciplina {
    private String nome;
    private String codigo;
    private String periodo;
    //////////////////////////
    public Disciplina(String n, String c, String p){
        setNome(n);
        setCodigo(c);
        setPeriodo(p);
    }
    //////////////////////////
    public String getNome(){
        return this.nome;
    }
    
    public String getCodigo(){
        return this.codigo;
    }
    
    public String getPeriodo(){
        return this.periodo;
    }
    //////////////////////////
    public void setNome(String n){
        this.nome = n;
    }
    
    public void setCodigo(String c){
        this.codigo = c;
    }
    
    public void setPeriodo(String p){
        this.periodo = p;
    }
    //////////////////////////
}
