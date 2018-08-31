/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhas;

/**
 *
 * @author Acacio Ngove 
 * @author Samuel Guambe
 * @author Bento Muholove
 */
public class Livro {
    /**
     * 
     */
      private String assunto;
    private String autor;
    private String titulo;
    private String edicao;
    private String anoEdicao;
    private String editora;
  

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public Livro(String autor, String titulo, String edicao, String anoEdicao, String editora,String assunto) {
        this.autor = autor;
        this.titulo = titulo;
        this.edicao = edicao;
        this.anoEdicao = anoEdicao;
        this.editora = editora;
        this.assunto = assunto;
    }

    public Livro() {
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getAnoEdicao() {
        return anoEdicao;
    }

    public void setAnoEdicao(String anoEdicao) {
        this.anoEdicao = anoEdicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "{" + "assunto:   " + assunto + '}';
    }

    
    
    
}
