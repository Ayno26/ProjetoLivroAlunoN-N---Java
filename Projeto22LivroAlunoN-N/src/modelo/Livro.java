/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Livro {
    
    private String titulo;
    private String editora;
    private int ano;
    
    ArrayList<Autor> escritores = new ArrayList();

    public Livro() {
    }
    public Livro(String titulo, String editora, int ano) {
        this.titulo = titulo;
        this.editora = editora;
        this.ano = ano;
    }
    //Getters e Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void getEscritores() {
        for (int i=0; i<escritores.size(); i++){
            System.out.println("Autor: "+this.escritores.get(i).getNome());
        }
    }
    public void setEscritores(Autor escritor) {
        escritores.add(escritor);
    }
}
