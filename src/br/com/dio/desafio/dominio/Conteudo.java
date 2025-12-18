package br.com.dio.desafio.dominio;

public abstract class Conteudo { // abstract mae
    protected static final double XP_PADRAO = 10d; // protected concede acesso aos seus filhos

    private String titulo;
    private String descricao;

    // classes que extenderem
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
