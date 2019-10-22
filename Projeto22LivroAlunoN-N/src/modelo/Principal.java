/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Livro livro1 = new Livro("Chamas da Paixão", "Editora 1000", 2006);
        Livro livro2 = new Livro("Calor do Amor", "Editora Nova", 2007);
        Livro livro3 = new Livro("Aquece Coração", "Editora Mundo", 2008);
        Autor autor1 = new Autor("Senhor Sr", 1987, "srsr@gmail.com");
        Autor autor2 = new Autor("Mister Mr", 1977, "mrmister@gmail.com");
        Autor autor3 = new Autor("Elder Antigo", 1967, "anciao@gmail.com");
        
        autor1.setObras(livro1);
        autor1.setObras(livro2);
        autor1.setObras(livro3);
        livro1.setEscritores(autor1);
        livro1.setEscritores(autor2);
        livro1.setEscritores(autor3);
        
        autor1.getObras();
        livro1.getEscritores();
    }    
}
